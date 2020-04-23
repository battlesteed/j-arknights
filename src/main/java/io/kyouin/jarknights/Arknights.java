package io.kyouin.jarknights;

import io.kyouin.jarknights.aceship.*;
import io.kyouin.jarknights.retrofit.Request;
import io.kyouin.jarknights.utils.GamedataLanguage;
import io.kyouin.jarknights.utils.LanguageChecker;

import java.util.List;
import java.util.Map;

public class Arknights {

    //TODO methods

    public static String getReadableName(String name) {
        List<AceshipUnreadableName> unreadableNames = Request.get(Request.METHODS.getAceshipUnreadableNames());

        if (unreadableNames == null) return null;

        AceshipUnreadableName toFind = unreadableNames.stream()
                .filter(unreadableName -> unreadableName.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);

        if (toFind == null) return name;

        return toFind.getNameEN();
    }

    public static AceshipSkill getSkills(String skillID) {
        Map<String, AceshipSkill> skills = Request.get(Request.METHODS.getAceshipSkills());

        if (skills == null) return null;

        return skills.get(skillID);
    }

    public static List<List<AceshipTalent>> getTalents(String operatorID) {
        Map<String, List<List<AceshipTalent>>> talents = Request.get(Request.METHODS.getAceshipTalents());

        if (talents == null) return null;

        return talents.get(operatorID);
    }

    public static String getTranslatedOperatorName(String name, GamedataLanguage language) {
        Map<String, AceshipOperatorName> operatorNames = Request.get(Request.METHODS.getAceshipOperatorNames());

        if (operatorNames == null) return null;

        AceshipOperatorName toFind = operatorNames.values().stream()
                .filter(operator -> LanguageChecker.matchesTranslation(name, operator))
                .findFirst()
                .orElse(null);

        if (toFind == null) return null;

        return toFind.getName(language);
    }

    public static String getTranslatedItem(String name, GamedataLanguage language) {
        List<AceshipItem> items = Request.get(Request.METHODS.getAceshipItems());

        if (items == null) return null;

        AceshipItem toFind = items.stream()
                .filter(item -> LanguageChecker.matchesTranslation(name, item))
                .findFirst()
                .orElse(null);

        if (toFind == null) return null;

        return toFind.getName(language);
    }

    public static String getTranslatedTag(String name, GamedataLanguage language) {
        List<AceshipTag> tags = Request.get(Request.METHODS.getAceshipTags());

        if (tags == null) return null;

        AceshipTag toFind = tags.stream()
                .filter(tag -> LanguageChecker.matchesTranslation(name, tag))
                .findFirst()
                .orElse(null);

        if (toFind == null) return null;

        return toFind.getName(language);
    }

    public static String getTranslatedType(String name, GamedataLanguage language) {
        List<AceshipType> types = Request.get(Request.METHODS.getAceshipTypes());

        if (types == null) return null;

        AceshipType toFind = types.stream()
                .filter(type -> LanguageChecker.matchesTranslation(name, type))
                .findFirst()
                .orElse(null);

        if (toFind == null) return null;

        return toFind.getName(language);
    }
}
