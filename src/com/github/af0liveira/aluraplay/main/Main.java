package com.github.af0liveira.aluraplay.main;

import com.github.af0liveira.aluraplay.modelos.PlayList;
import com.github.af0liveira.aluraplay.modelos.PodcastEpisode;
import com.github.af0liveira.aluraplay.modelos.SongTrack;

public class Main {

    public static void main(String[] args) {

        SongTrack mySongTrack = new SongTrack();
        mySongTrack.setTitle("There's a Light That Never Goes Out");
        mySongTrack.setArtist("The Smiths");
        mySongTrack.setAlbum("The Queen Is Dead");
        mySongTrack.setComposer("Johnny Marr & Morrissey");
        mySongTrack.setYear(1986);
        mySongTrack.setDurationInSeconds(244);
        mySongTrack.setGenre("Alternative");

        System.out.println("mySongTrack: " + mySongTrack);
        for (int i = 1; i <= 1500; i++) {
            mySongTrack.playAudio();
            if (i % 3 == 0) {
                mySongTrack.likeAudio();
            }
            if (i % 7 == 0) {
                mySongTrack.dislikeAudio();
            }
        }
        System.out.println("Times mySongTrack was played:   " + mySongTrack.getTimesPlayed());
        System.out.println("Times mySongTrack was liked:    " + mySongTrack.getTimesLiked());
        System.out.println("Times mySongTrack was disliked: " + mySongTrack.getTimesDisliked());
        System.out.println("Rating of mySongTrack :         " + mySongTrack.getRating());

        PodcastEpisode myPodcastEpisode = new PodcastEpisode();
        myPodcastEpisode.setTitle("Na jugular");
        myPodcastEpisode.setShowTitle("Alexandre");
        myPodcastEpisode.setEpisodeDescription("""
            Em 30 de outubro de 2022, Alexandre de Moraes votou em uma escola em
            São Paulo e depois seguiu para Brasília. O voo até foi tranquilo.
            Naquele dia, quem chacoalhava era o Brasil. Bolsonaristas e
            petistas, por motivos diferentes, queriam adiar ou postergar o
            fechamento das urnas do segundo turno. Como Alexandre contrariou os
            dois lados e manteve a calma? Este episódio revela os bastidores da
            atuação do presidente do Tribunal Superior Eleitoral em um dos dias
            mais tensos e decisivos da história da nossa democracia.
            """);
        myPodcastEpisode.setSeason(1);
        myPodcastEpisode.setEpisode(1);
        myPodcastEpisode.setDay(31);
        myPodcastEpisode.setMonth(7);
        myPodcastEpisode.setYear(2023);
        myPodcastEpisode.setCreator("Trovão Mídia e Revista Piauí");

        System.out.println("myPodcastEpisode: " + myPodcastEpisode);
        for (int i = 1; i <= 500; i++) {
            myPodcastEpisode.playAudio();
            if (i % 2 == 0) {
                myPodcastEpisode.likeAudio();
            }
            if (i % 3 == 0) {
                myPodcastEpisode.dislikeAudio();
            }
        }
        System.out.println("Times myPodcastEpisode was played:   " + myPodcastEpisode.getTimesPlayed());
        System.out.println("Times myPodcastEpisode was liked:    " + myPodcastEpisode.getTimesLiked());
        System.out.println("Times myPodcastEpisode was disliked: " + myPodcastEpisode.getTimesDisliked());
        System.out.println("Rating of myPodcastEpisode :         " + myPodcastEpisode.getRating());

        PlayList myPlayList = new PlayList();
        myPlayList.include(mySongTrack);
        myPlayList.include(myPodcastEpisode);

    }

}