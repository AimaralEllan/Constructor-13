public class Dog {
    private String name;
    private String paroda;
    private int age;

    public Dog(){

    }

    public Dog(String name,String paroda,int age){
        this.name=name;
        this.paroda=paroda;
        this.age=age;
    }

    public void setName(){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setParoda(){
        this.paroda=paroda;
    }
    public String getParoda(){
        return paroda;
    }

    public void setAge(){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
