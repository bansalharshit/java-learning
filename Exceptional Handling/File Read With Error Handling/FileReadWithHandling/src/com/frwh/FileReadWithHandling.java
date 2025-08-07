package com.frwh;

import java.io.*;

public class FileReadWithHandling {
    public static void main(String[] args)  {
        BufferedReader reader = null;
        try{
            File file = new File("sample.txt");
            reader = new BufferedReader(new FileReader(file));
            //BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sample.txt"));
            System.out.println("File Content :");
            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("Error: File Not Found. Please check the filename and path.");
        }catch (IOException e)
        {
            System.out.println("Error: Reading the file "+e.getMessage());
        }finally{
            try{
                if(reader!=null)
                {
                    reader.close();
                    System.out.println("File Reader closed Successfully...");
                }
            }catch(IOException e)
            {
                System.out.println("Error closing the file reader");
            }

        }
    }
}
