package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 
	private String message;
	private String topic;


	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.message = message;
		this.topic = topic;
	}

	// TODO:
	// Implement object variables - a topic and a message is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
	public String getMessage() {
		return this.message;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}
