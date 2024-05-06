public class Usuario {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("TV ligada? " + smartTv.ligada);
    System.out.println("Canal em que a TV está: " + smartTv.canal);
    System.out.println("Volume em que a TV está " + smartTv.volume);

    smartTv.ligar();
    System.out.println("TV ligada? " + smartTv.ligada);

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();
    System.out.println("Volume em que a TV está " + smartTv.volume);

    smartTv.mudarCanal(15);
    System.out.println("Canal em que a TV está: " + smartTv.canal);

    smartTv.aumentarCanal();
    System.out.println("Canal em que a TV está: " + smartTv.canal);


    

  }



  
}
