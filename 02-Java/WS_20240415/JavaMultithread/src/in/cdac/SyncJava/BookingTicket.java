package in.cdac.SyncJava;


public class BookingTicket implements Runnable{

	int availableTickets = 3;
	static int i;
	
	public synchronized void ticketBook(String name, int noOfTickets)  {
		if (noOfTickets <= availableTickets) {
			
		
			System.out.println("Name : " + name + " , " + noOfTickets + " tickets booked.");
			availableTickets -= noOfTickets;
		}
		else
			System.out.println("No Tickets Booked.");
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name);
		if (name.equals("Passenger 1")) {
			ticketBook(name, 1);
		}
		if (name.equals("Passenger 2")) {
			ticketBook(name, 3);
		}
		if (name.equals("Passenger 3")) {
			ticketBook(name, 2 );
		}
	}
	
	
	
	
	public static void main(String[] args) {
		BookingTicket bookingticket = new BookingTicket();
		Thread t1 = new Thread(bookingticket);
		Thread t2 = new Thread(bookingticket);
		Thread t3 = new Thread(bookingticket);

		t1.setName("Passenger 1");
	
		t2.setName("Passenger 2");
		t3.setName("Passenger 3");
		
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}

	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		BookingTicket.i = i;
	}

}
