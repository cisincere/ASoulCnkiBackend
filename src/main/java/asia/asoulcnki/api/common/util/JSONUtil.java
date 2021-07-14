package asia.asoulcnki.api.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

import static asia.asoulcnki.api.common.util.FileUtil.readFile;

public final class JSONUtil {

    public static Map<String, Object> readJSON2Map(String path) {
        return JSONObject.parseObject(readFile(path)).getInnerMap();
    }

}
