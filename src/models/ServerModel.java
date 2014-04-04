package models;

public class ServerModel extends CloudModel {
	
	private String macAddress;
	
	public ServerModel(int id, String ipAddress) {
		super(id, ipAddress);
	}	

	/**
	 * @param id
	 * @param name
	 * @param macAddress
	 */
	public ServerModel(int id, String name, String macAddress) {
		super(id, name);
		this.macAddress = macAddress;
	}

	/**
	 * @return the macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress the macAddress to set
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
}
