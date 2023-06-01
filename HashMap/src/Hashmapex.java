import java.util.HashMap;

public class Hashmapex {
    public static void main(String[] args) {
        String input = "Hi All! This is Uma.";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

       
        String[] words = input.split("\\s+");

        
        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z0-9]", "");

           
            if (!word.isEmpty()) {
                
                word = word.toLowerCase();

             
                if (wordCountMap.containsKey(word)) {
                    int count = wordCountMap.get(word);
                    wordCountMap.put(word, count + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }
        }

        
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(word + ": " + count);
        }
    }
}