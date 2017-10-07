package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Command {

    private String command;
    private int width;
    private int height;

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Command(String command, int width, int height) {
        this.command = command;
        this.width = width;
        this.height = height;
    }

    public Command(String command, int x1, int y1, int x2, int y2) {
        this.command = command;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


}
