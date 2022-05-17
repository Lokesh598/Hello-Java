public class vowelOrConsonent {
    public static void vowel_or_consonent(char y) {
        if (y == 'a' || y == 'e' || y == 'i' || y =='o' || y == 'u') {
            System.out.println("It is vowel");
        } else {
            System.out.println("It is consonent");
        }
    }
    public static void main(String[] args) {
        vowel_or_consonent('b');
    }
}
