/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class MusicPlayer {
    private boolean play;
    private boolean stop;
    
    private static MusicPlayer controller;
    
    MusicPlayer(){
        play = false;
        stop = true;
        System.out.println("Loading Track...");
    }
    
    public static synchronized MusicPlayer getInstance(){
        if (controller == null) {
            System.out.println("Checking Track.....");
            controller = new MusicPlayer();
        }
        System.out.println("Clearing track....");
        return controller;
    }
    
    public void load(){
    if(isStop()) {
        play = false;
        stop = false;
        System.out.println("Loading Track");
    }
}
    public void player(){
      if(!isStop() && !isPlay()){
          play = false;
          System.out.println("Playing track...");
        }
    }
          

    public void stop(){
       if(!isStop() && !isPlay()){
           stop = true;
           System.out.println("Track Stopped.");
       }
       
    }
           

public boolean isStop(){
       return stop;
   }
   
   public boolean isPlay(){
       return play;
   }
}
