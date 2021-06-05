import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("n1 sayısını giriniz : ");
        int n1=scanner.nextInt();
        System.out.println("n2 sayısını giriniz : ");
        int n2=scanner.nextInt();

        int i=1;
        while(i<=(n1*n2)){
            if((i%n1==0) && (i%n2==0)){
                System.out.println("ebob : "+i);
                break;
            }
            i++;
        }
        int j=n1*n2;
        while(j>0){
            if(j%n1==0 && j%n2==0){
                System.out.println("ekok : "+j);
                break;
            }
            j--;
        }
    }
}
