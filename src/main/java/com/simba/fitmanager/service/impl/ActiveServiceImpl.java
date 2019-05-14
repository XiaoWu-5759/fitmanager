package com.simba.fitmanager.service.impl;

import com.simba.fitmanager.dao.Fit;
import com.simba.fitmanager.dao.FitExample;
import com.simba.fitmanager.mapper.FitMapper;
import com.simba.fitmanager.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
            System.out.println(fitList.get(0).getState().toString());
            switch (fitList.get(0).getState()){
                case "0":
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

    // 通过两个激活码，激活配件
    @Override
    public String activeByTwo(String num1, String num2) {
        return null;
    }
}
