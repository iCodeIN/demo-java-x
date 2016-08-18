import java.util.stream.IntStream;

public class PrivateInterfaceMethods {

	public interface InJava8 {

		default boolean evenSum(int... numbers) {
			return sum(numbers) % 2 == 0;
		}

		default boolean oddSum(int... numbers) {
			return sum(numbers) % 2 == 0;
		}

		// we don't want this to be public;
		// but how else do we reuse in Java 8?
		default int sum(int[] numbers) {
			return IntStream.of(numbers).sum();
		}

	}

	public interface InJava9 {

		default boolean evenSum(int... numbers) {
			return sum(numbers) % 2 == 0;
		}

		default boolean oddSum(int... numbers) {
			return sum(numbers) % 2 == 0;
		}

		// in Java 9 just make it private
		private int sum(int[] numbers) {
			return IntStream.of(numbers).sum();
		}

	}

}