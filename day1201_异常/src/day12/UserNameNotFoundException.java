package day12;

/*
 * 用户名不存在异常
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
