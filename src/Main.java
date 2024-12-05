import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Main main = new Main();
        date.getTimezoneOffset();
        main.deprec();
        @SuppressWarnings("unchecked") List<String> list = new ArrayList<>();

    }

    @Deprecated
    public void deprec() {
        System.out.println("Annotation test");
    }
}
