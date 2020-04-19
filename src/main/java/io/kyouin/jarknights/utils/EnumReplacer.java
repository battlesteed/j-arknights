package io.kyouin.jarknights.utils;

import io.kyouin.jarknights.enums.OperatorProfession;

public class EnumReplacer {

    public static OperatorProfession replaceProfession(OperatorProfession profession) {
        switch (profession) {
            case PIONEER: return OperatorProfession.VANGUARD;
            case SPECIAL: return OperatorProfession.SPECIALIST;
            case SUPPORT: return OperatorProfession.SUPPORTER;
            case TANK:    return OperatorProfession.DEFENDER;
            case WARRIOR: return OperatorProfession.GUARD;
            default:      return profession;
        }
    }
}
