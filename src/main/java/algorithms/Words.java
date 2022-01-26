package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words {

    private List<String> words = new ArrayList<>();


    public List<String> getWords() {
        return words;
    }

    public void addWords(String... wordsToAdd) {
        words.addAll(Arrays.asList(wordsToAdd));
    }

    public List<String> findWordsOccursOnes() {
        return words
                .stream()
                .filter(s -> words.indexOf(s)== words.lastIndexOf(s))
                .toList();
    }
}
