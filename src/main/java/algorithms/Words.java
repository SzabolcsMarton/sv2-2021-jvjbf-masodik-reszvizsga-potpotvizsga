package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Words {

    private List<String> words = new ArrayList<>();


    public List<String> getWords() {
        return words;
    }

    public void addWords(String... wordsToAdd) {
        for (String actual : wordsToAdd) {
            words.add(actual);
        }
    }

    public List<String> findWordsOccursOnes() {
        return words
                .stream()
                .filter(s -> words.indexOf(s)== words.lastIndexOf(s))
                .toList();
    }
}
