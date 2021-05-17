package demo.test.output_invoice;

import demo.entity.output_invoice.InvoiceBuildParam;
import demo.entity.output_invoice.InvoiceWill;
import demo.utils.HttpClientUtil;
import demo.utils.URLConfigEnum;

import java.util.Map;

/**
 * @author wrk
 * @time 2021-05-13 15:14
 * 未开票收入管理api测试入口
 */
public class InvoiceWillTest {
    public static void main(String[] args) throws Exception {
        //未开票查询
        String result ="";
//        result=result();
        //新增未开票
//        result=save();
        //开票状态查询服务
//        result=queryInvoiceStatus();
        //未开票记录变更查询
        result=change();
        System.out.println(result);

    }

    public static String change() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = InvoiceWill.change();
        return HttpClientUtil.jsonPost(URLConfigEnum.CHANGE.getUrl(), (Map) paramsMap);
    }

    //开票状态查询服务
    public static String queryInvoiceStatus() throws Exception {
        //构造POST表单Map
        Map<String, String> paramsMap = InvoiceWill.buildQueryInvoiceStatusPostParam();
        return HttpClientUtil.post(URLConfigEnum.QUERY_INBOICE_STATUS.getUrl(), (Map) paramsMap);
    }

    public static String result() throws Exception{
        Map<String, Object> paramsMap = InvoiceWill.result();
        return HttpClientUtil.jsonPost(URLConfigEnum.RESULT.getUrl(), paramsMap);
    }

    public static String save() throws Exception{
        Map<String, Object> paramsMap = InvoiceWill.save();
        return HttpClientUtil.jsonPost(URLConfigEnum.SAVE.getUrl(), paramsMap);
    }

}
