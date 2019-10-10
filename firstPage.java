import pkg.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class firstPage
{
    
    private boolean state;
    Player win;
    private String[] b;
    private EasyReader read;
    private String line;
    private String theword;
    private ArrayList<Object> person;
    
    public firstPage()
    {
        Rectangle cgenerated= new Rectangle(80, 250, 250,100);
        cgenerated.draw();
        Text c= new Text(115,280, "Computer Generated Words");
        c.draw();
        Rectangle buddy= new Rectangle(390, 250, 250,100);
        Text b= new Text(440,280, "Friends Choose Words");
        b.draw();
        buddy.draw();
    }
	
    public String toString()
    {

       return "the word is: "+ theword;
    }
}
