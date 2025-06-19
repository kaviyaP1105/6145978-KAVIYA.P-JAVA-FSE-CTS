import java.util.*;
import java.lang.*;
class Product
{
    int productId;
    String productName;
    String category;
    public Product(int productId,String productName,String category)
    {
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }
}
public class 
 {
    public static void main(String[] args) {
        List<Product> p=new ArrayList<>();
        p.add(new Product(1,"HpLaptop","Laptop"));
         p.add(new Product(2, "DellLaptop", "Laptop"));
        p.add(new Product(3, "iPhone 14", "Mobile"));
        p.add(new Product(4, "Samsung Galaxy", "Mobile"));
        p.add(new Product(5, "Sony Bravia TV", "Electronics"));
        p.add(new Product(6, "LG Refrigerator", "Appliances"));
        p.add(new Product(7, "Whirlpool Washing Machine", "Appliances"));
        p.add(new Product(8, "Redmi Note 12", "Mobile"));
        p.add(new Product(9, "Apple Watch", "Wearables"));
        p.add(new Product(10, "Boat Earbuds", "Audio"));
        p.add(new Product(11, "Asus Monitor", "Electronics"));
        p.add(new Product(12, "Lenovo Keyboard", "Accessories"));
        p.add(new Product(13, "Logitech Mouse", "Accessories"));
        p.add(new Product(14, "Amazon Echo", "Smart Devices"));
        p.add(new Product(15, "Philips Trimmer", "Personal Care"));
        p.add(new Product(16, "Canon Printer", "Office"));
        p.add(new Product(17, "Realme Tablet", "Tablet"));
        p.add(new Product(18, "MI Air Purifier", "Home Appliances"));
        p.add(new Product(19, "Nike Shoes", "Footwear"));
        p.add(new Product(20, "Puma Backpack", "Bags"));
        System.out.println("Welcome USER");
        System.out.println("Enter the product ID You want to search between 1 and 20");
        Scanner in=new Scanner(System.in);
        int userProduct=in.nextInt();
        //LINEAR SEARCH
        System.out.println("LINEAR SEARCH");
        for(int i=0;i<p.size();i++)
        {
            if(userProduct==p.get(i).productId)
            {
                System.out.println("Your product found");
                System.out.println("PRODUCT DETAILS");
                System.out.println(p.get(i).productId);
                System.out.println(p.get(i).productName);
                System.out.println(p.get(i).category);
            }
            
        }
        //BINARY SEARCH
        System.out.println("BINARY SEARCH");
        int n=p.size();
        int s=0;
        int e=n-1;
       
        boolean f=false;
        while(s<=e)
        {
             int m=(s+e)/2;
            if(userProduct==p.get(m).productId)
            {
                System.out.println("Your product found");
                System.out.println("PRODUCT DETAILS");
                System.out.println(p.get(m).productId);
                System.out.println(p.get(m).productName);
                System.out.println(p.get(m).category);
                f=true;
                break;
            }
            else if(userProduct>p.get(m).productId)
            {
                s=m+1;
            }
            else 
            {
                e=m-1;
            }
        }
        if(!f)
        {
            System.out.println("No product");
        }
    }
    
}

