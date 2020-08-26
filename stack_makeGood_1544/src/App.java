public class App {
    public static void main(String[] args) throws Exception {
        // String s = "abBAcC";
        // String s = "leEeetcode";
        // String s = "mC";
        String s = "WpubBUPwG";
        // String s = "hHcOzoC";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        char[] buf = new char[len + 1];

        int index = 0;

        for (int i = 0; i < len; i++) {
            if (index == 0) {
                index = 1;
                buf[index] = s.charAt(i);
                continue;
            }

            if (Math.abs(s.charAt(i) - buf[index]) == 32) {
                index--;
            } else {
                buf[++index] = s.charAt(i);
            }

        }
    

    StringBuilder sb = new StringBuilder();if(index==0)return sb.toString();

    for(int j = 1;j<=index;j++)    {
        sb.append(buf[j]);
    }return sb.toString();

}

// public static void push(char[] ch, char s){

// }
}
