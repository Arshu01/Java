import java.util.Arrays;

public class exm {
    public  boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        System.out.println(arr1);
        Arrays.sort(arr2);                      //anagrams Quetion
        System.out.println(arr1);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        exm e=new exm();
        String str1 = "lisen";
        String str2 = "silnt";
        if (e.areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
