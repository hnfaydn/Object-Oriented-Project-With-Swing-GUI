public class twm extends silahlar
{
	static String name;
	static String fiyat;
	static String path;
	twm()
	{
		name = getAd();
		fiyat = getFiyat();
		path = getPath();
	}

	@Override
	public String getAd() {
		
		return name="TWM X308";
	}

	@Override
	public String getFiyat() {
		
		return fiyat="6000";
	}

	@Override
	public String getPath() {
		
		return path="guns/twm.png";
	}
}