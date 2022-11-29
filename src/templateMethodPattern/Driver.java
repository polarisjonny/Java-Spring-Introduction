package templateMethodPattern;

public class Driver {
    public static void main(String[] args) {
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        bolt.playWithOwner();

        System.out.println();
        System.out.println();

        kitty.playWithOwner();
    }
}

//템플릿 메소드 패턴은 상위 클래스의 견본 메소드에서 하위 클래스가 오버라이딩한 메소드를 호출하는 패턴이다.