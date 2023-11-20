package polymorphism;

public class EeAcompny {
    protected int no;
    protected String name;

    public EeAcompny(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void takeOrder(){
        System.out.printf("%d호 %s점 홀 주문 받음%n",no,name);
    }

    //멤버 변수 no (정수)와 name (문자열): 이 변수들은 회사의 번호와 이름을 나타냅니다.
    //생성자 메서드 EeAcompny(int no, String name): 이 생성자는 no와 name 매개변수를 받아서 객체를 초기화합니다.
    //takeOrder() 메서드: 이 메서드는 주문을 받는 작업을 수행합니다. 주문 정보를 화면에 출력하는 메서드입니다.
    //인터넷 주문 받음

}
