package dushyant.android.beatbox.models;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dushyant Singh Shekhawat
 * on 25-06-2016.
 */
public class BeatBox {
    private static final String TAG = "BeatBox";

    private static final String SOUNDS_FOLDER = "sample_sounds";

    private AssetManager mAssets;
    private List<Sound> mSounds = new ArrayList<>();

    public BeatBox(Context context) {
        mAssets = context.getAssets();
        loadSounds();
    }

    private void loadSounds() {
        String[] soundNames;
        try {
            soundNames = mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG, "Found " + soundNames.length + " sounds.");
        } catch (IOException e) {
            Log.e(TAG, "Could not list assets.", e);
            return;
        }

        for (String filename :
                soundNames) {
            String assetPath = SOUNDS_FOLDER + "/" + filename;
            mSounds.add(new Sound(assetPath));
        }
    }

    public List<Sound> getSounds() {
        return mSounds;
    }
}
