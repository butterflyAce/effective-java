public class Demo {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
////测试枚举
//        CertType fr = CertType.getByCode("FR");
//        System.out.println(fr);
//        System.out.println(fr.getCode());
//        System.out.println(fr.getMessage());
//        System.out.println(fr.getDeclaringClass());

        Integer i = null;//在栈内存创建一个引用i，不指向任何堆地址值
        Integer j1 = 0;
        int j2 = 0;//在栈内存创建一个引用j2，指向常量池中的整数0
        System.out.println(null == j1);//如果用null==0会报错，因为引用数据类型和基本数据类型不能比较，会报错

    }


    int gcd(int x, int y){
            return y != 0 ? gcd(y, x%y) : x;
    }
}
