package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubscriptionsFilter;
import io.swagger.model.SubscriptionsLinks;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This type represents a subscription related to notifications about VNF package management. 
 */
@ApiModel(description = "This type represents a subscription related to notifications about VNF package management. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class InlineResponse2002   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("filter")
  private SubscriptionsFilter filter = null;

  @JsonProperty("callbackUri")
  private String callbackUri = null;

  @JsonProperty("_links")
  private SubscriptionsLinks links = null;

  public InlineResponse2002 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * String formatted according to IETF RFC 3986. 
   * @return id
  **/
  @ApiModelProperty(required = true, value = "String formatted according to IETF RFC 3986. ")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2002 filter(SubscriptionsFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SubscriptionsFilter getFilter() {
    return filter;
  }

  public void setFilter(SubscriptionsFilter filter) {
    this.filter = filter;
  }

  public InlineResponse2002 callbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
    return this;
  }

  /**
   * String formatted according to IETF RFC 3986. 
   * @return callbackUri
  **/
  @ApiModelProperty(required = true, value = "String formatted according to IETF RFC 3986. ")
  @NotNull


  public String getCallbackUri() {
    return callbackUri;
  }

  public void setCallbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
  }

  public InlineResponse2002 links(SubscriptionsLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SubscriptionsLinks getLinks() {
    return links;
  }

  public void setLinks(SubscriptionsLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.id, inlineResponse2002.id) &&
        Objects.equals(this.filter, inlineResponse2002.filter) &&
        Objects.equals(this.callbackUri, inlineResponse2002.callbackUri) &&
        Objects.equals(this.links, inlineResponse2002.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, filter, callbackUri, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    callbackUri: ").append(toIndentedString(callbackUri)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

