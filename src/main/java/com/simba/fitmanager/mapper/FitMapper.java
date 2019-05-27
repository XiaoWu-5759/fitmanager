package com.simba.fitmanager.mapper;

import com.simba.fitmanager.dao.Fit;
import com.simba.fitmanager.dao.FitExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FitMapper {
    long countByExample(FitExample example);

    int deleteByExample(FitExample example);

    int deleteByPrimaryKey(Long fitId);

    int insert(Fit record);

    int insertSelective(Fit record);

    List<Fit> selectByExample(FitExample example);

    Fit selectByPrimaryKey(Long fitId);

    int updateByExampleSelective(@Param("record") Fit record, @Param("example") FitExample example);

    int updateByExample(@Param("record") Fit record, @Param("example") FitExample example);

    int updateByPrimaryKeySelective(Fit record);

    int updateByPrimaryKey(Fit record);
}