import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Handles the display of post details when a map marker is interacted with.
 */
public class PostDetailsDisplayHandler implements MapInteractionHandler {
    private static final String TAG = "PostDetailsHandler";
    private Context context;

    /**
     * Creates an instance of PostDetailsDisplayHandler.
     *
     * @param context The context used for initiating activities.
     */
    public PostDetailsDisplayHandler(Context context) {
        this.context = context;
    }

    /**
     * Implements MapInteractionHandler's method requirement.
     * @param post Post to interact with.
     */
    @Override
    public boolean handleMapInteraction(Post post) {
        Intent intent = new Intent(context, PostDetailActivity.class); // Assuming PostDetailActivity is created to show post details.
        intent.putExtra("post_id", post.getId());
        context.startActivity(intent);
        Log.d(TAG, "Opening details for post: " + post.getTitle());
        return true;
    }
}

