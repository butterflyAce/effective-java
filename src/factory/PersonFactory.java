package factory;

import domain.Person;

/**
 * Created by butterfly on 2017/11/1.
 */
public class PersonFactory {

    private static Person person = new Person();

    public static Person getPerson(){
//        Person person = new Person();
        return person;
    }

    public static Boolean valueof(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
