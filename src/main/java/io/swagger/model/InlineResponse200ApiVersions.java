package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200ApiVersions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class InlineResponse200ApiVersions   {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("isDeprecated")
  private Boolean isDeprecated = null;

  @JsonProperty("retirementDate")
  private Object retirementDate = null;

  public InlineResponse200ApiVersions version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Identifies a supported version. The value of the version attribute shall be a version identifier as specified in clause 4.6.1. 
   * @return version
  **/
  @ApiModelProperty(required = true, value = "Identifies a supported version. The value of the version attribute shall be a version identifier as specified in clause 4.6.1. ")
  @NotNull


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public InlineResponse200ApiVersions isDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
    return this;
  }

  /**
   * The Boolean is a data type having two values (TRUE and FALSE). 
   * @return isDeprecated
  **/
  @ApiModelProperty(value = "The Boolean is a data type having two values (TRUE and FALSE). ")


  public Boolean isIsDeprecated() {
    return isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public InlineResponse200ApiVersions retirementDate(Object retirementDate) {
    this.retirementDate = retirementDate;
    return this;
  }

  /**
   * Date-time stamp. Representation: String formatted according toas defined by the date-time production in IETF RFC 3339. 
   * @return retirementDate
  **/
  @ApiModelProperty(value = "Date-time stamp. Representation: String formatted according toas defined by the date-time production in IETF RFC 3339. ")


  public Object getRetirementDate() {
    return retirementDate;
  }

  public void setRetirementDate(Object retirementDate) {
    this.retirementDate = retirementDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200ApiVersions inlineResponse200ApiVersions = (InlineResponse200ApiVersions) o;
    return Objects.equals(this.version, inlineResponse200ApiVersions.version) &&
        Objects.equals(this.isDeprecated, inlineResponse200ApiVersions.isDeprecated) &&
        Objects.equals(this.retirementDate, inlineResponse200ApiVersions.retirementDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, isDeprecated, retirementDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ApiVersions {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    isDeprecated: ").append(toIndentedString(isDeprecated)).append("\n");
    sb.append("    retirementDate: ").append(toIndentedString(retirementDate)).append("\n");
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

