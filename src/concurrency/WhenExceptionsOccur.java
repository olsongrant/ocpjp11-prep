package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WhenExceptionsOccur {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.submit(() -> {
			throw new RuntimeException();
		});
		service.shutdown();
		System.out.println("done");
	}

}
