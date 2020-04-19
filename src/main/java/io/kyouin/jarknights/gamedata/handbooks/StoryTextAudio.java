package io.kyouin.jarknights.gamedata.handbooks;

import java.util.List;

public class StoryTextAudio {

    private List<StoryText> stories;
    private String storyTitle;
    private Boolean unLockorNot;

    public List<StoryText> getStories() {
        return stories;
    }

    public String getTitle() {
        return storyTitle;
    }

    public Boolean getUnlockOrNot() {
        return unLockorNot;
    }
}
