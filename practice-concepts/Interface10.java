// Program to practice the concept of interface in java 
// Real world implementation of interface
public class Interface10{
	public static void main(String[] args){
		Phone redmi = new Phone();
		redmi.storageApp();
		redmi.networkApp();
		redmi.cameraApp();
	}
}
interface Network{
	void getSIMInfo();
	void connectNet();
}
interface Camera{
	void capture();
	void record();
}
interface Storage{
	void cleanJunk();
	void getStorageInfo();
}
interface Drivers extends Camera,Storage,Network{
	default void configNetDriver(){
		System.out.println("Configuring the network drivers");
	}
	default void configCam1(){
		System.out.println("Configuring the camera drivers");
	}
	default void configPSD1(){
		System.out.println("Configuring the storage drivers");
	}
}
interface Software extends Drivers{
	void cameraApp();
	void networkApp();
	void storageApp();
}
class Phone implements Software{
	public void getSIMInfo(){
		System.out.println("Getting SIM information");
	}
	public void connectNet(){
		System.out.println("Connecting to the network");
	}
	public void capture(){
		System.out.println("Capturing with Cam 1");
	}
	public void record(){
		System.out.println("Recording started");
	}
	public void cleanJunk(){
		System.out.println("Cleaning the junk files");
	}
	public void getStorageInfo(){
		System.out.println("Displaying primary storage information");
	}
	public void cameraApp(){
		configCam1();
		capture();
		record();
	}
	public void networkApp(){
		configNetDriver();
		getSIMInfo();
		connectNet();
	}
	public void storageApp(){
		configPSD1();
		cleanJunk();
		getStorageInfo();
	}
}