import java.awt.*;
/**
 * Write a description of class Tiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiles
{
    // instance variables - replace the example below with your own
    private String color;
    private int row;
    private int column;
    private boolean withGlue;
    private boolean isVisible;
    

    /**
     * Constructor for objects of class Tiles
     */
    public Tiles()
    {
        // initialise instance variables
        this.row = row;
        this.column = column;
        this.color = color;
        withGlue = false;
        isVisible = true;
    }

    /**
     * create a tile with the given values
     */
    
    public Tiles(int rowGiven, int columnGiven, String colorGiven)
    {
        // put your code here
        row = rowGiven;
        column = columnGiven;
        color = colorGiven;
        withGlue = false;
        isVisible = true;
    }
    public void relocateTile(int rowGiven, int columnGiven)
    {
        row = rowGiven;
        column = columnGiven;
    }
        public void addGlue(){
        withGlue = true;
    }
        public void deleteGlue(){
        withGlue = false;
    }
        public void makeVisible(){
        isVisible = true;
    }
        public void makeInvisible(){
        isVisible = false;
    }
}
