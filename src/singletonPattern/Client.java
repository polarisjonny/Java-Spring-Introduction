package singletonPattern;

public class Client {
    public static void main(String[] args) {
        //private 생성자이므로 new를 통해 인스턴스를 생성할 수 없다.
        //Singleton s = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1 = null;
        s2 = null;
        s3 = null;
    }
}

//싱글턴 패턴의 특징
//1. private 생성자를 갖는다.
//2. 단일 객체 참조 변수를 정적 속성으로 갖는다.
//3. 단일 객체 참조 변수가 참조하는 단일 객체를 반환하는 getInstance() 정적 메소드를 갖는다.
//4. 단일 객체는 쓰기 가능한 속성을 갖지 않는 것이 정석이다.
