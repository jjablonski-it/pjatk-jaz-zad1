package training;

import java.util.List;
import java.util.function.Function;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class TestUtils {
    private TestUtils() { }

    public static <I, T, S extends BaseStream> void tester(
            final I instance,
            final S reference,
            final Function<I, S> creator,
            final Function<S, List<T>> collector) {
        final S stream = creator.apply(instance);

        assertEquals(reference.isParallel(), stream.isParallel());

        assertNotSame(creator.apply(instance), stream);

        final List<T> expected = collector.apply(reference);
        final List<T> actual = collector.apply(stream);

        assertEquals(expected, actual);
    }
}
