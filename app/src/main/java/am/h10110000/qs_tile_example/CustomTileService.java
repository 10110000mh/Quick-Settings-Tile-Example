package am.h10110000.qs_tile_example;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import android.util.Log;

public class CustomTileService extends TileService {

    private static final String TAG = "CustomTileService";

    @Override
    public void onTileAdded() {
        super.onTileAdded();
        // Set default state and label
        Tile tile = getQsTile();
        tile.setState(Tile.STATE_INACTIVE);
        tile.updateTile();
    }

    @Override
    public void onClick() {
        super.onClick();

        // Log the press
        Log.d(TAG, "Quick Settings Tile Clicked");

        // Toggle tile state
        Tile tile = getQsTile();
        if (tile.getState() == Tile.STATE_INACTIVE) {
            tile.setState(Tile.STATE_ACTIVE);
        } else {
            tile.setState(Tile.STATE_INACTIVE);
        }
        tile.updateTile();
    }

    @Override
    public void onTileRemoved() {
        super.onTileRemoved();
        Log.d(TAG, "Quick Settings Tile Removed");
    }
}
