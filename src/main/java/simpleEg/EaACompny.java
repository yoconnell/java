package simpleEg;

public class EaACompny {
    int no;
    String name;
    Product[] products;

    public EaACompny(int no, String name, Product[] products) {
        this.no = no;
        this.name = name;
        this.products = products;
    }

    Product orderProduct (String name){
        for(Product item : products){
            if(item.name.equals(name)) return item;
        }
        return null;
    }

    //- 클래스의 필드로 다른 클래스의 인스턴스를 담은 배열을 가짐
    // - 클래스가 인스턴스가 배열 등 다른 자료형에도, 그 반대로도 포함될 수 있음
    //- 클래스는 둘 이상의 생성자를 가질 수 있음
    //- 인스턴스를 반환하는 메소드

    //orderProduct 이 메소드는 주어진 이름(name)과 일치하는 제품을 찾아서 반환하거나,
    // 일치하는 제품이 없을 경우 null을 반환합니다.
    // 반환 값의 자료형은 Product 클래스의 인스턴스입니다.
    // 따라서 이 메소드를 호출하면 해당 제품에 관한 정보를 얻을 수 있습니다.

    // EaACompny 클래스의 orderProduct 메소드는 Product를 반환하는 메소드입니다.
    // 이 메소드는 주어진 이름(name)과 일치하는 제품을 찾아서 반환하거나,
    // 일치하는 제품이 없을 경우 null을 반환합니다.
    // 반환 값의 자료형은 Product 클래스의 인스턴스입니다.
    // 따라서 이 메소드를 호출하면 해당 제품에 관한 정보를 얻을 수 있습니다.


}
