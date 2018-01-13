package com.yaoge.controlle;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息处理
 */
@RestController
@RequestMapping("plat")
public class Plat {

    @RequestMapping("pwd/upd")
    @ResponseBody
    public Object plat(@RequestBody JSONObject object){


        //获取头信息
        Common.getHeadInfo(object);

        //获取数据
        JSONObject data = (JSONObject) object.get("data");
        String loginid = data.containsKey("loginid") ? (String) data.get("loginid") : "";
        String pwd = data.containsKey("pwd") ? (String) data.get("pwd") : "";
        String newpwd = data.containsKey("newpwd") ? (String) data.get("newpwd") : "";
        String verificode = data.containsKey("verificode") ? (String) data.get("verificode") : "";


        JSONObject retObj = new JSONObject();


        //登录成功
        if(b){

            JSONObject result = new JSONObject();
            result.put("userid" , 666);
            retObj.put("result" ,result);
        }else{
            Common.getFailResult();
        }

        return retObj;
    }
}
