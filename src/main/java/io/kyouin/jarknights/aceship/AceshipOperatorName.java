package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.utils.AKConstants;

public class AceshipOperatorName {

    private String cn;
    private String en;
    private String jp;
    private String kr;

    public String getName(String lang) {
        switch (lang) {
            case AKConstants.LANG_CN: return cn;
            case AKConstants.LANG_JP: return jp;
            case AKConstants.LANG_KR: return kr;
            default: return en;
        }
    }
}
