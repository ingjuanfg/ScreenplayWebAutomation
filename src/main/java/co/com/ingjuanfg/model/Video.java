package co.com.ingjuanfg.model;

import co.com.ingjuanfg.model.builders.VideoBuilder;

public class Video {

    private String nombreVideo;
    private String artista;

    public Video(VideoBuilder videoBuilder) {
        this.nombreVideo = videoBuilder.getNombreVideo();
        this.artista = videoBuilder.getArtista();
    }

    public String getNombreVideo() {
        return nombreVideo;
    }

    public String getArtista() {
        return artista;
    }
}