package mocktest1;

import java.util.HashMap;

public class UniqueCharacter {
    public static int uniqueCharacterIndex(String s){
        char ch;
        for(int i=0;i<s.length();i++) {
            ch=s.charAt(i);
            if (s.indexOf(ch)==s.lastIndexOf(ch)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s ;
        s= "leetcode";
        System.out.println(uniqueCharacterIndex(s));
        s = "loveleetcode";
        System.out.println(uniqueCharacterIndex(s));
        s = "aabb";
        System.out.println(uniqueCharacterIndex(s));
    }
}
