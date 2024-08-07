package methodreferences;

import java.util.ArrayList;
import java.util.List;

public class StaticMethodReferenceDemo {

    public static int getLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("practise");
        list.add("word");

        list.stream().mapToInt(StaticMethodReferenceDemo::getLength)
                .forEach(System.out::println);

    }
}
