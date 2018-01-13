package com.yaoge.controlle;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录
 */
@RestController
@RequestMapping("login")
public class Login {

    public static JSONArray jsonArray = new JSONArray();

    static{
        JSONObject jsonObject = new JSONObject();
        //管理员账号
        jsonObject.put("loginid" , "admin");
        jsonObject.put("pwd" , "123456");
        jsonArray.add(jsonObject);
        jsonObject.clear();

    }

    @RequestMapping("plat")
    @ResponseBody
    public Object plat(@RequestBody JSONObject object){

        Common.getHeadInfo(object);

        //获取数据
        JSONObject data = (JSONObject) object.get("data");
        String loginid = data.containsKey("loginid") ? (String) data.get("loginid") : "";
        String pwd = data.containsKey("pwd") ? (String) data.get("pwd") : "";

        boolean b = false;
        for(int i = 0 ; i < jsonArray.size() ; i++){
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            if(jsonObject.get("loginid").equals(loginid.trim()) && jsonObject.get("pwd").equals(pwd.trim())){
                b = true;
                break;
            }
        }


        JSONObject retObj = null;


        //登录成功
        if(b){
            retObj = Common.getSuccessResult();
            JSONObject result = new JSONObject();
            result.put("userid" , 666);
            retObj.put("result" ,result);
        }else{
            retObj = Common.getFailResult();
        }

        return retObj;
    }
}
