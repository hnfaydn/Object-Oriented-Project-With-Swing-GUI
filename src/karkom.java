public class karkom extends silahlar
{
	static String name;
	static String fiyat;
	static String path;
	karkom()
	{
		name = getAd();
		fiyat = getFiyat();
		path = getPath();
	}

	@Override
	public String getAd() {
		
		return name="Karkom SMG";
	}

	@Override
	public String getFiyat() {
		
		return fiyat="6000";
	}

	@Override
	public String getPath() {
		
		return path="guns/karkom.png";
	}
}