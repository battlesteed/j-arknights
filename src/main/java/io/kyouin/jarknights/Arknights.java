package io.kyouin.jarknights;

import io.kyouin.jarknights.aceship.AceshipOperatorName;
import io.kyouin.jarknights.retrofit.Request;
import io.kyouin.jarknights.utils.GamedataLanguage;
import io.kyouin.jarknights.utils.LanguageChecker;

import java.util.Map;

public class Arknights {

    //TODO methods

    public static String getTranslatedOperatorName(String name, GamedataLanguage language) {
        Map<String, AceshipOperatorName> operators = Request.get(Request.METHODS.getAceshipOperatorNames());

        if (operators == null) return null;

        AceshipOperatorName toFind = operators.values().stream()
                .filter(operator -> LanguageChecker.matchesOperatorName(name, operator))
                .findFirst()
                .orElse(null);

        if (toFind == null) return null;

        return toFind.getName(language);
    }
}
