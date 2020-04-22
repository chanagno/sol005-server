package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubscriptionsAuthentication;
import io.swagger.model.SubscriptionsFilter;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This type represents a subscription request related to VNF package management  notifications about VNF package on boarding or changes. 
 */
@ApiModel(description = "This type represents a subscription request related to VNF package management  notifications about VNF package on boarding or changes. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class Body4   {
  @JsonProperty("filter")
  private SubscriptionsFilter filter = null;

  @JsonProperty("callbackUri")
  private String callbackUri = null;

  @JsonProperty("authentication")
  private SubscriptionsAuthentication authentication = null;

  public Body4 filter(SubscriptionsFilter filter) {
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

  public Body4 callbackUri(String callbackUri) {
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

  public Body4 authentication(SubscriptionsAuthentication authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * Get authentication
   * @return authentication
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SubscriptionsAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(SubscriptionsAuthentication authentication) {
    this.authentication = authentication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body4 body4 = (Body4) o;
    return Objects.equals(this.filter, body4.filter) &&
        Objects.equals(this.callbackUri, body4.callbackUri) &&
        Objects.equals(this.authentication, body4.authentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, callbackUri, authentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body4 {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    callbackUri: ").append(toIndentedString(callbackUri)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
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

