public class main2 {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron(10);
        hinhTron.xuatThongTin();
        HinhHoc hinhGiDo = new HinhHoc() {
            protected float banKinh;
            @Override
            public void nhapBanKinh(float r) {
                this.banKinh = r;
            }

            @Override
            public float tinhChuVi() {
                return 0;
            }

            @Override
            public float tinhDienTich() {
                return 0;
            }
        };
    }
}
