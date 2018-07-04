package com.bs.rest.service;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.bs.rest.data.DataBuilder;
import com.bs.rest.data.StaticData;
import com.bs.rest.model.ContentMatch;

public class BotService {

    public ContentMatch match(String content) {

        ContentMatch contentMatch = new ContentMatch();
        if (!StringUtils.isBlank(content)) {
            // word boundaries
            String[] words = content.trim().toLowerCase().split("\\b");
            List<String> tokens = Arrays.asList(words);
            String patternString = "\\b(" + StringUtils.join(tokens, "|") + ")\\b";
            Matcher matcher = null;
            Pattern pattern = null;
            for (StaticData sd : DataBuilder.getData()) {
                pattern = Pattern.compile(sd.getPattern());
                matcher = pattern.matcher(patternString);
                while (matcher.find()) {
                    contentMatch.setPattern(sd.getPattern());
                    contentMatch.setValue(sd.getValue());
                    return contentMatch;
                }

            }
        }
        // default set
        contentMatch.setPattern("notfound");
        contentMatch.setValue("I'm afraid I don't understand. I'm sorry!");
        return contentMatch;

    }
}
