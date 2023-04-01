import java.util.*;

public class text{
    public static void main(String args[]){
        List<data1> sales2021=new ArrayList<>();
        List<data1> sales2022=new ArrayList<>();
        sales2021.add(new data1("tea",120));
        sales2021.add(new data1("Coffee",230));
        sales2021.add(new data1("greentea",60));
       

        sales2022.add(new data1("tea",100));
        sales2022.add(new data1("Coffee",250));
        sales2022.add(new data1("greentea",50));
        
        
         

        int sales2021Total=sales2021.stream().mapToInt(s->s.getvalue()).sum();
        int sales2022Total=sales2022.stream().mapToInt(s->s.getvalue()).sum();
        //calculate total for tea products-so use filter option
        

        int salesoftea2021=sales2021.stream().filter(s->s.getProduct().contains("tea"))
        .mapToInt(s->s.getvalue()).sum();
        int salesoftea2022=sales2022.stream().filter(s->s.getProduct().contains("tea"))
        .mapToInt(s->s.getvalue()).sum();

       
       
      
        System.out.println("sum of 2021 sales"+sales2021Total);
        System.out.println("sum of 2022 sales"+sales2022Total);
        System.out.println(salesoftea2021);
        System.out.println(salesoftea2022);


       

        
       }
}
class data1 {
    private String product;
    private int value;
    private double varpct;
     public data1(String product,int value){
        this.product=product;
        this.value=value;
        

     }
     public data1(String product,double varpct){
        this.product=product;
        this.varpct=varpct;
     }
     public int getvalue(){
        return value;

     }
     public String getProduct(){
        return product;
     }
     public String toString(){
        return "{"+this.product+":"+this.value+":"+this.varpct+"}";
     }

    
}
