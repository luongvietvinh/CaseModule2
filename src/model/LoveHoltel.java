package model;

import java.io.Serializable;

public class LoveHoltel implements Serializable {
    private int id;
    private String staffName;
    private int soNgayTro;
    private String loaiPhongTro;
    private double price;
    private String description;

    public LoveHoltel() {
    }

    public LoveHoltel(int id,String staffName ,int soNgayTro, String loaiPhongTro, double price, String description) {
        this.id = id;
        this.staffName = staffName;
        this.soNgayTro = soNgayTro;
        this.loaiPhongTro = loaiPhongTro;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(String loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "LoveHoltel{" +
                "id=" + id +
                ", staffName='" + staffName + '\'' +
                ", soNgayTro=" + soNgayTro +
                ", loaiPhongTro='" + loaiPhongTro + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
