package demo.entity.output_invoice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *未开票收入管理
 * */
public class InvoiceWill {
    /**
     * 未开票记录变更查询 报错
     * */
    public static Map<String, Object> change() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        //发票号码
        paramsMap.put("beginTime","2019-10-24 16:31:15");
        paramsMap.put("endTime","2021-01-01 16:31:15");
        paramsMap.put("orgCode", "20160914001");
        paramsMap.put("pageNum", 2);
        paramsMap.put("pageSize", 15);

        return paramsMap;
    }

    /**
     * 构造 开票状态查询服务 表单数据
     */
    public static Map<String, String> buildQueryInvoiceStatusPostParam() {
        Map<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put("fpqqlsh", buildFpqqlsh());
        return paramsMap;
    }

    private static String buildFpqqlsh() {
        return "SX210402000030";
    }
    /**
     * 未开票查询
     */
    public static Map<String, Object> result() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        //发票代码
        paramsMap.put("lyid", "1");
        //发票号码
        paramsMap.put("djqqlsh", "23770399");
        paramsMap.put("orgCode", "20160914001");
        paramsMap.put("pageNum", "1");
        paramsMap.put("orgSize", "20160914001");

        return paramsMap;
    }

    //新增未开票
    public static Map<String, Object> save() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        //发票代码
        paramsMap.put("lyid", "1");
        //发票号码
        paramsMap.put("djqqlsh", "23770399");
        paramsMap.put("orgCode", "20160914001");
        paramsMap.put("pageNum", "1");
        paramsMap.put("orgSize", "20160914001");
        paramsMap.put("GMF_MC", "广州佰仕德材料科技有限公司");
        paramsMap.put("GMF_NSRSBH", "91440101MA5CR3FU35");
        paramsMap.put("GMF_DZDH", "广州市花都区红棉大道北16号4楼4B07室 020-61796191");
        paramsMap.put("GMF_YHZH", "中国农业银行股份有限公司广州花都名门支行 44087001040011474");

        paramsMap.put("zdrq","2020-09-09");
        paramsMap.put("invoiceWillBs",buildWillbs());
        return paramsMap;
    }

    private static Object buildWillbs() {

        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("XMMC", "硅胶5299B");
        paramsMap.put("XMBM", "202020012");
        paramsMap.put("GGXH", "25kg/桶");
        paramsMap.put("DW", "千克");
        paramsMap.put("XMSL", 2);
        paramsMap.put("XMJSHJ", 40);
        paramsMap.put("hh","1");
        paramsMap.put("SPBM", "1070213070000000000");
        paramsMap.put("SL", 0.16);
        return paramsMap;
    }
    //新增红字信息表
    public static Map<String, Object> apply() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("orgcode", "20160914001");
        paramsMap.put("xxbbh","2018011906");
        paramsMap.put("reqMemo", "1100000000");
        paramsMap.put("GMF_MC", "用友金融信息技术股份有限公司123");
        paramsMap.put("GMF_NSRSBH", "201609140000001");
        paramsMap.put("XSF_NSRSBH", "111222333456333");//91110105MA0084MW37
        paramsMap.put("XSF_MC", "测试333");
        paramsMap.put("kprq","202101");
        paramsMap.put("items",buildItems());
        paramsMap.put("hjje",-99.01);
        paramsMap.put("hjse",-0.99);
        paramsMap.put("jshj",-100);
        paramsMap.put("reqBillNo","3211ss232123");
        paramsMap.put("resBillNo","88888888");


        return paramsMap;
    }

    /**
     * 构造request发票明细
     */
    private static List<Object> buildItems() {
        List<Object> items = new ArrayList<Object>();
        Map<String, Object> data1 = new HashMap<String, Object>();

        data1.put("XMJSHJ", -100);
        data1.put("YSXMMC", "橡皮");
        data1.put("XMMC", "*运输服务*橡皮");
        data1.put("xmdj","23.0041942911");
        data1.put("xmhsdj","23.234213");
        data1.put("GGXH", "一二三四五六七八");
        data1.put("DW", "一二三");
        data1.put("XMSL", "-4.3039977296");
        data1.put("SE", -0.99);
        //税率16%需要写成0.16的格式
        data1.put("SL", 0.01);
        data1.put("xmje",-99.01);
        data1.put("spbm", "3213124314324322");
        items.add(data1);

        return items;
    }
}
