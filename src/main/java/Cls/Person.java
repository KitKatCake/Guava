package Cls;

public class Person {
    private String name;
    private Home home;
    public Person(String _name){
        name = _name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public static class Home{
        private String address;
        private String tel;

        public Home(String _address,String _tel){
            address = _address;
            tel = _tel;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }
    }

    public static void main(String[] args) {
        Person p = new Person("张三");

        p.setHome(new Person.Home("上海","021"));

        System.out.println(p.getName());
    }

}
