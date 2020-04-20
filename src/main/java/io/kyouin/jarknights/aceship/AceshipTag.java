package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.utils.GamedataLanguage;

public class AceshipTag extends TranslatableObject {

    private String tag_cn;
    private String tag_en;
    private String tag_jp;
    private String tag_kr;
    private String type;

    @Override
    public String getName(GamedataLanguage language) {
        switch (language) {
            case CN: return tag_cn;
            case JP: return tag_jp;
            case KR: return tag_kr;
            default: return tag_en;
        }
    }

    public String getType() {
        return type;
    }
}
