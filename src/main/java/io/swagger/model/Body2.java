package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VnfPackagesvnfPkgIdextArtifactsAccessArtifact;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This type represents the access configuration information for downloading external VNF package artifacts. The NFVO can obtain the external VNF package artifact file through the information provided in this structure, together with information provided in the manifest / VNFD. The data structure shall comply with the provisions defined in Table 9.5.2.10-1. If the data structure is part of a response body, security-sensitive attributes shall be excluded as specified in Table 9.5.2.10-1. 
 */
@ApiModel(description = "This type represents the access configuration information for downloading external VNF package artifacts. The NFVO can obtain the external VNF package artifact file through the information provided in this structure, together with information provided in the manifest / VNFD. The data structure shall comply with the provisions defined in Table 9.5.2.10-1. If the data structure is part of a response body, security-sensitive attributes shall be excluded as specified in Table 9.5.2.10-1. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class Body2   {
  @JsonProperty("artifact")
  private VnfPackagesvnfPkgIdextArtifactsAccessArtifact artifact = null;

  public Body2 artifact(VnfPackagesvnfPkgIdextArtifactsAccessArtifact artifact) {
    this.artifact = artifact;
    return this;
  }

  /**
   * Get artifact
   * @return artifact
  **/
  @ApiModelProperty(value = "")

  @Valid

  public VnfPackagesvnfPkgIdextArtifactsAccessArtifact getArtifact() {
    return artifact;
  }

  public void setArtifact(VnfPackagesvnfPkgIdextArtifactsAccessArtifact artifact) {
    this.artifact = artifact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body2 body2 = (Body2) o;
    return Objects.equals(this.artifact, body2.artifact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body2 {\n");
    
    sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
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

