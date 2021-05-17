package demo.entity.output_invoice;

import java.util.HashMap;
import java.util.Map;

/**
 * 发票打印方法
 * */
public class InvoicePrint {
    /**
     * 构造 发票打印 表单数据
     */
    public static Map<String, Object> buildTaxPrintParam() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        //发票代码
        paramsMap.put("fpDm", "200004275230");
        //发票号码
        paramsMap.put("fpHm", "23770399");
        paramsMap.put("orgCode", "20160914001");

        return paramsMap;
    }
}

