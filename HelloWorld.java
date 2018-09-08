import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println(" - java.version: " + System.getProperty("java.version"));
        System.out.println(" - java.vm.version: " + System.getProperty("java.vm.version"));
        System.out.println(" - Cores : " + Runtime.getRuntime().availableProcessors());
        System.out.println(" - Memory: " + (Runtime.getRuntime().maxMemory() / 1024 / 1024) + " MB");

        List<byte[]> l = new ArrayList<byte[]>();
        while (true) {
            l.add(new byte[1024 * 1024]);
            System.out.println( "free memory: " + (Runtime.getRuntime().freeMemory() / 1024 / 1024) + " MB" );
        }
    }
}
