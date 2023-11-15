package code.objectOrientedProgramming.ApnaCollege;
class Pen{
    //Properties
    String color,type;
    public void write(){//Method
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }

}
class shape{
    String color;

}
class Triangle extends shape{//Inheritance

}
class Student{
    String name;
    int age;
    public void printInfo(String name){//Polymorphism
        System.out.println(name);
//        System.out.println(this.name);
//        System.out.println(this.age);
    }
    public void printInfo(int age){//Polymorphism
        System.out.println(age);
    }
    public void printInfo(String name, int age){//Polymorphism
        System.out.println(name+", "+age);

    }
//    Student(String name, int age){//Constructor
//        this.name=name;
//        this.age=age;
//        System.out.println("Constructor called");
//    }
//    Student(Student s2){//Copy constructor: to copy one object to other
//        this.name=s2.name;
//        this.age=s2.age;
////        System.out.println("Constructor called");
//    }
//    Student(){}//for copy constructor
}
public class OOPS {
    public static void main(String[] args) {
//        Pen p1 = new Pen();//Object creation
//        p1.color="blue";
//        p1.type="gel";
//        p1.write();

//        Pen p2 = new Pen();//Object creation
//        p2.color="black";
//        p2.type="ballpoint";
//        //p2.write();
//
//        p1.printColor();
//        p2.printColor();


//        Student s1= new Student();//Object creation(using default constructor)
//        s1.name="Kalpak";
//        s1.age=21;
//
//        s1.printInfo(s1.name, s1.age);//poly
//
//        Student s2=new Student(s1);
//        s2.printInfo();
//        Student s=new Student("Kalpak", 22);//Parameterised constructor
//        s.printInfo();

        //We don't write destructors in Java coz it already destroys


        //Function overloading: compile time polymorphism


        Triangle t1= new Triangle();
        t1.color="Red";




    }
}
