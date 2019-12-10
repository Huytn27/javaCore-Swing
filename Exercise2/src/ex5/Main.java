package ex5;

public class Main {
    public static void main(String[] args) {
        AbstractDemo abstractDemo = new Demo1(6);

        abstractDemo.setName("He");
        System.out.println(abstractDemo.getName());
        System.out.println(abstractDemo.getValue());

        DinhGia dinhGia = new DinhGia() {
            @Override
            public void doTinCay() {
                System.out.println("Rat tin");
            }

            @Override
            public double getGiaTri() {
                return 1;
            }
        };

        dinhGia.doTinCay();
    }
}
