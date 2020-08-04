public class App {
    public static void main(String[] args) throws Exception {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s, indices));
    }


        public static String restoreString(String s, int[] indices) {
            char buf[] = new char[indices.length];
            for(int i = 0; i < indices.length; i++){
                buf[indices[i]] = s.charAt(i);
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j <indices.length; j++ ){
                sb.append(buf[j]);
            }
            return sb.toString();
        }
    
}
