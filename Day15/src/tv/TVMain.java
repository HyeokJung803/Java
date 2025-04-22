package tv;

public class TVMain {
	public static void main(String[] args) {
		IPTelevision iptv = new IPTelevision("LG");
		
		System.out.println("모델 : " + iptv.model);
		
		iptv.powerOn();
		iptv.changeChannel(5);
		
		iptv.settopBoxOn();
		iptv.changeContents("영화");
	}
}
