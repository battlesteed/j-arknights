package io.kyouin.jarknights.gamedata.operators;

import io.kyouin.jarknights.enums.ItemType;

public class LevelUpCost {

    private String id;
    private Integer count;
    private ItemType type;

    public String getItemID() {
        return id;
    }

    public Integer getCount() {
        return count;
    }

    public ItemType getType() {
        return type;
    }
}
