package practice;

import java.util.Arrays;

/**
 *
 * @author Mimi
 */
public class Card {
  
    public static void main(String[] args) {
        String [] cards  = {"J","1","K","Q","A","2","10"};
        cards=SortingTheCards(cards);
        for (String s: cards){
          System.out.println(s);
        }
    }
    
    public static String [] SortingTheCards(String cards[]){
        String [] st={"A","K","Q","J","10"};
        int count=0;
        for (int i=0; i<st.length; i++){
            for (int j=0; j<cards.length;j++){
                if(st[i].equals(cards[j])){
                    String temp=cards[i];
                    cards[i]=cards[j];
                    cards[j]=temp;
                    count++;
                }
                
            }
        }

        for (int i=count; i<cards.length-1; i++){
           for (int j=i;j<cards.length;j++){ 
                
                    if ((int)cards[j].charAt(0) > (int)cards[i].charAt(0)){
                    String temp= cards[j];
                    cards[j]=cards[i];
                    cards[i]=temp;
                }
           }
        }
        return cards;
    }
    
    public static void sortingKori(){
        String [] cards  = {"J","1","K","Q","A","2","10"};
        
        for (int i=0; i<cards.length-1; i++){
            
            if ((int)cards[i].charAt(0) < (int)cards[i+1].charAt(0)){
                String temp= cards[i];
                cards[i]=cards[i+1];
                cards[i+1]=temp;
            }
        }
      //  Arrays.sort(cards);
        
    }
}
    
