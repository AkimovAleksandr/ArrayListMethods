/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistmethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;
import java.util.function.Predicate;

/**
 *
 * @author Kudesnik
 */
public class ArrayListMethods {

// public static Predicate<Employee> isAgeMoreThan(Integer age) {
//    return p -> p.getAge() > age;
//}

 public static Predicate<String> containsText(String text)
 {
     return p-> p.contains(text);
 }

 
 

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Певрвая вставка");
        myArrayList.add("Вторая вставка");
        myArrayList.add("Третья вставка");
        myArrayList.add("Четвертая вставка");
        System.out.println(myArrayList);  
        
        myArrayList.add(2,"Пятая вставка на третье место");
        System.out.println(myArrayList); 
        
        ArrayList<String> myArrayList2 = new ArrayList<String>();
        myArrayList2.addAll(myArrayList);
        System.out.println(myArrayList2);
        
        myArrayList2.clear();
        System.out.println(myArrayList2); 
        
        ArrayList<String> myArrayList3 = (ArrayList<String>)myArrayList.clone();
        System.out.println(myArrayList3);
        
        System.out.println(myArrayList.contains("Певрвая вставка"));
        
        myArrayList.ensureCapacity(11);
                
        myArrayList.forEach(item->{item+="!";System.out.println(item);});
        System.out.println(myArrayList);
        
        System.out.println(myArrayList.get(1));
        
        System.out.println(myArrayList.indexOf("Третья вставка"));
        
        System.out.println(myArrayList.isEmpty());
        
        Iterator<String> itr1 = myArrayList.iterator();
        while (itr1.hasNext()) System.out.println(itr1.next());
        
        System.out.println(myArrayList.lastIndexOf("Певрвая вставка"));
        
        ListIterator<String> listItr1 = myArrayList.listIterator();
        while (listItr1.hasNext()) System.out.println(listItr1.next());
        
        myArrayList.remove("Певрвая вставка");
        System.out.println(myArrayList);
        
        
        myArrayList.remove(0);
        System.out.println(myArrayList);
        
        myArrayList2.add(myArrayList.get(0));
        System.out.println(myArrayList2);
        System.out.println(myArrayList.removeAll(myArrayList2));
        System.out.println(myArrayList);
        
        // тестирую созданный предикат
        System.out.println(containsText("вставка").test(myArrayList.get(0)));
        
        myArrayList.removeIf(containsText("вставка"));
        System.out.println(myArrayList);     
        
        myArrayList.addAll(myArrayList3);
        System.out.println(myArrayList); 
       
        
       MyOperator<String> operator = new MyOperator<>();
       operator.varc1 = "вставка";
      myArrayList.replaceAll(operator);
      System.out.println(myArrayList); 
      
      myArrayList.add(2,"blablabla");
      System.out.println(myArrayList); 
      myArrayList.retainAll(myArrayList3);
      System.out.println(myArrayList); 

      myArrayList.set(0, "Самая первая вставка");
      System.out.println(myArrayList); 
      
      System.out.println(myArrayList.size());
        
      myArrayList.sort(new StringByLength());
      System.out.println(myArrayList); 
      
      List<String> myList = myArrayList.subList(0, 2);//до третьего включительно
      System.out.println(myList);
       
      String[] myStringArray = myArrayList.toArray(new String[myArrayList.size()]);
     for (String myStringArray1 : myStringArray) {
         System.out.println(myStringArray1);
     }

      Object[] myObjectArray = myArrayList.toArray();
     for (Object myObjectArray1 : myObjectArray) {
         System.out.println(myObjectArray1);
     }
      
      myArrayList.trimToSize();
        
    }
    
}
