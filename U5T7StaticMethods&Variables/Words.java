public class Words {

    private Words() { }

    public static boolean doesContain(String str1, String str2){
        return str2.indexOf(str1) != -1;
    }

    public static void printReverse(String str){
        for (int i = str.length() - 1; i >= 0; i --){
            System.out.print(str.substring(i, i+1));
            System.out.print(" ");
        }
        System.out.println();
    }
}
