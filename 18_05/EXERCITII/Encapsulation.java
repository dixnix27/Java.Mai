package s18_05;

public class Encapsulation {
    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getIdNum(){
        return idNum;
    }

    public void setAge(int newAge){
        this.age=newAge;
    }

    public void setName(String newName){
        this.name=newName;
    }
    public void setIdNum(String newId){
        this.idNum=newId;
    }


}
