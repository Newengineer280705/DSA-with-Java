
class Solution {
    public void reverseString(char[] s) {
        String str = new String(s);
        
        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            str2.append(str.charAt(i));
        }

        str2 = str2.reverse();

        for (int i = 0; i < str2.length(); i++) {
            s[i] = str2.charAt(i);
        }
    }
}




////////////////////////////////////////
// class Solution {
//     // public void reverseString(char[] s) {
//     //     int left = 0;
//     //     int right = s.length - 1;

//     //     while (left < right) {
//     //         char temp = s[left];
//     //         s[left] = s[right];
//     //         s[right] = temp;

//     //         left++;
//     //         right--;
//     //     }
//     // }
// }
