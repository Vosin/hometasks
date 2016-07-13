/*
 * Класс кухонный комбайн
 */
package com.hm.hometasks.oop_part_3.foodProcessor;
import com.hm.hometasks.oop_part_3.peellable.Fruit;
import com.hm.hometasks.oop_part_3.peellable.Vegetable;
import java.util.ArrayList;
/**
 *
 * @author Osin Vladimir
 */
public class FoodProcessor  implements Peeller,Cutter,Slicer{

    public FoodProcessor() {
    }
   
    @Override
     public double peellItem(Object obj) {
        double weight = 0.00;
        if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            fruit.setCleaning(true);
            System.out.println(fruit.toString() + " очищен!");
            weight = (fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            vegetable.setCleaning(true);
            System.out.println(vegetable.toString() + " очищен!");
            weight = (vegetable.getWeight() - ((vegetable.getWeight() * 5) / 100));
        }
        return weight;
    }
   
     @Override
     public double peellItems(ArrayList fruitVegetables) {
     double weight = 0.00;
      for (int i = 0; i < fruitVegetables.size(); i++) {
            Object  obj = fruitVegetables.get(i);
         if (obj instanceof Fruit) {
            Fruit fruit = (Fruit) obj;
            fruit.setCleaning(true);
            System.out.println(fruit.toString() + " очищен!");
            weight = (fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
        } else if (obj instanceof Vegetable) {
            Vegetable vegetable = (Vegetable) obj;
            vegetable.setCleaning(true);
            System.out.println(vegetable.toString() + " очищен!");
            weight = (vegetable.getWeight() - ((vegetable.getWeight() * 5) / 100));
        }
        
    }
     return weight;
    }
     @Override
    public double cut(Object obj) {
       double weight = 0.00; 
       if (obj instanceof Fruit) {
           Fruit fruit = (Fruit) obj;
           if (fruit.getCleaning() == true) {
               System.out.println(fruit.toString() + " пошинкован!");
               weight = (fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
           } else {
               throw new IllegalArgumentException(fruit.toString() + "не очищен");
           }
       } else if (obj instanceof Vegetable) {
           Vegetable vegetable = (Vegetable) obj;
           if (vegetable.getCleaning() == true) {
               System.out.println(vegetable.toString() + " пошинкован!");
               weight =(vegetable.getWeight() - ((vegetable.getWeight() * 2) / 100));
           } else {
               throw new IllegalArgumentException(vegetable.toString() + "не очищен");
           }
          
       }
       return weight;
    }
     @Override
     public double cutAll(ArrayList fruitVegetables) {
       double weight = 0;
       for (int i = 0; i < fruitVegetables.size(); i++) {
           Object obj = fruitVegetables.get(i);
           if (obj instanceof Fruit) {
               Fruit fruit = (Fruit) obj;
               if (fruit.getCleaning() == true) {
                   System.out.println(fruit.toString() + " пошинкован!");
                   weight = (fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
               } else {
                   throw new IllegalArgumentException(fruit.toString() + "не очищен");
               }
           } else if (obj instanceof Vegetable) {
               Vegetable vegetable = (Vegetable) obj;
               if (vegetable.getCleaning() == true) {
                   System.out.println(vegetable.toString() + " пошинкован!");
                   weight = (vegetable.getWeight() - ((vegetable.getWeight() * 2) / 100));
               } else {
                   throw new IllegalArgumentException(vegetable.toString() + "не очищен");
               }

           }
        }
        return weight;
     }
     
    @Override
    public double slicerItem(Object obj) {
       double weight = 0.00; 
       if (obj instanceof Fruit) {
           Fruit fruit = (Fruit) obj;
           if (fruit.getCleaning() == true) {
               System.out.println(fruit.toString() + " нарезан ломтиками!");
               weight = (fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
           } else {
               throw new IllegalArgumentException(fruit.toString() + "не очищен");
           }
       } else if (obj instanceof Vegetable) {
           Vegetable vegetable = (Vegetable) obj;
           if (vegetable.getCleaning() == true) {
               System.out.println(vegetable.toString() + " нарезан ломтиками!");
               weight =(vegetable.getWeight() - ((vegetable.getWeight() * 2) / 100));
           } else {
               throw new IllegalArgumentException(vegetable.toString() + "не очищен");
           }
          
       }
       return weight;
    }
@Override
     public double slicerItems(ArrayList fruitVegetables) {
       double weight = 0;
       for (int i = 0; i < fruitVegetables.size(); i++) {
           Object obj = fruitVegetables.get(i);
           if (obj instanceof Fruit) {
               Fruit fruit = (Fruit) obj;
               if (fruit.getCleaning() == true) {
                   System.out.println(fruit.toString() + " пошинкован!");
                   weight = (fruit.getWeight() - ((fruit.getWeight() * 2) / 100));
               } else {
                   throw new IllegalArgumentException(fruit.toString() + "не очищен");
               }
           } else if (obj instanceof Vegetable) {
               Vegetable vegetable = (Vegetable) obj;
               if (vegetable.getCleaning() == true) {
                   System.out.println(vegetable.toString() + " пошинкован!");
                   weight = (vegetable.getWeight() - ((vegetable.getWeight() * 2) / 100));
               } else {
                   throw new IllegalArgumentException(vegetable.toString() + "не очищен");
               }

           }
        }
        return weight;
     }
}
     
        

