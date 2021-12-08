package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{
        plik("C:\\Users\\local\\Desktop\\scelochzadania\\zadania10.3\\src\\pl\\edu\\uwm\\wmii\\kotewa\\laboratorium00\\ok.txt");
    }
public static void plik(String file) throws IOException
{
    BufferedReader bufReader = new BufferedReader(new FileReader(file));
    ArrayList<String> listOfLines = new ArrayList<>();
    String line = bufReader.readLine();
    while (line != null)
    {
        listOfLines.add(line);
        line = bufReader.readLine();
    }
    bufReader.close();
    System.out.println(listOfLines);
    Collections.sort(listOfLines);
    System.out.println(listOfLines);
}
}