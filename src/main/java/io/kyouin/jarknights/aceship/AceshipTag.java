package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.utils.AKConstants;

public class AceshipTag {

    private String tag_cn;
    private String tag_en;
    private String tag_jp;
    private String tag_kr;
    private String type;

    public String getTag(String lang) {
        switch (lang) {
            case AKConstants.LANG_CN: return tag_cn;
            case AKConstants.LANG_JP: return tag_jp;
            case AKConstants.LANG_KR: return tag_kr;
            default: return tag_en;
        }
    }

    public String getType() {
        return type;
    }
}
