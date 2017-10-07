package controller;

import model.Canvas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Commands {

    public static Map<String, BiFunction> commands = new HashMap();

    static BiFunction<Integer, Integer, Canvas> buildCanvas = (width, height) -> new Canvas(width, height);

    static {
        // C, L, R, B, Q
        commands.put("C", buildCanvas);
    }

}
