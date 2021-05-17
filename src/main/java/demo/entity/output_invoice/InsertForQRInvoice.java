package demo.entity.output_invoice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wrk
 * @time 2021-05-14 13:06
 * 扫码开票方法
 */
public class InsertForQRInvoice {


    /**
     * 扫码开票
     * XSF_NSRSBH	String	20	是		销售方纳税人识别号
     * JSHJ	Double	15,2	是		价税合计	两位小数
     * ORGCODE	String	100	是		电子发票平台唯一标识，从电子发票平台获取。
     * RQSJ	String	100	是		日期时间
     * SHMC	String	100	是		商户名称
     * 构造requestdatas
     *
     * @return
     */
    public static Map<String, Object> buildRequestDatasQR() {
        Map<String, Object> data = new HashMap<>();
        //测试环境请一定要使用测试纳税人识别号
        data.put("XSF_NSRSBH", "201609140000001");
        //组织编码，测试环境请一定使用测试环境的组织编码
        data.put("ORGCODE", "20160914001");
        data.put("FPQQLSH", buildFpqqlsh());
        data.put("SHMC", "asdasd");
        data.put("JSHJ", 117);
        data.put("ZDYBZ", "aa");
        data.put("items", buildItems());
        return data;
    }

    /**
     * 获取发票请求流水号
     * 长度不超过20位，长度在1到20位的字母和数字组合，不可以重复的，不要包含window系统文件名限制的特殊字符
     *
     * @return 发票请求流水号
     */
    private static String  buildFpqqlsh() {
        return "164291i05l0003sKs234";
    }


    /**
     * 构造request发票明细
     *
     * @return
     */
    private static List<Object> buildItems() {
        List<Object> items = new ArrayList<>();
        Map<String, Object> data = new HashMap<>();
        data.put("XMMC", "（pp瓶）0.9%氯化钠注射液");
        data.put("XMJSHJ", 117);
        //税率17%需要写成0.17的格式
        data.put("SL", 0.17);
        //SPBM字段为商品税收分类编码，不同的商品会有不同的编码，不对应的话会影响报税，需要咨询下公司财务
        data.put("SPBM", "3010504020000000000");
        items.add(data);
        return items;

    }
}
