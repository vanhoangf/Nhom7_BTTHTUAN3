import java.util.Scanner;

public class Bai_2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String ten = scanner.nextLine();

        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = scanner.nextInt();

        System.out.print("Nhap chieu cao (m): ");
        double chieucao = scanner.nextDouble();

        System.out.print("Nhap gioi tinh: ");
        String gioitinh = scanner.next().toLowerCase();

        System.out.print("Ban co thich lap trinh khong? (true/false): ");
        boolean thichLapTrinh = scanner.nextBoolean();

        System.out.println("\n--- Thong tin ca nhan ---");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Chieu cao: " + chieucao + " met");
        System.out.println("Gioi tinh: " + gioitinh);
        System.out.println("Co thich lap trinh khong? " + thichLapTrinh);
        
        // Dong scanner de tranh ro ri bo nho
        scanner.close();
    }
}
