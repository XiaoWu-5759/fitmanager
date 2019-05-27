package com.simba.fitmanager.service.impl;

import com.simba.fitmanager.dao.Fit;
import com.simba.fitmanager.dao.FitExample;
import com.simba.fitmanager.mapper.FitMapper;
import com.simba.fitmanager.service.ManagerService;
import com.simba.fitmanager.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private FitMapper fitMapper;

    Fit addFit = new Fit();

    @Override
    public String addFitList(String destFileName) throws Exception {
        List<Fit> fitList = new ArrayList<>();
        fitList = ExcelUtil.importExcel(destFileName);
//        System.out.println(fitList.size());
        for (int i = 0; i < fitList.size(); i++) {
//            System.out.println(i);
//            System.out.println(fitList.get(i));
            addFit = fitList.get(i);
//            System.out.println(addFit.toString());
//            fitMapper.insertSelective(addFit);

            // 入库判别，如果有重名，覆盖它
            FitExample fitExample = new FitExample();
            FitExample.Criteria fitExampleCriteria = fitExample.createCriteria();
            fitExampleCriteria.andFitNumEqualTo(addFit.getFitNum());
            List<Fit> fitList1 = fitMapper.selectByExample(fitExample);
            if (fitList1.size() != 0) {
                addFit.setFitId(fitList1.get(0).getFitId());
                fitMapper.updateByPrimaryKeySelective(addFit);
                System.out.println("更新一条数据");
            } else {
                fitMapper.insertSelective(addFit);
                System.out.println("插入一条数据");
            }
        }
        return "1";
    }

    /**
     * 查询全部数据
     *
     * @return
     */
    @Override
    public List<Fit> showFitList() {
        List<Fit> fitList = new ArrayList<>();
        FitExample fitExample = new FitExample();
        FitExample.Criteria fitExampleCriteria = fitExample.createCriteria();
        fitList = fitMapper.selectByExample(fitExample);

        return fitList;
    }

    /**
     * 更新配件信息
     *
     * @param fit
     * @return
     */
    @Override
    public String updateFitList(Fit fit) {
//        List<Fit> fitList = new ArrayList<>();
//        FitExample fitExample = new FitExample();
//        FitExample.Criteria fitExampleCriteria = fitExample.createCriteria();
        int result = fitMapper.updateByPrimaryKeySelective(fit);
        if (result == 1) {
            // 修改成功
            return "1";
        }
        // 修改失败
        return "0";
    }
}
