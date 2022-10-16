package expressions;
import java.util.*;
public class Expressions {

    public static void main(String[] args) {
        
        
        //2d arrayList

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        
        
       ArrayList<String> backeryList = new ArrayList<String>();
       
       backeryList.add("pasta");
       backeryList.add("garlic bread");
       backeryList.add("donuts");
        
       
         ArrayList<String> fruitList = new ArrayList<String>();
       
       fruitList.add("Banana");
       fruitList.add("chilie");
       fruitList.add("mongo");
       
       
         ArrayList<String> vegList = new ArrayList<String>();
       
       vegList.add("cabbaage");
       vegList.add("tomato");
       vegList.add("cucumber");
       
       groceryList.add(backeryList);
       groceryList.add(fruitList);
       groceryList.add(vegList);
       
       System.out.println(groceryList);
       
        
        
        
       
    }
    
}
  
