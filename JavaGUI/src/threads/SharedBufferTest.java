package threads;

public class SharedBufferTest {

	public static void main(String[] args) {
		// create shared object used by threads;
		UnsynchronizedBuffer sharedLocation = new UnsynchronizedBuffer();

		// create producer and consumer objects
		Producer producer = new Producer(sharedLocation);
		Consumer consumer = new Consumer(sharedLocation);

		producer.start(); // start producer thread
		consumer.start(); // start consumer thread

	}

}
