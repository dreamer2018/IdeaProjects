package FanXing;

/**
 * Created by zhoupan on 16-1-8.
 */
public class Apple<T>{
    private T info;

    public Apple(){
    }
    public Apple(T info){
        this.info=info;
    }

    public void setInfo(T info){
        this.info=info;
    }
    public T getInfo() {
        return this.info;
    }

    public static void main(String[] args) {
        Apple<String> apple = new Apple<>();
        apple.setInfo("苹果");
        System.out.println(apple.getInfo());
        Apple<Double> a = new Apple<>(45.1);
        System.out.println(a.getInfo());
    }
}
