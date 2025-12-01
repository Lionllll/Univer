package lab4.task4;

public class Monitor {
    private double size;
    private String resolution;

    public Monitor(double size, String resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public double getSize() { return size; }
    public String getResolution() { return resolution; }

    @Override
    public String toString() {
        return size + "\\" + resolution;
    }
}
