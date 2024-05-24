import javax.naming.Name;

public class Product {

    int ProduktId;
    public String ProduktName;
    public int Price;
    public int Stock;

    public void setProduktId(int ProduktId) {
        this.ProduktId = ProduktId;
    }

    public int getProduktId() {
        return ProduktId;
    }

    public void setProduktName(String Produktname) {
        this.ProduktName = Produktname;
    }

    public String getProduktName() {
        return ProduktName;
    }

    public void setName(String Name) {
       this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getPrice() {
        return Price;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getStock() {
        return Stock;
    }
    abstract void reduceStock(int quantity) {

    }
}