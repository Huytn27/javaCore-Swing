package ex5;

public class Demo1 extends AbstractDemo implements DiHoc, DinhGia {
    private int value;

    public Demo1() {
    }

    public Demo1(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void show(String tmp) {
        System.out.println(tmp);
    }

    @Override
    public void mangGi() {

    }

    @Override
    public int getTien() {
        return 0;
    }

    @Override
    public void diBangGi() {

    }

    @Override
    public void doTinCay() {

    }

    @Override
    public double getGiaTri() {
        return 0;
    }
}
