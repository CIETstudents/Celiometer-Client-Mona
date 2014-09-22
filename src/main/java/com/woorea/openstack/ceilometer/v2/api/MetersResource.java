package com.woorea.openstack.ceilometer.v2.api;


import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.ceilometer.QueriableCeilometerCommand;
import com.woorea.openstack.ceilometer.v2.model.Sample;
/**
 * This class consists of Statistics and List values to be used in Ceilometer.
 * @author Mona
 */
public class MetersResource {
    
	/**
         * Enter the client name.
         */
	private final OpenStackClient CLIENT;
        
        /**
         * Pass client name in MetersResource.
         * @param client in the class.
         */
	
	public MetersResource(OpenStackClient client) {
		CLIENT = client;
	}
	
        /**
         * This class consists of List of clients. 
         * @return list.
         */
	public List list() {
		return new List();
	}
        
	/**
         * This class shows client list.
         * @return Show.
         */
	public Show show() {
		return new Show();
	}
	
        /**
         * Statistics about Client.
         * @return Statistics.
         */
	public Statistics statistics() {
		return new Statistics();
	}
	
        /**
         * class extends another class QueriableCeilometer.
         */
	public class List extends QueriableCeilometerCommand<List, java.util.List<Sample>> {
		public List() {
			//return query(target.path("meters")).request(MediaType.APPLICATION_JSON).get(new GenericType<List<Meter>>() {});
		}
	}
        
	/**
         * class extends another class QueriableCeilometer.
         */
	public class Show extends QueriableCeilometerCommand<Show, java.util.List<Sample>> {
        
                /**
                 * Return String name using private variable.
                 */
		private String name;
                
                /**
                 * Shows client name.
                 * @param name
                 * @return name.
                 */
		public Show name(String name) {
			this.name = name;
			return this;
		}
		
                /**
                 * Show client names list.
                 */
		public Show() {
//			if(name == null) {
//				throw new UnsupportedOperationException("meter id is mandatory");
//			}
//			return query(target.path("meters").path(name)).request(MediaType.APPLICATION_JSON).get(new GenericType<List<Sample>>() {});
		}

	}

	public class Statistics extends QueriableCeilometerCommand<Statistics, java.util.List<Statistics>> {

		private String name;
			
		public Statistics name(String name) {
			this.name = name;
			return this;
		}
		
		public Statistics() {
//			if(name == null) {
//				throw new UnsupportedOperationException("meter id is mandatory");
//			}
//			return query(target.path("meters").path(name).path("statistics")).request(MediaType.APPLICATION_JSON).get(new GenericType<List<Statistics>>(){});
		}

	}

}
