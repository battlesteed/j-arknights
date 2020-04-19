package io.kyouin.jarknights.gamedata.stages;

import java.util.List;

public class StageDropInfo {

    private List<StageItemDropInfo> displayRewards;
    private List<StageItemDetailDropInfo> displayDetailRewards;
    private Boolean isStagePatch;
    private String mainStageId;

    public List<StageItemDropInfo> getDisplayRewards() {
        return displayRewards;
    }

    public List<StageItemDetailDropInfo> getDisplayDetailRewards() {
        return displayDetailRewards;
    }

    public Boolean isStagePatch() {
        return isStagePatch;
    }

    public String getMainStageID() {
        return mainStageId;
    }
}
