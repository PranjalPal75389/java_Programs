public class recursion {
    // print no. form 5 to 1

//    public static void printnumbers(int n){
//        if(n==0)
//            return;
//        System.out.println(n);
//        printnumbers(n-1);
//    }
//    public static void main(String[]args){
//printnumbers(5);
//
//    }

 // print no. from 1 to 5
 public static void print(int n)
 {
     if(n==6)
         return;
     System.out.println(n);
     print(n+1);
 }
 public static void main(String[]args)
 {
     int n=1;
     print(n);
     System.out.println(n);
 }

}
