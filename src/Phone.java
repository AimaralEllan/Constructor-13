public class Phone {
    private String name;
    private String model;
    private String color;

    public Phone(){ //Constructor without parametr

    }
    public Phone(String name,String model,String color){ //Constructor with parametr
        /*if (name.length()>2){
            this.name=name;
        }else {
            System.out.println("Name should consist of 3 or more letters!");
        }*/
        this.name=name;
        this.model=model;
        this.color=color;
    }

    public void setName(){
            this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setModel(){
        this.model=model;
    }
    public String getModel(){
        return model;
    }

    public void setColor(){
        this.color=color;
    }
    public String getColor(){
       return color;
    }

}
