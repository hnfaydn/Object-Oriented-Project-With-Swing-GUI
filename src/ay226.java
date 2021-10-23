public class ay226 extends silahlar
{
	static String name;
	static String fiyat;
	static String path;
	ay226()
	{
		name = getAd();
		fiyat = getFiyat();
		path = getPath();
	}
	
	@Override
	public String getAd() {
		
		return name="Ay226";
	}

	@Override
	public String getFiyat() {
		
		return fiyat="3000";
	}

	@Override
	public String getPath() {
		
		return path="guns/ay226.png";
	}
}