package com.cai.encryptutil.model;

import com.cai.encryptutil.util.DataAdapter;
import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 航班动态信息查询返回值
 */
@Data
public class FlyInfoModel {
    
    private String soflSeqNr="";
    
    private String fltDt="";
    
    private String fltNr="";
    
    private String opSuffix="";
    
    private String alnCd="";
    
    private String branchCode="";
    
    private String legSeqNr="";
    
    private String latestTailNr="";
    
    private String latestEqpCd="";
    
    private String svcType="";
    
    private String svcChnDesc="";
    
    private String schDepDt="";
    
    private String locSchDepDt="";
    
    private String schArvDt="";
    
    private String locSchArvDt="";
    
    private String latestDepDt="";
    
    private String locLatestDepDt="";
    
    private String latestArvDt="";
    
    private String locLatestArvDt="";
    
    private String depArpCd="";
    
    private String arvArpCd="";
    
    private String schDepCityName="";
    
    private String schArvCityName="";
    
    private String latestDepArpCd="";
    
    private String latestArvArpCd="";
    
    private String arcDepCityName="";
    
    private String arcArvCityName="";
    
    private String depStandNo="";
    
    private String arvStandNo="";
    
    private String depGateNo="";
    
    private String arvGateNo="";
    
    private String depBeltNo="";
    
    private String arvBeltNo="";
    
    private String depTerminal="";
    
    private String arvTerminal="";
    
    private String cnclCd="";
    
    private String depStsCd="";
    
    private String arvStsCd="";
    
    private String legStsCd="";
    
    private String legStsChn="";
    
    private String acfOper="";
    
    private String dlyCd1="";
    
    private String dlyReasonDetail01="";
    
    private String dlyReasonPublish01="";
    
    private String dlyCd2="";
    
    private String dlyReasonDetail02="";
    
    private String dlyReasonPublish02="";
    
    private String dlyCd3="";
    
    private String dlyReasonDetail03="";
    
    private String dlyReasonPublish03="";
    
    private String dlyCd4="";
    
    private String dlyReasonDetail04="";
    
    private String dlyReasonPublish04="";
    
    private String dlyCd5="";
    
    private String dlyReasonDetail05="";
    
    private String dlyReasonPublish05="";
    
    private String dlyTm1="";
    
    private String dlyTm2="";
    
    private String dlyTm3="";
    
    private String dlyTm4="";
    
    private String dlyTm5="";
    
    private String delayTime="";
    
    private String ccCockpit="";
    
    private String ccCabin="";
    
    private String dopsTmst="";
    
    private String deleteInd="";
    
    private String airTm="";
    
    private String locAirTm="";
    
    private String dwnTm="";
    
    private String locDwnTm="";
    
    private String cfpTime="";
    
    private String actualOffblocks="";
    
    private String actualAirborne="";
    
    private String actualLanding="";
    
    private String actualOnblocks="";
    
    private String taxiInTm="";
    
    private String taxiOutTm="";
    
    private String dlyRemark1="";
    
    private String dlyRemark2="";
    
    private String dlyRemark3="";
    
    private String dlyRemark4="";
    
    private String dlyRemark5="";
    
    private String crewDepDt="";
    
    private String fltManipCode="";
    
    private String fltRoute="";
    
    private String opNoopInd="";
    
    private String recSourceInd="";
    
    private String opsKnownInd="";
    
    private String opsAssInd="";
    
    private String crewArvDt="";
    
    private String pubSchDepDt="";
    
    private String pubSchArvDt="";
    
    private String scheduledEqpCd="";
    
    private String tailCompany="";
    
    private String latestDlyCd="";
    
    private String actualOutTm="";
    
}
