package com.simba.fitmanager.controller;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.simba.fitmanager.dao.Fit;
import com.simba.fitmanager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 实现控件的增删改查
 * 增加 通过excel表格实现
 * 删除 没有
 * 修改 提供修改配件的状态state
 * 查看 查看所有的配件,展示出来
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        if (file.isEmpty()){
            //上传失败
            return "0";
        }
        // 前端上传的excel文件处理
        String fileName = file.getOriginalFilename();
        String dir=System.getProperty("user.dir");
        String destFileName=dir+File.separator +"uploadedfiles_"+fileName;
        System.out.println(destFileName);
        File destFile = new File(destFileName);
        file.transferTo(destFile);
        System.out.println("上传成功");
        System.out.println("开始读取EXCEL内容");

        String response = managerService.addFitList(destFileName);
        return response;
    }

    // 返回的是列表类型的 json数据
    @RequestMapping(value = "/show")
    public List<Fit> show(){
        List<Fit> response = new ArrayList<>();
        response = managerService.showFitList();
        return response;
    }

    @RequestMapping(value = "/update")
    public String update(@RequestBody Fit fit){
        String response = null;
        response = managerService.updateFitList(fit);
        return response;
    }

}
