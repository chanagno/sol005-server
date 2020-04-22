package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionsFilterVersions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class SubscriptionsFilterVersions   {
  @JsonProperty("vnfSoftwareVersion")
  private String vnfSoftwareVersion = null;

  @JsonProperty("vnfdVersions")
  @Valid
  private List<String> vnfdVersions = null;

  public SubscriptionsFilterVersions vnfSoftwareVersion(String vnfSoftwareVersion) {
    this.vnfSoftwareVersion = vnfSoftwareVersion;
    return this;
  }

  /**
   * A Version. Representation: string of variable length. 
   * @return vnfSoftwareVersion
  **/
  @ApiModelProperty(required = true, value = "A Version. Representation: string of variable length. ")
  @NotNull


  public String getVnfSoftwareVersion() {
    return vnfSoftwareVersion;
  }

  public void setVnfSoftwareVersion(String vnfSoftwareVersion) {
    this.vnfSoftwareVersion = vnfSoftwareVersion;
  }

  public SubscriptionsFilterVersions vnfdVersions(List<String> vnfdVersions) {
    this.vnfdVersions = vnfdVersions;
    return this;
  }

  public SubscriptionsFilterVersions addVnfdVersionsItem(String vnfdVersionsItem) {
    if (this.vnfdVersions == null) {
      this.vnfdVersions = new ArrayList<String>();
    }
    this.vnfdVersions.add(vnfdVersionsItem);
    return this;
  }

  /**
   * If present, match VNF packages that contain VNF products with certain VNFD versions, a certain software version and a certain product name, from one particular provider. 
   * @return vnfdVersions
  **/
  @ApiModelProperty(value = "If present, match VNF packages that contain VNF products with certain VNFD versions, a certain software version and a certain product name, from one particular provider. ")


  public List<String> getVnfdVersions() {
    return vnfdVersions;
  }

  public void setVnfdVersions(List<String> vnfdVersions) {
    this.vnfdVersions = vnfdVersions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionsFilterVersions subscriptionsFilterVersions = (SubscriptionsFilterVersions) o;
    return Objects.equals(this.vnfSoftwareVersion, subscriptionsFilterVersions.vnfSoftwareVersion) &&
        Objects.equals(this.vnfdVersions, subscriptionsFilterVersions.vnfdVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vnfSoftwareVersion, vnfdVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionsFilterVersions {\n");
    
    sb.append("    vnfSoftwareVersion: ").append(toIndentedString(vnfSoftwareVersion)).append("\n");
    sb.append("    vnfdVersions: ").append(toIndentedString(vnfdVersions)).append("\n");
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

