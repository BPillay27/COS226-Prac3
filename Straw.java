
public class Straw {
	private Filter lock;

	Straw(String lock_type) {
		if (lock_type == "V2") {
			lock = new Improved_Filter(3);
		} else {
			lock = new Filter(3);
		}
	}

	public void sip(int threadId) {
		// done
		try {
			lock.lock(threadId);
			// possible output here
			long x = (long) (Math.random() * 100);
			Thread.sleep(x);

			// possible output here
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} finally {
			lock.unlock(threadId);
		}
	}
}
