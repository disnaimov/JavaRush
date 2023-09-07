public class StringHelper {
    public static String multiply(String s, int count){
      int i = 0;
      String ss = "";
      while (i < count) {ss += s; i++;}
      return ss;
    }
    public static String multiply(String s){
        int i = 0;
        String ss = "";
        while (i < 5) {ss += s; i++;}
        return ss;
    }
}
