public class Dog {
    String name;
    public static void main(String[] args){
        Dog dog1=new Dog();
        dog1.bark();
        dog1.name="Jack";

        Dog[] myDogs=new Dog[3];
        myDogs[0]=new Dog();
        myDogs[1]=new Dog();
        myDogs[2]=dog1;

        myDogs[0].name="John";
        myDogs[1].name="Oscar";

        System.out.print("Third Dogs name is..");
        System.out.println(myDogs[2].name);

        int x=0;
        while (x<myDogs.length){
            myDogs[x].bark();
            x++;

        }

    }
    public  void  bark(){
        System.out.println(name + " is Barking...");
    }
}
