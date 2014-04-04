package services;

import config.GeneralConfigurationManager;
import util.ARPTableManager;
import util.Energy;
import util.ResponseMessage;

import models.ServerModel;

/**
 * Performs operations related to physical servers
 */
public abstract  class ServerService extends Service<ServerModel>{	
	
//	static {
//        String location = GeneralConfigurationManager.getARPTableFileLocation();
//        arpTableManager = new ARPTableManager(location);
//    }
	
	/**
	 * Enables a host from the pool
	 * @param server = the host to be enabled
	 * @return response message from the cloud manager
	 */
	public abstract ResponseMessage enable(ServerModel server);
	
	/**
	 * Disables a host from the pool
	 * @param server = the host to be disabled
	 * @return response message from the cloud manager
	 */
	public abstract ResponseMessage disable(ServerModel server);
	
	
	
	/**
	 * Retrieves the energy consumed by a server
	 * @param server = the host to be monitored
	 * @return energy consumed
	 */
	public abstract Energy getEnergyConsumption(ServerModel server);
	
	
	
}
