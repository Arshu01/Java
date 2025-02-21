class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public void foodHabbit(){
        System.out.println("Animal is eating all");
    }
}
class Tiger extends Animal{
   public void eat(){
        System.out.println("Tiger is eating meat");
    }
    public void sleep(){
        System.out.println("Tiger is sleeping in den");
    }
    public void foodHabbit(){
        System.out.println("Tiger is  cornivars");
    } 
}
class Deer extends Animal{
   public void eat(){
        System.out.println("Deer is eating grass");
    }
    public void sleep(){
        System.out.println("Deer is sleeping in road");
    }
    public void foodHabbit(){
        System.out.println("Deer is  harnivours");
    }  
}
class Monkey extends Animal{
    public void eat(){
        System.out.println("Monkey is till and eating");
    }
    public void sleep(){
        System.out.println("Monkey is sleeping in trees");
    }
    public void foodHabbit(){
        System.out.println("Monkey is  omnivars");
    } 
}
class forest{
    public static void accept(Animal ref){
        ref.eat();
        ref.sleep();
        ref.foodHabbit();
    }
}
class AnimalApp{
    public static void main(String[] args) {
        forest.accept(new Tiger());
        forest.accept(new Deer());
        forest.accept(new Monkey());
    }
}
