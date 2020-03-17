package com.cai.encryptutil.controller;

import com.alibaba.fastjson.JSON;
import com.cai.encryptutil.model.LuggageAllProcessReqVo;
import com.cai.encryptutil.model.LuggageFlightInfoVo;
import com.cai.encryptutil.model.LuggageInfoVo;
import com.cai.encryptutil.model.LuggageOpEventVo;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class PackageController {

    @RequestMapping ("/luggageAllProcess/getLuggageAllProcess")
   public Object queryPackage(@RequestBody(required = false) LuggageAllProcessReqVo req){

        LuggageInfoVo vo = new LuggageInfoVo();

        List<LuggageOpEventVo> list = new ArrayList<>();
        LuggageOpEventVo opEventVo = new LuggageOpEventVo();
        list.add(opEventVo);
        LuggageFlightInfoVo fltInfo = new LuggageFlightInfoVo();
        vo.setLuggageOpEvents(list);
        vo.setFlightInfoVo(fltInfo);

        vo.setInfoStatus("YY:站点已开通，并且当前有行李节点信息");
        vo.setStatusName("行李正在分拣");
        vo.setStatus("1");
        vo.setTagAlnCd("CZ");
        vo.setTagNum("666666");
        vo.setDepArpCd("CAN");
        vo.setDestArpCd("PER");
        vo.setFltDt("2019-12-01");
        vo.setAlnCd("CZ");
        vo.setFltNr("3103");

        opEventVo.setLuggageStatus("1");
        opEventVo.setOpType("");
        opEventVo.setOpDt("2019-12-10 15:00:00");
        opEventVo.setOpArpCd("PER");
        opEventVo.setStatusName("行李正在分拣");

        fltInfo.setAlnCd("CZ");
        fltInfo.setFltNr("3103");
        fltInfo.setFltDt("2019-12-01");
        fltInfo.setActDepDt("");
        fltInfo.setActDepBjDt("");
        fltInfo.setActArvDt("");
        fltInfo.setActArvBjDt("");
        fltInfo.setDepStsCd("AIR");
        fltInfo.setArvStsCd("SCH");

        //请求参数
        vo.setReqInfo(req);

        log.info("接口返回：{}", JSON.toJSONString(vo));
        return vo;
    }



}
