package io.swagger.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This type represents the checksum of a VNF package or an artifact file. 
 */
@Entity
@Table(name="VnfPackagesVnfPkgInfoChecksum")
@ApiModel(description = "This type represents the checksum of a VNF package or an artifact file. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class VnfPackagesVnfPkgInfoChecksum   {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
	
  @Column(name="algorithm")
  @JsonProperty("algorithm")
  private String algorithm = null;
  
  @Column(name="hash")
  @JsonProperty("hash")
  private String hash = null;
  
  public VnfPackagesVnfPkgInfoChecksum algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }
  @OneToOne(mappedBy="checksum")
  @JsonIgnore
  private VnfPackagesVnfPkgInfo vnfinfo;
  /**
   * Name of the algorithm used to generate the checksum, as defined in ETSI GS NFV-SOL 004 [5]. For example, SHA-256, SHA-512. 
   * @return algorithm
  **/
  @ApiModelProperty(required = true, value = "Name of the algorithm used to generate the checksum, as defined in ETSI GS NFV-SOL 004 [5]. For example, SHA-256, SHA-512. ")
  @NotNull


  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public VnfPackagesVnfPkgInfoChecksum hash(String hash) {
    this.hash = hash;
    return this;
  }

 
  /**
   * The hexadecimal value of the checksum. 
   * @return hash
  **/
  @ApiModelProperty(required = true, value = "The hexadecimal value of the checksum. ")
  @NotNull


  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnfPackagesVnfPkgInfoChecksum vnfPackagesVnfPkgInfoChecksum = (VnfPackagesVnfPkgInfoChecksum) o;
    return Objects.equals(this.algorithm, vnfPackagesVnfPkgInfoChecksum.algorithm) &&
        Objects.equals(this.hash, vnfPackagesVnfPkgInfoChecksum.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VnfPackagesVnfPkgInfoChecksum {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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
  public VnfPackagesVnfPkgInfo getinfo() {
  	return vnfinfo;
  }
  @JsonIgnore
  public void setinfo(VnfPackagesVnfPkgInfo info)
  {
  	this.vnfinfo=info;
  }
}

