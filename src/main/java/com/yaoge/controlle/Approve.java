package com.yaoge.controlle;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 审批
 */
@RestController
@RequestMapping("approve")
public class Approve {

    @RequestMapping("build")
    @ResponseBody
    public Object build(@RequestBody JSONObject object) {

        Common.getHeadInfo(object);

        //获取数据
        JSONObject data = (JSONObject) object.get("data");

        //必填字段为空
        if (data.containsKey("approverid") || data.containsKey("status")) {
            return Common.getHasNullFail();
        }
        Integer approverid = (Integer) data.get("approverid");
        String status = (String) data.get("status");

        JSONObject retObj = Common.getSuccessResult();
        JSONObject object1 = new JSONObject();
        JSONArray result = new JSONArray();
        object1.put("appid", 1001);
        object1.put("bldid", 2001);
        object1.put("bldname", "bldname       1");
        object1.put("devid", 3001);
        object1.put("devname", "R");
        object1.put("opertype", "opertype      1");
        object1.put("logo", "logo          1");
        object1.put("panorama", "panorama      1");
        object1.put("sellprice", "sellprice     1");
        object1.put("unit", "0");
        object1.put("propertytype", "1");
        object1.put("buildcategory", "1");
        object1.put("housetype", "1");
        object1.put("capital", "1");
        object1.put("agentflag", "1");
        object1.put("agentname", "agentname     1");
        object1.put("prov", "prov          1");
        object1.put("city", "city          1");
        object1.put("area", "area          1");
        object1.put("address", "address       1");
        object1.put("conuserid", 1002);
        object1.put("conusername", "conusername   1");
        object1.put("conuserphone", "conuserphone  1");
        object1.put("repusername", "repusername   1");
        object1.put("repuserphone", "repuserphone  1");
        object1.put("saletelphone", "saletelphone  1");
        object1.put("uspdesc", "uspdesc       1");
        object1.put("isdeep", 1);
        object1.put("reccate", 1);
        object1.put("actcate", 1);
        object1.put("actname", "actname       1");
        object1.put("joinbegindate", "joinbegindate 1");
        object1.put("joinenddate", "joinenddate   1");
        object1.put("apperid", 2015);
        object1.put("appernm", "appernm       1");
        object1.put("appertm", "appertm       1");
        object1.put("approverid", 1024);
        object1.put("approvernm", "approvernm    1");
        object1.put("approvertm", "approvertm    1");
        object1.put("approverid2", 1022);
        object1.put("approvernm2", "approvernm2   1");
        object1.put("approvertm2", "approvertm2   1");
        object1.put("reason", "reason        1");
        object1.put("buildstatus", 1);
        object1.put("prestatus", "1");
        object1.put("status", 1);
        object1.put("summary", "summary       1");
        object1.put("settime", "1514739661");
        object1.put("updatetime", "1514739661");
        result.add(object1);

        object1.clear();
        object1.put("appid", 2002);
        object1.put("bldid", 2002);
        object1.put("bldname", "bldname       2");
        object1.put("devid", 3002);
        object1.put("devname", "R");
        object1.put("opertype", "opertype      2");
        object1.put("logo", "logo          2");
        object1.put("panorama", "panorama      2");
        object1.put("sellprice", "sellprice     2");
        object1.put("unit", "0");
        object1.put("propertytype", "2");
        object1.put("buildcategory", "2");
        object1.put("housetype", "2");
        object1.put("capital", "2");
        object1.put("agentflag", "2");
        object1.put("agentname", "agentname     2");
        object1.put("prov", "prov          2");
        object1.put("city", "city          2");
        object1.put("area", "area          2");
        object1.put("address", "address       2");
        object1.put("conuserid", 2002);
        object1.put("conusername", "conusername   2");
        object1.put("conuserphone", "conuserphone  2");
        object1.put("repusername", "repusername   2");
        object1.put("repuserphone", "repuserphone  2");
        object1.put("saletelphone", "saletelphone  2");
        object1.put("uspdesc", "uspdesc       2");
        object1.put("isdeep", 2);
        object1.put("reccate", 2);
        object1.put("actcate", 2);
        object1.put("actname", "actname       2");
        object1.put("joinbegindate", "joinbegindate 2");
        object1.put("joinenddate", "joinenddate   2");
        object1.put("apperid", 2025);
        object1.put("appernm", "appernm       2");
        object1.put("appertm", "appertm       2");
        object1.put("approverid", 2024);
        object1.put("approvernm", "approvernm    2");
        object1.put("approvertm", "approvertm    2");
        object1.put("approverid2", 2022);
        object1.put("approvernm2", "approvernm2   2");
        object1.put("approvertm2", "approvertm2   2");
        object1.put("reason", "reason        2");
        object1.put("buildstatus", 2);
        object1.put("prestatus", "2");
        object1.put("status", 2);
        object1.put("summary", "summary       2");
        object1.put("settime", "2524739662");
        object1.put("updatetime", "2524739662");
        result.add(object1);

        retObj.put("result", result);


        return retObj;
    }

    @RequestMapping("build/do")
    @ResponseBody
    public Object buildDo(@RequestBody JSONObject object) {

        Common.getHeadInfo(object);

        //获取数据
        JSONObject data = (JSONObject) object.get("data");

        //必填字段为空
        if (data.containsKey("appid") || data.containsKey("approverid") || data.containsKey("status")) {
            return Common.getHasNullFail();
        }
        Integer appid = (Integer) data.get("appid");
        Integer approverid = (Integer) data.get("approverid");
        String status = (String) data.get("status");

        JSONObject retObj = Common.getSuccessResult();

        return retObj;
    }

}
