/* Definire una classe Veicolo con esattamente le seguenti caratteristiche.
 * Un veicolo ha una targa (valore stringa che non potra' essere modificato),
 * e un prezzo di listino (valore intero che non potra' essere modificato).
 * La classe Veicolo deve avere un metodo calcolaValoreAttuale che restituisce il 
 * prezzo di listino. 
 * 
 * Definire una interfaccia Usato che contiene il metodo di default calcolaSvalutazione che 
 * restituisce la svalutazione del veicolo in base al tempo trascorso dalla sua immatricolazione. 
 * In particolare, la percentuale (intero da 0 a 100) di svalutazione rispetto al prezzo di listino 
 * e' calcolata come: (annoCorrente - annoImmatricolazione +1)*5. Attenzione, l'interfaccia puo'
 * contenere altri metodi.       
 * 
 * Definire una classe VeicoloUsato sottoclasse di Veicolo, che implementa l'interfaccia Usato.
 * Un veicolo usato ha un anno di immatricolazione (valore intero che non potra' essere modificato). 
 * Sovrascrivere il metodo calcolaValoreAttuale per calcola il valore del veicolo partendo 
 * dal prezzo di listino ed applicando la svalutazione definita nell'interfaccia. 
 * 
 * Definire una classe Concessionaria. Una concessionaria e' caratterizzato da un garage, 
 * ovvero da un lista di veicoli. Un nuova concessionaria ha un garage inizialmente vuoto. 
 * La classe Concessionaria ha un metodo aggiungiVeicolo che inserisce un veicolo nel garage, e
 * un metodo calcolaValoreTotale che calcola il valore di tutti i veicoli nel garage tenendo 
 * opportunamente conto se sono nuovi o usati.
 * 
 * Ogni classe deve sovrascrivere il metodo toString per fornire una string opportuna per 
 * la stampa.
 *  
 */
