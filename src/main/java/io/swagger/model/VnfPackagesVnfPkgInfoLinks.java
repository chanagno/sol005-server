package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VnfPackagesVnfPkgInfoLinksSelf;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Links to resources related to this resource. 
 */
@ApiModel(description = "Links to resources related to this resource. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")
@Entity
@Table(name="VnfPackagesVnfPkgInfoLinks")
public class VnfPackagesVnfPkgInfoLinks   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@OneToOne
	@JoinColumn(name="self")
	@JsonProperty("self")
  private VnfPackagesVnfPkgInfoLinksSelf self = null;
  
  @OneToOne
  @JoinColumn(name="vnfd")
  @JsonProperty("vnfd")
  private VnfPackagesVnfPkgInfoLinksSelf vnfd = null;

  @OneToOne
  @JoinColumn(name="packageContent")
  @JsonProperty("packageContent")
  private VnfPackagesVnfPkgInfoLinksSelf packageContent = null;

  public VnfPackagesVnfPkgInfoLinks self(VnfPackagesVnfPkgInfoLinksSelf self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VnfPackagesVnfPkgInfoLinksSelf getSelf() {
    return self;
  }

  public void setSelf(VnfPackagesVnfPkgInfoLinksSelf self) {
    this.self = self;
  }

  public VnfPackagesVnfPkgInfoLinks vnfd(VnfPackagesVnfPkgInfoLinksSelf vnfd) {
    this.vnfd = vnfd;
    return this;
  }

  /**
   * Get vnfd
   * @return vnfd
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VnfPackagesVnfPkgInfoLinksSelf getVnfd() {
    return vnfd;
  }

  public void setVnfd(VnfPackagesVnfPkgInfoLinksSelf vnfd) {
    this.vnfd = vnfd;
  }

  public VnfPackagesVnfPkgInfoLinks packageContent(VnfPackagesVnfPkgInfoLinksSelf packageContent) {
    this.packageContent = packageContent;
    return this;
  }

  /**
   * Get packageContent
   * @return packageContent
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VnfPackagesVnfPkgInfoLinksSelf getPackageContent() {
    return packageContent;
  }

  public void setPackageContent(VnfPackagesVnfPkgInfoLinksSelf packageContent) {
    this.packageContent = packageContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnfPackagesVnfPkgInfoLinks vnfPackagesVnfPkgInfoLinks = (VnfPackagesVnfPkgInfoLinks) o;
    return Objects.equals(this.self, vnfPackagesVnfPkgInfoLinks.self) &&
        Objects.equals(this.vnfd, vnfPackagesVnfPkgInfoLinks.vnfd) &&
        Objects.equals(this.packageContent, vnfPackagesVnfPkgInfoLinks.packageContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, vnfd, packageContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VnfPackagesVnfPkgInfoLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    vnfd: ").append(toIndentedString(vnfd)).append("\n");
    sb.append("    packageContent: ").append(toIndentedString(packageContent)).append("\n");
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

