public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market", // print
            "Programming is both painful and engaging", 
            "This has nothing to do with machine learning", 
            "We need to leverage our core competencies", // print
            "Let's talk about data and algorithms", 
            "Chatbots are great but must be used carefully", 
            "This blockchain-based solution will disrupt the industry", // print
            "The team showed great Synergy in the last project", // print
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift", // print
            "Effective presentations must be clear, concise, and humble" 
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        int j = 0;
        for ( j = 0; j < sentences.length; j++) {
            String sentence = sentences[j].toLowerCase();
            for (int i = 0; i < keywords.length; i++) {
                String word = keywords[i].toLowerCase();
                if (contains(sentence, word)) {
                    System.out.println(sentences[j]);
                    break;
                }
            }
        }
        // Replace this comment with your code
    } 

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
