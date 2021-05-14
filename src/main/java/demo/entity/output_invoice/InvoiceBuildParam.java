package demo.entity.output_invoice;

import com.google.gson.GsonBuilder;
import demo.utils.Base64Util;

import java.util.*;

/**
 * @program: yesfp-demo
 * @description: 开票
 * @author: kw
 * @create: 2020/05/21 12:41
 */
public class InvoiceBuildParam {


    /**
     * 扫码开票
     * XSF_NSRSBH	String	20	是		销售方纳税人识别号
     * JSHJ	Double	15,2	是		价税合计	两位小数
     * ORGCODE	String	100	是		电子发票平台唯一标识，从电子发票平台获取。
     * RQSJ	String	100	是		日期时间
     * SHMC	String	100	是		商户名称
     */
    public static Map<String, Object> scanApply() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("XSF_NSRSBH", "9144011476190205X4");
        paramsMap.put("JSHJ", "15.2");
        paramsMap.put("orgcode", "20160914001");
        paramsMap.put("RQSJ", "2021-01-01");
        paramsMap.put("SHMC", "接口测试wrk");
        paramsMap.put("items",buildItems());
        paramsMap.put("FPQQLSH","12345678910aaasssddd");
        paramsMap.put("GMF_MC", "广州佰仕德材料科技有限公司");
        paramsMap.put("GMF_NSRSBH", "91440101MA5CR3FU35");
        paramsMap.put("GMF_DZDH", "广州市花都区红棉大道北16号4楼4B07室 020-61796191");
        paramsMap.put("GMF_YHZH", "中国农业银行股份有限公司广州花都名门支行 44087001040011474");
        return paramsMap;
    }

    /**
     * 构造获取专票参数
     */
    public static Map<String, Object> buildQueryInvoiceParam() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("yfpDm", "");
        paramsMap.put("yfpHm", "");
        paramsMap.put("orgcode", "20160914001");
        paramsMap.put("rq_q", "2021-01-01");
        paramsMap.put("rq_z", "2021-05-06");
        paramsMap.put("period", "202101");
        return paramsMap;
    }

    /**
     * 构造 专票红冲状态查询接口 参数
     */
    public static Map<String, Object> buildRedStateTotalParam() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("yfpDm", "100000064388");
        paramsMap.put("yfpHm", "55216153");
        return paramsMap;
    }

    /**
     * 构造 发票作废 表单数据
     */
    public static Map<String, Object> buildInvalidParam() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("requestdatas", buildInvalidRequestdatas());
        return paramsMap;
    }

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

    /**
     * 构造 开票状态查询服务 表单数据
     */
    public static Map<String, String> buildQueryInvoiceStatusPostParam() {
        Map<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put("fpqqlsh", buildFpqqlsh());
        return paramsMap;
    }

    /**
     * 构造 开票申请删除 表单数据
     */
    public static Map<String, Object> buildInvoiceApplyDelParam() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        List<Object> datas = new ArrayList<>();
        Map<String, String> requestdatas = new HashMap();
        requestdatas.put("FPQQLSH", buildFpqqlsh());
        requestdatas.put("XSF_NSRSBH", "9144011476190205X4");
        datas.add(requestdatas);
        paramsMap.put("requestdatas", new GsonBuilder().create().toJson(datas));
        return paramsMap;
    }


    /**
     * 构造 开票蓝票请求服务 表单数据
     */
    public static Map<String, String> buildInsertWithArrayPostParam() {
        Map<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put("requestdatas", buildRequestDatas());
        //可以选填
        paramsMap.put("email", buildEmailConfigs());
        //paramsMap.put("sms", buildSmsConfigs());
        paramsMap.put("url", buildUrlConfigs());
        paramsMap.put("autoAudit", "true");
        return paramsMap;
    }

    /**
     * 开票申请审核通过
     */
    public static Map<String, Object> issue() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("requestdatas", buildRequestDatas());
        paramsMap.put("autoAudit", true);
        return paramsMap;
    }

    /**
     * 发票红冲请求服务
     * 电子发票部分红冲
     */
    public static Map<String, Object> red() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("requestdatas", redRequestDatas());
        paramsMap.put("url", buildUrlConfigs());
        paramsMap.put("autoAudit", "false");
        return paramsMap;
    }

    /**
     * 开票蓝票请求服务--发票拆分
     */
    public static Map<String, Object> insertWithSplit() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("requestdatas", buildRequestDatasSplit());
        paramsMap.put("url", buildUrlConfigs());
        paramsMap.put("autoAudit", "true");
        paramsMap.put("email", buildEmailConfigs());
        paramsMap.put("sms", buildSmsConfigs());
        return paramsMap;
    }

    /**
     * url回掉配置
     */
    private static String buildUrlConfigs() {
        List<Object> datas = new ArrayList<Object>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("fpqqlsh", buildFpqqlsh());
        data.put("url", "http://18z7873y70.eicp.vip/taxcloud/callback");
        datas.add(data);
        GsonBuilder builder = new GsonBuilder();
        return builder.create().toJson(datas);
    }

    /**
     * 构造短信发送信息
     */
    private static String buildSmsConfigs() {
        List<Object> datas = new ArrayList<Object>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("fpqqlsh", buildFpqqlsh());
        data.put("address", "155****3180");
        datas.add(data);
        GsonBuilder builder = new GsonBuilder();
        return builder.create().toJson(datas);
    }

    /**
     * 构造email发送信息
     */
    private static String buildEmailConfigs() {
        List<Object> datas = new ArrayList<Object>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("fpqqlsh", buildFpqqlsh());
        data.put("address", "kangwang@yonyou.com");
        datas.add(data);
        GsonBuilder builder = new GsonBuilder();
        return builder.create().toJson(datas);
    }

    /**
     * 构造requestdatas
     */
    private static String buildRequestDatas() {
        List<Object> datas = new ArrayList<Object>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("FPQQLSH", buildFpqqlsh());
        //测试环境请一定要使用测试纳税人识别号
//        data.put("ORGCODE","20160914001");
        data.put("XSF_NSRSBH", "201609140000001");//91110105MA0084MW37
        data.put("GMF_MC", "广州佰仕德材料科技有限公司");
        data.put("GMF_NSRSBH", "91440101MA5CR3FU35");
        data.put("GMF_DZDH", "广州市花都区红棉大道北16号4楼4B07室 020-61796191");
        data.put("GMF_YHZH", "中国农业银行股份有限公司广州花都名门支行 44087001040011474");
        data.put("FPLX", "4");
        //组织编码，测试环境请一定使用测试环境的组织编码
//        data.put("ORGCODE", "20160914001");//91110105MA0084MW37
        data.put("JSHJ", 40);
        data.put("items", buildItems());

        datas.add(data);
        GsonBuilder builder = new GsonBuilder();
        return builder.create().toJson(datas);
    }

    /**
     * 构造redRequestdatas
     */
    private static String redRequestDatas() {
        List<Object> datas = new ArrayList<Object>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("FPQQLSH", buildFpqqlsh());
        //蓝色发票代码
        data.put("fpDm", "044007679677");//91110105MA0084MW37
        //蓝色发票号码
        data.put("fpHm", "21427457");
        data.put("JSHJ", -1);
        data.put("items", buildItems());
        //  data.put("ORGCODE", "");//91110105MA0084MW37
        datas.add(data);
        GsonBuilder builder = new GsonBuilder();
        return builder.create().toJson(datas);
    }

    /**
     * 拆分
     *
     * @return
     */
    private static String buildRequestDatasSplit() {
        List<Object> datas = new ArrayList<Object>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("FPQQLSH", buildFpqqlsh());
        //测试环境请一定要使用测试纳税人识别号
        data.put("XSF_NSRSBH", "201609140000001");//91110105MA0084MW37
        data.put("XSF_MC", "销售方名称");
        data.put("XSF_DZDH", "江苏省 无锡市   中国江苏省无锡市江阴市滨江西路");
        data.put("GMF_MC", "接口测试组织-请勿修改");
        data.put("GMF_MC", "接口测试组织-请勿修改");
        data.put("JSHJ", 4000000);
        data.put("items", buildItems());
        // data.put("items", buildItems1());
        datas.add(data);
        GsonBuilder builder = new GsonBuilder();
        return builder.create().toJson(datas);
    }

    /**
     * 构造request发票明细
     */
    private static List<Object> buildItems() {
        List<Object> items = new ArrayList<Object>();
        Map<String, Object> data2 = new HashMap<String, Object>();
        Map<String, Object> data1 = new HashMap<String, Object>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("XMJSHJ", -10);
        data.put("XMMC", "硅胶5299B");
        data.put("XMBM", "202020012");
        data.put("GGXH", "25kg/桶");
        data.put("DW", "千克");
        data.put("XMSL", 2);
        // data.put("SE", -57.52);
        //税率16%需要写成0.16的格式
        data.put("SL", 0.16);
        //SPBM字段为商品税收分类编码，不同的商品会有不同的编码，不对应的话会影响报税，需要咨询下公司财务
        data.put("SPBM", "1070213070000000000");

        data.put("FPHXZ", "1");
        data.put("HH", "1");
        items.add(data);

        data1.put("XMJSHJ", 40);
        data1.put("XMMC", "硅胶5299B");
        data1.put("XMBM", "202020012");
        data1.put("GGXH", "25kg/桶");
        data1.put("DW", "千克");
        data1.put("XMSL", 2);
        // data.put("SE", -57.52);
        //税率16%需要写成0.16的格式
        data1.put("SL", 0.16);
        //SPBM字段为商品税收分类编码，不同的商品会有不同的编码，不对应的话会影响报税，需要咨询下公司财务
        data1.put("SPBM", "1070213070000000000");
        data1.put("FPHXZ", "2");
        data1.put("HH", "2");
        data1.put("ZKHHH", "1");
        items.add(data1);

        data2.put("XMJSHJ", 10);
//        data2.put("XMMC", "饮用水 娃哈哈 Wahaha");
        data2.put("XMBM", "1316927134524661760");
        data2.put("GGXH", "596ml");
//        data2.put("DW", "箱");
        data2.put("XMSL", 2);
        // data.put("SE", -57.52);
        //税率16%需要写成0.16的格式
//        data2.put("SL", 0.13);
        //SPBM字段为商品税收分类编码，不同的商品会有不同的编码，不对应的话会影响报税，需要咨询下公司财务
        data2.put("SPBM", "3060101000000000000");
        items.add(data2);
        return items;
    }


    /**
     * 获取发票请求流水号
     * 长度不超过20位，长度在1到20位的字母和数字组合，不可以重复的，不要包含window系统文件名限制的特殊字符
     *
     * @return 发票请求流水号
     */
    private static String buildFpqqlsh() {
        return "SX210402000030";
    }


    /**
     * 发票作废Requestdatas参数
     */
    private static String buildInvalidRequestdatas() {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("fpHm", "200004275230");
        data.put("fpDm", "23770399");
        GsonBuilder builder = new GsonBuilder();
        return builder.create().toJson(data);
    }


}
