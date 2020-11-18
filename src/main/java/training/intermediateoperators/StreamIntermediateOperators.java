package training.intermediateoperators;

import java.util.List;
import java.util.stream.Stream;

public interface StreamIntermediateOperators {

    Stream<String> wordsLongerThanFiveCharacters(List<String> words);

    Stream<String> firstThreeWordsLongerThanFiveCharacters(List<String> words);

    Stream<String> firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrder(List<String> words);

    Stream<Integer> lengthOfWords(List<String> words);

    /**
     * W tym zadaniu nalezy zrobic taki stream:
     *
     * 0                 <- pierwszy element
     * 0 1               <- drugi i trzeci element
     * 0 1 2             <- czwarty, piaty i szosty element itd.
     * 0 1 2 3
     * 0 1 2 3 4
     * 0 1 2 3 4 5
     * 0 1 2 3 4 5 6
     *
     * Sugestia: operacja flatMap moze byc tu przydatna
     *
     */
    Stream<Integer> staircase();
}
