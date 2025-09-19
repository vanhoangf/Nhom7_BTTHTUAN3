import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList();
        int n = 5;
        System.out.println("Nhập " + n + " phần tử:");

        for(int i = 0; i < n; ++i) 
        {
            System.out.print("Phần tử " + (i + 1) + ": ");
            ds.add(sc.nextInt());
        }

        System.out.println("\nDanh sách ban đầu:");

        for(int i = 0; i < ds.size(); ++i) 
        {
            PrintStream var10000 = System.out;
            Object var10001 = ds.get(i);
            var10000.print(String.valueOf(var10001) + " ");
        }

        System.out.println("\n\n--- THÊM PHẦN TỬ ---");
        System.out.print("Vị trí thêm (0 đến " + ds.size() + "): ");
        int vitrithem = sc.nextInt();
        if (vitrithem >= 0 && vitrithem <= ds.size()) 
        {
            System.out.print("Giá trị thêm: ");
            int giatrithem = sc.nextInt();
            ds.add(vitrithem, giatrithem);
            System.out.println("\nDanh sách sau khi thêm:");

            for(int i = 0; i < ds.size(); ++i) 
            {
                PrintStream var11 = System.out;
                Object var14 = ds.get(i);
                var11.print(String.valueOf(var14) + " ");
            }

            System.out.println("\n\n--- XÓA PHẦN TỬ ---");
            PrintStream var12 = System.out;
            int var15 = ds.size();
            var12.print("Vị trí xóa (0 đến " + (var15 - 1) + "): ");
            int vitrixoa = sc.nextInt();
            if (vitrixoa >= 0 && vitrixoa < ds.size()) {
                ds.remove(vitrixoa);
                System.out.println("\nDanh sách sau khi xóa:");

                for(int i = 0; i < ds.size(); ++i) {
                    var12 = System.out;
                    Object var16 = ds.get(i);
                    var12.print(String.valueOf(var16) + " ");
                }

            } 
            else 
            {
                System.out.println("Vị trí không hợp lệ!");
            }
        } 
        else 
        {
            System.out.println("Vị trí không hợp lệ!");
        }
    }
}