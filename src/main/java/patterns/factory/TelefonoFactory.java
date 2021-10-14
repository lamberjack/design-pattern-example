package patterns.factory;

/**
 * Factory concreto per la classe Telefono
 *
 * @author lamberto.pauletti
 *
 */
public class TelefonoFactory extends ProductAbstractFactory {

    @Override
    public Telefono createProduct(String descrizione, int prezzo) {
        System.out.println("Creazione Prodotto -> Telefono: "+ descrizione+" ,"+Integer.toString(prezzo));
        Telefono newTelefono = new Telefono();
        newTelefono.setPrezzo(prezzo);
        newTelefono.setDescrizione(descrizione);
        return newTelefono;
    }

}
