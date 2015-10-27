package com.countries.json;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.countries.json.action.CountryResource;

/**
 * A class that allows a Jackson features
 * this class is simple a mapper from json to java class and vice versa
 * @author Rahel Ephrem
 *
 */
public class JsonApplication extends ResourceConfig {
	
	public JsonApplication(){
		super(
				CountryResource.class,
				JacksonFeature.class
				);
	}

}
