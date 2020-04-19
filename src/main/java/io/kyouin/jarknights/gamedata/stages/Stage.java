package io.kyouin.jarknights.gamedata.stages;

import io.kyouin.jarknights.enums.StageDifficulty;
import io.kyouin.jarknights.enums.StageType;

import java.util.List;

public class Stage {

    private StageType stageType;
    private StageDifficulty difficulty;
    private List<StageUnlockCondition> unlockCondition;
    private String stageId;
    private String levelId;
    private String zoneId;
    private String code;
    private String name;
    private String description;
    private String hardStagedId;
    private String dangerLevel;
    private String loadingPicId;
    private Boolean canPractice;
    private Boolean canBattleReplay;
    private Integer apCost;
    private Integer apFailReturn;
    private Integer apProtectTimes;
    private Integer diamondOnceDrop;
    private Integer practiceTicketCost;
    private Integer dailyStageDifficulty;
    private Integer expGain;
    private Integer goldGain;
    private Integer passFavor;
    private Integer completeFavor;
    private Integer slProgress;
    private String displayMainItem;
    private Boolean hilightMark;
    private Boolean bossMark;
    private Boolean isPredefined;
    private Boolean isStoryOnly;
    private Integer appearanceStyle;
    private StageDropInfo stageDropInfo;

    public StageType getType() {
        return stageType;
    }

    public StageDifficulty getDifficulty() {
        return difficulty;
    }

    public List<StageUnlockCondition> getUnlockCondition() {
        return unlockCondition;
    }

    public String getStageID() {
        return stageId;
    }

    public String getLevelID() {
        return levelId;
    }

    public String getZoneID() {
        return zoneId;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getHardStagedID() {
        return hardStagedId;
    }

    public String getDangerLevel() {
        return dangerLevel;
    }

    public String getLoadingPicID() {
        return loadingPicId;
    }

    public Boolean getCanPractice() {
        return canPractice;
    }

    public Boolean getCanBattleReplay() {
        return canBattleReplay;
    }

    public Integer getApCost() {
        return apCost;
    }

    public Integer getApFailReturn() {
        return apFailReturn;
    }

    public Integer getApProtectTimes() {
        return apProtectTimes;
    }

    public Integer getDiamondOnceDrop() {
        return diamondOnceDrop;
    }

    public Integer getPracticeTicketCost() {
        return practiceTicketCost;
    }

    public Integer getDailyStageDifficulty() {
        return dailyStageDifficulty;
    }

    public Integer getExpGain() {
        return expGain;
    }

    public Integer getGoldGain() {
        return goldGain;
    }

    public Integer getPassFavor() {
        return passFavor;
    }

    public Integer getCompleteFavor() {
        return completeFavor;
    }

    public Integer getStorylineProgress() {
        return slProgress;
    }

    public String getDisplayMainItem() {
        return displayMainItem;
    }

    public Boolean isHilightMark() {
        return hilightMark;
    }

    public Boolean isBossMark() {
        return bossMark;
    }

    public Boolean isPredefined() {
        return isPredefined;
    }

    public Boolean isStoryOnly() {
        return isStoryOnly;
    }

    public Integer getAppearanceStyle() {
        return appearanceStyle;
    }

    public StageDropInfo getStageDropInfo() {
        return stageDropInfo;
    }
}
