package com.woorea.openstack.ceilometer.v2.api;

import java.util.List;

import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.ceilometer.QueriableCeilometerCommand;
import com.woorea.openstack.ceilometer.v2.model.Resource;
/**
 * This class hold client identity.
 * @author Mona.
 */
public class ResourcesResource {
    
	/**
         * Enter client name using access specifier.
         */
	private final OpenStackClient CLIENT;

        /**
         * Pass client name in ResourcesResource.
         * @param client in the class.
         */
	public ResourcesResource(OpenStackClient client) {
		CLIENT = client;
	}

        /**
         * ResourceList extends another class.
         */
	public class ResourceList extends QueriableCeilometerCommand<ResourceList, List<Resource>> {
	
                /**
                 * List sends request to OpenStack.
                 */
		public ResourceList() {
			OpenStackRequest request = new OpenStackRequest();
			//return query(target.path("resources")).request(MediaType.APPLICATION_JSON).get(new GenericType<List<Resource>>() {});
		}
	}
	
        /**
         * Resource shows client list requested for OpenStack.
         */
	public class ResourceShow extends OpenStackRequest<Void> {
                
                /**
                 * Get client Identity.
                 */
		private String id;
                
                /**
                 * Shows client identity.
                 * @param id identity for client.
                 * @return id.
                 */
		public ResourceShow id(String id) {
			this.id = id;
			return this;
		}
		
                /**
                 * Shows client list.
                 * @param client. 
                 */
		public ResourceShow(OpenStackClient client) {
//			if(id == null) {
//				throw new UnsupportedOperationException("resource id is mandatory");
//			}
//			return target.path("resources").path(id).request(MediaType.APPLICATION_JSON).get(Resource.class);
		}

	}

}
