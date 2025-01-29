
package controleremoto;

/**
 *
 * @author Alisson Kaelan
 */
public class mein {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleRemoto RemoteControl = new ControleRemoto();
        RemoteControl.ligar();
        RemoteControl.abrirMenu();
        RemoteControl.maisVolume();
        RemoteControl.play();
        RemoteControl.abrirMenu();
    }
    
}
