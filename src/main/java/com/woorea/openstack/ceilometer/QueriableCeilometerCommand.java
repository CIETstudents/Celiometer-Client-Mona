package com.woorea.openstack.ceilometer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.woorea.openstack.base.client.OpenStackRequest;
/**
 * This class is use to check client fields and values.
 * @author Mona.
 * @param <T>
 * @param <R> 
 */
public abstract class QueriableCeilometerCommand<T,R> extends OpenStackRequest<R> {
	
        /**
         * Get client field in array list.
         */
	protected List<String> fields = new ArrayList<String>();
	
        /**
         * Get client options in array list.
         */
	protected List<String> ops = new ArrayList<String>();
	
        /**
         * Get client values in array list.
         */
	protected List<Serializable> values = new ArrayList<Serializable>();
	
        /**
         * Pass field,option, values.
         * @param field add each field of client.
         * @param op add option for client.
         * @param value add values for client.
         * @return field,option,values.
         */
	private T filter(String field, String op, Serializable value) {
		fields.add(field);
		ops.add(op);
		values.add(value);
		return (T) this;
	}
	
        /**
         * Checks for whether client field is less than client value.
         * @param field in String.
         * @param value using Serializable.
         * @return true or false.
         */
	public T lt(String field, Serializable value) {
		return filter(field, "lt", value);
	}
	
        /**
         * Checks for whether client field is less than or equal to client value.
         * @param field in String.
         * @param value using Serializable.
         * @return true or false.
         */
	public T le(String field, Serializable value) {
		return filter(field, "le", value);
	}
	
        /**
         * Checks for whether client field equals client value.
         * @param field in String.
         * @param value using Serializable.
         * @return true or false..
         */
	public T eq(String field, Serializable value) {
		return filter(field, "eq", value);
	}
	
        /**
         * Checks for whether client field not equal to client value.
         * @param field in String.
         * @param value using Serializable.
         * @return true or false.
         */
	
	public T ne(String field, Serializable value) {
		return filter(field, "ne", value);
	}
	
        /**
         * Checks for whether client field greater than or equal to client value.
         * @param field in String.
         * @param value using Serializable.
         * @return true or false.
         */
	public T ge(String field, Serializable value) {
		return filter(field, "ge", value);
	}
	
        /**
         * Checks for whether client field greater than or equal to client value.
         * @param field in String.
         * @param value using Serializable.
         * @return true or false.
         */
	public T gt(String field, Serializable value) {
		return filter(field, "gt", value);
	}

	/*
	public WebTarget query(WebTarget target) {
		if(fields.size() > 0) {
			target = target.queryParam("q.field", fields.toArray());
			target = target.queryParam("q.op", ops.toArray());
			target = target.queryParam("q.value", values.toArray());
		}
		return target;
	}
	*/
}
