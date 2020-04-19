package io.kyouin.jarknights.gamedata.operators;

import java.util.List;

public class SkillMasterLevelUp {

    private UnlockCondition unlockCond;
    private Integer lvlUpTime;
    private List<LevelUpCost> levelUpCost;

    public UnlockCondition getUnlockCondition() {
        return unlockCond;
    }

    public Integer getLevelUpTime() {
        return lvlUpTime;
    }

    public List<LevelUpCost> getLevelUpCosts() {
        return levelUpCost;
    }
}
