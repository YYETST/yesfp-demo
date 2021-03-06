package demo.test.input_ticket;

import demo.entity.personal_ticket_holder.ReimburseCollection;
import demo.entity.input_ticket.StaBookBuildParam;
import demo.test.APITest;
import demo.utils.HttpClientUtil;
import demo.utils.URLConfigEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author wrk
 * @time 2021-05-13 15:21
 * 报销台账Api测试入口类
 */
public class ReimburseLedgerTest {


    private static Logger LOGGER = LoggerFactory.getLogger(APITest.class);

    public static void main(String[] args) throws Exception {
        String result = "";
        /**
         * ocr识别接口v2
         * */
        //result=recognise();


        /**
         * 识别结果保存台账
         * */
        //result=OCR_Save();

        /**
         * 台账报销
         * */
        //result=reimbursed();


        /**
         * 台账取消报销
         * */
        //result=cancelReimbursed();

        /**
         * 台账记账
         * */
        //result=account();

        /**
         * 台账取消记账
         * */
        //result=cancelAccount();

        /**
         * 报销台账删除
         * */
        //result=delete();

        /**
         * 飞机票台账查询
         * */
        //result=air();

        /**
         *  火车票台账查询
         * */
        //result=train();

        /**
         * 出租车台账查询
         * */
        //result=taxi();

        /**
         * 机打发票台账查询
         * */
//        result=machine();
//        System.out.println(result+"machine");
        /**
         * 定额发票台账查询
         * */
//        result=quota();
        /**
         * 过路费发票台账查询
         * */
//        result=tolls();
        /**
         * 客运汽车发票台账查询
         * */
//        result=passenger();
        /**
         *报销台账查询详情信息接口
         *  */
//        result=detail();

        /**
         *报销台账置支付状态接口
         * */
        //result=paid();
        /**
         *报销台账置取消支付状态接口
         * */
//        result=canclePaid();
        /**
         * 报销台账更新凭证号接口
         * */
        //result=updateVoucherid();

        /**
         * 查验并缓存
         * */
        result=verify();


        /**
         * 提交保存到报销台账  token从查验中获取
         * 发票保存token；1张发票对应1个saveToken。
         * 此token有效期为10分钟，超过时长此token失效，需要重新查验。token只能使用一次。
         * */
        result=submit();
        System.out.println(result);


    }

    //提交保存到报销台账
    public static String submit() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = StaBookBuildParam.submit();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.SUBMIT.getUrl(), paramsMap);
    }

    //查验并缓存
    public static String verify() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = StaBookBuildParam.verfiy();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.VERIFY.getUrl(), paramsMap);
    }


    //OCR识别接口v2
    public static String recognise() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = StaBookBuildParam.buildRecognisePostParam();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.RECOGNISE.getUrl(), paramsMap);
    }


    /**
     * 识别结果保存台帐
     */
    public static String OCR_Save() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.OCR_Save();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.OCR_SAVE.getUrl(), paramsMap);
    }

    /**
     * 台账报销
     */
    public static String reimbursed() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.reimbursed();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.REIMBURSED.getUrl(), paramsMap);
    }

    /**
     * 台账取消报销
     */
    public static String cancelReimbursed() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.cancelReimbursed();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.CANCEL_REIMBURSED.getUrl(), paramsMap);
    }

    /**
     * 台账记账
     */
    public static String account() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.account();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.ACCOUNT.getUrl(), paramsMap);
    }

    /**
     * 台账取消记账
     */
    public static String cancelAccount() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.cancelAccount();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.CANCEL_ACCOUNT.getUrl(), paramsMap);
    }

    /**
     * 报销台账删除
     */
    public static String delete() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.delete();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.DELETE.getUrl(), paramsMap);
    }

    /**
     * 飞机票台账查询
     */
    public static String air() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.find();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.AIR.getUrl(), paramsMap);
    }

    /**
     * 火车票台账查询
     */
    public static String train() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.find();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.TRAIN.getUrl(), paramsMap);
    }

    /**
     * 出租车台账查询
     */
    public static String taxi() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.find();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.TAXI.getUrl(), paramsMap);
    }
    /**
     * 机打发票台账查询
     * */
    public static String machine() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.find();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.MACHINE.getUrl(), paramsMap);
    }
    /**
     * 定额发票台账查询
     * */
    public static String quota() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.find();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.QUOTA.getUrl(), paramsMap);
    }
    /**
     * 客运汽车发票台账查询
     * */
    public static String passenger() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.find();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.PASSENGER.getUrl(), paramsMap);
    }
    /**
     * 过路费发票台账查询
     * */
    public static String tolls() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.find();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.TOOLS.getUrl(), paramsMap);
    }
    /**
     *报销台账置支付状态接口
     * */
    public static String paid() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.query();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.PAID.getUrl(), paramsMap);
    }
    /**
     * 取消报销台账置支付状态接口
     * */
    public static String detail() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.query();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.DETAIL.getUrl(), paramsMap);
    }
    /**
     * 报销台账置取消支付状态接口
     */
    public static String canclePaid() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.query();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.CANCELPAID.getUrl(), paramsMap);
    }

    /**
     * 报销台账更新凭证号接口
     */
    public static String updateVoucherid() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.query();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.UPDATEVOUCHERID.getUrl(), paramsMap);
    }

    //    PAID ("/input-tax/api/bill-collections/paid&appid="),
    //    /**
    //     *报销台账置取消支付状态接口
    //     * */
    //    CANCELPAID ("/input-tax/api/bill-collections/cancel-paid&appid="),
    //    /**
    //     * 报销台账更新凭证号接口
    //     * */
    //    UPDATEVOUCHERID("input-tax/api/bill-collections/update-voucherid&appid="),


    //报销台账查询接口（新）
    public static String CollQuery() throws Exception {
        Map<String, Object> paramsMap = ReimburseCollection.query();
        return HttpClientUtil.jsonPost(URLConfigEnum.QUERY.getUrl(), paramsMap);
    }

}

