package proxyPattern;

public class ClientWithProxy {
    public static void main(String[] args) {
        //프록시를 이용한 호출
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}

//프록시 패턴의 중요 포인트
//1. 대리자는 실제 서비스와 같은 이름의 메소드를 구현한다. 이때 인터페이스를 사용한다.
//2. 대리자는 실제 서비스에 대한 참조 변수를 갖는다.
//3. 대리자는 실제 서비스의 같은 이름을 가진 메소드를 호출하고 그 값을 클라이언트에게 돌려준다.
//4. 대리자는 실제 서비스의 메소드 호출 전후에 별도의 로직을 수행할 수도 있다.
