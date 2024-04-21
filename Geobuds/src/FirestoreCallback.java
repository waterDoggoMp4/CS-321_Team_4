/**
 * Supports modularity by making an interface to handle Firestore operations callbacks.
 */
public interface FirestoreCallback {
	//Success case.
	void onSuccess(Object result); 
	//Failure case. 
	void onFailure(Exception e);
}

