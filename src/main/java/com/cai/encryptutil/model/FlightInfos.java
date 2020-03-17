package com.cai.encryptutil.model;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Data
@XmlRootElement(name = "FlightInfos")
@XmlAccessorType(XmlAccessType.FIELD)
public class FlightInfos {

    @XmlElement(name = "FlightInfo")
    private List<FlyInfoModel> flightInfos = new ArrayList<>();
}
