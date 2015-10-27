package com.countries.json.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * a pojo class to map json object to java object
 * the json object is given at restcountries.eu.
 * @author Rahel Ephrem
 * @version 1.0
 */
public class Country {
	String name;
	String capital;
	private List<String> altSpellings = new ArrayList<String>();
	String relevance;
	String region;
	String subregion;
	Translations translations;
	int population;
	double[] latlng = new double[2];
	String demonym;
	int area;
	double gini;
	List<String> timezones = new ArrayList<String>();;
	List<String> borders = new ArrayList<String>();;
	String nativeName;
	List<String> callingCodes = new ArrayList<String>();;
	List<String> topLevelDomain = new ArrayList<String>();;
	String alpha2Code;
	String alpha3Code;
	List<String> currencies = new ArrayList<String>();;
	List<String> languages = new ArrayList<String>();;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public List<String> getAltSpellings() {
		return altSpellings;
	}
	public void setAltSpellings(List<String> altSpellings) {
		this.altSpellings = altSpellings;
	}
	public String getRelevance() {
		return relevance;
	}
	public void setRelevance(String relevance) {
		this.relevance = relevance;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSubregion() {
		return subregion;
	}
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	public Translations getTranslations() {
		return translations;
	}
	public void setTranslations(Translations translations) {
		this.translations = translations;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public double[] getLatlng() {
		return latlng;
	}
	public void setLatlng(double[] latlng) {
		this.latlng = latlng;
	}
	public String getDemonym() {
		return demonym;
	}
	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public List<String> getTimezones() {
		return timezones;
	}
	public void setTimezones(List<String> timezones) {
		this.timezones = timezones;
	}
	public List<String> getBorders() {
		return borders;
	}
	public void setBorders(List<String> borders) {
		this.borders = borders;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}
	public List<String> getCallingCodes() {
		return callingCodes;
	}
	public void setCallingCodes(List<String> callingCodes) {
		this.callingCodes = callingCodes;
	}
	public List<String> getTopLevelDomain() {
		return topLevelDomain;
	}
	public void setTopLevelDomain(List<String> topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
	}
	public String getAlpha2Code() {
		return alpha2Code;
	}
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}
	public String getAlpha3Code() {
		return alpha3Code;
	}
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}
	public List<String> getCurrencies() {
		return currencies;
	}
	public void setCurrencies(List<String> currencies) {
		this.currencies = currencies;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public double getGini() {
		return gini;
	}
	public void setGini(double gini) {
		this.gini = gini;
	}
}
