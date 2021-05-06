package ro.ase.cts.chain.clase;

public class NotificatorSMS extends Notificator{

	@Override
	public void trimitereNotificare(Client client, String text) {
		if(client.getNrTelefon() != null) {
			System.out.println("Trimitere SMS catre " + client.getNume() + " mesaj: " +text);
		} else {
			
			if(super.getNotificator() != null ) {
				super.getNotificator().trimitereNotificare(client, text);
			} else {
				System.out.println("Domnule manager, nu avem date de contact pt clientul " + client.getNume());
			}
		}
	}
	
}
