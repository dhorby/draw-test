package model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Span {

    private int from;
    private int to;
    private int row;
    private int column;
}
