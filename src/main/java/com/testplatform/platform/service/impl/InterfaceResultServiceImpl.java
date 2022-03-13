package com.testplatform.platform.service.impl;

import com.testplatform.platform.POJO.InterfaceResultPO;
import com.testplatform.platform.dao.InterfaceResultMapper;
import com.testplatform.platform.search.InterfaceResultParam;
import com.testplatform.platform.service.InterfaceResultService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class InterfaceResultServiceImpl implements InterfaceResultService {


    @Autowired
    InterfaceResultMapper interfaceResultMapper;

    @Override
    public List<InterfaceResultPO> getInterfaceResultList(InterfaceResultParam interfaceResultParam) {

        return interfaceResultMapper.getInterfaceResultList(interfaceResultParam);
    }

    @Override
    public InterfaceResultPO getInterfaceResult(InterfaceResultParam interfaceResultParam) {

        return interfaceResultMapper.getInterfaceResult(interfaceResultParam);
    }

    @Override
    public void addResult(InterfaceResultPO interfaceResultPO) {

    }
}
