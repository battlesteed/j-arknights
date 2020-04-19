package io.kyouin.jarknights.gamedata.skills;

import io.kyouin.jarknights.utils.TextFormatter;

import java.util.List;

public class SkillLevel {

    private String name;
    private String rangeId;
    private String description;
    private Integer skillType;
    private SkillSPData spData;
    private Float duration;
    private List<SkillAttribute> blackboard;

    public String getName() {
        return name;
    }

    public String getRangeID() {
        return rangeId;
    }

    public String getDescription() {
        return description;
    }

    public Integer getType() {
        return skillType;
    }

    public SkillSPData getSPData() {
        return spData;
    }

    public Float getDuration() {
        return duration;
    }

    public List<SkillAttribute> getAttributes() {
        return blackboard;
    }

    // OTHERS

    public String getCleanDescription(String replace, String replaceItalic) {
        return TextFormatter.formatSkillText(blackboard, description, replace, replaceItalic);
    }
}
