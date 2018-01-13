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

    /**
     * 修改密码
     * @param object
     * @return
     */
    @RequestMapping("pwd/upd")
    @ResponseBody
    public Object pwd_upd(@RequestBody JSONObject object) {


        //获取头信息
        Common.getHeadInfo(object);

        //获取数据
        JSONObject data = (JSONObject) object.get("data");
        String loginid = data.containsKey("loginid") ? (String) data.get("loginid") : "";
        String pwd = data.containsKey("pwd") ? (String) data.get("pwd") : "";
        String newpwd = data.containsKey("newpwd") ? (String) data.get("newpwd") : "";
        String verificode = data.containsKey("verificode") ? (String) data.get("verificode") : "";


        JSONObject retObj = Common.getSuccessResult();


        JSONObject result = new JSONObject();

        result.put("userid", 666);
        result.put("username", "huang");
        result.put("loginid", loginid);
        result.put("img", "http://himg.bdimg.com/sys/portrait/item/0db2e58991e6838ae9a38e656e6a6f79692f.jpg");
        result.put("background", "http://e.hiphotos.baidu.com/image/h%3D300/sign=8d3a9ea62c7f9e2f6f351b082f31e962/500fd9f9d72a6059099ccd5a2334349b023bbae5.jpg");
        result.put("deptid", "01");
        result.put("idcode", "360428199305181019");
        result.put("gender", 0);
        result.put("title", "01");
        result.put("educational", "1");
        result.put("mobilephone", "13632505081");
        result.put("birthday", "05-18");
        result.put("prov", "41");
        result.put("city", "20");
        result.put("area", "11");
        result.put("address", "深圳市宝安区西乡固戍");
        result.put("office", "深圳市南山区");
        result.put("familyphone", "13818181818");
        result.put("officephone", "0755-12345678");
        result.put("descri", "帅的一比");
        result.put("status", "1");
        retObj.put("result", result);

        return retObj;
    }

    /**
     * 用户信息
     * @param object
     * @return
     */
    @RequestMapping("user/info")
    @ResponseBody
    public Object user_infof(@RequestBody JSONObject object) {


        //获取头信息
        Common.getHeadInfo(object);

        //获取数据
        JSONObject data = (JSONObject) object.get("data");
        Integer userid = data.containsKey("userid") ? (Integer) data.get("userid") : null;


        JSONObject retObj = Common.getSuccessResult();


        JSONObject result = new JSONObject();

        result.put("userid", userid);
        result.put("username", "huang");
        result.put("loginid", "admin");
        result.put("img", "http://himg.bdimg.com/sys/portrait/item/0db2e58991e6838ae9a38e656e6a6f79692f.jpg");
        result.put("background", "http://e.hiphotos.baidu.com/image/h%3D300/sign=8d3a9ea62c7f9e2f6f351b082f31e962/500fd9f9d72a6059099ccd5a2334349b023bbae5.jpg");
        result.put("deptid", "01");
        result.put("idcode", "360428199305181019");
        result.put("gender", 0);
        result.put("title", "01");
        result.put("educational", "1");
        result.put("mobilephone", "13632505081");
        result.put("birthday", "05-18");
        result.put("prov", "41");
        result.put("city", "20");
        result.put("area", "11");
        result.put("address", "深圳市宝安区西乡固戍");
        result.put("office", "深圳市南山区");
        result.put("familyphone", "13818181818");
        result.put("officephone", "0755-12345678");
        result.put("descri", "帅的一比");
        result.put("status", "1");
        retObj.put("result", result);

        return retObj;
    }

    /**
     * 获取角色信息
     * @param object
     * @return
     */
    @RequestMapping("user/role")
    @ResponseBody
    public Object user_role(@RequestBody JSONObject object) {


        //获取头信息
        Common.getHeadInfo(object);

        //获取数据
        JSONObject data = (JSONObject) object.get("data");
        Integer userid = data.containsKey("userid") ? (Integer) data.get("userid") : null;


        JSONObject retObj = Common.getSuccessResult();


        JSONObject result = new JSONObject();

        result.put("userid", userid);
        result.put("roleid", "001");
        result.put("rolename", "管理员");
        result.put("roledesc", "最大权限");
        retObj.put("result", result);

        return retObj;
    }

    /**
     * 新增/修改用戶信息
     * @param object
     * @return
     */
    @RequestMapping("user/add")
    @ResponseBody
    public Object user_add(@RequestBody JSONObject object) {


        //获取头信息
        Common.getHeadInfo(object);

        //获取数据
        JSONObject data = (JSONObject) object.get("data");
        Integer userid = data.containsKey("userid") ? (Integer) data.get("userid") : 0;
        String username = data.containsKey("username") ? (String) data.get("username") : "";
        String loginid = data.containsKey("loginid") ? (String) data.get("loginid") : "";
        String pwd = data.containsKey("pwd") ? (String) data.get("pwd") : "";
        String img = data.containsKey("img") ? (String) data.get("img") : "";
        String background = data.containsKey("background") ? (String) data.get("background") : "";
        String deptid = data.containsKey("deptid") ? (String) data.get("deptid") : "";
        String idcode = data.containsKey("idcode") ? (String) data.get("idcode") : "";
        Integer gender = data.containsKey("gender") ? (Integer) data.get("gender") : null;
        String title = data.containsKey("title") ? (String) data.get("title") : "";
        String educational = data.containsKey("educational") ? (String) data.get("educational") : "";
        String mobilephone = data.containsKey("mobilephone") ? (String) data.get("mobilephone") : "";
        String birthday = data.containsKey("birthday") ? (String) data.get("birthday") : "";
        String prov = data.containsKey("prov") ? (String) data.get("prov") : "";
        String city = data.containsKey("city") ? (String) data.get("city") : "";
        String area = data.containsKey("area") ? (String) data.get("area") : "";
        String address = data.containsKey("address") ? (String) data.get("address") : "";
        String office = data.containsKey("office") ? (String) data.get("office") : "";
        String familyphone = data.containsKey("familyphone") ? (String) data.get("familyphone") : "";
        String officephone = data.containsKey("officephone") ? (String) data.get("officephone") : "";
        String descri = data.containsKey("descri") ? (String) data.get("descri") : "";


        JSONObject retObj = Common.getSuccessResult();


        JSONObject result = new JSONObject();

        result.put("userid", userid);
        retObj.put("result", result);

        return retObj;
    }


}
