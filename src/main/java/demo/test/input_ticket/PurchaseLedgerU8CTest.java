package demo.test.input_ticket;

import demo.entity.personal_ticket_holder.ReimburseCollection;
import demo.utils.HttpClientUtil;
import demo.utils.URLConfigEnum;

import java.util.Map;

/**
 * @author wrk
 * @time 2021-05-13 15:22
 * 采购台账（U8C）API测试入口类
 */
public class PurchaseLedgerU8CTest {
    public static void main(String[] args) throws Exception {
        /**
         * 报销台账查询接口（新）
         * */
         String result ="";
         result=CollQuery();

        /**
         * 附件预览
         * */

        /**
         * 采购台账结算
         * */
//        result=purchase();


        /**
         * 采购台账取消结算
         * */
//        result=purchaseUnset();
        System.out.println(result);
    }

    //报销台账查询接口（新）
    public static String CollQuery() throws Exception {
        Map<String, Object> paramsMap = ReimburseCollection.query();
        return HttpClientUtil.jsonPost(URLConfigEnum.QUERY.getUrl(), paramsMap);

    }

    //采购台账结算
    public static String purchase() throws Exception {
        Map<String, Object> paramsMap = ReimburseCollection.purchase();
        return HttpClientUtil.jsonPost(URLConfigEnum.PURCHASEACCOUNT.getUrl(), paramsMap);

    }
    //采购台账取消结算
    public static String purchaseUnset() throws Exception {
        Map<String, Object> paramsMap = ReimburseCollection.purchase();
        return HttpClientUtil.jsonPost(URLConfigEnum.PURCHASEACCOUNT.getUrl(), paramsMap);

    }
}
