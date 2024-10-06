package org.example.selfcode.cwhCode.Chapter.chp09_access_modifier_constructors;

//    CWH1(){
//        System.out.println("This is the default constructor of CWH class.");
//    }
//    CWH1(String s, int i){
//        System.out.println("The name of the first employee is : " + s);
//        System.out.println("The id of the first employee is : " + i);
//    }

//
//public class self {
//    public static void main(String[] args) {

//    CWH1 obj1 = new CWH1();
//    CWH1 obj2 = new CWH1("khalid",45);

class emp{
    int id;
    int salary;
    String name;

    emp(){
        System.out.println("jindala");
    }
    emp(int a){
        System.out.println(a);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getid(){
        return id;
    }
    public void setid(int i){
        this.id = i;
    }
}
public class self {
    public static void main(String[] args) {
        emp em = new emp();
        emp emw = new emp(3);
em.setName("khalid");
        System.out.println(em.getName());
}}
