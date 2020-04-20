package io.kyouin.jarknights.utils;

import io.kyouin.jarknights.aceship.TranslatableObject;

import java.util.Arrays;

public class LanguageChecker {

    public static boolean matchesTranslation(String toCheck, TranslatableObject obj) {
        return Arrays
                .stream(GamedataLanguage.values())
                .anyMatch(lang -> obj.getName(lang).equalsIgnoreCase(toCheck));
    }
}
