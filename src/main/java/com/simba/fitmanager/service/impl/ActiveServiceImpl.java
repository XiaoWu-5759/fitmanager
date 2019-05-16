package com.simba.fitmanager.service.impl;

import com.simba.fitmanager.dao.Fit;
import com.simba.fitmanager.dao.FitExample;
import com.simba.fitmanager.mapper.FitMapper;
import com.simba.fitmanager.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ActiveServiceImpl implements ActiveService {
    @Autowired
    private FitMapper fitMapper;

    // 通过一个激活码，激活配件
    @Override
    public String activeByOne(String num) {
        FitExample fitExample = new FitExample();
        FitExample.Criteria fitExampleCriteria = fitExample.createCriteria();
        fitExampleCriteria.andFitNumEqualTo(num);
        List<Fit> fitList = fitMapper.selectByExample(fitExample);

        if ( fitList.size() == 0) {
            // 配件码不存在，返回0
            return "0";
        }
        else{
//            System.out.println(fitList.get(0).getState().toString());
            switch (fitList.get(0).getState()){
                case "0":
                    Fit updateFit = fitList.get(0);
                    updateFit.setState("2");
                    fitMapper.updateByPrimaryKeySelective(updateFit);
                    //返回1，是正常配件，激活成功
                    return "1";
                case "1":
                    //返回2，是备件，需要另外一个被激活的配件码
                    return "2";
                case "2":
                    //返回3，是激活过的配件，提示该配件已被激活
                    return "3";
                default:
                    // 返回0，激活失败
                    return "0";
            }
        }
    }

    // 通过两个激活码，激活配件，激活成功时，更新数据库
    @Override
    public String activeByTwo(String num1, String num2) {
        FitExample fitExample1 = new FitExample();
        FitExample.Criteria fitExampleCriteria1 = fitExample1.createCriteria();
        fitExampleCriteria1.andFitNumEqualTo(num1);
        List<Fit> fitList1 = fitMapper.selectByExample(fitExample1);
//        Fit fitNum1 = fitList1.get(0);

        FitExample fitExample2 = new FitExample();
        FitExample.Criteria fitExampleCriteria2 = fitExample2.createCriteria();
        fitExampleCriteria2.andFitNumEqualTo(num2);
        List<Fit> fitList2 = fitMapper.selectByExample(fitExample2);
//        Fit fitNum2 = fitList2.get(0);
        System.out.println(fitList1.get(0).getState()+"+"+fitList2.get(0).getState());

        // 转义字符 需要转义
//        String[] col1 = fitList1.get(0).getState().split("\\.");
//        String[] col2 = fitList2.get(0).getState().split("\\.");
//        System.out.println(col1.length);
//        System.out.println(col1[0]);
        if (fitList1.size() == 0 || fitList2.size() == 0){
            //返回0，激活码不正确，激活失败
            return "0";
        }
        else if (Double.valueOf(fitList1.get(0).getState()) == 1.0 && Double.valueOf(fitList2.get(0).getState()) == 2.0){
//            SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
//            sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
//            Date date = new Date();// 获取当前时间 sdf.format(date)

            // 更改更换件属性
            Fit updateFit2 = fitList2.get(0);
            Timestamp activeTime = new Timestamp(updateFit2.getActiveTime().getTime());
            updateFit2.setState("3");
            fitMapper.updateByExample(updateFit2,fitExample2);


            // 更改备件属性
//            java.util.Date date = new java.util.Date();          // 获取一个Date对象
//            Timestamp timeStamp = new Timestamp(date.getTime());     //   讲日期时间转换为数据库中的timestamp类
            Fit updateFit1 = fitList1.get(0);
            updateFit1.setState("2");
            updateFit1.setActiveTime(activeTime);
            fitMapper.updateByExample(updateFit1,fitExample1);
            //返回1，激活成功
            return "1";

        }
        else{
            //返回2，请将激活码填入正确的输入框中
            //第一个输入框填备件，第二个输入框填已激活件
            return "4";
        }

    }
}
