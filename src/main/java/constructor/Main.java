package constructor;

public class Main {
    public static void main(String[] args) {



        EeACmpny store1 = new EeACmpny(1,"뉴욕");

        int storeNo = store1.no;
        String store1Name = store1.name;

        String store1Intro =store1.intro();


    }
}