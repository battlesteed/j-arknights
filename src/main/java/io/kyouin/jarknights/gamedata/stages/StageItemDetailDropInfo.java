package io.kyouin.jarknights.gamedata.stages;

public class StageItemDetailDropInfo {

    private Integer occPercent;
    private String type;
    private String id;
    private Integer dropType;

    public Integer getDropFrequency() {
        return occPercent;
    }

    public String getType() {
        return type;
    }

    public String getID() {
        return id;
    }

    public Integer getDropType() {
        return dropType;
    }
}
