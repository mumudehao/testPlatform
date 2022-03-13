package com.testplatform.platform.service;

import com.testplatform.platform.POJO.InterfaceResultPO;
import com.testplatform.platform.search.InterfaceResultParam;

import java.util.List;

public interface InterfaceResultService {

//    List<InterfaceResultPO> getInterfaceResultList(InterfaceResultParam interfaceResultParam);

    List<InterfaceResultPO> getInterfaceResultList(InterfaceResultParam interfaceResultParam);

    InterfaceResultPO getInterfaceResult(InterfaceResultParam interfaceResultParam);

    void addResult(InterfaceResultPO interfaceResultPO);



}
