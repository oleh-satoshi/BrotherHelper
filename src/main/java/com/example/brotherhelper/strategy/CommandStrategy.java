package com.example.brotherhelper.strategy;

import com.example.brotherhelper.strategy.handler.CommandHandler;

public interface CommandStrategy {
  CommandHandler get(String command);
}