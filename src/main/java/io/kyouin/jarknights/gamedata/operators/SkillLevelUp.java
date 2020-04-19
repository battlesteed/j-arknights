package io.kyouin.jarknights.gamedata.operators;

import java.util.List;

public class SkillLevelUp {

    private UnlockCondition unlockCond;
    private List<LevelUpCost> lvlUpCost;

    public UnlockCondition getUnlockCondition() {
        return unlockCond;
    }

    public List<LevelUpCost> getLevelUpCosts() {
        return lvlUpCost;
    }
}
