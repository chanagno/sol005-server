package io.swagger.model;


import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VnfPackagesVnfPkgInfoChecksum;

import org.apache.tomcat.jni.File;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This type represents an artifact other than a software image which is contained in a VNF package.  It shall comply with provisions defined in Table 9.5.3.3-1. 
 */
@ApiModel(description = "This type represents an artifact other than a software image which is contained in a VNF package.  It shall comply with provisions defined in Table 9.5.3.3-1. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")
@Entity
public class VnfPackagesVnfPkgInfoAdditionalArtifacts   {
	@javax.persistence.Id
	@GeneratedValue
	Long Id;
	
	@Column
	@JsonProperty("artifactPath")
  private String artifactPath = null;

  @Column
  @JsonProperty("artifactURI")
  private String artifactURI = null;

  @OneToOne
  @JoinColumn(name="checksum_addart")
  @JsonProperty("checksum")
  private VnfPackagesVnfPkgInfoChecksum checksum = null;

  /*@ManyToOne
  @JoinColumn(name="vnfinfolist")
  @JsonIgnore
  
  private VnfPackagesVnfPkgInfo vnfinfolist;
  /**
   * Marks specific types of artifacts as defined in the VNF package. If none of the specific classes listed below applies, the attribute shall not be present. Valid values: - HISTORY: a history artifact as per clause 4.3.3 in ETSI GS NFV-SOL 004 [5] - TESTING: a testing artifact as per clause 4.3.4 in ETSI GS NFV-SOL 004 [5] - LICENSE: a license artifact as per clause 4.3.5 in ETSI GS NFV-SOL 004 [5] 
   */
  public enum ArtifactClassificationEnum {
    HISTORY("HISTORY"),
    
    TESTING("TESTING"),
    
    LICENSE("LICENSE");

    private String value;

    ArtifactClassificationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArtifactClassificationEnum fromValue(String text) {
      for (ArtifactClassificationEnum b : ArtifactClassificationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("artifactClassification")
  private ArtifactClassificationEnum artifactClassification = null;

  @JsonProperty("isEncrypted")
  private Boolean isEncrypted = null;

  @JsonProperty("nonManoArtifactSetId")
  private String nonManoArtifactSetId = null;

  @JsonProperty("metadata")
  private String metadata = null;
   
  public VnfPackagesVnfPkgInfoAdditionalArtifacts artifactPath(String artifactPath) {
    this.artifactPath = artifactPath;
    return this;
  }

  /**
   * A string as defined in IETF RFC 8259. 
   * @return artifactPath
  **/
  @ApiModelProperty(value = "A string as defined in IETF RFC 8259. ")


  public String getArtifactPath() {
    return artifactPath;
  }

  public void setArtifactPath(String artifactPath) {
    this.artifactPath = artifactPath;
  }

  public VnfPackagesVnfPkgInfoAdditionalArtifacts artifactURI(String artifactURI) {
    this.artifactURI = artifactURI;
    return this;
  }

  /**
   * String formatted according to IETF RFC 3986. 
   * @return artifactURI
  **/
  @ApiModelProperty(value = "String formatted according to IETF RFC 3986. ")


  public String getArtifactURI() {
    return artifactURI;
  }

  public void setArtifactURI(String artifactURI) {
    this.artifactURI = artifactURI;
  }

  public VnfPackagesVnfPkgInfoAdditionalArtifacts checksum(VnfPackagesVnfPkgInfoChecksum checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Get checksum
   * @return checksum
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VnfPackagesVnfPkgInfoChecksum getChecksum() {
    return checksum;
  }

  public void setChecksum(VnfPackagesVnfPkgInfoChecksum checksum) {
    this.checksum = checksum;
  }

  public VnfPackagesVnfPkgInfoAdditionalArtifacts artifactClassification(ArtifactClassificationEnum artifactClassification) {
    this.artifactClassification = artifactClassification;
    return this;
  }

  /**
   * Marks specific types of artifacts as defined in the VNF package. If none of the specific classes listed below applies, the attribute shall not be present. Valid values: - HISTORY: a history artifact as per clause 4.3.3 in ETSI GS NFV-SOL 004 [5] - TESTING: a testing artifact as per clause 4.3.4 in ETSI GS NFV-SOL 004 [5] - LICENSE: a license artifact as per clause 4.3.5 in ETSI GS NFV-SOL 004 [5] 
   * @return artifactClassification
  **/
  @ApiModelProperty(value = "Marks specific types of artifacts as defined in the VNF package. If none of the specific classes listed below applies, the attribute shall not be present. Valid values: - HISTORY: a history artifact as per clause 4.3.3 in ETSI GS NFV-SOL 004 [5] - TESTING: a testing artifact as per clause 4.3.4 in ETSI GS NFV-SOL 004 [5] - LICENSE: a license artifact as per clause 4.3.5 in ETSI GS NFV-SOL 004 [5] ")


  public ArtifactClassificationEnum getArtifactClassification() {
    return artifactClassification;
  }

  public void setArtifactClassification(ArtifactClassificationEnum artifactClassification) {
    this.artifactClassification = artifactClassification;
  }

  public VnfPackagesVnfPkgInfoAdditionalArtifacts isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

  /**
   * Reflects whether the artifact is encrypted (true) or not (false). 
   * @return isEncrypted
  **/
  @ApiModelProperty(required = true, value = "Reflects whether the artifact is encrypted (true) or not (false). ")
  @NotNull


  public Boolean isIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public VnfPackagesVnfPkgInfoAdditionalArtifacts nonManoArtifactSetId(String nonManoArtifactSetId) {
    this.nonManoArtifactSetId = nonManoArtifactSetId;
    return this;
  }

  /**
   * Non-MANO artifact set identifier of the non-MANO artifact set to which the artifact belongs, as defined in clause 4.3.7 of ETSI GS NFV-SOL 004 [5]. Shall be provided if the artifact is a non-MANO artifact, and shall be omitted otherwise. 
   * @return nonManoArtifactSetId
  **/
  @ApiModelProperty(value = "Non-MANO artifact set identifier of the non-MANO artifact set to which the artifact belongs, as defined in clause 4.3.7 of ETSI GS NFV-SOL 004 [5]. Shall be provided if the artifact is a non-MANO artifact, and shall be omitted otherwise. ")


  public String getNonManoArtifactSetId() {
    return nonManoArtifactSetId;
  }

  public void setNonManoArtifactSetId(String nonManoArtifactSetId) {
    this.nonManoArtifactSetId = nonManoArtifactSetId;
  }

  public VnfPackagesVnfPkgInfoAdditionalArtifacts metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * This type represents a list of key-value pairs. The order of the pairs in the list is not significant. In JSON, a set of key- value pairs is represented as an object. It shall comply with the provisions defined in clause 4 of IETF RFC 7159. 
   * @return metadata
  **/
  @ApiModelProperty(value = "This type represents a list of key-value pairs. The order of the pairs in the list is not significant. In JSON, a set of key- value pairs is represented as an object. It shall comply with the provisions defined in clause 4 of IETF RFC 7159. ")


  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnfPackagesVnfPkgInfoAdditionalArtifacts vnfPackagesVnfPkgInfoAdditionalArtifacts = (VnfPackagesVnfPkgInfoAdditionalArtifacts) o;
    return Objects.equals(this.artifactPath, vnfPackagesVnfPkgInfoAdditionalArtifacts.artifactPath) &&
        Objects.equals(this.artifactURI, vnfPackagesVnfPkgInfoAdditionalArtifacts.artifactURI) &&
        Objects.equals(this.checksum, vnfPackagesVnfPkgInfoAdditionalArtifacts.checksum) &&
        Objects.equals(this.artifactClassification, vnfPackagesVnfPkgInfoAdditionalArtifacts.artifactClassification) &&
        Objects.equals(this.isEncrypted, vnfPackagesVnfPkgInfoAdditionalArtifacts.isEncrypted) &&
        Objects.equals(this.nonManoArtifactSetId, vnfPackagesVnfPkgInfoAdditionalArtifacts.nonManoArtifactSetId) &&
        Objects.equals(this.metadata, vnfPackagesVnfPkgInfoAdditionalArtifacts.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactPath, artifactURI, checksum, artifactClassification, isEncrypted, nonManoArtifactSetId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VnfPackagesVnfPkgInfoAdditionalArtifacts {\n");
    
    sb.append("    artifactPath: ").append(toIndentedString(artifactPath)).append("\n");
    sb.append("    artifactURI: ").append(toIndentedString(artifactURI)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    artifactClassification: ").append(toIndentedString(artifactClassification)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    nonManoArtifactSetId: ").append(toIndentedString(nonManoArtifactSetId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

