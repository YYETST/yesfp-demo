package demo.test.personal_ticket_holder;

import demo.entity.input_ticket.StaBookBuildParam;
import demo.utils.HttpClientUtil;
import demo.utils.URLConfigEnum;

import java.util.Map;

/**
 * @author wrk
 * @time 2021-05-13 16:32
 * 个人全票种api测试类
 */
public class PersonalTicketTest {
    public static void main(String[] args) throws Exception {

        String result = "";
        /**
         * ocr识别接口v2
         * */
        //result=recognise();

        /**
         * ocr接口图片预览接口
         * */

        /**
         * 个人票夹列表查询
         * */
//        result=billQuery();
        /**
         * 修改发票状态
         * */
//        result=purchaserStatus();
        /**
         * 根据号码代码获取信息
         * */
//        result=summar();

        /**
         * 个人票夹票据详情查询
         * */
//        result=detail();
        /**
         * 个人票价附件预览
         * */
        /**
         * 个人票夹附件下载
         * */

        /**
         *
         * 个人票夹新增
         * */
//        result=add();

        /**
         *
         * 个人票夹删除
         * */
//        result = billDelete();
        /**
         *
         * 个人票夹修改
         * */
//        result=billUpdate();
        /**
         * 个人票价提交到企业台账
         * */
//        result=commit();

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
         * 个人票夹行程单预览
         * */
//        result=preview();
        /**
         * 个人票夹行程单下载
         * */
//        result=download();

        System.out.println(result);


    }


    //OCR识别接口v2
    public static String recognise() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = StaBookBuildParam.buildRecognisePostParam();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.RECOGNISE.getUrl(), paramsMap);
    }

    public static String billQuery() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = StaBookBuildParam.buildInfo();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.BILLQUERY.getUrl(), paramsMap);
    }

    //修改发票状态
    public static String purchaserStatus() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = StaBookBuildParam.changFapiaoStatus();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.PURCHASERSTATUS.getUrl(), paramsMap);
    }

    /**
     * 个人票夹提交发票到报销台账_全票种
     */
    public static String commit() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.commit();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.COMMIT.getUrl(), paramsMap);
    }

    //根据号码代码获取信息
    public static String summar() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.summar();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.SUMMARY.getUrl(), paramsMap);
    }

    //个人票夹票据详情查询
    public static String detail() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.detial();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.BILLDETAIL.getUrl(), paramsMap);
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

    //个人票夹新增
    private static String add() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.add();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.BILLADD.getUrl(), paramsMap);
    }

    //个人票夹删除
    private static String billDelete() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.billDelete();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.BILLDELETE.getUrl(), paramsMap);
    }

    //个人票夹修改
    private static String billUpdate() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.billUpdate();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.BILLUPDATE.getUrl(), paramsMap);
    }
    //
    //    //个人票夹行程单预览
    //    PERVIEW("/piaoeda-web/api/bill/itinerary/preview?appid="),
    //    //个人票夹行程单下载
    //    DOWNLOAD("/piaoeda-web/api/bill/itinerary/download?appid="),
    //

    //个人票夹行程单预览
    private static String preview() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.view();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.PREVIEW.getUrl(), paramsMap);
    }
    //个人票夹行程单下载
    private static String download() throws Exception {
        Map<String, Object> paramsMap = StaBookBuildParam.view();
        //json格式
        return HttpClientUtil.jsonPost(URLConfigEnum.DOWNLOAD.getUrl(), paramsMap);
    }

}

