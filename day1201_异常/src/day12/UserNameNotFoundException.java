package day12;

/*
 * �û����������쳣
 */
public class UserNameNotFoundException extends Exception {

	public UserNameNotFoundException() {
		super();

	}

	public UserNameNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public UserNameNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public UserNameNotFoundException(String message) {
		super(message);

	}

	public UserNameNotFoundException(Throwable cause) {
		super(cause);

	}

}
