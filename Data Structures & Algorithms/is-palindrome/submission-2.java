class Solution {

    public static boolean isPalindrome(String s) {

       char[] chars = s.toLowerCase().toCharArray();

       int i=0;
       int j=chars.length -1;

      while(i < j)
      {
          char start = chars[i];
          char end = chars[j];

          if(!Character.isAlphabetic(start) && !Character.isDigit(start))
          {
              i++;
              continue;
          }
          if(!Character.isAlphabetic(end) && !Character.isDigit(end))
          {
              j--;
              continue;
          }

          if(start!= end)
          {
              return false;
          }
          i++;
          j--;

      }
       return true;
    }
}
 