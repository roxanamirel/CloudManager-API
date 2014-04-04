package services;


import util.ResponseType;

import models.ImageModel;

/**
 * Performs operations related to virtual machine images
 */
public abstract class ImageService extends Service<ImageModel>{
	
	/**
	 * Checks if an image exists in the pool
	 * @param imageName = the name of the image
	 * @return true if the images is found, false otherwise
	 */
	public abstract boolean contains(String imageName);
	
	/**
	 * Allocates a new Image in the pool
	 * @param description = the description of the Image
	 * @param dataStoreId = id of the datastore that will store the image
	 * @return response message from the cloud manager
	 */
	public abstract ResponseType allocate(String description, int dataStoreId); 
}
