package io.kyouin.jarknights.gamedata.operators;

import io.kyouin.jarknights.utils.TextFormatter;

import java.util.List;

public class Talent {

    private UnlockCondition unlockCondition;
    private Integer requiredPotentialRank;
    private String name;
    private String description;
    private String rangeId;
    private List<TalentAttribute> blackboard;

    public UnlockCondition getUnlockCondition() {
        return unlockCondition;
    }

    public Integer getRequiredPotentialRank() {
        return requiredPotentialRank;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRangeID() {
        return rangeId;
    }

    public List<TalentAttribute> getAttributes() {
        return blackboard;
    }

    // OTHERS

    public String getCleanDescription(String replace) {
        return TextFormatter.formatText(description, replace);
    }
}
