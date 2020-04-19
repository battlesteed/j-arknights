package io.kyouin.jarknights.gamedata.operators;

public class Stats {

    private Integer maxHp;
    private Integer atk;
    private Integer def;
    private Float magicResistance;
    private Integer cost;
    private Integer blockCnt;
    private Float moveSpeed;
    private Float attackSpeed;
    private Float baseAttackTime;
    private Integer respawnTime;
    private Float hpRecoveryPerSec;
    private Float spRecoveryPerSec;
    private Integer maxDeployCount;
    private Integer maxDeckStackCnt;
    private Integer tauntLevel;
    private Integer massLevel;
    private Integer baseForceLevel;
    private Boolean stunImmune;
    private Boolean silenceImmune;

    public Integer getMaxHp() {
        return maxHp;
    }

    public Integer getAttack() {
        return atk;
    }

    public Integer getDefense() {
        return def;
    }

    public Float getMagicResistance() {
        return magicResistance;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getBlockCount() {
        return blockCnt;
    }

    public Float getMoveSpeed() {
        return moveSpeed;
    }

    public Float getAttackSpeed() {
        return attackSpeed;
    }

    public Float getBaseAttackTime() {
        return baseAttackTime;
    }

    public Integer getRespawnTime() {
        return respawnTime;
    }

    public Float getHpRecoveryPerSec() {
        return hpRecoveryPerSec;
    }

    public Float getSpRecoveryPerSec() {
        return spRecoveryPerSec;
    }

    public Integer getMaxDeployCount() {
        return maxDeployCount;
    }

    public Integer getMaxDeckStackCount() {
        return maxDeckStackCnt;
    }

    public Integer getTauntLevel() {
        return tauntLevel;
    }

    public Integer getMassLevel() {
        return massLevel;
    }

    public Integer getBaseForceLevel() {
        return baseForceLevel;
    }

    public Boolean isStunImmune() {
        return stunImmune;
    }

    public Boolean isSilenceImmune() {
        return silenceImmune;
    }
}
