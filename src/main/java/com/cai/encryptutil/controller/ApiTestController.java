package com.cai.encryptutil.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cai.encryptutil.model.FlightInfos;
import com.cai.encryptutil.model.FlyInfoModel;
import com.cai.encryptutil.model.SeatReq;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.AttributeSetMethodGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.util.Date;

@RestController
@Slf4j
public class ApiTestController {

    /**
     * 航班动态信息查询
     * @return
     * @throws Exception
     */
    @GetMapping (value = {"/route/api/v1/td/fltinfo/core_kv/","/route/api/v1/td/fltinfo/fn_kv/"},produces = "application/xml;charset=utf-8")
    public Object decrypt() throws Exception {

        FlightInfos flightInfos = new FlightInfos();
        FlyInfoModel flyInfoModel = null;
        for (int i = 1; i <=10 ; i++) {
            flyInfoModel = new FlyInfoModel();
            flyInfoModel.setFltDt("2012-06-20 16:55");
            flyInfoModel.setFltNr("CZ310"+i);
            flyInfoModel.setLegSeqNr("2");
            flyInfoModel.setSvcType("J");
            flyInfoModel.setLatestTailNr("B2827");
            flyInfoModel.setAcfOper("XO");
            flyInfoModel.setCcCockpit("2");
            flyInfoModel.setCcCabin("7");
            flyInfoModel.setDopsTmst("2012-06-01 10:07");
            flyInfoModel.setLatestEqpCd("757");
            flyInfoModel.setDeleteInd("N");
            flyInfoModel.setCrewDepDt("2012-06-20 20:20");
            flyInfoModel.setBranchCode("URC");
            flyInfoModel.setSvcChnDesc("正班");
            flyInfoModel.setTaxiInTm("5");
            flyInfoModel.setTaxiOutTm("5");
            flyInfoModel.setDepStsCd("SCH");
            flyInfoModel.setDepArpCd("ZGC");
            flyInfoModel.setSchDepCityName("兰州");
            flyInfoModel.setLatestDepArpCd("ZGC");
            flyInfoModel.setLatestDepDt("2012-06-20 20:20");
            flyInfoModel.setArvStsCd("SCH");
            flyInfoModel.setArvArpCd("URC");
            flyInfoModel.setSchArvCityName("乌鲁木齐");
            flyInfoModel.setLatestArvArpCd("URC");
            flyInfoModel.setArcArvCityName("乌鲁木齐");
            flyInfoModel.setSchArvDt("2012-06-20 23:10");
            flyInfoModel.setLatestArvDt("2012-06-20 23:10");
            flyInfoModel.setDelayTime("15");

            flightInfos.getFlightInfos().add(flyInfoModel);
        }


        return flightInfos;
    }


    @RequestMapping("wibe/shopping/flightinfobycitypair")
    public Object seatIinfo(SeatReq req){

        log.info("座位信息入参："+JSON.toJSONString(req));

        JSONObject result = new JSONObject();

        JSONArray flightRoList = new JSONArray();
        JSONObject msgDto = new JSONObject();
        result.put("flightRoList",flightRoList);
        result.put("msgDto",msgDto);

        msgDto.put("code","0");
        msgDto.put("reason","success");
        msgDto.put("exception","success");

        for (int i = 1; i <= 10; i++) {
            JSONObject fightRoDto = new JSONObject();
            flightRoList.add(fightRoDto);

            JSONArray depAndArrOfSegs = new JSONArray();
            JSONObject DepAndArrDto = new JSONObject();
            JSONObject RoResultDto = new JSONObject();
            depAndArrOfSegs.add(DepAndArrDto);

            fightRoDto.put("flightNum","CZ310"+i);
            fightRoDto.put("depAndArrOfSegs",depAndArrOfSegs);
            fightRoDto.put("roResultDto",RoResultDto);

            DepAndArrDto.put("depDate",new Date());
            DepAndArrDto.put("arrDate",new Date());
            DepAndArrDto.put("depAirport","CAN");
            DepAndArrDto.put("arrAirport","PER");
            DepAndArrDto.put("elapsedTime","5小时");
            DepAndArrDto.put("depTerm","白云T1航站楼");
            DepAndArrDto.put("arrTerm","大兴航站楼");
            DepAndArrDto.put("planeType","高等商务舱");
            DepAndArrDto.put("meal","sb");

            JSONArray roCabinDtoList = new JSONArray();
            RoResultDto.put("flightNo","CZ3101");
            RoResultDto.put("flightDate","26-AUG");
            RoResultDto.put("office1","");
            RoResultDto.put("office2","");
            RoResultDto.put("roCabinDtoList",roCabinDtoList);
            RoResultDto.put("controlOffice","CAN001");
            RoResultDto.put("roDetail","恭喜你查询成功啦");

            JSONArray roDataDtoList = new JSONArray();
            JSONObject RoCabinDto = new JSONObject();
            JSONObject RoDataDto = new JSONObject();
            roCabinDtoList.add(RoCabinDto);
            roDataDtoList.add(RoDataDto);
            RoCabinDto.put("bigCabin","大仓位J");
            RoCabinDto.put("smallCabins","小仓位JCDIO");
            RoCabinDto.put("roDataDtoList",roDataDtoList);

            RoDataDto.put("deptAirport","CAN");
            RoDataDto.put("opn","50");
            RoDataDto.put("max","100");
            RoDataDto.put("cap","110");
            RoDataDto.put("tb","20");
        }



        return result ;
    }


}
