package Linterfaces.test;

import Linterfaces.dominio.DataBaseLoader;
import Linterfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        fileLoader.CheckPermission();
        dataBaseLoader.CheckPermission();
    }
}
