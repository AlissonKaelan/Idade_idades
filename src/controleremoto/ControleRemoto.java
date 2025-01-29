/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleremoto;

/**
 *
 * @author Alisson Kaelan
 */
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    private static final int VOLUME_MAXIMO = 100;
    private static final int VOLUME_MINIMO = 0;
    private static final int VOLUME_INCREMENTO = 5;
    
    //Metodoa especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = Math.max(VOLUME_MINIMO, Math.min(volume, VOLUME_MAXIMO));
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //Metodos Abstratos

    @Override
    public void ligar() {
    this.setLigado(true);
    }

    @Override
    public void desligar() {
    this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()){
        StringBuilder menu = new StringBuilder();
        menu.append("--------MENU---------\n");
        menu.append("Está ligado? ").append(this.isLigado()).append("\n");
        menu.append("Está tocando? ").append(this.isTocando()).append("\n");
        menu.append("Volume: ").append(this.getVolume()).append("\n");
        for (int i = 0; i <= this.getVolume(); i += 10) {
                menu.append("|");
            }

            menu.append("\n---------------------");
            System.out.println(menu.toString());
        } else {
            System.out.println("TV Desligada");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu....");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() + VOLUME_INCREMENTO);
            
        }else{
            System.out.println("Impossivel aumentar volume ");
        }
        
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - VOLUME_INCREMENTO);
        }else{
            System.out.println("Impossivel abaixa volume ");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(5);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
          this.setTocando(true);
        }else{
            System.out.println("Impossivel reproduzir ");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
            
        }else{
            System.out.println("Impossivel pausar");
        }
            
        
    }
    
    
}
