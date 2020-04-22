package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200ApiVersions;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This type represents API version information. 
 */
@ApiModel(description = "This type represents API version information. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class InlineResponse200   {
  @JsonProperty("uriPrefix")
  private String uriPrefix = null;

  @JsonProperty("apiVersions")
  @Valid
  private List<InlineResponse200ApiVersions> apiVersions = new ArrayList<InlineResponse200ApiVersions>();

  public InlineResponse200 uriPrefix(String uriPrefix) {
    this.uriPrefix = uriPrefix;
    return this;
  }

  /**
   * Specifies the URI prefix for the API, in the following form {apiRoot}/{apiName}/{apiMajorVersion}/. 
   * @return uriPrefix
  **/
  @ApiModelProperty(required = true, value = "Specifies the URI prefix for the API, in the following form {apiRoot}/{apiName}/{apiMajorVersion}/. ")
  @NotNull


  public String getUriPrefix() {
    return uriPrefix;
  }

  public void setUriPrefix(String uriPrefix) {
    this.uriPrefix = uriPrefix;
  }

  public InlineResponse200 apiVersions(List<InlineResponse200ApiVersions> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  public InlineResponse200 addApiVersionsItem(InlineResponse200ApiVersions apiVersionsItem) {
    this.apiVersions.add(apiVersionsItem);
    return this;
  }

  /**
   * Version(s) supported for the API signalled by the uriPrefix attribute. 
   * @return apiVersions
  **/
  @ApiModelProperty(required = true, value = "Version(s) supported for the API signalled by the uriPrefix attribute. ")
  @NotNull

  @Valid

  public List<InlineResponse200ApiVersions> getApiVersions() {
    return apiVersions;
  }

  public void setApiVersions(List<InlineResponse200ApiVersions> apiVersions) {
    this.apiVersions = apiVersions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.uriPrefix, inlineResponse200.uriPrefix) &&
        Objects.equals(this.apiVersions, inlineResponse200.apiVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uriPrefix, apiVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    uriPrefix: ").append(toIndentedString(uriPrefix)).append("\n");
    sb.append("    apiVersions: ").append(toIndentedString(apiVersions)).append("\n");
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

