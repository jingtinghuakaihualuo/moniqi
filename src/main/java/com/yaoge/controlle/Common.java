package com.yaoge.controlle;

import net.sf.json.JSONObject;

/**
 * 打印头信息
 */
public class Common {

    public static void getHeadInfo(JSONObject object){
        //获取头信息
        String version = object.containsKey("version")? (String) object.get("version") : "";
        System.out.print("\n--------version:" + version);
        String osflag = object.containsKey("osflag")? (String) object.get("osflag") : "";
        System.out.print("\n--------osflag:" + osflag);
        String appflag = object.containsKey("appflag")? (String) object.get("appflag") : "";
        System.out.print("\n--------appflag:" + appflag);
        String sign = object.containsKey("sign")? (String) object.get("sign") : "";
        System.out.print("\n--------sign:" + sign);
        String token = object.containsKey("token")? (String) object.get("token") : "";
        System.out.print("\n--------token:" + token);
    }

    public static JSONObject getSuccessResult(){
        JSONObject object = new JSONObject();
        object.put("code" , "0000");
        object.put("message" , "返回正确的模拟接口信息");
        object.put("sign" , "");
        return object;
    }

    public static JSONObject getFailResult(){

        JSONObject object = new JSONObject();

        object.put("code" , "8888");
        object.put("message" , "返回错误的模拟信息");
        object.put("sign" , "");
        object.put("result" ,null);
        return object;
    }

    public static JSONObject getHasNullFail(){

        JSONObject object = new JSONObject();

        object.put("code" , "8888");
        object.put("message" , "必填字段为空");
        object.put("sign" , "");
        object.put("result" ,null);
        return object;
    }
}
