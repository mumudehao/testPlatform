package com.testplatform.platform.controller;

import com.testplatform.platform.POJO.InterfaceResultPO;
import com.testplatform.platform.dao.InterfaceResultMapper;
import com.testplatform.platform.search.InterfaceResultParam;
import com.testplatform.platform.service.InterfaceResultService;
import com.testplatform.platform.service.impl.InterfaceResultServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/interfaceResult")
@Slf4j
public class InterfaceResultController {

    @Autowired
    private InterfaceResultService interfaceResultService;


    @GetMapping("/getresult")
    public List<InterfaceResultPO> getResult(InterfaceResultParam interfaceResultParam){

        List<InterfaceResultPO> list = new ArrayList<>();
        list = interfaceResultService.getInterfaceResultList(interfaceResultParam);
        return list;
    }

    @GetMapping("/get")
    public InterfaceResultPO getInterfaceResult(InterfaceResultParam interfaceResultParam){
        return interfaceResultService.getInterfaceResult(interfaceResultParam);
    }

}
