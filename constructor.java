// public class constructor {
//     int x;
//     public constructor(){
//      x = 5;
//     }
//     public static void main(String[] args){
//     constructor a = new constructor();
//     System.out.println(a.x);
//     }
    
// }



// public class constructor{
//      int x;
//      public constructor(int y){
//      x = y;
//      }
//      public static void main(String[] args){
//         constructor a = new constructor(1231231231);
//         System.out.println(a.x);
//      }

// }



public class constructor{
   String  modelName;
   int modelYear;
   public constructor(int year, String name ){
    modelName = name;
    modelYear = year;
   }
   public  static void main(String[] args){
    constructor a = new constructor(1970, "Mustang");
    System.out.println(a.modelName +" "+ a.modelYear);
   }
}