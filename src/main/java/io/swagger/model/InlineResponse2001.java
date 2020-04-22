package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VnfPackagesVnfPkgInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2001
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class InlineResponse2001   {
  @JsonProperty("VnfPkgInfo")
  private VnfPackagesVnfPkgInfo vnfPkgInfo = null;

  public InlineResponse2001 vnfPkgInfo(VnfPackagesVnfPkgInfo vnfPkgInfo) {
    this.vnfPkgInfo = vnfPkgInfo;
    return this;
  
  }

  /**
   * Get vnfPkgInfo
   * @return vnfPkgInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public VnfPackagesVnfPkgInfo getVnfPkgInfo() {
    return vnfPkgInfo;
  }

  public void setVnfPkgInfo(VnfPackagesVnfPkgInfo vnfPkgInfo) {
    this.vnfPkgInfo = vnfPkgInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.vnfPkgInfo, inlineResponse2001.vnfPkgInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vnfPkgInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    vnfPkgInfo: ").append(toIndentedString(vnfPkgInfo)).append("\n");
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

