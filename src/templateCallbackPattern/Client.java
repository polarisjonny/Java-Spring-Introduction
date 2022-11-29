package templateCallbackPattern;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("총! 총초종총 총! 총!");
            }
        });
        System.out.println();

        rambo.runContext(new Strategy() {
           @Override
           public void runStrategy() {
               System.out.println("칼! 카가가갈 칼!");
           }
        });

        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("도끼! 독독....도도독 독끼!");
            }
        });
    }
}

//탬플릿 콜백 패턴은 전략을 익명 내부 클래스로 구현한 전략 패턴이다. 
