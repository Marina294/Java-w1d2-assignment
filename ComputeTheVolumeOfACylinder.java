

// (Compute the volume of a cylinder) Write a program 
// that reads in the radius and length of a cylinder 
// and computes the area and volume using the following formulas:
// area = radius * radius * p volume = area * length



public class ComputeTheVolumeOfACylinder{  
    public static void main(String args[])  
    {  
    int length = 20;  
    int radius = 10;  
    double pi = 3.142;  
    double volume = pi * (radius * radius) * length;  
        System.out.println("Volume of a cylinder: " + volume);  
     }  
}  




// ---------------------------------------------------------------




// public class ComputeTheVolumeOfACylinder {

//     public static void main(String[] args) {
    
//         Scanner scan = new Scanner(System.in);

//             // int value1 = scan.nextInt();
//             System.out.println("Write the radius: ");
//             double radius = scan.nextDouble();  

//             // int value2 = scan.nextInt();
//             System.out.println("Write the height: " );
//             double height = scan.nextDouble();


//                 double volume = ((22 * radius * radius * height) / 7);

//                 System.out.println("Volume of Cylinder is " + volume);


//     }

// }




// ---------------------------------------------------------------




// import java.util.Scanner;

// class testScanner2{
//   public static void main(String args[]){
//     System.out.println("数値を入力して下さい。");

//     Scanner scan = new Scanner(System.in);

//     int val = scan.nextInt();
//     System.out.println("最初の数値のトークンは: "+ val); 

//     val = scan.nextInt();
//     System.out.println("次の数値のトークンは  : "+ val);
//   }
// }