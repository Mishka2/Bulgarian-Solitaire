//	Michelle Loven 		December 2, 2016

/**This program is a game of Bulgarian Solitaire
 * You pick any triangular number of cards and it will sort it into piles of n(1), where n(2) = n+1 
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;


public class BulgSolitaire {

	public static void main(String[] args) {
		Scanner numCardsTry = new Scanner(System.in);
		 int numCards = 0;
  
//Testing to see if the number entered in is triangular
	for(int t = 1; t < 10; t++){
	System.out.print("Enter a triangular number: ");
    int numCardsTest = numCardsTry.nextInt();
    
    double testNum = Math.sqrt((8*numCardsTest) + 1);
    
        if(testNum % 1 == 0 ){
        	t = 10000000;
        	numCards = numCardsTest;
        }else{
		t--;
        	System.out.print("Try again! That number is not triangular. ");
        }
	}
  
//Initializing arrayList
		ArrayList<Integer> cards = new ArrayList<Integer>();
		
		Random randNum = new Random();
		
		int totalCards = numCards;

//Making random amounts of piles based on how many cards there are
		for(int cardPile = 0; cardPile < numCards; cardPile++){
			int cardsInPile = (randNum.nextInt(numCards));
			if(cardsInPile <= totalCards){
				cards.add(cardPile, cardsInPile);
				totalCards = totalCards - cardsInPile;
			} else {
				cardPile--;
			}
		}
		int numPiles = cards.size();

//getting rid of the zeros in the arrayList		
		for(int zeros = 0; zeros < cards.size(); zeros++){
			if(cards.get(zeros) == 0){
				cards.remove(zeros);
				zeros--;
			}
		}
		
		setPiles(numPiles, cards);
	}

//testing to see if the array had an order of 1, 2, 3, 4...
	public static void setPiles(int numPiles, ArrayList<Integer> cards){
		System.out.println(cards);
		int placeHolder = 1;
		int finCounter = 0;
	
		for(int m = 0; m < 100000; m++){
			workLoop(cards);
			System.out.println(cards);
			Collections.sort(cards);
			for( int p = 0; p < cards.size(); p++){
				if(cards.get(p) == placeHolder){
					placeHolder++;
					finCounter++;
				}else {
					placeHolder = 0;
					finCounter = 0;
				}
			}
		if(finCounter == cards.size()){
			m = m+1000000000;
			for(int i = 0; i < cards.size(); i++){
				if(cards.get(i) == 0){
					cards.remove(i);
					i--;
				}
			}
			System.out.println(cards);
		  }
		}
	}
		
//the algorithm of taking away cards and putting them back in 	
	public static void workLoop(ArrayList<Integer> cards){
		int counter = 0;
		
		for(int i = 0; i < cards.size(); i++){
			if(cards.get(i) == 0){
				cards.remove(i);
				i--;
			} else {
				int next = cards.get(i)-1;
				cards.set(i, next);
				counter++;
			}
			System.out.println(cards + "  Counter= " + counter);
		}
		cards.add(counter);
		System.out.println(cards);
	}

  }
