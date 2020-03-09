public class HinhTron implements HinhHoc {
    private static final float PI = 3.14f;
    protected String ten;
    protected float banKinh;
    public HinhTron(float banKinh) {
        this.ten = "Hình Tròn";
        this.banKinh = banKinh;
    }
    @Override
    public void nhapBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override     public float tinhChuVi() {
        return 2 * PI * banKinh;
    }
        @Override
        public float tinhDienTich() {
        return PI * banKinh;
        }

        public void xuatThongTin() {
            System.out.println("Day la xuat thong tin");;
        }
}
