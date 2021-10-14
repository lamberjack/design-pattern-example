package patterns.factory;

/**
 * Factory concreto per la classe Auto
 * 
 * @author lamberto.pauletti
 *
 */
public class AutoFactory extends ProductAbstractFactory {

    @Override
    public Auto createProduct(String descrizione, int prezzo) {
        System.out.println("Creazione Prodotto -> Auto: "+ descrizione+" ,"+Integer.toString(prezzo));
        Auto newAuto = new Auto();
        newAuto.setDescrizione(descrizione);
        newAuto.setPrezzo(prezzo);
        return newAuto;
    }

}
