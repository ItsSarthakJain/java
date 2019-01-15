public class byteshortint {
    public static void main(String[] args) {

        byte frstbyte = 120;
        byte newbyte = (byte) ((frstbyte / 2) + 30);
        short num = 111;
        short dup = (short) (num * 2);
        int d = 32767 * 2;
        long no = 50000 + 10 * (frstbyte + newbyte) + num + dup + d;
        System.out.println(newbyte);
        System.out.println(dup);
        System.out.println(d);
        System.out.println(no);

    }




}
