import java.util.Scanner;

 class exp3 {
    public static void main (String []args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the marks for Maths :");
        int m1=obj.nextInt();
        System.out.println("Enter the marks for Physics :");
        int m2=obj.nextInt();
        System.out.println("Enter the marks for Chemistry :");
        int m3=obj.nextInt();
        int T=m1+m2+m3;
        int Tmp=m1+m2;
        String res=(T>150 && Tmp>75 ? "is eligible": "not eligible") ;
        System.out.println(res);
           
    obj.close();
    }
}
