public class Student {
    private String name;
    private int age;
    private int typing;

    public Student(){

    }
    public Student(String name,int age,int typing){
        this.name=name;
        this.age=age;
        this.typing=typing;
    }

    public void setName(){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setTyping(){
        this.typing=typing;
    }
    public int getTyping(){
        return typing;
    }
}
