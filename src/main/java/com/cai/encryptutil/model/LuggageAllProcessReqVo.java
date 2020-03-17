package com.cai.encryptutil.model;

import lombok.Data;

@Data
public class LuggageAllProcessReqVo {

    private String alnCd;
    private String fltNr;
    private String fltDt;
    private String depCd;
    private String boardingNumber;
    private String[] certificateNos;
    private String lang;
}
