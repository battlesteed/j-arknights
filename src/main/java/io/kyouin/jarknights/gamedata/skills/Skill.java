package io.kyouin.jarknights.gamedata.skills;

import io.kyouin.jarknights.utils.AKConstants;

import java.util.List;

public class Skill {

    private String skillId;
    private List<SkillLevel> levels;

    public String getID() {
        return skillId;
    }

    public List<SkillLevel> getLevels() {
        return levels;
    }

    // OTHERS

    public String getIconUrl() {
        return AKConstants.BASE_URL + AKConstants.IMAGE_SKILLS + "skill_icon_" + skillId + ".png";
    }
}
