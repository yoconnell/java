package abstractPart;

public class EeAFashionCompny extends EeAGroup {
    public static String getCreed(){
        return Creed.formatted("the fashion");
    }

    protected static int lastNo = 0;

    private boolean isSW;

    public EeAFashionCompny(String name, boolean isSW) {
        super(++lastNo, name);
        this.isSW = isSW;
    }

    @Override
    public void takeOrder() {
        System.out.printf("%s 패션사업부입니다.",super.intro());
        if(!isSW) System.out.printf("ff시즌을 찾으세요?");
    }
}
