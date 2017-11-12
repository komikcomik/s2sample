package s2.sample.s2comtainer.helloworld;

public class HelloMessageProvider implements IMessageProvider {

	private IMessageTarget messageTarget2;

	@Override
	public void setMessageTarget2(IMessageTarget messageTarget) {
		this.messageTarget2 = messageTarget;

	}

	@Override
	public String getMessage() {
		return "Hello, " + messageTarget2.getName() + "!";
	}
}
