package examples.Chapter2.Item2.builder;// Builder Pattern - Pages 14-15

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    //静态内部类
    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values
        private int calories      = 0;
        private int fat           = 0;
        private int carbohydrate  = 0;
        private int sodium        = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings    = servings;
        }

        public Builder calories(int val)
            { calories = val;      return this; }
        public Builder fat(int val)
            { fat = val;           return this; }
        public Builder carbohydrate(int val)
            { carbohydrate = val;  return this; }
        public Builder sodium(int val)
            { sodium = val;        return this; }

        public NutritionFacts build() {//静态内部类可以直接调用外部的构造方法
            return new NutritionFacts(this);
        }

        //但静态内部类不可以直接调用外部类的非static修饰的属性和方法
        /*public void test(){
            String test = NutritionFacts.this.test();
        }*/
    }

    private String test(){
        return "butterflyAce";
    }

    //构造器
    private NutritionFacts(Builder builder) {
        servingSize  = builder.servingSize;
        servings     = builder.servings;
        calories     = builder.calories;
        fat          = builder.fat;
        sodium       = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
    //客户端方法
    public static void main(String[] args) {
        NutritionFacts cocaCola = new Builder(240, 8).
            calories(100).sodium(35).carbohydrate(27).build();
    }
}