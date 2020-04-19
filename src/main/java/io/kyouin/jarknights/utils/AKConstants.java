package io.kyouin.jarknights.utils;

public class AKConstants {

    public static final Integer HTTP_TIMEOUT                = 120;

    public static final String  BASE_URL                    = "https://raw.githubusercontent.com";

    private static final String ACESHIP_DATA                = "/Aceship/AN-EN-Tags/master/json";
    private static final String ACESHIP_IMG                 = "/Aceship/AN-EN-Tags/master/img";

    private static final String ACESHIP_GAMEDATA            = ACESHIP_DATA + "/gamedata/{lang}/gamedata/excel";

    public static final String  IMAGE_AVATARS               = ACESHIP_IMG + "/avatars/";
    public static final String  IMAGE_CHARACTERS            = ACESHIP_IMG + "/characters/";
    public static final String  IMAGE_ITEMS                 = ACESHIP_IMG + "/items/";
    public static final String  IMAGE_SKILLS                = ACESHIP_IMG + "/skills/";

    public static final String  JSON_CHARACTER              = ACESHIP_GAMEDATA + "/character_table.json";
    public static final String  JSON_CHAR_WORD              = ACESHIP_GAMEDATA + "/charword_table.json";
    public static final String  JSON_CHECK_IN               = ACESHIP_GAMEDATA + "/checkin_table.json";
    public static final String  JSON_HANDBOOK               = ACESHIP_GAMEDATA + "/handbook_info_table.json";
    public static final String  JSON_ITEM                   = ACESHIP_GAMEDATA + "/item_table.json";
    public static final String  JSON_RANGE                  = ACESHIP_GAMEDATA + "/range_table.json";
    public static final String  JSON_SKILL                  = ACESHIP_GAMEDATA + "/skill_table.json";
    public static final String  JSON_SKIN                   = ACESHIP_GAMEDATA + "/skin_table.json";
    public static final String  JSON_STAGE                  = ACESHIP_GAMEDATA + "/stage_table.json";

    public static final String  JSON_ACESHIP_AKHR           = ACESHIP_DATA + "/tl-akhr.json";
    public static final String  JSON_ACESHIP_CHAR           = ACESHIP_DATA + "/tl-char.json";
    public static final String  JSON_ACESHIP_SKILLS         = ACESHIP_DATA + "/ace/tl-skills.json";
    public static final String  JSON_ACESHIP_TAGS           = ACESHIP_DATA + "/tl-tags.json";
    public static final String  JSON_ACESHIP_TALENTS        = ACESHIP_DATA + "/ace/tl-talents.json";
    public static final String  JSON_ACESHIP_TYPE           = ACESHIP_DATA + "/tl-type.json";
    public static final String  JSON_ACESHIP_UNREADABLENAME = ACESHIP_DATA + "/tl-unreadablename.json";

    public static final String  LANG_EN                     = "en_US";
    public static final String  LANG_JP                     = "ja_JP";
    public static final String  LANG_KR                     = "ko_KR";
    public static final String  LANG_CN                     = "zh_CN";
}
