package com.cai.encryptutil.util;

import org.springframework.util.ObjectUtils;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DataAdapter extends XmlAdapter<Object, Object> {
    @Override
    public Object unmarshal(Object v) throws Exception {
        return null;
    }

    @Override
    public Object marshal(Object v) throws Exception {
        if(ObjectUtils.isEmpty(v)){
            v = "";
        }
        return v;
    }
}
