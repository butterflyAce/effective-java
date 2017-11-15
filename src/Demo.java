import domain.CertType;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//测试枚举
        CertType fr = CertType.getByCode("FR");
        System.out.println(fr);
        System.out.println(fr.getCode());
        System.out.println(fr.getMessage());
//        System.out.println(fr.getDeclaringClass());
    }


    int gcd(int x, int y){
            return y != 0 ? gcd(y, x%y) : x;
    }
}
