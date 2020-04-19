package io.kyouin.jarknights.utils;

import io.kyouin.jarknights.gamedata.skills.SkillAttribute;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormatter {

    public static String formatText(String text, String replace) {
        return text.replaceAll("<@ba\\.vup>|<@ba\\.vdown>|<@ba\\.kw>|<@ba\\.talpu>|</>", replace).replaceAll("; *", "\n");
    }

    public static String formatSkillText(List<SkillAttribute> skillAttributes, String skillText, String replace, String secondReplace) {
        Matcher remMatcher = Pattern.compile("<@ba\\.rem>[^@]+</>").matcher(skillText);

        while (remMatcher.find()) {
            String match = remMatcher.group();

            skillText = skillText.replace(match, match.replaceAll("<@ba\\.rem>|</>", secondReplace));
        }

        skillText = formatText(skillText, replace);

        if (skillAttributes == null) return skillText;

        Pattern pattern = Pattern.compile("[+-]?\\{([^:}]+):?(?:[^}])+?}");
        Matcher matcher = pattern.matcher(skillText);

        while (matcher.find()) {
            String matched = matcher.group();
            String key = matcher.group(1);

            for (SkillAttribute skillAttribute : skillAttributes) {
                if (!skillAttribute.getKey().equalsIgnoreCase(key)) continue;

                if (matched.contains("%")) skillText = skillText.replace(matched, ((int) (skillAttribute.getValue() * 100)) + "%");
                else skillText = skillText.replace(matched, skillAttribute.getValue() + "");
            }
        }

        return skillText.replaceAll("\\.0", "");
    }

    public static List<String> formatAceshipSkillText(List<SkillAttribute> skillAttributes, List<String> skillTexts) {
        Pattern pattern = Pattern.compile("\\{?(?:\\{([^}]+)})(?::[^}]+})?");
        List<String> formattedSkillTexts = new ArrayList<>();

        skillTexts.forEach(skillText -> {
            Matcher matcher = pattern.matcher(skillText);

            while (matcher.find()) {
                String matched = matcher.group();
                String attribute = matcher.group(1);

                for (SkillAttribute skillAttribute : skillAttributes) {
                    if (!skillAttribute.getKey().equalsIgnoreCase(attribute)) continue;

                    if (matched.contains("%")) skillText = skillText.replace(matched, ((int) (skillAttribute.getValue() * 100)) + "%");
                    else skillText = skillText.replace(matched, skillAttribute.getValue() + "");
                }
            }

            formattedSkillTexts.add(skillText.replaceAll("\\.0", ""));
        });

        return formattedSkillTexts;
    }
}
