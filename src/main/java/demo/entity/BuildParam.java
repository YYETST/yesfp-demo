package demo.entity;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: yesfp-demo
 * @description:
 * @author: kw
 * @create: 2020/05/21 12:41
 */
public class BuildParam {


    public static Map<String, String> buildQueryInvoiceStatusPostParam() {
        Map<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put("fpqqlsh", buildFpqqlsh());
        return paramsMap;
    }

    public static Map<String, String> buildRecognisePostParam() {
        Map<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put("nsrsbh", "201609140000001");
        paramsMap.put("orgcode", "20160914001");
        paramsMap.put("file", "I7BTLrJ1qY2tfy5ByM6VCN8+T69E7JqCM84Nsa1nOXhMGY+jM77C");
        return paramsMap;
    }

    /**
     * 构造 开票蓝票请求服务 表单数据
     */
    public static Map<String, String> buildInsertWithArrayPostParam() {
        Map<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put("requestdatas", buildRequestDatas());
        paramsMap.put("email", buildEmailConfigs());
        paramsMap.put("sms", buildSmsConfigs());
        paramsMap.put("url", buildUrlConfigs());
        paramsMap.put("autoAudit", "false");
        return paramsMap;
    }
    /**
     * url回掉配置
     */
    private static String buildUrlConfigs() {
        List<Object> datas = new ArrayList<Object>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("fpqqlsh", buildFpqqlsh());
        data.put("url", "http://117.12.12.3:7787/EinvoiceRESTService/CallBackEInvoices/");
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
        data.put("address", "123123123123");
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
        data.put("address", "123@163.com");
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
        data.put("XSF_NSRSBH", "201609140000001");
        data.put("GMF_MC", "购买方名称");
        data.put("GMF_DZDH", "购买方地址电话");
        //组织编码，测试环境请一定使用测试环境的组织编码
        data.put("ORGCODE", "20160914001");
        data.put("JSHJ", 1396.00);
        data.put("items", buildItems());
        datas.add(data);
        GsonBuilder builder = new GsonBuilder();
        return builder.create().toJson(datas);
    }

    /**
     * 构造request发票明细
     */
    private static List<Object> buildItems() {
        List<Object> items = new ArrayList<Object>();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("XMJSHJ", "1396.00");
        data.put("XMMC", "住宅物业管理费2");
        //税率16%需要写成0.16的格式
        data.put("SL", 0.16);
        //SPBM字段为商品税收分类编码，不同的商品会有不同的编码，不对应的话会影响报税，需要咨询下公司财务
        data.put("SPBM", "3040502029902000000");
        items.add(data);
        return items;
    }


    /**
     * 获取发票请求流水号
     * 长度不超过20位，长度在1到20位的字母和数字组合，不可以重复的，不要包含window系统文件名限制的特殊字符
     *
     * @return 发票请求流水号
     */
    private static String buildFpqqlsh() {
        return "254291i05h2080102sKs";
    }

}