package training.intermediateoperators;

import javax.sql.ConnectionPoolDataSource;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperatorsExercise implements StreamIntermediateOperators {

    @Override
    public Stream<String> wordsLongerThanFiveCharacters(List<String> words) {
        return Stream.empty();
    }

    @Override
    public Stream<String> firstThreeWordsLongerThanFiveCharacters(List<String> words) {
        return Stream.empty();
    }

    @Override
    public Stream<String> firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrder(List<String> words) {
        return Stream.empty();
    }

    @Override
    public Stream<Integer> lengthOfWords(List<String> words) {
        return Stream.empty();
    }

    @Override
    public Stream<Integer> staircase() {
        return Stream.empty();
    }
}
