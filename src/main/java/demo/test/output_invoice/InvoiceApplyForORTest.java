package demo.test.output_invoice;

import demo.entity.output_invoice.InsertForQRInvoice;
import demo.entity.output_invoice.InvoiceBuildParam;
import demo.utils.HttpClientUtil;
import demo.utils.URLConfigEnum;

import java.util.Map;

/**
 * @author wrk
 * @time 2021-05-13 15:11
 * 扫码开票相关API测试入口
 */
public class InvoiceApplyForORTest {
    public static void main(String[] args) throws Exception {
        System.out.println(scanApply());
    }

    public static String scanApply() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = InsertForQRInvoice.buildRequestDatasQR();
        System.out.println(paramsMap);
        return HttpClientUtil.post(URLConfigEnum.SCAN.getUrl(), (Map) paramsMap);
    }
}
