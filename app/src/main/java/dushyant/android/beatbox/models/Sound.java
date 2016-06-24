package dushyant.android.beatbox.models;

/**
 * Created by Dushyant Singh Shekhawat
 * on 25-06-2016.
 */
public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String name = components[components.length - 1];
        mName = name.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
