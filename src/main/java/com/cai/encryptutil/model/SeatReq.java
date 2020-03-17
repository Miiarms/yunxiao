package com.cai.encryptutil.model;

import lombok.Data;

@Data
public class SeatReq {
    private String org;//起始机场
    private String dst;//到达机场
    private String date;//date
    private String groupName;//订座配置组名
}
