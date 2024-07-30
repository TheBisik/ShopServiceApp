package domain;

public class Item {
    private long id; // id pozycji
    String name; // nazwa pozycji
    protected Product product;
    int count;

    public Item(long id, String name, Product product, int count) {
        this.id = id;
        this.name = name; //TODO automatyczne pobieranie nazwy produktu z obiektu
        this.product = product;
        this.count = count;
    }
    public int getCount() {
        return count;
    }

    public String getName() {
        return name;

    /* public void setItem(long id, String name, Product product, int count) {
        Item item = new Item(id, name, product, count); */
    }
}






