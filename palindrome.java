public class palindrome{
    public static void main(String[] args) {
        String str="madam";
        boolean ispalindrome=checkpalindrome(str);
        if(ispalindrome){
            System.out.println(str + " is palindrome");
        }
        else{
            System.out.println(str + " is not palindrome");
        }
    }
    public static boolean checkpalindrome (String str){
        int start=0;
        int end=str.length()-1;
        while (start<end) {
            if(str.charAt(start)!=str.charAt(end)){
            return false; 
        }
        start++;
        end--;
    }
    return true;
}
}