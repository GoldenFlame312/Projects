package kk.zse.edu;
public class Wentylator {
    private int moc;

    public Wentylator(){};
    public Wentylator(int moc) {
        this.moc = moc;
    }
    public void setMoc(int moc) {
        this.moc = moc;
    }
    public int getMoc() {
        return moc;
    }
    public void pracuj() {
        System.out.println("Wentylator pracuje z mocą: " + moc);
    }

    public void wylacz() {
        System.out.println("Wentylator został wyłączony");
    }
}
