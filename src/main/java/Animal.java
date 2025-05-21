abstract class Animal{
    protected String name, type;
    protected int age, position;
    public Animal(String name, int age, String type, int position){
        this.name=name;
        this.type=type;
        this.age=age;
        this.position=position;
    }
    abstract String animalSound();
    abstract void move();
    public String sleep(){
        return "Zzz";
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getAge(){
        return this.age;
    }
    public int getPosition(){
        return this.position;
    }
}