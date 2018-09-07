package com.date.command;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {

    private Map<String, CommandModel> COMMANDS = new HashMap<>();

    private CommandManager() {
        init();
    }

    private void init() {
        COMMANDS.put("join", new JoinCommand());
        COMMANDS.put("query", new QueryCommand());
        COMMANDS.put("refactor", new RefactorProfileCommand());
    }

    private static final CommandManager COMMAND_MANAGER = new CommandManager();

    public static CommandManager getInstance() {
        return COMMAND_MANAGER;
    }

    public CommandModel getCommand(String commandName) {
        return COMMANDS.get(commandName);
    }

}
