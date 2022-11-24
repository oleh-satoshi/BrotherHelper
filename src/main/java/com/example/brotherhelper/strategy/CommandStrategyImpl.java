package com.example.brotherhelper.strategy;

import com.example.brotherhelper.model.Command;
import com.example.brotherhelper.strategy.handler.CommandHandler;
import com.example.brotherhelper.strategy.handler.PlugCommandHandler;
import com.example.brotherhelper.strategy.handler.StartCommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CommandStrategyImpl implements CommandStrategy {
    private final Map<String, CommandHandler> strategyMap;

    public CommandStrategyImpl() {
        strategyMap = Map.of(
                Command.START.getName(), new StartCommandHandler());
    }

    @Override
    public CommandHandler get(String command) {
        CommandHandler commandHandler = strategyMap.get(command);
        if (commandHandler == null) {
            commandHandler = new PlugCommandHandler();
        }
        return commandHandler;
    }
}