import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        
    
    FileReader reader = null;
    FileWriter writer = null;
    try{
        reader=new FileReader("Pr.txt");
        //reading and printing file contents on the screen
        int ch;
        while ((ch=reader.read())!=-1) {
            System.out.print((char )ch);

        }
        System.out.println();
        reader.close();
        reader=null;


        writer=new FileWriter("Pr.txt");
       writer.write("iam pradeepshetty");
        writer.flush();

    }catch(FileNotFoundException e){
        System.out.print("file not found..");
    }catch(IOException e){
        System.out.print(e.getMessage());
    }finally{
        if(reader!=null){
        
        reader.close();
    }
    if(writer!=null){
        writer.close();
    }
}
}
}

