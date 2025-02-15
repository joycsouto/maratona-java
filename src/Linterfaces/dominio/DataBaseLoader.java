package Linterfaces.dominio;

public class DataBaseLoader implements DataLoad, DataRemove{

    @Override
    public void load() {
        System.out.println("inside of databaseloader");
    }

    @Override
    public void remove() {
        System.out.println("revoving data");
    }

}
