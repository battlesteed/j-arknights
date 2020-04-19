package io.kyouin.jarknights.gamedata.handbooks;

import java.util.List;

public class Handbook {

    private String charID;
    private String drawName;
    private String infoName;
    private List<StoryTextAudio> storyTextAudio;

    public String getCharID() {
        return charID;
    }

    public String getDrawName() {
        return drawName;
    }

    public String getInfoName() {
        return infoName;
    }

    public List<StoryTextAudio> getStories() {
        return storyTextAudio;
    }
}
