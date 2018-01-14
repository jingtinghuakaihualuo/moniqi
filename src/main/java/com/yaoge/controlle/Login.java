package com.yaoge.controlle;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * 登录
 */
@CrossOrigin(origins = "http://127.0.0.1:8010", maxAge = 3600)
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
            result.put("username" , "huang");
            result.put("loginid" , loginid);
            result.put("img" , "http://himg.bdimg.com/sys/portrait/item/0db2e58991e6838ae9a38e656e6a6f79692f.jpg");
            result.put("background" , "http://e.hiphotos.baidu.com/image/h%3D300/sign=8d3a9ea62c7f9e2f6f351b082f31e962/500fd9f9d72a6059099ccd5a2334349b023bbae5.jpg");
            result.put("deptid" , "01");
            result.put("idcode" , "360428199305181019");
            result.put("gender" , 0);
            result.put("title" , "01");
            result.put("educational" , "1");
            result.put("mobilephone" , "13632505081");
            result.put("birthday" , "05-18");
            result.put("prov" , "41");
            result.put("city" , "20");
            result.put("area" , "11");
            result.put("address" , "深圳市宝安区西乡固戍");
            result.put("office" , "深圳市南山区");
            result.put("familyphone" , "13818181818");
            result.put("officephone" , "0755-12345678");
            result.put("descri" , "帅的一比");
            result.put("status" , "1");
            retObj.put("result" ,result);
        }else{
            retObj = Common.getFailResult();
        }

        return retObj;
    }
}
