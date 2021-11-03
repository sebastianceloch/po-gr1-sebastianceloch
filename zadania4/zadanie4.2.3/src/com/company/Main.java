package com.company;
import java.io.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        InputStream istream;
        OutputStream ostream;
        int c;
        int ile=0;
        String s;
        final int EOF = -1;
        ostream = System.out;
        try{
            File myfile = new File("xd.txt");
            istream = new FileInputStream(myfile);
            try{
                while((c = istream.read())!=EOF) {
                    ostream.write(c);
                    if(c=='asdf')
                        ile++;
                }
                System.out.println('\n');
                System.out.println(ile);
            } catch (IOException e)
            {
                System.out.println("Error");
            }
            finally{
                try{
                    istream.close();
                    ostream.close();
                }
                catch(IOException e)
                {
                    System.out.println("did not close");
                }
            }
        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }

    }
}
