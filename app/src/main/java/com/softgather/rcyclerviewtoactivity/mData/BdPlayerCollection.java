package com.softgather.rcyclerviewtoactivity.mData;

import com.softgather.rcyclerviewtoactivity.R;

import java.util.ArrayList;
import java.util.List;

public class BdPlayerCollection {
    public static List<BdPlayer> getBdPlayers()
    {
        List<BdPlayer> bdPlayers = new ArrayList<>();
        BdPlayer bdplayer = null;

        //Add data to collection

        bdplayer = new BdPlayer();
        bdplayer.setPlayerName("Mashrafe");
        bdplayer.setPlayerImage(R.drawable.masrafe);
        bdPlayers.add(bdplayer);

        bdplayer = new BdPlayer();
        bdplayer.setPlayerName("Mashrafe");
        bdplayer.setPlayerImage(R.drawable.masrafe);
        bdPlayers.add(bdplayer);

        bdplayer = new BdPlayer();
        bdplayer.setPlayerName("Mashrafe");
        bdplayer.setPlayerImage(R.drawable.masrafe);
        bdPlayers.add(bdplayer);

        bdplayer = new BdPlayer();
        bdplayer.setPlayerName("Mashrafe");
        bdplayer.setPlayerImage(R.drawable.masrafe);
        bdPlayers.add(bdplayer);

        bdplayer = new BdPlayer();
        bdplayer.setPlayerName("Mashrafe");
        bdplayer.setPlayerImage(R.drawable.masrafe);
        bdPlayers.add(bdplayer);

        bdplayer = new BdPlayer();
        bdplayer.setPlayerName("Mashrafe");
        bdplayer.setPlayerImage(R.drawable.masrafe);
        bdPlayers.add(bdplayer);

        return bdPlayers;

    }
}
