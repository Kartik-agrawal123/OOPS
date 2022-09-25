package OOPS;
import java.util.*;
class Game{
    int noOfGuesses;
    int ranNum;
    public Game(int n){
        ranNum = n;
    }
    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int numb = sc.nextInt();
        noOfGuesses++;
        return numb;
    }
    int num = 0;
    public void isCorrectNumber(int ranNum , int numb){
        if(ranNum == numb){
            System.out.println("Sabhas Beta Mauj Kar Diye!!!");
            System.out.println("Your number of guesses :"+noOfGuesses);
        }
        else if(ranNum>numb){
            System.out.println("Kam Hai Or Daal Be!!!!");
           num =  takeUserInput();
           isCorrectNumber(ranNum , num);

        }
        else if(ranNum<numb){
            System.out.println("Jayada Hai Kam Karrrr Be!!!");
            num = takeUserInput();
            isCorrectNumber(ranNum , num);
        }

    }
}
public class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100); // 0-100
        Game g = new Game(n);
        int no = g.takeUserInput();
        g.isCorrectNumber(n,no);




    }
}
