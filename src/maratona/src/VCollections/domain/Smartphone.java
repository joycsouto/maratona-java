package VCollections.domain;

public class Smartphone {
    private String serialNumeber;
    private String marca;

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumeber != null &&  serialNumeber.equals( smartphone.serialNumeber);
    }

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
