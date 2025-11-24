public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        int i = 0;
        String newstr = "";
        for(i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < 91 && ch > 64) {
                newstr += (char)(ch + 32);
            } else {
                newstr += ch;
            }
        }
        // Replace the following statement with your code
        return newstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false;
        }
        if (str2.length() == 0) {
            return true;
        }
        for (int i = 0; i <= (str1.length() - str2.length()); i++) {
            int j = 0;
            if (str2.charAt(j) == str1.charAt(i)) {
                while (j < str2.length()){
                    if (str2.charAt(j) != str1.charAt(i + j)) {
                        break;
                    }
                    j++;
                }
                if (j == str2.length()) {
                    return true;
                }
            }
        }  
        // Replace the following statement with your code
        return false;
    }
}
