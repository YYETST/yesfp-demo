package demo.test.personal_ticket_holder;

import com.alibaba.fastjson.JSON;
import demo.entity.input_ticket.StaBookBuildParam;
import demo.utils.HttpClientUtil;
import demo.utils.MobileLoginUtils;
import demo.utils.URLConfigEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wrk
 * @time 2021-05-13 16:32
 * 个人票夹后台对接api测试类
 */
public class PersonalTicketDockTest {
    public static void main(String[] args) throws Exception {
        String result = "";
        //绑定验证  可以运行
        result=authCheck();
        //获取加密公钥
//        result=getPubKey();
        //账号登录并绑定
        String username = "17600104874";
        String password = "xiaobo0307hao";

        //登录获取token
//        String token = MobileLoginUtils.loginV2(username,password);
//        System.out.println(token);

        //token值每查询一次改变一次
        //票夹查询
//        testQuery(MobileLoginUtils.loginV2(username,password));
//        test(MobileLoginUtils.loginV2(username,password));

        System.out.println(result);
    }



    private static String getPubKey() throws Exception {

        //json格式
        System.out.println(URLConfigEnum.PUBKEY.getUrl());
        return HttpClientUtil.put(URLConfigEnum.PUBKEY.getUrl());
    }

    //账号绑定验证
    public static String authCheck() throws Exception {
        //json格式
        System.out.println(URLConfigEnum.AUTHCHECK.getUrl1("001"));
        Map<String, Object> entity = new HashMap<>();

        return HttpClientUtil.get(URLConfigEnum.AUTHCHECK.getUrl1("001"),entity);
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
