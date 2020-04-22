package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * This type represents a link to a resource. 
 */
@ApiModel(description = "This type represents a link to a resource. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")
@Entity
@Table(name="VnfPackagesVnfPkgInfoLinksSelf")
public class VnfPackagesVnfPkgInfoLinksSelf   {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
  
  @Column
  @JsonProperty("href")
  private String href = null;

  @OneToOne(mappedBy="vnfd")
 private VnfPackagesVnfPkgInfoLinks links=null;
  
  public VnfPackagesVnfPkgInfoLinksSelf href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URI of a resource referenced from a notification. Should be an absolute URI (i.e. a URI that contains {apiRoot}), however, may be a relative URI (i.e. a URI where the {apiRoot} part is omitted) if the {apiRoot} information is not available. 
   * @return href
  **/
  @ApiModelProperty(required = true, value = "URI of a resource referenced from a notification. Should be an absolute URI (i.e. a URI that contains {apiRoot}), however, may be a relative URI (i.e. a URI where the {apiRoot} part is omitted) if the {apiRoot} information is not available. ")
  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnfPackagesVnfPkgInfoLinksSelf vnfPackagesVnfPkgInfoLinksSelf = (VnfPackagesVnfPkgInfoLinksSelf) o;
    return Objects.equals(this.href, vnfPackagesVnfPkgInfoLinksSelf.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VnfPackagesVnfPkgInfoLinksSelf {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
  @JsonIgnore
  public VnfPackagesVnfPkgInfoLinks getlinks() {
	  return links;
  }
  @JsonIgnore
  public void  setlinks(VnfPackagesVnfPkgInfoLinks link) {
	  this.links=link;
  }
}

