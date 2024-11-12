public class Products{
    private String product;
    private boolean isVegeterian;

    public Products(String product, boolean isVegeterian){
        this.isVegeterian = isVegeterian;
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public boolean isVegeterian() {
        return isVegeterian;
    }

    public void setVegeterian(boolean isVegeterian) {
        this.isVegeterian = isVegeterian;
    }

    public void displayProductInfo() {
        String vegetarianStatus = isVegeterian ? "Vegetarian" : "Non-Vegetarian";
        System.out.println("Product: " + product);
        System.out.println("Vegetarian: " + vegetarianStatus);
    }
    
    public static void main(String[] args) {
        Products p = new Products("Meat", false);
        p.getProduct();
        p.isVegeterian();
        p.setProduct("Potato");
        p. setVegeterian(false);
        p.displayProductInfo();
    }
}
