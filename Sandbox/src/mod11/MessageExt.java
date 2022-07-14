package mod11;

import java.io.*;

public class MessageExt implements Externalizable {

	static final long serialVersionUID = 1L;

	private String message;
	private transient String password;

	public MessageExt() {

	}

	public MessageExt(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message: " + this.message;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// write the message
		out.writeUTF(this.message);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// read the message
		this.message = in.readUTF();

	}

}
