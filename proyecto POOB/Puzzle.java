import java.awt.*;
/**
 * Write a description of class Puzzle here.
 * 
 * @author (Juan David Martinez Mendez & Nicolas Pachon Unibio) 
 * @version (1 | date: 08/09/2024)
 */
public class Puzzle
{
    // instance variables - replace the example below with your own
    private int height;
    private int width;
    private String color;
    private final int xPosition;
    private final int yPosition;
    private boolean isVisible;

    /**
     * Constructor for objects of class Puzzle
     */
    public Puzzle()
    {
        // initialise instance variables
        height = 100;
        width  =100;
        color = "Black";
        xPosition = 100;
        yPosition =100;
        isVisible = true;
    }
    
}
