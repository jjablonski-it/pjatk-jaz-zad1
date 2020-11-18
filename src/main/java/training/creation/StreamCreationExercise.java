package training.creation;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationExercise implements StreamCreator {

    @Override
    public IntStream positiveDigitsUsingOf() {
        return IntStream.empty();
    }

    @Override
    public IntStream positiveDigitsUsingRange() {
        return IntStream.empty();
    }

    @Override
    public IntStream positiveDigitsUsingIterate() {
        return IntStream.empty();
    }

    @Override
    public IntStream powersOfTwo() {
        return IntStream.empty();
    }

    @Override
    public DoubleStream from0Till1WithTenSteps() {
        return DoubleStream.empty();
    }

    @Override
    public Stream<String> alphabet() {
        return Stream.empty();
    }

}
