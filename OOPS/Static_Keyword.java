package OOPS;

public class Static_Keyword {
    public static void main(){
        Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";
    }
}


class Student {
    String name;
    int roll;

    static String schoolName;

    String getName(String name){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    static int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    }
 
}