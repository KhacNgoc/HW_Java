/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Khac Ngoc
 */
class hoaQua
{
    private int giaBan;
    private float can;
    private String nguonGoc;

    public int getGiaBan() {
        return giaBan;
    }

    public float getCan() {
        return can;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public void setCan(float can) {
        this.can = can;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public hoaQua(int giaBan, float can, String nguonGoc) {
        this.giaBan = giaBan;
        this.can = can;
        this.nguonGoc = nguonGoc;
    }
    
    public void ngayNhap()
    {
        System.out.println("Ngày nhập: 11/1/2018");
    }
    public void soLuong()
    {
        System.out.println("Số lượng: 300");
    } 
    public void getInfo()
    {
        System.out.println("Giá (/1kg): "+this.giaBan+"\n Cân: "+this.can+"\nNguồn gốc: "+this.nguonGoc);
    }
}
 class quaCam extends hoaQua
{
    
    public quaCam(int giaBan, float can, String nguonGoc) {
        super(giaBan, can, nguonGoc);
    }
    public void ngayNhap()
    {
        System.out.println("Ngày nhập: 20/10/2018");
    }
}
class quaTao extends hoaQua
{
    
    public quaTao(int giaBan, float can, String nguonGoc) {
        super(giaBan, can, nguonGoc);
    }
    public void soLuong()
    {
        System.out.println("Số lượng: 200");
    }
}
class camCaoPhong extends hoaQua
{
    
    public camCaoPhong(int giaBan, float can, String nguonGoc) {
        super(giaBan, can, nguonGoc);
    }
    public void ngayNhap()
    {
        System.out.println("Ngày nhập: 13/13/2013");
    }
    public void soLuong()
    {
        System.out.println("Số lượng: 450");
    }
}
class camSanh extends hoaQua
{
    
    public camSanh(int giaBan, float can, String nguonGoc) {
        super(giaBan, can, nguonGoc);
    }
    public void tiLeHong()
    {
        System.out.println("Tỉ lệ hỏng là 10%");
    }
}
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        quaCam a=new quaCam(10, 1, "Viet Nam.");
        quaTao b= new quaTao(15, 1, "Trung Quoc.");
        camCaoPhong c= new camCaoPhong(30, 2, "Viet Nam");
        camSanh d= new camSanh(19, 1, "Trung Quoc.");
        a.ngayNhap();
        a.soLuong();
        a.getInfo();
        System.out.println("__________________");
        b.ngayNhap();
        b.soLuong();
        b.getInfo();
        System.out.println("__________________");
        c.ngayNhap();
        c.soLuong();
        c.getInfo();
        System.out.println("__________________");
        d.ngayNhap();
        d.soLuong();
        d.getInfo();
        System.out.println("__________________");
    }
    
}
