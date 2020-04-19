package io.kyouin.jarknights.gamedata.operators;

import java.util.List;

public class SkillEntry {

    private String skillId;
    private List<SkillMasterLevelUp> levelUpCostCond;
    private UnlockCondition unlockCond;

    public String getID() {
        return skillId;
    }

    public List<SkillMasterLevelUp> getLevelUpCostConditions() {
        return levelUpCostCond;
    }

    public UnlockCondition getUnlockCondition() {
        return unlockCond;
    }
}
