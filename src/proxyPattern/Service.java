package proxyPattern;
//프록시는 대리자, 대변인이라는 뜻을 가진 단어다.

public class Service implements IService {
    public String runSomething() {
        return "서비스 짱!!!!";
    }
}
