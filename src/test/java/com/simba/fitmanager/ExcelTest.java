package com.simba.fitmanager;

import com.simba.fitmanager.dao.Fit;
import com.simba.fitmanager.util.ExcelUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExcelTest {
    @Test
    public void test1() throws Exception {
        String filename = "F:\\fit.xlsx";
        List<Fit> list = new ArrayList<>();
        list = ExcelUtil.importExcel(filename);
    }
}
