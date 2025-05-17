package VCollections.domain;

public class Smartphone {
    private String serialNumeber;
    private String marca;

    public Smartphone(String serialNumeber, String marca) {
        this.serialNumeber = serialNumeber;
        this.marca = marca;
    }

    public String getSerialNumeber() {
        return serialNumeber;
    }

    public void setSerialNumeber(String serialNumeber) {
        this.serialNumeber = serialNumeber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
