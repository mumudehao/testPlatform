package com.testplatform.platform.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterfaceResultParam extends BaseQueryParam{

    private int resultId;
    private String excuteGroupId;
    private String interfaceCaseId;
    private int type;
    private LocalDate gmtCreate;

}
