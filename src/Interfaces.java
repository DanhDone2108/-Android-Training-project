interface  Playable{
    public void play();
}
class Play implements Playable{
    public void play(){
        System.out.println("Game is now playable.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Playable playable = new Play();
        playable.play();
    }
}
