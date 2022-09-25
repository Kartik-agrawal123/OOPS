package OOPS;
class Lib {
    int[] availableBook;
    int[] issueBook;
    int[] returnBook;

    public void showAvailableBook () {
        availableBook = new int[10];
        for (int i = 0; i <= availableBook.length-1; i++) {
            availableBook[i] = 1;
        }
    }

    public void issueBook() {
        issueBook = new int[5];
        int i = 0;
        issueBook[i] += 1;
        i++;

    }
        public void returnBook () {
        returnBook = new int[5];
        int j = 0;
        returnBook[j] += 1;
        j++;

    }
        public void print(){
            System.out.println("available books here :");
            for(int j = 0;j<=availableBook.length-1;j++){
                System.out.print(availableBook[j]+" ");
            }
            System.out.println();
            System.out.println("issue books here :");
            for(int j = 0;j<=issueBook.length-1;j++){
                System.out.print(issueBook[j]+" ");
            }
            System.out.println();
            System.out.println("return books here :");
            for(int k = 0;k<=returnBook.length-1;k++){
                System.out.print(returnBook[k]+" ");
            }
            System.out.println();

        }


}

    public class Library {
        public static void main(String[] args) {
            Lib person_1 = new Lib();
            Lib person_2 = new Lib();


            person_1.showAvailableBook();
            person_1.issueBook();
            person_1.returnBook();
            person_1.print();

            person_2.showAvailableBook();
            person_2.issueBook();
            person_2.returnBook();
            person_2.print();

        }
    }

