package io.kyouin.jarknights.gamedata.checkins;

import io.kyouin.jarknights.enums.ItemType;

public class CheckInItem {

    private String itemId;
    private ItemType itemType;
    private Integer count;

    public String getID() {
        return itemId;
    }

    public ItemType getType() {
        return itemType;
    }

    public Integer getCount() {
        return count;
    }
}
