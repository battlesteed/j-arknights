package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.utils.GamedataLanguage;

import java.util.List;

public class AceshipOperator extends TranslatableObject {

    private String name_cn;
    private String name_en;
    private String name_jp;
    private String name_kr;
    private String characteristic_cn;
    private String characteristic_en;
    private String characteristic_jp;
    private String characteristic_kr;
    private String camp;
    private String type;
    private Integer level;
    private String sex;
    private List<String> tags;
    private Boolean hidden;
    private Boolean globalHidden;

    @Override
    public String getName(GamedataLanguage language) {
        switch (language) {
            case CN: return name_cn;
            case JP: return name_jp;
            case KR: return name_kr;
            default: return name_en;
        }
    }

    public String getCharacteristic(GamedataLanguage language) {
        switch (language) {
            case CN: return characteristic_cn;
            case JP: return characteristic_jp;
            case KR: return characteristic_kr;
            default: return characteristic_en;
        }
    }

    public String getCamp() {
        return camp;
    }

    public String getType() {
        return type;
    }

    public Integer getLevel() {
        return level;
    }

    public String getSex() {
        return sex;
    }

    public List<String> getTags() {
        return tags;
    }

    public Boolean isHidden() {
        return hidden;
    }

    public Boolean isGlobalHidden() {
        return globalHidden;
    }
}
