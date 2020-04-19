package io.kyouin.jarknights.gamedata.operators;

import java.util.List;

public class Phase {

    private String rangeId;
    private Integer maxLevel;
    private List<StatsEntry> attributesKeyFrames;
    private List<LevelUpCost> evolveCost;

    public String getRangeID() {
        return rangeId;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public List<StatsEntry> getStatsEntries() {
        return attributesKeyFrames;
    }

    public List<LevelUpCost> getEvolveCosts() {
        return evolveCost;
    }
}
