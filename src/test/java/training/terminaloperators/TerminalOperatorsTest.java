package training.terminaloperators;

import org.junit.Test;
import training.intermediateoperators.IntermediateOperatorsExercise;
import training.termialoperators.TerminalOperatorsExercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static training.TestUtils.tester;

public class TerminalOperatorsTest {

    private final Stream<String> ALPHABET_STREAM = Stream.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                                                             "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    private final Stream<String> WORD_STREAM = Stream.of("The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");
    private final Stream<String> EMPTY_WORD_STREAM = Stream.of();

    private final String[] ALPHABET_ARRAY = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                                             "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    private final List<String> ALPHABET_LIST = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                                                       "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    private final List<String> REVERSE_ALPHABET_LIST = List.of("Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "N",
                                                               "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A");

    private final Set<String> ALPHABET_SET = Set.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                                                    "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    private final Map<Integer, List<String>> WORDS_GROUPED_BY_LENGTH = Map.of(
            3, List.of("The", "fox", "the", "dog"),
            4, List.of("over", "lazy"),
            5, List.of("quick", "brown", "jumps"));

    private final TerminalOperatorsExercise instance = new TerminalOperatorsExercise();

    @Test
    public void addToSetTest() {
        final Set<String> actual = new HashSet<>();
        instance.addToSet(ALPHABET_STREAM, actual);
        assertEquals(ALPHABET_SET, actual);
    }

    @Test
    public void addToListInReverseOrderTest() {
        final List<String> actual = new ArrayList<>();
        instance.addToListInReverseOrder(ALPHABET_STREAM, actual);
        assertEquals(REVERSE_ALPHABET_LIST, actual);
    }


    @Test
    public void collectToArrayTest() {
        final String[] actual = instance.collectToArray(ALPHABET_STREAM);
        assertArrayEquals(ALPHABET_ARRAY, actual);
    }

    @Test
    public void collectToSetTest() {
        Set<String> actual = instance.collectToSet(ALPHABET_STREAM);
        assertEquals(ALPHABET_SET, actual);
    }

    @Test
    public void collectToListTest() {
        List<String> actual = instance.collectToList(ALPHABET_STREAM);
        assertEquals(ALPHABET_LIST, actual);
    }

    @Test
    public void mergeIntoStringTest() {
        final String DELIMITED_ALPHABET = "[A-B-C-D-E-F-G-H-I-J-K-L-M-N-O-P-Q-R-S-T-U-V-W-X-Y-Z]";
        String actual = instance.mergeIntoString(ALPHABET_STREAM);
        assertEquals(DELIMITED_ALPHABET, actual);
    }

    @Test
    public void countCharactersTest() {
        int charCount = instance.countCharacters(WORD_STREAM);
        int emptyCharCount = instance.countCharacters(EMPTY_WORD_STREAM);
        assertEquals(35, charCount);
        assertEquals(0, emptyCharCount);
    }

    @Test
    public void longestWordLengthTest() {
        int longestWordLength = instance.longestWordLength(WORD_STREAM);
        int zeroLength = instance.longestWordLength(EMPTY_WORD_STREAM);
        assertEquals(5, longestWordLength);
        assertEquals(0, zeroLength);
    }

    @Test
    public void longestWordTest() {
        String longestWord = instance.longestWord(WORD_STREAM);
        String emptyStreamLongestWord = instance.longestWord(EMPTY_WORD_STREAM);
        assertEquals("quick", longestWord);
        assertEquals("", emptyStreamLongestWord);
    }

    @Test
    public void wordsGroupedByLengthTest() {
        Map<Integer, List<String>> wordsGroupedByLength = instance.wordsGroupedByLength(WORD_STREAM);
        assertEquals(WORDS_GROUPED_BY_LENGTH, wordsGroupedByLength);
    }

}
