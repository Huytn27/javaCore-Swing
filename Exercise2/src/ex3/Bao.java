package ex3;

import java.util.Date;

public class Bao extends TaiLieu implements CaiDat {
    private Date date;

    public Bao() {
    }

    public Bao(Date date) {
        this.date = date;
    }

    public Bao(String id, String tenNxb, int soBan, Date date) {
        super(id, tenNxb, soBan);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "date=" + date +
                ", id='" + id + '\'' +
                ", tenNxb='" + tenNxb + '\'' +
                ", soBan=" + soBan +
                '}';
    }
}
