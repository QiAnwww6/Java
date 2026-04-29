import java.util.*;

public class MainApp {

    static ArrayList list = new ArrayList();

    public static void main(String[] args) {

        init();

        show();

        add("004", "赵六", "Java", 77);

        show();

        update("002", 95);

        show();

        delete("001");

        show();
    }

    public static void init() {
        list.add(new Stu("001", "张三", "Java", 90));
        list.add(new Stu("002", "李四", "Math", 85));
        list.add(new Stu("003", "王五", "English", 88));
    }

    public static void show() {
        System.out.println("------");
        for (int i = 0; i < list.size(); i++) {
            Stu s = (Stu) list.get(i);
            System.out.println(s.a + "," + s.b + "," + s.c + "," + s.d);
        }
    }

    public static void add(String x, String y, String z, int k) {
        list.add(new Stu(x, y, z, k));
    }

    public static void update(String id, int score) {
        for (int i = 0; i < list.size(); i++) {
            Stu s = (Stu) list.get(i);
            if (s.a.equals(id)) {
                s.d = score;
            }
        }
    }

    public static void delete(String id) {
        for (int i = 0; i < list.size(); i++) {
            Stu s = (Stu) list.get(i);
            if (s.a.equals(id)) {
                list.remove(i);
                break;
            }
        }
    }
}

class Stu {
    String a;
    String b;
    String c;
    int d;

    public Stu(String x, String y, String z, int k) {
        a = x;
        b = y;
        c = z;
        d = k;
    }
}