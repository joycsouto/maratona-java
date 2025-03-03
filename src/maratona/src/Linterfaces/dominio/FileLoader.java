package Linterfaces.dominio;

public class FileLoader implements DataLoad, DataRemove {

    @Override
    public void load() {
        System.out.println("inside of file loader");
    }

    @Override
    public void remove() {
        System.out.println("removing file");
    }
}

