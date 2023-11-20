package abstractPart;

public class EeAFoodcompny extends EeAGroup {

    protected EeAFoodcompny(String name) {
        super(++lastNo, name);
    }

    public static String getCreed(){
        return Creed.formatted("the food");
    }

    protected static int lastNo = 0;


    //반드시 구현 되어야하는 부분
    @Override
    public void takeOrder() {
        System.out.printf("%s 식품사업부입니다. ",super.intro());
    }
}
