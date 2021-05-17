package demo.utils;

/**
 * @description:  url的配置类
 * @author: kw
 * @date: 2020/5/21
 * @param:
 * @return:
 */
public enum URLConfigEnum {


    //如果需要测试其他接口 直接在这里添加枚举即可
    //-----------------------------------------------------------------------------------------------------------------------------------
    /**
     *开票
     *
     * */

    //发票打印
    TAX_PRINT("/output-tax/api/invoice-his/print?appid="),
    //开票申请删除
    INVOICE_APPLY_DEL_URL("/invoiceclient-web/api/invoiceApply/del?appid="),
    //在税务云 openapi中 url为 /output-tax/api/invoiceApply/insertWithArray? 和下方两个两者都可用 把 output-tax和invoiceclient-web代替即可
    //开票蓝票请求服务
    INSERT_WITH_ARRAY_URL("/invoiceclient-web/api/invoiceApply/insertWithArray?appid="),
    //发票作废
    INVALID("/invoiceclient-web/api/invoiceApply/invalid?appid="),
    //开票状态查询服务
    QUERY_INBOICE_STATUS("/invoiceclient-web/api/invoiceApply/queryInvoiceStatus?appid="),
    //开票申请审核通过
    ISSUE("/invoiceclient-web/api/invoiceApply/issue?appid="),
    //发票红冲请求服务
    RED("/invoiceclient-web/api/invoiceApply/red?appid="),
    //电子发票部分红冲
    PART_RED("/invoiceclient-web/api/invoiceApply/part-red?appid="),
    //开票蓝票请求服务--发票拆分
    INSERT_WITH_SPLIT ("/invoiceclient-web/api/invoiceApply/insertWithSplit?appid="),
    /**
     * 扫码开票
     * */

    SCAN("/output-tax/api/invoiceApply/insertForQRInvoice?appid="),

    //申请红字信息表（购方销方）
    READINFOAPPLY("/output-tax/api/redinfo-apply/insertWithRedApply?appid="),

    //查询红字信息表参数
    QUERYREAINFO("/output-tax/api/redinfo-apply/queryRedInfoApply/"),

    //未开票查询
    RESULT("/output-tax/api/invoice-will/result?appid="),
    //未开票管理新增单据
    SAVE("/output-tax/api/invoice-will/save?appid="),

    //未开票记录变更查询
    CHANGE("/output-tax/api/invoice-will/changes?appid="),

    //-----------------------------------------------------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------------------------------------------------------


    /**
     * 受票
     * 有些 url即在受票中使用又在个人票价使用
     * */
    //发票上传
    UPLOADPDF("/invoiceclient-web/api/reimburseCollection/uploadpdf?appid="),
    //发票取消上传
    COLLECTION_DELETE("/invoiceclient-web/api/reimburseCollection/delete?appid="),
    //发票已报销
    COLLECTION_REIMBURSED ("/invoiceclient-web/api/reimburseCollection/reimbursed?appid="),
    //发票取消报销
    COLLECTION_UNREIMBURSED("/invoiceclient-web/api/reimburseCollection/unreimbursed?appid="),
    //报销台账查询接口（新）
    QUERY("/invoiceclient-web/api/reimburseCollection/query?appid="),
    //入账
    ACCOUNT_STATUS("/invoiceclient-web/api/reimburseCollection/accountStatus?appid="),
    //取消入账
    COLLECTION_CANCEL_ACCOUNT("/invoiceclient-web/api/reimburseCollection/cancelAccount?appid="),
    //个人票夹发票提交到采购台账
    FETCH("/piaoeda-web/api/einvoice/v2/fetchPurchase?appid="),

    //发票上传V2
    V2_UPLOADPDF("/input-tax/api/reimburseCollection/v2/uploadpdf?appid="),
    //OCR识别接口
    RECOGNISE("/input-tax/api/ocr/v2/recognise?appid="),

    //识别结果保存台帐
    OCR_SAVE("/input-tax/api/bill-collections/ocr-save?appid="),
    //台账报销
    REIMBURSED("/input-tax/api/bill-collections/reimbursed?appid="),
    //台账取消报销
    CANCEL_REIMBURSED("/input-tax/api/bill-collections/cancel-reimbursed?appid="),
    //台账记账
    ACCOUNT("/input-tax/api/bill-collections/account?appid="),
    //台账记账
    CANCEL_ACCOUNT("/input-tax/api/bill-collections/cancel-account?appid="),
    //报销台账删除
    DELETE("/input-tax/api/bill-collections/delete?appid="),
    //飞机票台账查询
    AIR("/input-tax/api/bill-collections/air?pagenum=1&pagesize=15&appid="),
    //火车票台账查询
    TRAIN("/input-tax/api/bill-collections/train?pagenum=1&pagesize=15&appid="),
    //出租车台账查询
    TAXI("/input-tax/api/bill-collections/taxi?pagenum=1&pagesize=15&appid="),
    //机打发票台账查询
    MACHINE("/input-tax/api/bill-collections/machine?pagenum=1&pagesize=15&appid="),
    //定额发票台账查询
    QUOTA("/input-tax/api/bill-collections/quota?pagenum=1&pagesize=15&appid="),
    //过路费发票台账查询
    TOOLS("/input-tax/api/bill-collections/tolls?pagenum=1&pagesize=15&appid="),
    //客运汽车发票台账查询
    PASSENGER("/input-tax/api/bill-collections/passenger?pagenum=1&pagesize=15&appid="),

    /**
     * 查询详细
     * */
    DETAIL("/input-tax/api/bill-collections/detail?appid="),
    /**
     *报销台账置支付状态接口
     * */
    PAID ("/input-tax/api/bill-collections/paid?appid="),
    /**
     *报销台账置取消支付状态接口
     * */
    CANCELPAID ("/input-tax/api/bill-collections/cancel-paid?appid="),
    /**
     * 报销台账更新凭证号接口
     * */
    UPDATEVOUCHERID("/input-tax/api/bill-collections/update-voucherid?appid="),
    //采购台账结算
    PURCHASEACCOUNT("/input-tax/api/purchase-account/settle?appid="),
    //采购台账取消结算
    PURCHASEUNSET("/input-tax/api/purchase-account/unsettle?appid="),

    //-----------------------------------------------------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------------------------------------------------------

    /**
     * 个人票夹
     * */
    //个人票价列表查询
    BILLQUERY("/piaoeda-web/api/bill/query?page=1&size=10&appid="),
    //修改发票状态
    PURCHASERSTATUS("/piaoeda-web/api/bill/purchaser-status?appid="),
    //根据号码代码获取信息
    SUMMARY("/piaoeda-web/api/bill/summary?appid="),
    //个人票夹票据详情查询
    BILLDETAIL("/piaoeda-web/api/bill/detail?appid="),
    //获取专票
    QUERY_INVOICE("/invoiceclient-web/api/vat/queryInvoice?appid="),
    //请求二维码信息
    INSERT_FOR_QR_INVOICE("/invoiceclient-web/api/invoiceApply/insertForQRInvoice?appid="),
    //专票红冲状态查询接口
    RED_STATE_TOTAL("/output-tax/api/invoiceApply/red/state/total?appid="),
    //采购台账
    PURCHASE_QUERY("/invoiceclient-web/api/purchase-collection/query?appid="),

    //用户同步
    SYNC_USER("/piaoeda-web/api/einvoice/v2/sync-user?appid="),


    //个人票夹提交发票到报销台账_全票种
    COMMIT("/piaoeda-web/api/bill/v2/commit?appid="),
    //个人票夹新增
    BILLADD("/piaoeda-web/api/bill/add?appid="),
    //个人票夹删除
    BILLDELETE("/piaoeda-web/api/bill/delete?appid="),
    //个人票夹修改
    BILLUPDATE("/piaoeda-web/api/bill/update?appid="),
    //个人票夹行程单预览
    PREVIEW("/piaoeda-web/api/bill/itinerary/preview?appid="),
    //个人票夹行程单下载
    DOWNLOAD("/piaoeda-web/api/bill/itinerary/download?appid="),

    //账号绑定验证
    AUTHCHECK("/piaoeda-web/api/partner/v1/auth-check?appid="),
    //获取加密公钥
    PUBKEY("/cas/v1/pubkey?appid="),
    //-----------------------------------------------------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------------------------------------------------------
    /**
     * ofd能力接口
     * */
    //OFD渲染
    RENDER("/ofd/api/render?appid="),
    //ofd数据提取
    INVOCEDATA("/ofd/api/invoice-data?appid="),
    //-----------------------------------------------------------------------------------------------------------------------------------

    //pro22.pfx为测试环境通讯证书，正式环境需要替换成正式的
    KEY_PATH("src/main/resources/certificate/pro22.pfx"),
    //      KEY_PATH("src/main/resources/certificate/证书.pfx"),
    //证书密码
    PASSWORD("password");
//        PASSWORD(
//        "");


    //测试环境有测试appid和证书，正式环境有正式appid和证书，请务必对应使用
    //测试环境appid就用这个，正式环境需要替换成正式的
//      private static String APPID = "";
    private static String APPID = "commontesterCA";

    //这个是测试环境的域名，正式环境为https://fapiao.yonyoucloud.com
//    private static String DOMAIN = "https://tax.diwork.com"; //yonsuite yonbip 环境域名
//       private static String DOMAIN = "https://fapiao.yonyoucloud.com";
    private static String DOMAIN = "https://yesfp.yonyoucloud.com";

    private String value;
    URLConfigEnum(String value) {
        this.value = value;
    }

    public String getValue() {return value;}
    public String getUrl() {
        return DOMAIN + value + APPID;
    }
    public String getUrl1(String usercode) {
        return DOMAIN + value + APPID+"&usercode="+usercode;
    }
    //查询红字信息表编号
    //appid用下方的可查出数据
    public String queryRedInfo(String reqBillNo){
        return DOMAIN+value+reqBillNo+"?appid="+APPID;
    }
}
