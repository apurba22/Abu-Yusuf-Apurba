package string.problems;

/**
 * Created by mrahman.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        checkAnagram("CAT", "ACT");
        checkAnagram("ARMY", "MARY");
    }


        public static void checkAnagram(String  word, String anagram){
            if(isAnagram(word,anagram) ==true){
                System.out.println(anagram+ "is an anagram"+ word);
            }else {
                System.out.println(" not an anagram");
            }
        }
        public static boolean isAnagram(String word, String anagram){
            if(word.length() != anagram.length()){
                return false;
            }

            char[] chars = word.toCharArray();
            for(char c: chars){
                int index = anagram.indexOf(c);
                if(index !=1){
                    anagram = anagram.substring(0, index)+ anagram.substring(index+1, anagram.length());
                }else {
                    return false;
                }
            }
            return anagram.isEmpty();
        }


    }
