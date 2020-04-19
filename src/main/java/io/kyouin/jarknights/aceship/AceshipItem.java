package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.utils.AKConstants;

public class AceshipItem {

    private String name_cn;
    private String name_en;
    private String name_jp;
    private String name_kr;

    public String getName(String lang) {
        switch (lang) {
            case AKConstants.LANG_CN: return name_cn;
            case AKConstants.LANG_JP: return name_jp;
            case AKConstants.LANG_KR: return name_kr;
            default: return name_en;
        }
    }
}
