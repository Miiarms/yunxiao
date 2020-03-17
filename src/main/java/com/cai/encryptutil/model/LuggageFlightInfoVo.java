package com.cai.encryptutil.model;

import lombok.Data;

@Data
public class LuggageFlightInfoVo {
    private String alnCd;
    private String fltNr;
    private String fltDt;
    private String actDepDt;
    private String actDepBjDt;
    private String actArvDt;
    private String actArvBjDt;
    private String depStsCd;
    private String arvStsCd;
}
