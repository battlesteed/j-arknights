package io.kyouin.jarknights.gamedata.items;

import io.kyouin.jarknights.enums.ItemClassifyType;
import io.kyouin.jarknights.enums.ItemType;
import io.kyouin.jarknights.utils.AKConstants;

import java.util.List;

public class Item {

    private String itemId;
    private String name;
    private String description;
    private Integer rarity;
    private String iconId;
    private String usage;
    private String obtainApproach;
    private ItemClassifyType classifyType;
    private ItemType itemType;
    private List<ItemDropInfo> stageDropList;
    private List<ItemProductInfo> buildingProductList;

    public String getID() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getRarity() {
        return rarity;
    }

    public String getIconID() {
        return iconId;
    }

    public String getUsage() {
        return usage;
    }

    public String getObtainApproach() {
        return obtainApproach;
    }

    public ItemClassifyType getClassifyType() {
        return classifyType;
    }

    public ItemType getType() {
        return itemType;
    }

    public List<ItemDropInfo> getStageDropList() {
        return stageDropList;
    }

    public List<ItemProductInfo> getBuildingProductList() {
        return buildingProductList;
    }

    // OTHERS

    public String getIconUrl() {
        return AKConstants.BASE_URL + AKConstants.IMAGE_ITEMS + iconId + ".png";
    }
}
