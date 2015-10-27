package com.countries.json.action;

import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.countries.json.entity.Country;
import com.countries.json.service.CountryService;

/**
 * A resource class to expose the restful APIS
 * @author re
 *
 */
@Path("/countries")
public class CountryResource {
	
	private CountryService countryService;
	public CountryResource() {
		countryService = new CountryService();
	}

	@GET
	@Path("/islands")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Country> getIslands() {
       return countryService.getIslands() ;
     //  return Response.ok(new Viewable("/Countries that are islands", countryService.getIslands())).build();
	}
    	
	@GET
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Country> getCountriesByRegion(@PathParam("param") String regionName) {
		return countryService.getCountriesByRegion(regionName);
	}
	
	@GET
	@Path("/mostBordingCountries")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Country> mostBordingCountries() {
		return countryService.mostBordingCountries();
	}
	
	@GET
	@Path("mostBordingCountries/borders")
	@Produces({MediaType.APPLICATION_JSON})
	public Map<String, List<Country>> borders() {
		return countryService.borders();
	}
	
	@GET
	@Path("all")
	@Produces({MediaType.APPLICATION_JSON})
	public Country[] allCountries() {
		return countryService.getCountries();
	}
	
}
