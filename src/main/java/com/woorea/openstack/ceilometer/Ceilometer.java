package com.woorea.openstack.ceilometer;


import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackClientConnector;
import com.woorea.openstack.ceilometer.v2.api.MetersResource;
import com.woorea.openstack.ceilometer.v2.api.ResourcesResource;
/**
 * This class gets meters and resources.
 * @author Mona
 */
public class Ceilometer extends OpenStackClient {
	
        /**
         * get values for Meters.
         */
	private final MetersResource METERS;
        
	/**
         * get values for Resources.
         */
	private final ResourcesResource RESOURCES;
	
        /**
         * Pass Meters, Resources values into the class.
         * @param endpoint consists of Meters value.
         * @param connector consists of Resources value.
         */
	public Ceilometer(String endpoint, OpenStackClientConnector connector) {
		super(endpoint, connector);
		METERS = new MetersResource(this);
		RESOURCES = new ResourcesResource(this);
	}
	
        /**
         * Pass Meters values in end point.
         * @param endpoint in the class.
         */
	public Ceilometer(String endpoint) {
		this(endpoint, null);
		
	}
	
        /**
         * Get resources values.
         * @return Resources.
         */
	public ResourcesResource resources() {
		return RESOURCES;
	}
	
        /**
         * get Meters values.
         * @return Meters.
         */
	public MetersResource meters() {
		return METERS;
	}
}
