package com.freedom.itunessearch.views.songdetail;

import com.freedom.itunessearch.api.model.Track;

/**
 * Created by Shraddha on 24/3/2021.
 */

public class SongDetailContract {

    interface View {
        void displayMessage(String message);

        void displayTrack(Track track);
    }
}
