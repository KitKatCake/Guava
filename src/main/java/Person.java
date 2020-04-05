import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {


    @JSONField(name = "AGE")
    private int age;

    @JSONField(name = "FULL NAME")
    private String fullName;

    @JSONField(name = "DATE OF BIRTH")
    private Date dateOfBirth;

    public Person(int age, String fullName, Date dateOfBirth) {
        super();
        this.age = age;
        this.fullName= fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    private List<Person> listOfPersons = new ArrayList<Person>();

//    public void setUp() {
//        listOfPersons.add(new Person(15, "John Doe", new Date()));
//        listOfPersons.add(new Person(20, "Janette Doe", new Date()));
//    }

//    public void whenJavaList_thanConvertToJsonCorrect() {
//        String jsonOutput= JSON.toJSONString(listOfPersons);
//        System.out.println(jsonOutput);
//    }

    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<Person>();
        listOfPersons.add(new Person(15, "John Doe", new Date()));
        listOfPersons.add(new Person(20, "Janette Doe", new Date()));

        Person person = new Person();

       // person.whenJavaList_thanConvertToJsonCorrect();

        String jsonOutput= JSON.toJSONString(listOfPersons);
        System.out.println(jsonOutput);

    }
}
