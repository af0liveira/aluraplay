package com.github.af0liveira.aluraplay.modelos;

public class PlayList {
    
    public void include(Audio audio) {
        if (audio.getRating() > 1000) {
            System.out.println("%s is very popular!".formatted(audio.getTitle()));
        } else if (audio.getRating() > 500) {
            System.out.println("%s is popular.".formatted(audio.getTitle()));
        } else {
            System.out.println("%s hasn't been played enough.".formatted(audio.getTitle()));
        }
    }

}
