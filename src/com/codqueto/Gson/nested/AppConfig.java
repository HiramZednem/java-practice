package com.codqueto.Gson.nested;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class AppConfig {
    private String appName;
    private String version;
    private Configurations settings;

    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    static class Configurations {
        private String theme;
        private boolean notifications;
        private String language;
    }
}
