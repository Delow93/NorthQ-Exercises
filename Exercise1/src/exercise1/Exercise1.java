/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.HashMap;

/**
 *
 * @author Bæstet
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lArray[]={1, 2, 3, 5, 4, 4, 5, 2, 2, 5, 5, 4, 5, 1, 1, 1};
        String[]result=removeFromList(lArray, 3);
        System.out.print("Endelige resultat: ");
        for(int i=0;i<result.length;i++){
            if(i==result.length-1){
                System.out.println(result[i]);
            }else{
            System.out.print(result[i]+", ");
        }
        }
        
        
    }
    
    
    
    public static String[] removeFromList(int listArray[], int n){
        HashMap hmList = new HashMap();
        String newList="";
        for(int i=0; i<listArray.length;i++){
            if(hmList.get(listArray[i])!=null){
                hmList.put(listArray[i],(int) hmList.get(listArray[i])+1);
            }else{
            hmList.put(listArray[i], 1);
            }
            if((int)hmList.get(listArray[i])<n){
                newList+=listArray[i]+",";
                //System.out.println("hmList: "+ hmList.get(listArray[i]));
            }else{
                
                //System.out.println("Removed value: "+listArray[i]);
                hmList.put(listArray[i],0);
            }
            
        }
        String[] arrayNewList=newList.split(",");
      return arrayNewList;
    }
}
