// public class jclass2 {
//     public static void main(String[] args) {
//         jclass obj2 = new jclass();
//         System.out.println(obj2.x); 
//     }
// }




// public class jclass2{
//     int x = 10;
//     public static void main(String[] args){
//         jclass2 obj = new jclass2();
//         obj.x = 12;
//         System.out.println(obj.x);
//     }

// }

// public class jclass2{
//     int x;
//     public static void main(String[] args) {
//         jclass2 obj = new jclass2();
//         obj.x =123123;
//         System.out.println(obj.x);
//     }
// }

// public class jclass2{
//     final int a = 1212;
//     public static void main(String[] args) {
//         jclass2 obj = new jclass2();
//         // obj.a = 123;
//         System.out.println(obj.a);
//     }
// }

// public class jclass2{
//     int a = 123;
//     public static void main(String[] args) {
//         jclass2 obj = new jclass2();
//         jclass2 obj1 = new jclass2();
//         obj1.a = 1231;
//         System.out.println(obj.a);
//         System.out.println(obj1.a);
//     }
// }

public class jclass2{
    String fname ="Ankit ";
    String lname ="Soni";
    int age = 19;
    public static void main(String[] args) {
        jclass2 obj = new jclass2();
        System.out.println("Name: "+ obj.fname + obj.lname);
        System.out.println("Age: " + obj.age);
    }
}