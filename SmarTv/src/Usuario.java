public class Usuario {
    public static void main(String[] args) throws Exception {
        SmarTv smarTv = new SmarTv();
        //aumentando e diminuindo o volume da tv
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();

        //canal que estava antes
        System.out.println("Qual canal a TV esta :" + smarTv.canal);
        
        //canal de agora a qual o usuario escolheu
        smarTv.mudarCanal(13);
        System.out.println("Qual canal a TV esta :" + smarTv.canal);

        System.out.println("A TV esta ligada ?:" + smarTv.ligada);
        System.out.println("Qual volume a TV esta ?:" + smarTv.volume);
        System.out.println("Qual canal a TV esta :" + smarTv.canal);

        
        // comando para o status da tv ser true ou seja ligada
        smarTv.ligar ();
        System.out.println("Novo Status -> A TV esta ligada ?:" + smarTv.ligada);

        // comando para o status da tv ser false ou seja desligada
        smarTv.desligar ();
        System.out.println("Novo Status -> A TV esta ligada ?:" + smarTv.ligada);
        }


    
}

