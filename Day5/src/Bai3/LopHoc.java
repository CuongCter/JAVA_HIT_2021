package Bai3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class LopHoc {
    private String maLH,tenLH,ngayMo;
    private int n;
    ArrayList<SinhVien> x = new ArrayList<>(n);
    private String giaoVien;

    public LopHoc() {
    }

    public LopHoc(String maLH, String tenLH, String ngayMo, int n, ArrayList<SinhVien> x, String giaoVien) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.n = n;
        this.x = x;
        this.giaoVien = giaoVien;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma lop hoc: ");
        maLH = sc.nextLine();
        System.out.print("Ten lop hoc: ");
        tenLH = sc.nextLine();
        System.out.print("Ngay mo: ");
        ngayMo = sc.nextLine();

        System.out.print("So sinh vien: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            System.out.println("Nhap thong tin sinh vien " + (i+1));
            sv.Nhap();
            x.add(sv);
        }
        sc.nextLine();
        System.out.print("Giao vien: ");
        giaoVien = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma lop hoc: " + maLH);
        System.out.println("Ten lop hoc: " + tenLH);
        System.out.println("Ngay mo: " + ngayMo);
        System.out.println("Giao vien: " + giaoVien);
        System.out.printf("%20s %15s %20s %15s %15s %15s", "Ho ten", "Ngay sinh", "Que quan", "Ma sinh vien", "Nganh", "Khoa hoc");
        System.out.println();
        for(int i = 0; i < n; i++) {
            x.get(i).Xuat();
            System.out.println();
        }
    }

    public int K15() {
        int dem = 0;
        for(int i = 0; i < n; i++) {
            if (x.get(i).getKhoaHoc() == 15) {
                dem++;
            }
        }
        return dem;
    }

    public void sx() {
        for(int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(x.get(i).getKhoaHoc() > x.get(j).getKhoaHoc()) {
                    Collections.swap(x, i, j);
                }
            }
        }
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
}
