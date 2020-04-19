package io.kyouin.jarknights.gamedata.items;

import io.kyouin.jarknights.enums.ItemDropFrequency;

public class ItemDropInfo {

    private String stageId;
    private ItemDropFrequency occPer;

    public String getStageID() {
        return stageId;
    }

    public ItemDropFrequency getDropFrequency() {
        return occPer;
    }
}
