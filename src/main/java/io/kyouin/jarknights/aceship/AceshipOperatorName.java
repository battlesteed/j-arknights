package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.utils.GamedataLanguage;

public class AceshipOperatorName extends TranslatableObject {

    private String cn;
    private String en;
    private String jp;
    private String kr;

    @Override
    public String getName(GamedataLanguage language) {
        switch (language) {
            case CN: return cn;
            case JP: return jp;
            case KR: return kr;
            default: return en;
        }
    }
}
