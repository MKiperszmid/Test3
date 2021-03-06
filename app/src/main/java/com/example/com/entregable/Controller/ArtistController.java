package com.example.com.entregable.Controller;

import android.content.Context;

import com.example.com.entregable.Model.DAO.AppDatabase;
import com.example.com.entregable.Model.DAO.ArtistDao;
import com.example.com.entregable.Model.POJO.Artist;
import com.example.com.entregable.Model.POJO.ArtistContainer;

import java.util.List;

public class ArtistController {
    private ArtistDao artistDao;
    private AppDatabase appDatabase;

    public ArtistController(){
        this.artistDao = new ArtistDao();
    }

    public void grabArtists(final ResultListener<Artist> listener, String id){
        artistDao.grabArtists(new ResultListener<Artist>() {
            @Override
            public void finish(Artist result) {
                listener.finish(result);
            }
        }, id);
    }

    public void grabAllArtists(final ResultListener<ArtistContainer> listener){
        artistDao.grabAllArtists(new ResultListener<ArtistContainer>() {
            @Override
            public void finish(ArtistContainer result) {
                listener.finish(result);
            }
        });
    }
}
