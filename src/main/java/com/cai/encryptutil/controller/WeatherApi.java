package com.cai.encryptutil.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.zip.GZIPInputStream;

@RestController
@Slf4j
public class WeatherApi {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "weather",method = {RequestMethod.POST, RequestMethod.GET})
    public String weather(String city,HttpServletRequest request) throws IOException {
        System.out.println("传入城市："+city);
        String url = "http://wthrcdn.etouch.cn/weather_mini?city="+city;

        ResponseEntity<Resource> responseEntity = restTemplate.getForEntity(url, Resource.class);
        ByteArrayOutputStream out = null;
        try {
            GZIPInputStream gip = new GZIPInputStream(responseEntity.getBody().getInputStream());
            out = new ByteArrayOutputStream();
            //缓冲
            byte []buffer = new byte[1024];
            int len ;
            while((len = gip.read(buffer))!=-1){
                out.write(buffer, 0, len);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }finally{
            //关闭流
            try {
                if(out != null){
                    out.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return (new String(out.toByteArray(), "utf-8"));
    }

    @RequestMapping("/")
    public String home(){
        return "你好啊，大傻吊！！";
    }

}
