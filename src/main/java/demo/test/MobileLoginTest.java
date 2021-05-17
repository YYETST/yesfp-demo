package demo.test;

import com.alibaba.fastjson.JSON;
import demo.utils.MobileLoginUtils;

import java.util.HashMap;
import java.util.Map;

public class MobileLoginTest {

  public static void main(String[] args) {
    testLogin();
    String username = "17600104874";
    String password = "xiaobo0307hao";
    //token值每查询一次改变一次
    testQuery(MobileLoginUtils.loginV2(username,password));
    test(MobileLoginUtils.loginV2(username,password));
  }

  public static void testLogin() {

    String username = "17600104874";
    String password = "xiaobo0307hao";

    //登录获取token
    String token = MobileLoginUtils.loginV2(username,password);

    System.out.println(token);

  }

  public static void testQuery(String token) {

    //登录时获得的token


    String url = "https://yesfp.yonyoucloud.com/piaoeda-web/mobile/invoices/advancequery?page=1&size=5&token="+token;
    Map<String, Object> entity = new HashMap<>();
//    entity.put("fpjz", "1");
    //entity.put("classify", "交通");
    entity.put("expensestatus", new Integer[] {-1,33,36});

    String result = MobileLoginUtils.doPostJson(url, JSON.toJSONString(entity));

    System.out.println(result);

  }

  public static void test(String token) {
//    String token = "YWVmYjQ2NzAtMGI4MS00NjE5LWIwNmEtNzE5ZTdiNWNhODJk";//登录时获得的token
    //token值每查询一次改变一次  所以不能使用固定token 应该
    String url = "https://yesfp.yonyoucloud.com/piaoeda-web/mobile/invoices/advancequery?page=1&size=5&token="+token;
    Map<String, Object> entity = new HashMap<>();
    entity.put("fpjz", "0");
    //entity.put("classify", "交通");
    entity.put("expensestatus", new Integer[] {-1,33});

    String result = MobileLoginUtils.doPostJson(url, JSON.toJSONString(entity));

    System.out.println(result);

  }

}
