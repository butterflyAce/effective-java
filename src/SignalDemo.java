import domain.Signal;

/**
 * Created by butterfly on 2018/2/9.
 */
public class SignalDemo {
    static Signal color = Signal.greeen;
    public static void main(String[] args) {
        switch (color) {
            case red:
                color = Signal.greeen;
                break;
            case greeen:
                color = Signal.yellow;
                break;
            case yellow:
                color = Signal.red;
                break;
        }
        System.out.println(color);
    }
}
