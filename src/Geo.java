public class Geo {

	private double latitude;
	private double longitude;

	public Geo(double latitude, double longitude){
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude(){
		return latitude;
	}
	public double getLongitude(){
		return longitude;
	}

	@Override
	public java.lang.String toString() {
		return "Geo{" + "latitude=" + latitude + ", longitude=" + longitude + '}';
	}

//	public java.lang.String toString(){
//
//		return "{"+ getLatitude() ":"+ getLongitude() + "}";
//	}
}
