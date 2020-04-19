package io.kyouin.jarknights.gamedata.skins;

import io.kyouin.jarknights.utils.AKConstants;

public class Skin {

    private String skinId;
    private String charId;
    private String illustId;
    private String avatarId;
    private String portraitId;
    private Boolean isBuySkin;
    private SkinData displaySkin;

    public String getSkinID() {
        return skinId;
    }

    public String getCharID() {
        return charId;
    }

    public String getIllustID() {
        return illustId;
    }

    public String getAvatarID() {
        return avatarId;
    }

    public String getPortraitID() {
        return portraitId;
    }

    public Boolean isBuySkin() {
        return isBuySkin;
    }

    public SkinData getData() {
        return displaySkin;
    }

    // OTHERS

    public String getSkinUrl() {
        return AKConstants.BASE_URL + AKConstants.IMAGE_CHARACTERS + portraitId + ".png";
    }
}
