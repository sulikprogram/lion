public class Animal {
    String name;
    boolean vegetarian;
    double weight;
    double height;
    int age;
   int numOfLegs;
    public Animal(){
    }
    public Animal(int NumOfLegs,boolean vegetarian,  String name , double weight, double height, int age){
    this.numOfLegs=numOfLegs;
    this.vegetarian=vegetarian;
    this.name=name;
    this.weight=weight;
    this.height=height;
    this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getvegetarian() {
        return vegetarian ;
    }
    public void setvegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    public void setNumOfLegs(int numOfLegs){
        this.numOfLegs=numOfLegs;
    }
    public int getNumOfLegs(){
        return numOfLegs;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height=height;
    }
    
    public  String toString() {
        String result = ("Animal{name='Tom', weight=12.5, height=40.7, age=4}");

        return result;
    }
}












