package io.kyouin.jarknights.gamedata.checkins;

import java.util.List;

public class CheckIn {

    private String groupId;
    private String title;
    private String description;
    private Long signStartTime;
    private Long signEndTime;
    private List<CheckInItem> items;

    public String getID() {
        return groupId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getSignStartTime() {
        return signStartTime;
    }

    public Long getSignEndTime() {
        return signEndTime;
    }

    public List<CheckInItem> getItems() {
        return items;
    }
}
