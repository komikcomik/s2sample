package s2.sample.s2comtainer.helloworld;

/**
 * Seasar2徹底入門の2.1.2あたりの勉強
 * @author komikcomik
 *
 */
public interface IMessageProvider {

	public void setMessageTarget2(IMessageTarget messageTarget);
	public String getMessage();

}
