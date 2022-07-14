package mod11;

import java.io.Serializable;

public class Message implements Serializable {

	static final long serialVersionUID = 1L;

	private String message;
	private transient String password;

	public Message() {

	}

	public Message(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message: " + this.message;
	}

}
