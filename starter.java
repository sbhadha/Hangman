import pkg.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class starter implements InputControl
{
    private Hangman a;
        public static void main(String args[])
		{
            MouseController mC = new MouseController(Canvas.getInstance(),new starter());
            firstPage b= new firstPage();

			
		}
    public void onMouseClick(double xx, double yy)
    {
        if((80<xx && xx<330) && (250<yy && yy<350))
        {
            a= new Hangman();
            
        }
        else if((390<xx && xx<640) && (250<yy && yy<350))
        {
            
            System.out.println("What would your friend like the word to be:");
            EasyReader read= new EasyReader();
            String word= read.readLine();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            a= new Hangman(word);
        }
       
        
    }
			
}

