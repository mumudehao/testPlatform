package com.testplatform.platform.dao;


import com.testplatform.platform.POJO.InterfaceResultPO;
import com.testplatform.platform.search.InterfaceResultParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface InterfaceResultMapper {

    List<InterfaceResultPO> getInterfaceResultList(InterfaceResultParam interfaceResultParam);

    InterfaceResultPO getInterfaceResult(InterfaceResultParam interfaceResultParam);


}
