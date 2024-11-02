package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){ //calcula o valor em dolares total em estoque
        return price * quantity;
    }

    public void addProducts(int quantity){ //adiciona quantidade em estoque
        this.quantity += quantity;
    }

    public void removeProducts(int quantity ){ //remove quantidade em estoque
        this.quantity -= quantity;
    }

    public String toString() { // imprime todas as informações somente chamando a classe Product lá pelo Program
        return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock());
    }
}
