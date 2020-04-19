package io.kyouin.jarknights.utils;

import io.kyouin.jarknights.aceship.AceshipOperatorName;

import java.util.Arrays;

public class LanguageChecker {

    public static boolean matchesOperatorName(String toCheck, AceshipOperatorName operatorName) {
        return Arrays
                .stream(GamedataLanguage.values())
                .anyMatch(lang -> operatorName.getName(lang).equalsIgnoreCase(toCheck));
    }
}
