package ro.ase.cts.chain.main;

import ro.ase.cts.chain.clase.Client;
import ro.ase.cts.chain.clase.NotificatorEmail;
import ro.ase.cts.chain.clase.NotificatorSMS;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("Ion", null, null);
		Client client2 = new Client("Marina", "0712341234", null);
		Client client3 = new Client("Ana", null, "ana2@gmail.com");
		
		NotificatorSMS notificatorSMS = new NotificatorSMS();
		NotificatorEmail notificatorEmail = new NotificatorEmail();
		
		notificatorSMS.setNotificator(notificatorEmail);
		notificatorSMS.trimitereNotificare(client3, "Mesaj 1");
		notificatorSMS.trimitereNotificare(client2, "Mesaj 2");

		
	}

}
