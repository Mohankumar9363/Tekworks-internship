/*Online Store: Create a class called Product that represents a product in an online store, and a class called Store that represents the store. The store class should have methods to add, remove, and display products. You can also create a custom exception called ProductNotFoundException to throw when a product is not found in the store.*/
import java.util.Scanner;

 class Product {
    String product;
     double price;
     double quantity;
     Product(String product,double price,double quantity){
         this.product=product;
         this.price=price;
         this.quantity=quantity;
     }
     void getProductDetails() {
        System.out.println("product is "+product);
        System.out.println("Price of product is "+price);
        System.out.println("Quantity of product is "+quantity);
    }
}
 class Store {
    String[] products;
     Store(String[] products){
         this.products=products;
     }
     void addProduct( ){
         System.out.println("enter product name to add in store");
         Scanner sc=new Scanner(System.in);
         String prod=sc.next();
         String products1[]=new String[products.length+1];
         for(int i=0;i<products.length;i++)
             products1[i]=products[i];
         products1[products.length]=prod;
         this.products=products1;
     }
     void deleteProduct(){
         System.out.println("enter product name to delete in store");
         Scanner sc=new Scanner(System.in);
         String prod=sc.next();
         String products1[]=new String[products.length-1];
         int j=0;
         for(int i=0;i<products.length;i++){
             if(!products[i].equals(prod)){
                 products1[j++]=products[i];
             }    
         }
         this.products=products1;
     }
    void displayProducts() {
        System.out.println("the products available are:");
        for(String h:products)
            System.out.println(h);
    }
    
} 
class OnlineStore{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter details for product");
        System.out.println("enter product name:");
        String product=sc.next();
        System.out.println("enter price of product ");
        double price=sc.nextDouble();
        System.out.println("enter quantity of product ");
        double quantity=sc.nextDouble();
        System.out.println("enter details for Store");
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        String[] products = new String[n];
        System.out.println("enter product names");
        for (int i = 0; i < n; i++) {
            products[i] = sc.next();
        }
        Product p = new Product(product,price,quantity);
        Store s=new Store(products);
        int opt=0;
        System.out.println("choose the option from below");
        System.out.println("1.product details "+"2.Add Product "+"3.Delete Product "+"4.Display Product "+"5.Exit");
        while(opt!=5){ 
        opt=sc.nextInt();
        switch(opt){
            case 1:p.getProductDetails();
                break;
            case 2: s.addProduct();
                break;
            case 3: s.deleteProduct();
                break;
            case 4: s.displayProducts();
                break;
        }
            if(opt!=4)
            System.out.println("select another option");
    }
}}
