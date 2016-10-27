package threads02;

public class Consumer extends Thread {

	private Buffer01 sharedLocation; // reference to shared object

	// constructor
	public Consumer(Buffer01 shared) {
		super("Consumer");
		sharedLocation = shared;
	}

	// read sharedLocation's value four times and sum the values
	public void run() {
		int sum = 0;

		for (int count = 1; count <= 4; count++) {

			// sleep 0 to 3 seconds, read value from Buffer and add to sum
			try {
				Thread.sleep((int) (Math.random() * 3001));
				sum += sharedLocation.get();
			}

			// if sleeping thread interrupted, print stack trace
			catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}

		System.err.println(getName() + " read values totaling: " + sum
				+ ".\nTerminating " + getName() + ".");
	}

}
