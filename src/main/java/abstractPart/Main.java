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


        Button button1= new Button(2,"Enter");
        Switch switch1 = new Switch(3,true);
        DropDown dropDown1 = new DropDown(5,new String[]{
                "이름 오름차순", "이름 내림차순",
                    "크기 오름차순", "크기 내림차순",
                    "날짜 오름차순", "날짜 내림차순"
        });

        clickFormElement(button1);
        clickFormElement(switch1);
        clickFormElement(switch1);
        clickFormElement(switch1);

        clickFormElement(dropDown1);
    }

    public static void clickFormElement(FormElement fe){
        fe.func();
    }
}
