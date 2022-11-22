package com.example.brotherhelper.config;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultBotOptions;

@Configuration
@Data
@PropertySource("application.properties")
public class TelegramBotConfig {
//    @Value("${telegram.userName}")
//    String userName;
//    @Value("${telegram.botToken}")
//    String botToken;
//    @Value("${telegram.webHookPath}")
//    String webHookPath;
    String userName = "InMySchoolBot";
    String botToken = "5699959668:AAETPOC3Tacmt-z2ngYklf-_t0c7JM1AZT8";
    String webHookPath = "https://2f37-2601-201-8201-d130-6042-3e4e-303-7f38.ngrok.io";

    @Bean
    public DefaultBotOptions getDefaultBotOptions() {
        return new DefaultBotOptions();
    }
}