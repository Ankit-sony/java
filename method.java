// public class method {
//   static void myMethod() {
//     System.out.println("first method");
//   }

//   public static void main(String[] args) {
//     myMethod();
//   }
// }

// ------------------------------------------------------------one-----------------------



// public class method{
//     static void secondMethod() {
//         System.out.println("second method");
//     }
//     static void thirdMethod(){
//         System.out.println("thirdmethod");

//     }

//     public static void main(String[] args){
//         secondMethod();
//         thirdMethod();
//     }

// }



// --------------------------------------java parameters----------------------


// public class method{
//     static void myMethod(String fname){
//         System.out.println(fname +" Superstar");
//     }

//     public static void main(String[] args){
//         myMethod("Danish");
//     }
// }



// --------------------------------------java multiple parameters----------------------


// public class method{
//     static void multimethod(String fname, int age){
//         System.out.println(fname +" is "+ age);
//     }

//     public static void main(String[] args){
//         multimethod("Danish",20);
//         multimethod("Mamav",20);
//         multimethod("Anushka",20);
//         multimethod("Anshita",20);
//         multimethod("Raghaw",20);
//     }
// }



// --------------------------------------return values----------------------
// public class method{
//     static int mymethod(int x){
//     return x + 5;
//     }
//     public static void main(String[] args){
//         System.out.println(mymethod(11));
//     }
//     }





 // --------------------------------------return 2 values----------------------   

//  public class method{
//     static int mymethod(int x, int y){
//         return x + y;
//     }

//     public static void main(String[] args){
//         System.out.println(mymethod(12,7));
//     }
//  }

  // --------------------------------------return 2 values and store in variable----------------------  


//   public class method{
//     static int mymethod(int x, int y){
//         return x + y;
//     }

//     public static void main (String[] args){
//         int z = mymethod(5, 3);
//         System.out.println(z);
//     }
//   }




  // --------------------------------------if else----------------------  


  public class method{
    static void myage(int age){
          if(age<18){
          System.out.println("you can't vote");
            }
          else{ 
            System.out.println("you can vote");
            }

    }

    public static void main(String[] args){
        myage(25);
    }
  }


