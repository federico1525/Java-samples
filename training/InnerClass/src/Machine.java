/**
 * Created by fede on 3/2/15.
 */
class Machine implements Arnese {
    private int id;
    private String seriale;

    public Machine(int id, String seriale) {
        this.id = id;
        this.seriale = seriale;
    }


    public void start(){
        System.out.println(id + " Machine started");
    }

    @Override
    public void Info() {
        System.out.println("info info:" + id);
    }

    @Override
    public void showSerial() {
        System.out.println("Seriale e' " + seriale);
    }
}
