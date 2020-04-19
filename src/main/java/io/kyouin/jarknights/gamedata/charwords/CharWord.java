package io.kyouin.jarknights.gamedata.charwords;

import io.kyouin.jarknights.enums.VoicePlaceType;
import io.kyouin.jarknights.enums.VoiceType;
import io.kyouin.jarknights.enums.VoiceUnlockType;

import java.util.List;

public class CharWord {

    private String charWordId;
    private String charId;
    private String voiceId;
    private String voiceText;
    private String voiceTitle;
    private Integer voiceIndex;
    private VoiceType voiceType;
    private VoiceUnlockType unlockType;
    private List<CharWordUnlockParam> unlockParam;
    private String lockDescription;
    private VoicePlaceType placeType;
    private String voiceAsset;

    public String getID() {
        return charWordId;
    }

    public String getCharID() {
        return charId;
    }

    public String getVoiceID() {
        return voiceId;
    }

    public String getVoiceText() {
        return voiceText;
    }

    public String getVoiceTitle() {
        return voiceTitle;
    }

    public Integer getVoiceIndex() {
        return voiceIndex;
    }

    public VoiceType getVoiceType() {
        return voiceType;
    }

    public VoiceUnlockType getUnlockType() {
        return unlockType;
    }

    public List<CharWordUnlockParam> getUnlockParams() {
        return unlockParam;
    }

    public String getLockDescription() {
        return lockDescription;
    }

    public VoicePlaceType getPlaceType() {
        return placeType;
    }

    public String getVoiceAsset() {
        return voiceAsset;
    }
}
