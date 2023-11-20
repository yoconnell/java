package abstractPart;

public class Main {
    public static void main(String[] args) {
        //EeAGroup group = new EeAGroup();
        // 이건 불가능
        // abstract라서 바로 사용 불가

        EeAFoodcompny eeAFoodcompny1 = new EeAFoodcompny("new york");
        EeAFoodcompny eeAFoodcompny2 = new EeAFoodcompny("paris");

        EeAFashionCompny eeAFashionCompny1 = new EeAFashionCompny("ams",true);
        EeAFashionCompny eeAFashionCompny2 = new EeAFashionCompny("london",false);

        EeAGroup[] aCmpnies={
                eeAFoodcompny1,eeAFoodcompny2,eeAFashionCompny1,eeAFashionCompny2
        };

        for(EeAGroup eeAGroup: aCmpnies){
            eeAGroup.takeOrder();
        }

        System.out.println("\n- - - - -\n");

        System.out.println(EeAFoodcompny.getCreed());
        System.out.println(EeAFashionCompny.getCreed());

    }
}
