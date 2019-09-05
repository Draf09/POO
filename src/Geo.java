public class Geo {

	private double latitude;
	private double longitude;

	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public static double distancia(Geo pos1, Geo pos2) {

		double lat1 = Math.toRadians( pos1.getLatitude() );
		double lat2 = Math.toRadians( pos2.getLatitude() );
		double lon1 = Math.toRadians( pos1.getLongitude() );
		double lon2 = Math.toRadians( pos2.getLongitude() );

		double diflat = (lat1 - lat2) / 2;
		double diflon = (lon1 - lat2) / 2;

		double d = Math.pow( Math.sin( diflat ), 2 ) +
				Math.pow( Math.sin( diflon ), 2 ) *
						Math.cos( lat1 ) * Math.cos( lat2 ) ;


		d = 2 * 6371 * Math.sin( Math.sqrt( d ) );
		return Math.round( d );
	}

	@Override
	public java.lang.String toString() {
		return "Geo{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
	}
}