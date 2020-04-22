package io.swagger.model;
//import io.swagger.model.VnfPackagesVnfPkgInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.model.InlineResponse2001;
import java.util.ArrayList;

public class ListInlineResponse2001{
	
	@JsonProperty("InlineResponse")
	private ArrayList<InlineResponse2001> inlineresponse;
	
	public ListInlineResponse2001() {}
	
}
