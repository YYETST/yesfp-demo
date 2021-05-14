package demo.test.output_invoice;

import demo.entity.output_invoice.InsertForQRInvoice;
import demo.utils.HttpClientUtil;
import demo.utils.URLConfigEnum;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import java.net.URL;
import java.util.Map;

/**
 * @author wrk
 * @time 2021-05-13 15:14
 * 红字信息表API测试入口
 */

public class RedInfoApplyTest {
    private static String s=""    ;
    public static void main(String[] args) throws Exception {
        String result="";
        //查询红字信息表
        //result=qurreyRedInfo("1331134384608165888");
        System.out.println(result);
    }
    public static String qurreyRedInfo(String q) throws Exception {
        //构造POST表单Map
//        System.out.println(URLConfigEnum.QUERYREAINFO.queryRedInfo(q));

        //1.获得一个httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        //2.生成一个get请求
        HttpGet httpget = new HttpGet(URLConfigEnum.QUERYREAINFO.queryRedInfo(q));
        //3.执行get请求并返回结果
        CloseableHttpResponse response = httpclient.execute(httpget);
        try {

            HttpEntity resEntity = response.getEntity();
            if(resEntity != null){
                s=EntityUtils.toString(resEntity,"utf-8");
            }

        } finally {
            response.close();
        }
        return s+"";
    }
}
