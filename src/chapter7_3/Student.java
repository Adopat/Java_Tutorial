package chapter7_3;

public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("参数异常了");
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
