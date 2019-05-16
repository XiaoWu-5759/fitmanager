package com.simba.fitmanager.service;

import com.simba.fitmanager.dao.Fit;

import java.util.List;

public interface ManagerService {
    String addFitList(String destFileName) throws Exception;

    List<Fit> showFitList();

    String updateFitList(Fit fit);
}
