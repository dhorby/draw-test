package controller;

import model.Command;

public class CommandController {

    public static Command parseCommand(String commandString) {

        final String[] commandVals = commandString.split(" ");
        final String commandVal = commandVals[0];

        Command command = null;

        switch(commandVal.toUpperCase()) {
            case "C": command = new Command("C", Integer.parseInt(commandVals[1]), Integer.parseInt(commandVals[2]));
                break;
            default:
                System.out.println("Invalid command");
                break;
        }

        return command;

    }
}
