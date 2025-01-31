package Linterfaces.test;

import Linterfaces.dominio.DataLoad;

public class DataBaseLoader implements DataLoad {

    @Override
    public void load() {
        System.out.println("inside of databaseloader");
    }
}
