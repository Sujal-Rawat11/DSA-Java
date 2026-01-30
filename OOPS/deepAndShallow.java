// package OOPS;

// public class deepAndShallow {
//      public static void main(String args[]) {

//         Student s1 = new Student();
//         s1.name = "Sujal";
//         s1.roll = 456;
//         s1.password = "sujal";
//         s1.marks[0] = 90;
//         s1.marks[1] = 85;
//         s1.marks[2] = 88;

//         // Copy constructor
//         Student s2 = new Student(s1);
//         s2.password = "xyz";   // change does NOT affect s1

//         // Test deep copy
//         s1.marks[0] = 100;

//         System.out.println(s1.marks[0]); // 100
//         System.out.println(s2.marks[0]); // 90
//     }
// }

// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     // Default constructor
//     Student() {
//         marks = new int[3];   // allocate memory
//     }

//     // Copy constructor (DEEP COPY)
//     Student(Student s1) {
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.password = s1.password;

//         this.marks = new int[s1.marks.length];
//         for (int i = 0; i < s1.marks.length; i++) {
//             this.marks[i] = s1.marks[i];
//         }
//     }

//     // Parameterized constructor
//     Student(String name) {
//         this.name = name;
//         marks = new int[3];
//     }

//     Student(int rollno) {
//         this.roll = rollno;
//         marks = new int[3];
//     }
// }
