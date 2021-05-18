package demo.test.output_invoice;

import demo.entity.output_invoice.InsertForQRInvoice;
import demo.entity.output_invoice.InvoiceBuildParam;
import demo.entity.output_invoice.InvoiceWill;
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
import java.util.HashMap;
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
        //申请红字信息表  报错9999
//       result=applyRedInfo();
        //查询红字信息表
        result=qurreyRedInfo("3211232123");
        System.out.println(result);
    }
    //申请红字信息表  报错9999
    private static String applyRedInfo() throws Exception {
        Map<String, Object> paramsMap = InvoiceWill.apply();
        return HttpClientUtil.jsonPost(URLConfigEnum.READINFOAPPLY.getUrl(), (Map) paramsMap);
    }
    //查询红字信息表
    public static String qurreyRedInfo(String q) throws Exception {
        Map<String, Object> paramsMap = new HashMap<>();
        System.out.println(URLConfigEnum.QUERYREAINFO.queryRedInfo(q));
        return HttpClientUtil.get(URLConfigEnum.QUERYREAINFO.queryRedInfo(q),paramsMap);
    }
}
