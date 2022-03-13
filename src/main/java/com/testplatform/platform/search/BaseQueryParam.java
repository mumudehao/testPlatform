package com.testplatform.platform.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseQueryParam {
    private int page;
    private int pageSize;

    private String oderBy ;
}
