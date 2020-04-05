package Gek;

public class Student2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    Student2(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Student2 s;
        if (!(obj instanceof Student2)){
            return false;
        }
        else{
            s = (Student2)obj;
            if (this.name.equals(s.getName())&&this.age==s.getAge()){
                return true;
            }
        }
        return false;
        //return super.equals(obj);
    }
}
