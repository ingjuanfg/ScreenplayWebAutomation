package co.com.ingjuanfg.model.builders;

import co.com.ingjuanfg.model.Video;
import co.com.ingjuanfg.utils.Builder;

public class VideoBuilder implements Builder<Video> {

    private String nombreVideo;
    private String artista;

    public VideoBuilder() {
        this.nombreVideo = "";
        this.artista = "";
    }

    public static VideoBuilder video(){
        return new VideoBuilder();
    }

    public VideoBuilder conNombreVideo(String nombreVideo){
        this.nombreVideo = nombreVideo;
        return this;
    }

    public VideoBuilder conArtista(String artista){
        this.artista = artista;
        return this;
    }

    public String getNombreVideo() {
        return nombreVideo;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public Video build() {
        return new Video(this);
    }
}