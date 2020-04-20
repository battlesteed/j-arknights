package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.utils.GamedataLanguage;

public class AceshipType extends TranslatableObject {

    private String type_data;
    private String type_cn;
    private String type_en;
    private String type_jp;
    private String type_kr;

    public String getTypeData() {
        return type_data;
    }

    @Override
    public String getName(GamedataLanguage language) {
        switch (language) {
            case CN: return type_cn;
            case JP: return type_jp;
            case KR: return type_kr;
            default: return type_en;
        }
    }
}
