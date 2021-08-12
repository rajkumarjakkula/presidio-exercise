import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class InsertText{
    public static void main(String[] args) {
        try{
        File file=new File("file.txt");
        if(!file.exists())
        {
            if(file.createNewFile())
            {
                System.out.println("New file created successfully");
            }
        }
        FileWriter writer=new FileWriter(file);
        writer.write("Text Inserted in the file");
        writer.close();
        }
        catch (IOException exception)
        {
            System.out.println("something went wrong");
        }

    }
}