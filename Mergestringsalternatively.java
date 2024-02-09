//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

//Leetcode 75
//Q1
 class Mergestringsalternatively {
     public static void mergeAlternately(String word1, String word2) {
         //Step-1: Comparing the two strings to identify which one is the minimum using .length()
         int len1 = word1.length();
         int len2 = word2.length();
         //Use Math class with min method to compare the two
         int min = Math.min(len1 , len2);
         // declare a variable for the longer string
         String longerstring;
         //write conditions for the longer string and store it in the declared variable
         if(min == len1){
             longerstring = word2;
         }else{longerstring = word1;}
         //declare character array and convert the strings to characters and store it
         char[] char1 = word1.toCharArray();
         char[] char2 = word2.toCharArray();
         StringBuilder sb = new StringBuilder();
         for( int i = 0; i < min; i++ ){
             sb.append(char1[i]);
             sb.append(char2[i]);
         }
         sb.append(longerstring.substring(min));
         System.out.println(sb.toString());
     }

     public static void main(String[] args){
         String word1 = "abc";
         String word2 = "pqr";
         mergeAlternately(word1 ,word2);
     }
 }