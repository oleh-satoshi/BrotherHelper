package com.example.brotherhelper.strategy.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class StartCommandHandler implements CommandHandler {

    @Override
    public SendMessage handle(Update update) {
        String firstName = update.getMessage().getChat().getFirstName();
        Long chatId = update.getMessage().getChatId();
        String response = "Привет, " + firstName + ", приятно познакомится!";
        SendMessage sendMessage = SendMessage.builder()
                .text(response)
                .chatId(chatId)
                .build();
        return sendMessage;
    }
}
