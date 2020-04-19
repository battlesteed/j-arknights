package io.kyouin.jarknights.gamedata.operators;

import io.kyouin.jarknights.enums.OperatorPosition;
import io.kyouin.jarknights.enums.OperatorProfession;
import io.kyouin.jarknights.utils.EnumReplacer;
import io.kyouin.jarknights.utils.TextFormatter;

import java.util.List;

public class Operator {

    private String name;
    private String description;
    private Boolean canUseGeneralPotentialItem;
    private String potentialItemId;
    private String displayNumber;
    private String appellation;
    private OperatorPosition position;
    private List<String> tagList;
    private String displayLogo;
    private String itemUsage;
    private String itemDesc;
    private String itemObtainApproach;
    private Integer maxPotentialLevel;
    private Integer rarity;
    private OperatorProfession profession;
    private List<Phase> phases;
    private List<SkillEntry> skills;
    private List<TalentEntry> talents;
    private List<Potential> potentialRanks;
    private List<StatsEntry> favorKeyFrames;
    private List<SkillLevelUp> allSkillLvlup;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean canUseGeneralPotentialItem() {
        return canUseGeneralPotentialItem;
    }

    public String getPotentialItemId() {
        return potentialItemId;
    }

    public String getDisplayNumber() {
        return displayNumber;
    }

    public String getAppellation() {
        return appellation;
    }

    public OperatorPosition getPosition() {
        return position;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public String getDisplayLogo() {
        return displayLogo;
    }

    public String getItemUsage() {
        return itemUsage;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public String getItemObtainApproach() {
        return itemObtainApproach;
    }

    public Integer getMaxPotentialLevel() {
        return maxPotentialLevel;
    }

    public Integer getRarity() {
        return rarity;
    }

    public OperatorProfession getProfession() {
        return profession;
    }

    public List<SkillEntry> getSkills() {
        return skills;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public List<TalentEntry> getTalents() {
        return talents;
    }

    public List<Potential> getPotentialRanks() {
        return potentialRanks;
    }

    public List<StatsEntry> getTrustBonuses() {
        return favorKeyFrames;
    }

    public List<SkillLevelUp> getSkillLevelUps() {
        return allSkillLvlup;
    }

    // OTHERS

    public String getCleanDescription(String replace) {
        return TextFormatter.formatText(description, replace);
    }

    public OperatorProfession getCorrectProfession() {
        return EnumReplacer.replaceProfession(profession);
    }
}
