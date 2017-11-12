package s2.sample.s2comtainer.helloworld;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;;

public class MainCaller {

	public static void main(String[] args) {

		// S2コンテナの初期化
		SingletonS2ContainerFactory.init();

		// IMessageProviderIFを実装したコンポーネントを取得
		IMessageProvider messageProvider = SingletonS2Container.getComponent(IMessageProvider.class);

		// メッセージを出力
		System.out.println(messageProvider.getMessage());

		// S2コンテナの破棄
		SingletonS2ContainerFactory.destroy();

	}

}
