package lab5.task10;

public class Computer {
    public Brand b; public Processor p; public Memory m; public Monitor mon;
    public Computer(Brand b,Processor p,Memory m,Monitor mon){this.b=b;this.p=p;this.m=m;this.mon=mon;}
    public String toString(){return b+" CPU="+p.m+" RAM="+m.s+"GB MON="+mon.s;}
}