package com.cai.encryptutil.model;

import lombok.Data;

import java.util.List;

@Data
public class LuggageInfoVo {
    private String infoStatus;
    private List<LuggageOpEventVo> luggageOpEvents;
    private LuggageFlightInfoVo flightInfoVo;
    private String statusName;
    private String status;
    private String tagAlnCd;
    private String tagNum;
    private String depArpCd;
    private String destArpCd;
    private String fltDt;
    private String alnCd;
    private String fltNr;

    private LuggageAllProcessReqVo reqInfo;
}





