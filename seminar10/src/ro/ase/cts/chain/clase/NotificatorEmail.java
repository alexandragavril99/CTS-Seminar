package ro.ase.cts.chain.clase;

public class NotificatorEmail extends Notificator{

	@Override
	public void trimitereNotificare(Client client, String text) {
		if(client.getEmail() != null) {
			System.out.println("Trimitere email catre clientul: " + client.getNume()+ " mesaj: "+text);
		} else {
			if(super.getNotificator() != null) {
				super.getNotificator().trimitereNotificare(client,text);
			} else {
				System.out.println("Domnule manager, nu avem date de contact pt clientul " + client.getNume());
			}
		}
	}

}
