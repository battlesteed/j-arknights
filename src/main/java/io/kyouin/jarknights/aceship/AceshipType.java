package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.utils.AKConstants;

public class AceshipType {

    private String type_data;
    private String type_cn;
    private String type_en;
    private String type_jp;
    private String type_kr;

    public String getTypeData() {
        return type_data;
    }

    public String getType(String lang) {
        switch (lang) {
            case AKConstants.LANG_CN: return type_cn;
            case AKConstants.LANG_JP: return type_jp;
            case AKConstants.LANG_KR: return type_kr;
            default: return type_en;
        }
    }
}
