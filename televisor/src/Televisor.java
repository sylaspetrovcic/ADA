public class Televisor {
    int canal =1;
    int volume =1;
    boolean ligado;
    void aumentarVolume() {
        if (volume < 10 ) {
            volume++;
        } else {
            System.out.println("Volume já está no máximo");
        }
    }
        void diminuirVolume(){
            if(volume > 1){
                volume--;
            }else {
                System.out.println("Volume já está no mínimo");
            }
        }
        void descerCanal(){
        if( canal >1 ){
            canal--;
        }else {
            System.out.println("Canal já está no mínimo");
        }
        }
        void subirCanal() {
            if (canal < 16 ) {
                canal++;
            }else{
                System.out.println("Canal já está no máximo");
            }
        }
        void ligarTelevisao(){
            ligado = true;
            }
        void desligarTelevisao(){
            ligado = false;
            }
        void mostrarStatus(){
            System.out.println("Canal :" + canal + " Volume :" + volume + " Televisão ligada ? " + ligado);

        }

    public Televisor() {
    }
}

