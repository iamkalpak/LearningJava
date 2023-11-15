package code.objectOrientedProgramming.AnujBhaiyaJava.practice1.basics;

import code.objectOrientedProgramming.AnujBhaiyaJava.practice1.ensapsulation.EncapsulationIntro;

public class ObjectOrientedConcepts {
    public static void main(String[] args) {
       /*Properties*/
//       Person p1 =new Person();//Object of class person
//        /*'new' ke aage jo likhte ho matlab aap constructor ko call kr rhe hote ho(default constructor)*/
//       p1.age=22;
//       p1.name="Kalpak";
//       //System.out.println("*************Properties*************");
//       System.out.println(p1.age+" "+p1.name);
//
//       Person p2 =new Person(89, "Bhayankar Buddha");//Object of class person
//       //p2.age=89;
//       //p2.name="Bhayanakar buddha";
//       System.out.println(p2.age+" "+p2.name);
//        System.out.println("*************Properties*************");
//       /*Properties*/
//
//        /*Behaviour*/
//        System.out.println("*************Behaviour*************");
//        p1.eat();
//        p2.walk();
//        p1.walk(150);
//        System.out.println(Person.count+" times constructor called");
//        System.out.println("*************Behaviour*************");
//
//        Developer d1=new Developer(22, "Kalpak");
//        d1.walk();//phle developer class me dhoondhega fir parent class me jayega jo hai Person
        //ise hum runtime polymorphism khe sakte hai kyuki use nai pata walk function Developer class ke pass hai ya Person class ke paas
        EncapsulationIntro obj = new EncapsulationIntro();
        //obj.doWork();
    }
}
class Developer extends Person{

    public Developer(int age, String name){
        super(age, name);//apne parent ke constructor ko call krne me kaam aata hai
    }
    void walk(){
        System.out.println("Developer "+name+" is walking.");
    }//polymorphsim(runtime)

}
class Person{//Person ek blueprint hi hai
    /*Properties*/
    protected String name;//Ye class program wali memory me jagha legi lekin runtime wali memory me jagha nai legi
    protected int age;
    static int count=0;//static matlab ye class ki property ban chuki hai ye object ki property nai rhi
    /*Properties*/
    public Person(){
        count++;
        System.out.println("Creating an object");
        /*
        * Ab count ye koi property toh hai nai kisi person ki toh maan lo ye data god ke paas hi rhega
        * Ab bhagwan ne jab person banaya bhagwan ke paas hi rhega count bhagwan ko pata kitne person banaye
        * */
    }
    /*public Person(int newAge, String newName){
        this();//ek constructor se koi dusra constructor call krna hai toh uske liye 'this' keyword use kr sakte ho
        name=newName;
        age=newAge;
    }*/
    public Person(int age, String name){
        //this();//ek constructor se koi dusra constructor call krna hai toh uske liye 'this' keyword use kr sakte ho
        this.name=name;//'this' keyword current constructor or properties ko access krte ho
        this.age=age;
    }

    /*Behaviour*/
    void walk(){
        System.out.println(name+" is walking.");
    }
    void eat(){
        System.out.println(name+" is eating.");
    }
    void walk(int steps){//Polymorphism (compiletime)
        System.out.println(name+"\twalked\t"+steps+" steps");
    }
    /*Behaviour*/
    void doWork(){
        System.out.println(name+" is working.");
    }

    //Inheritance me ek class ke multiple parents nai ho sakte

    /*
    * This arises the diamond problem which means child ko samjhega hi nai ki konse parent se properties lene hai
    * isko tackle krne ke liye interfaces banaye gaye hai
    * */
}
