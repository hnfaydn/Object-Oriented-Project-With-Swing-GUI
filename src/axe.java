public class axe extends silahlar
{
	static String name;
	static String fiyat;
	static String path;
	axe()
	{
		name = getAd();
		fiyat = getFiyat();
		path = getPath();
	}

	@Override
	public String getAd() {
		
		return name="Tactical Axe";
	}

	@Override
	public String getFiyat() {
		
		return fiyat="1000";
	}

	@Override
	public String getPath() {
		
		return path="guns/axe.png";
	}
	
}