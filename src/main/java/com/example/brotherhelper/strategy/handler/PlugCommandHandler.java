package com.example.brotherhelper.strategy.handler;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class PlugCommandHandler implements CommandHandler {
    @Override
    public SendMessage handle(Update update) {
        String firstName = update.getMessage().getChat().getFirstName();
        Long chatId = update.getMessage().getChatId();
        String response = firstName + ", такой команды нет!";
        SendMessage sendMessage = SendMessage.builder()
                .text(response)
                .chatId(chatId)
                .build();
        return sendMessage;
    }
}
