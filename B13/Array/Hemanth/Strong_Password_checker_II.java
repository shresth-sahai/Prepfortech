// https://leetcode.com/problems/strong-password-checker-ii/

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }
        String specialChar = "!@#$%^&*()-+";
        int lowerCount=0;
        int upperCount=0;
        int digitCount=0;
        int special=0;
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(password.charAt(i)>='a' && password.charAt(i)<='z'){
                lowerCount++;
            }if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
                upperCount++;
            }if(ch>='0' && ch<='9'){
                digitCount++;
            }if(specialChar.contains(ch+"")){
                special++;
            }
        }
        for(int i=0;i<password.length()-1;i++){
            if(password.charAt(i)==password.charAt(i+1)){
                return false;
            }
        }
        if(lowerCount==0 || upperCount==0 || digitCount==0 || special==0){
            return false;
        }
        return true;
    }
}
