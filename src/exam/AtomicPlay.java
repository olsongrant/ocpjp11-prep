package exam;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicPlay {
	
	AtomicInteger myInteger = new AtomicInteger(10);

	public static void main(String[] args) {
		AtomicInteger anAtomic = new AtomicInteger(5);
		anAtomic.addAndGet(3);
		System.out.println(anAtomic);
		System.out.println("Set to 10: " + anAtomic.compareAndSet(8, 10));
		System.out.println("Set to 11: " + anAtomic.compareAndSet(9, 11));
		anAtomic.accumulateAndGet(4, (x, y) -> x - y);
		System.out.println("After accumulateAndGet: " + anAtomic);
		System.out.println("returned from getAndAdd: " + anAtomic.getAndAdd(3));
		System.out.println("returned from getAndDecrement: " + anAtomic.getAndDecrement());
		System.out.println("returned from getAndIncrement: " + anAtomic.getAndIncrement());
		System.out.println("returned from getAndUpdate: " + anAtomic.getAndUpdate(x -> x * 2));
		System.out.println("returned from getOpaque: " + anAtomic.getOpaque());
		System.out.println("returned from getPlain: " + anAtomic.getPlain());
		System.out.println("returned from incrementAndGet: " + anAtomic.incrementAndGet());
		
	}

}
