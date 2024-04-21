import android.util.Log;
import java.util.List;

/**
 * Implementation of the FirestoreCallback interface for success and failure handling.
 */
public class FirestoreOperationsHandler implements FirestoreCallback {
	private static final String TAG = "FirestoreOperations";

	/**
	 * Handles successful Firestore operations.
	 * Logs different messages based on the type of result received.
	 *
	 * @param result The result from the Firestore operation, possibly a list of posts.
	 */
	@Override
	public void onSuccess(Object result) {
		// Case if the result is a list of posts.
		if (result instanceof List) {
			List<Post> posts = (List<Post>) result;
			Log.d(TAG, "Fetched " + posts.size() + " posts.");
		}
		// Case if the result isn't a list.
		else {
			Log.d(TAG, "Operation was successful; no list returned.");
		}
	}

	/**
	 * Handles failures in Firestore operations.
	 * Logs the error message to better understand what went wrong.
	 *
	 * @param e The exception thrown during the Firestore operation.
	 */
	@Override
	public void onFailure(Exception e) {
		Log.e(TAG, "Operation failed: " + e.getMessage(), e);
	}
}












