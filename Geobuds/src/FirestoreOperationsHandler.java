/**
 * Implementation of the FirestoreCallback interface for success and failure handling.
 */
public class FirestoreOperationsHandler implements FirestoreCallback {

	/**
	 * Firestore operation success handler.
	 */
	@Override
	public void onSuccess(Object result) {
		// Case if the result is a list of posts.
		if (result instanceof List) {
			List<Post> posts = (List<Post>) result;
			System.out.println("Fetched " + posts.size() + " posts.");
		}

		// Case if the result isn't a list.
		else {
			System.out.println("Operation was successful.");
		}
	}

	/**
	 * Exeception handler for failure and logs the error.
	 */
	@Override
	public void onFailure(Exception e) {
		// Error Log
		System.err.println("Operation failed: " + e.getMessage());
	}
}

