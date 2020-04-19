package io.kyouin.jarknights.aceship;

import io.kyouin.jarknights.gamedata.skills.SkillAttribute;
import io.kyouin.jarknights.utils.TextFormatter;

import java.util.List;

public class AceshipSkill {

    private String name;
    private List<String> desc;

    public String getName() {
        return name;
    }

    public List<String> getDescriptions() {
        return desc;
    }

    public List<String> getCleanDescriptions(List<SkillAttribute> skillAttributes) {
        return TextFormatter.formatAceshipSkillText(skillAttributes, desc);
    }
}
