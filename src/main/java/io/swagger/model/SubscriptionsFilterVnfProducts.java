package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubscriptionsFilterVersions;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionsFilterVnfProducts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class SubscriptionsFilterVnfProducts   {
  @JsonProperty("vnfProductName")
  private String vnfProductName = null;

  @JsonProperty("versions")
  @Valid
  private List<SubscriptionsFilterVersions> versions = null;

  public SubscriptionsFilterVnfProducts vnfProductName(String vnfProductName) {
    this.vnfProductName = vnfProductName;
    return this;
  }

  /**
   * Name of the VNF product to match. 
   * @return vnfProductName
  **/
  @ApiModelProperty(required = true, value = "Name of the VNF product to match. ")
  @NotNull


  public String getVnfProductName() {
    return vnfProductName;
  }

  public void setVnfProductName(String vnfProductName) {
    this.vnfProductName = vnfProductName;
  }

  public SubscriptionsFilterVnfProducts versions(List<SubscriptionsFilterVersions> versions) {
    this.versions = versions;
    return this;
  }

  public SubscriptionsFilterVnfProducts addVersionsItem(SubscriptionsFilterVersions versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<SubscriptionsFilterVersions>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * If present, match VNF packages that contain VNF products with certain versions and a certain product name, from one particular provider. 
   * @return versions
  **/
  @ApiModelProperty(value = "If present, match VNF packages that contain VNF products with certain versions and a certain product name, from one particular provider. ")

  @Valid

  public List<SubscriptionsFilterVersions> getVersions() {
    return versions;
  }

  public void setVersions(List<SubscriptionsFilterVersions> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionsFilterVnfProducts subscriptionsFilterVnfProducts = (SubscriptionsFilterVnfProducts) o;
    return Objects.equals(this.vnfProductName, subscriptionsFilterVnfProducts.vnfProductName) &&
        Objects.equals(this.versions, subscriptionsFilterVnfProducts.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vnfProductName, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionsFilterVnfProducts {\n");
    
    sb.append("    vnfProductName: ").append(toIndentedString(vnfProductName)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

