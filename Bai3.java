import java.util.Scanner;
public class LeDinhDanhbai3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("nhap so nguyen a:");
        a=sc.nextInt();
        System.out.println("nhap so nguyen b:");
        b=sc.nextInt();
        System.out.println("tong cua hai so a+b="+(a+b));
        System.out.println("hieu cua hai so a-b="+(a-b));
        System.out.println("tich cua hai so a*b="+(a*b));
        System.out.println("thuong cua hai so a/b="+((double)a/b));
        System.out.println("phan du cua hai so a%b="+(a%b));
    }
}
