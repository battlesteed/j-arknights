package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.utils.GamedataLanguage;

public class AceshipItem {

    private String name_cn;
    private String name_en;
    private String name_jp;
    private String name_kr;

    public String getName(GamedataLanguage language) {
        switch (language) {
            case CN: return name_cn;
            case JP: return name_jp;
            case KR: return name_kr;
            default: return name_en;
        }
    }
}
