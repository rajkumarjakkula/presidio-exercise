import java.io.*;

public class TextAppending {
    public static void main(String[] args){
        try {
            FileWriter f=new FileWriter("file.txt",true);
            f.write("\nThis is an sample text(append)");
            f.close();
            System.out.println("done with appending, file closed");
        }
        catch (IOException exception)
        {
            System.out.println("Error while Appending error: "+exception);
        }
        }


    }


