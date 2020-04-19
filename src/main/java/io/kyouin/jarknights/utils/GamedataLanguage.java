package io.kyouin.jarknights.utils;

public enum GamedataLanguage {

    CN("zh_CN"), EN("en_US"), JP("ja_JP"), KR("ko_KR");

    private final String langCode;

    GamedataLanguage(String langCode) {
        this.langCode = langCode;
    }

    public String getLangCode() {
        return langCode;
    }
}
