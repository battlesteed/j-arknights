package io.kyouin.jarknights.gamedata.handbooks;

import java.util.List;

public class EnemyHandbook {

    private String enemyId;
    private String enemyIndex;
    private List<String> enemyTags;
    private Integer sortId;
    private String name;
    private String enemyRace;
    private String enemyLevel;
    private String description;
    private String attackType;
    private String endure;
    private String attack;
    private String defence;
    private String resistance;
    private String ability;

    public String getID() {
        return enemyId;
    }

    public String getIndex() {
        return enemyIndex;
    }

    public List<String> getTags() {
        return enemyTags;
    }

    public Integer getSortID() {
        return sortId;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return enemyRace;
    }

    public String getLevel() {
        return enemyLevel;
    }

    public String getDescription() {
        return description;
    }

    public String getAttackType() {
        return attackType;
    }

    public String getEndure() {
        return endure;
    }

    public String getAttack() {
        return attack;
    }

    public String getDefence() {
        return defence;
    }

    public String getResistance() {
        return resistance;
    }

    public String getAbility() {
        return ability;
    }
}
