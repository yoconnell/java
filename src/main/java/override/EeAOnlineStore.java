package override;

public class EeAOnlineStore extends EeAcompny{
    private boolean onlineStoreOpen = true;


    public EeAOnlineStore(int no, String name) {
        super(no, name);
    }

    public void setOnlineStoreOpen(boolean onlineStoreOpen) {
        this.onlineStoreOpen = onlineStoreOpen;
    }

    public void takeOnlineOrder(){
        System.out.printf("%d호 %s점 온라인 주문 %s%n",no,name,(onlineStoreOpen ? "get" : "reject"));
    }
    //EeAOnlineStore 클래스는 EeAcompny 클래스를 상속하고 있습니다.
    //이것은 상속을 통해 EeAcompny 클래스의 멤버 변수와 메서드를 재사용할 수 있음을 의미합니다.

    //private boolean onlineStoreOpen 멤버 변수:
    //이 변수는 온라인 스토어가 열려있는지 여부를 나타내는 부울값을 저장합니다. 초기값으로 true를 가집니다.

    //생성자 메서드 EeAOnlineStore(int no, String name):
    //이 생성자는 no와 name 매개변수를 받아서 EeAcompny 클래스의 생성자를 호출하여 객체를 초기화합니다.

    //setOnlineStoreOpen(boolean onlineStoreOpen) 메서드:
    //이 메서드를 통해 온라인 스토어가 열려있는지 여부를 설정할 수 있습니다.

    //takeOnlineOrder() 메서드: 이 메서드는 온라인 주문을 처리합니다.
    //onlineStoreOpen 변수의 값에 따라 주문을 받을지 거절할지를 출력합니다.
}
