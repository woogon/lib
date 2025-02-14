package com.ziponia.kakao.client.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebSearchRequest {

    private String query;
    private Sort sort = Sort.ACCURACY;
    private Integer page;
    private Integer size;

    public enum Sort {
        ACCURACY,
        RECENCY
    }
}
