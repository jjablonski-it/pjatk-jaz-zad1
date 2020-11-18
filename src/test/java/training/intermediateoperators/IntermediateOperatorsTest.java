package training.intermediateoperators;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static training.TestUtils.tester;

public class IntermediateOperatorsTest {
    private static final String SENTENCE = "Sometimes Sometimes to understand the meaning of words you need more than a definition Seeing the word in a sentence can provide more context and relevance";
    private static final List<String> WORDS = Arrays.asList(SENTENCE.split(" "));

    private final IntermediateOperatorsExercise instance = new IntermediateOperatorsExercise();


    @Test
    public void wordsLongerThanFiveCharactersTest() {
        tester(
                instance,
                Stream.of("Sometimes", "Sometimes", "understand", "meaning", "definition", "Seeing", "sentence", "provide", "context", "relevance"),
                i -> i.wordsLongerThanFiveCharacters(WORDS),
                s -> s.collect(Collectors.toList())
        );
    }

    @Test
    public void firstThreeWordsLongerThanFiveCharactersTest() {
        tester(
                instance,
                Stream.of("Sometimes", "Sometimes", "understand"),
                i -> i.firstThreeWordsLongerThanFiveCharacters(WORDS),
                s -> s.collect(Collectors.toList())
        );
    }

    @Test
    public void firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrderTest() {
        tester(
                instance,
                Stream.of("understand", "meaning", "Sometimes"),
                i -> i.firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrder(WORDS),
                s -> s.collect(Collectors.toList())
        );
    }

    @Test
    public void lengthOfWordsTest() {
        tester(
                instance,
                Stream.of(9, 9, 2, 10, 3, 7, 2, 5, 3, 4, 4, 4, 1, 10, 6, 3, 4, 2, 1, 8, 3, 7, 4, 7, 3, 9),
                i -> i.lengthOfWords(WORDS),
                s -> s.collect(Collectors.toList())
        );
    }

    @Test public void increasingSawtoothTest() {
        tester(
                instance,
                Stream.of(0, 1, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 6),
                IntermediateOperatorsExercise::staircase,
                s -> s.collect(Collectors.toList())
        );
    }

}
