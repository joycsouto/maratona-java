package Linterfaces.dominio;

public interface DataLoad {
    void load();
    default void CheckPermission(){
        System.out.println("checking permission");
    }
}
