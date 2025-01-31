package Neexption.exeption.test;

import javax.swing.*;
import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {

    }
public static void LendoFile02(){
        try(Reader reader = new BufferedReader(new FileReader("test.txt"))) {
        }catch (IOException e ){
            e.printStackTrace();
        }
        }
}
    public static void LendoFile() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

