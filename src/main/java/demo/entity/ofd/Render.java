package demo.entity.ofd;

import demo.utils.Base64Util;

import java.util.HashMap;
import java.util.Map;

public class Render {

    public static Map<String, Object> render() {
        Map<String, Object> paramsMap = new HashMap<String, Object>();
//        paramsMap.put("type","png");
        paramsMap.put("content", Base64Util.imageToBase64("C:\\Users\\Administrator\\Desktop\\48797228-付甲宝.ofd"));//ImageToBase64("D:\\1.png"));
        return paramsMap;
    }

}
