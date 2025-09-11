import java.util.Scanner;
public class Bai4
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        float tl, tk;
        System.out.print("Nhap vao so tien gui (VND): ");
        int tg = sc.nextInt();
        System.out.print("\nNhap vao lai suat hang nam (%): ");
        float ls = sc.nextFloat();
        System.out.print("\nNhap vao so thang gui: ");
        int th = sc.nextInt();
        tl = tg*(ls/100)/12*th;
        tk = tg + tl;
        System.out.print("\nTien lai cuoi ky la: " + tl);
        System.out.print("\nTien goc cuoi ky la: " + tk);
    }        
}
