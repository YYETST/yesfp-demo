package demo.test.ofd;

import demo.entity.ofd.Render;
import demo.entity.output_invoice.InvoiceBuildParam;
import demo.utils.Base64Util;
import demo.utils.HttpClientUtil;
import demo.utils.URLConfigEnum;

import java.util.Base64;
import java.util.Map;

/**
 * @author wrk
 * @time 2021-05-13 15:23
 * ofd渲染api测试入口
 */
public class OfdRenderTest {
    public static void main(String[] args) throws Exception {
        //ofd文件转base64 调用渲染接口  报错 404
//        String result=render();
        String reslt2=invoceData();
    }
    //ofd渲染
    public static String render() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = Render.render();
        return HttpClientUtil.post(URLConfigEnum.RENDER.getUrl(), (Map) paramsMap);
    }
    //ofd数据提取
    public static String invoceData() throws Exception {
        //构造POST表单Map
        Map<String, Object> paramsMap = Render.render();
        return HttpClientUtil.post(URLConfigEnum.INVOCEDATA.getUrl(), (Map) paramsMap);
    }
}
