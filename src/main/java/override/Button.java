package override;

public class Button {
    private String print;

    public Button(String print){
        this.print=print;
    }

    public void func (){
        System.out.println("입력적용 = " + print);
    }
}
