
public class fararm extends silahlar
{

	static String name;
	static String fiyat;
	static String path;
	fararm()
	{
		name = getAd();
		fiyat = getFiyat();
		path = getPath();
	}
	@Override
	public String getAd() {
		
		return name="Fararm ATF12";
	}

	@Override
	public String getFiyat() {
		
		return fiyat="6000";
	}

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return path="guns/fararm.png";
	}
}