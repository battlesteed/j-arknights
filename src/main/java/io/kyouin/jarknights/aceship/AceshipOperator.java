package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.utils.AKConstants;

import java.util.List;

public class AceshipOperator {

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

    public String getName(String lang) {
        switch (lang) {
            case AKConstants.LANG_CN: return name_cn;
            case AKConstants.LANG_JP: return name_jp;
            case AKConstants.LANG_KR: return name_kr;
            default: return name_en;
        }
    }

    public String getCharacteristic(String lang) {
        switch (lang) {
            case AKConstants.LANG_CN: return characteristic_cn;
            case AKConstants.LANG_JP: return characteristic_jp;
            case AKConstants.LANG_KR: return characteristic_kr;
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
