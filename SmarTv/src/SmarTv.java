public class SmarTv {
    // valores da smart tv;
    boolean ligada=false;
    int canal=1;
    int volume = 25;
    
    //escolhendo o canal 
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    //aumentando o canal mudando para o proximo
    public void aumentarCanal(){
        
        canal++;
        System.out.println("Aumentando o canal:" + canal);

    }

    //diminuindo  o canal voltando para o ultimo canal 
    public void diminuirCanal(){
        
        canal--;
        System.out.println("Diminuindo o canal:" + canal);

    }
    //aumentando o volume 
    public void aumentarVolume(){
        //volume = volume + 1
        volume++;
        System.out.println("Aumentando o volume para:" + volume);

    }
    //diminuindo o volume
    public void diminuirVolume(){
        
        volume--;
        System.out.println("Diminuindo o volume para:" + volume);

    }

    //Metodo para ligar (ele não retorna nada por conta do void)
    public void ligar(){
        ligada=true;

    }

    //Metodo para Desligar (ele não retorna nada por conta do void)
    public void desligar() {
        ligada=false;
    }
}
