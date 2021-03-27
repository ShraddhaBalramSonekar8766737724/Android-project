package com.freedom.itunessearch.views.songlist;

import com.freedom.itunessearch.api.model.Track;

import java.util.List;

/**
 * Created by Shraddha on 25/3/2021.
 */

class SongListContract {

    interface View {
        void displayMessage(String message);

        void setLoadingIndicator(boolean isLoading);

        void displayTracks(List<Track> dataTracks);
    }

    interface Presenter {
        void getTracks(String term);
    }
}