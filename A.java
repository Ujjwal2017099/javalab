import java.util.*;
interface Vol{
     public void volume();
}
class Cone implements Vol{
     int a;
     int b;

     public void volume(){
          Scanner sc = new Scanner(System.in);
          a = sc.nextInt();
          b = sc.nextInt();

          System.out.println(0.33 * 3.14 * a *a * b);
     }

}
class Hemisphere implements Vol{
     int a;

     public void volume(){
          Scanner sc = new Scanner(System.in);
          a = sc.nextInt();
          // b = sc.nextInt();

          System.out.println(0.5 *3.14 * a *a * a);
     }

}
class Cylinder implements Vol{
     int a;
     int b;

     public void volume(){
          Scanner sc = new Scanner(System.in);
          a = sc.nextInt();
          b = sc.nextInt();

          System.out.println( 3.14 * a *a * b);
     }

}
public class A{
     public static void main(String args[]){
          Cone co= new Cone();
          System.out.println("Volume of cone");
          co.volume();
          Hemisphere he = new Hemisphere();
          System.out.println("Volume of hemisphere");
          he.volume();
          Cylinder cy = new Cylinder();
          System.out.println("Volume of cylinder");
          cy.volume();
     }
}
