package lab5.task13;

public class Main {
    public static void main(String[] a){
        ObservableStringBuilder o=new ObservableStringBuilder();
        o.addListener(s-> System.out.println("Changed: "+s));
        o.append("A").append("B");
    }
}