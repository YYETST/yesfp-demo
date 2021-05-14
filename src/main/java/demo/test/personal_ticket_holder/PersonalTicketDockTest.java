package demo.test.personal_ticket_holder;

import demo.entity.input_ticket.StaBookBuildParam;
import demo.utils.HttpClientUtil;
import demo.utils.URLConfigEnum;

import java.util.Map;

/**
 * @author wrk
 * @time 2021-05-13 16:32
 * 个人票夹后台对接api测试类
 */
public class PersonalTicketDockTest {
    public static void main(String[] args) throws Exception {
        String result = "";
        result=authCheck();
        System.out.println(result);
    }
    //账号绑定验证
    public static String authCheck() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = StaBookBuildParam.setUser();
        //json格式
        return HttpClientUtil.put(URLConfigEnum.AUTHCHECK.getUrl(), paramsMap);
    }
}
