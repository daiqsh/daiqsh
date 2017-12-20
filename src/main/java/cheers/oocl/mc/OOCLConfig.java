package cheers.oocl.mc;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author DASON
 * @Date 2017/12/20 21:09
 */
public enum OOCLConfig{
    CTL_SHA("412"),
    CTL_SHZ("413");

    private String value;
    private OOCLConfig(String value) {
        this.value = value;
    }

    private static Map<String, String> configMap;
    static {
        configMap = new HashMap<String, String>();
        for(OOCLConfig config : OOCLConfig.values()) {
            configMap.put(config.toString(), config.value);
        }
    }
    public static Map<String, String>  getConfigMap() {
        return configMap;
    }
    public static String getValue(String key) {
        return getConfigMap().get(key);
    }
}
