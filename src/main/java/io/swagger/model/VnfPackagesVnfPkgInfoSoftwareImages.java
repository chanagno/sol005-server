package io.swagger.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VnfPackagesVnfPkgInfoChecksum;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This type represents an artifact contained in a VNF package which represents a software image.   
 */
@ApiModel(description = "This type represents an artifact contained in a VNF package which represents a software image.   ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")
@Entity
@Table(name="VnfPackagesVnfPkgInfoSoftwareImages")
public class VnfPackagesVnfPkgInfoSoftwareImages   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String Id;
	/*@Column(insertable="false" update="false")
	@JsonProperty("id")
  private String id = null;*/
	
  @Column	
  @JsonProperty("name")
  private String name = null;

  @Column
  @JsonProperty("provider")
  private String provider = null;

  @Column
  @JsonProperty("version")
  private String version = null;

  @OneToOne
  @JoinColumn(name="checksum_images")
  @JsonProperty("checksum")
  private VnfPackagesVnfPkgInfoChecksum checksum = null;

  @Column
  @JsonProperty("isEncrypted")
  private Boolean isEncrypted = null;

  /**
   * Container format indicates whether the software image is in a file format that also contains meta-data about the actual software. Permitted values: - AKI: a kernel image format - AMI: a machine image format - ARI: a ram disk image format - BARE: the image does not have a container or meta-data envelope - DOCKER: docker container format - OVA: OVF package in a tar file - OVF: OVF container format 
   */
  public enum ContainerFormatEnum {
    AKI("AKI"),
    
    AMI("AMI"),
    
    ARI("ARI"),
    
    BARE("BARE"),
    
    DOCKER("DOCKER"),
    
    OVA("OVA"),
    
    OVF("OVF");

    private String value;

    ContainerFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContainerFormatEnum fromValue(String text) {
      for (ContainerFormatEnum b : ContainerFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("containerFormat")
  private ContainerFormatEnum containerFormat = null;

  /**
   * Disk format of a software image is the format of the underlying disk image. Permitted values: - AKI: a kernel image format - AMI: a machine image format - ARI: a ramdisk image format - ISO: an archive format for the data contents of an optical disc, such as CD-ROM - QCOW2: a common disk image format, which can expand dynamically and supports copy on write - RAW: an unstructured disk image format - VDI: a common disk image format - VHD: a common disk image format - VHDX: enhanced version of VHD format - VMDK: a common disk image format 
   */
  public enum DiskFormatEnum {
    AKI("AKI"),
    
    AMI("AMI"),
    
    ARI("ARI"),
    
    ISO("ISO"),
    
    QCOW2("QCOW2"),
    
    RAW("RAW"),
    
    VDI("VDI"),
    
    VHD("VHD"),
    
    VHDX("VHDX"),
    
    VMDK("VMDK");

    private String value;

    DiskFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DiskFormatEnum fromValue(String text) {
      for (DiskFormatEnum b : DiskFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @Column
  @JsonProperty("diskFormat")
  private DiskFormatEnum diskFormat = null;

  
  @Column(name="createdΑt")
  @JsonProperty("createdAt")
  private String createdAt = null;

  @Column
  @JsonProperty("minDisk")
  private Integer minDisk = null;

  @Column
  @JsonProperty("minRam")
  private Integer minRam = null;

  @Column
  @JsonProperty("size")
  private Integer size = null;

  @Column
  @JsonProperty("userMetadata")
  private String userMetadata = null;

  @Column
  @JsonProperty("imagePath")
  private String imagePath = null;

  @ManyToMany(mappedBy="softwareImages")//
  private Set<VnfPackagesVnfPkgInfo> info=new HashSet<>();
  
  public VnfPackagesVnfPkgInfoSoftwareImages id(String id) {
    this.Id = id;
    return this;
  }

  /**
   * Identifier of the VNF Virtual Link Descriptor (VLD) in the VNFD. 
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the VNF Virtual Link Descriptor (VLD) in the VNFD. ")
  @NotNull


  public String getId() {
    return Id;
  }

  public void setId(String id) {
    this.Id = id;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the software image. 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the software image. ")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Provider of the software image. 
   * @return provider
  **/
  @ApiModelProperty(required = true, value = "Provider of the software image. ")
  @NotNull


  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages version(String version) {
    this.version = version;
    return this;
  }

  /**
   * A Version. Representation: string of variable length. 
   * @return version
  **/
  @ApiModelProperty(required = true, value = "A Version. Representation: string of variable length. ")
  @NotNull


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages checksum(VnfPackagesVnfPkgInfoChecksum checksum) {
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

  public VnfPackagesVnfPkgInfoSoftwareImages isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

  /**
   * Reflects whether the image is encrypted (true) or not (false). 
   * @return isEncrypted
  **/
  @ApiModelProperty(required = true, value = "Reflects whether the image is encrypted (true) or not (false). ")
  @NotNull


  public Boolean isIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages containerFormat(ContainerFormatEnum containerFormat) {
    this.containerFormat = containerFormat;
    return this;
  }

  /**
   * Container format indicates whether the software image is in a file format that also contains meta-data about the actual software. Permitted values: - AKI: a kernel image format - AMI: a machine image format - ARI: a ram disk image format - BARE: the image does not have a container or meta-data envelope - DOCKER: docker container format - OVA: OVF package in a tar file - OVF: OVF container format 
   * @return containerFormat
  **/
  @ApiModelProperty(required = true, value = "Container format indicates whether the software image is in a file format that also contains meta-data about the actual software. Permitted values: - AKI: a kernel image format - AMI: a machine image format - ARI: a ram disk image format - BARE: the image does not have a container or meta-data envelope - DOCKER: docker container format - OVA: OVF package in a tar file - OVF: OVF container format ")
  @NotNull


  public ContainerFormatEnum getContainerFormat() {
    return containerFormat;
  }

  public void setContainerFormat(ContainerFormatEnum containerFormat) {
    this.containerFormat = containerFormat;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages diskFormat(DiskFormatEnum diskFormat) {
    this.diskFormat = diskFormat;
    return this;
  }

  /**
   * Disk format of a software image is the format of the underlying disk image. Permitted values: - AKI: a kernel image format - AMI: a machine image format - ARI: a ramdisk image format - ISO: an archive format for the data contents of an optical disc, such as CD-ROM - QCOW2: a common disk image format, which can expand dynamically and supports copy on write - RAW: an unstructured disk image format - VDI: a common disk image format - VHD: a common disk image format - VHDX: enhanced version of VHD format - VMDK: a common disk image format 
   * @return diskFormat
  **/
  @ApiModelProperty(required = true, value = "Disk format of a software image is the format of the underlying disk image. Permitted values: - AKI: a kernel image format - AMI: a machine image format - ARI: a ramdisk image format - ISO: an archive format for the data contents of an optical disc, such as CD-ROM - QCOW2: a common disk image format, which can expand dynamically and supports copy on write - RAW: an unstructured disk image format - VDI: a common disk image format - VHD: a common disk image format - VHDX: enhanced version of VHD format - VMDK: a common disk image format ")
  @NotNull


  public DiskFormatEnum getDiskFormat() {
    return diskFormat;
  }

  public void setDiskFormat(DiskFormatEnum diskFormat) {
    this.diskFormat = diskFormat;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date-time stamp. Representation: String formatted according toas defined by the date-time production in IETF RFC 3339. 
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Date-time stamp. Representation: String formatted according toas defined by the date-time production in IETF RFC 3339. ")
  @NotNull


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages minDisk(Integer minDisk) {
    this.minDisk = minDisk;
    return this;
  }

  /**
   * The minimal disk for this software image in bytes. 
   * minimum: 0
   * @return minDisk
  **/
  @ApiModelProperty(required = true, value = "The minimal disk for this software image in bytes. ")
  @NotNull

@Min(0)
  public Integer getMinDisk() {
    return minDisk;
  }

  public void setMinDisk(Integer minDisk) {
    this.minDisk = minDisk;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages minRam(Integer minRam) {
    this.minRam = minRam;
    return this;
  }

  /**
   * The minimal RAM for this software image in bytes. 
   * minimum: 0
   * @return minRam
  **/
  @ApiModelProperty(required = true, value = "The minimal RAM for this software image in bytes. ")
  @NotNull

@Min(0)
  public Integer getMinRam() {
    return minRam;
  }

  public void setMinRam(Integer minRam) {
    this.minRam = minRam;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Size of this software image in bytes. 
   * minimum: 0
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Size of this software image in bytes. ")
  @NotNull

@Min(0)
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages userMetadata(String userMetadata) {
    this.userMetadata = userMetadata;
    return this;
  }

  /**
   * This type represents a list of key-value pairs. The order of the pairs in the list is not significant. In JSON, a set of key- value pairs is represented as an object. It shall comply with the provisions defined in clause 4 of IETF RFC 7159. 
   * @return userMetadata
  **/
  @ApiModelProperty(value = "This type represents a list of key-value pairs. The order of the pairs in the list is not significant. In JSON, a set of key- value pairs is represented as an object. It shall comply with the provisions defined in clause 4 of IETF RFC 7159. ")


  public Object getUserMetadata() {
    return userMetadata;
  }

  public void setUserMetadata(String userMetadata) {
    this.userMetadata = userMetadata;
  }

  public VnfPackagesVnfPkgInfoSoftwareImages imagePath(String imagePath) {
    this.imagePath = imagePath;
    return this;
  }

  /**
   * Path in the VNF package, which identifies the image artifact and also allows to access a copy of the image artifact. 
   * @return imagePath
  **/
  @ApiModelProperty(required = true, value = "Path in the VNF package, which identifies the image artifact and also allows to access a copy of the image artifact. ")
  @NotNull


  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnfPackagesVnfPkgInfoSoftwareImages vnfPackagesVnfPkgInfoSoftwareImages = (VnfPackagesVnfPkgInfoSoftwareImages) o;
    return Objects.equals(this.Id, vnfPackagesVnfPkgInfoSoftwareImages.Id) &&
        Objects.equals(this.name, vnfPackagesVnfPkgInfoSoftwareImages.name) &&
        Objects.equals(this.provider, vnfPackagesVnfPkgInfoSoftwareImages.provider) &&
        Objects.equals(this.version, vnfPackagesVnfPkgInfoSoftwareImages.version) &&
        Objects.equals(this.checksum, vnfPackagesVnfPkgInfoSoftwareImages.checksum) &&
        Objects.equals(this.isEncrypted, vnfPackagesVnfPkgInfoSoftwareImages.isEncrypted) &&
        Objects.equals(this.containerFormat, vnfPackagesVnfPkgInfoSoftwareImages.containerFormat) &&
        Objects.equals(this.diskFormat, vnfPackagesVnfPkgInfoSoftwareImages.diskFormat) &&
        Objects.equals(this.createdAt, vnfPackagesVnfPkgInfoSoftwareImages.createdAt) &&
        Objects.equals(this.minDisk, vnfPackagesVnfPkgInfoSoftwareImages.minDisk) &&
        Objects.equals(this.minRam, vnfPackagesVnfPkgInfoSoftwareImages.minRam) &&
        Objects.equals(this.size, vnfPackagesVnfPkgInfoSoftwareImages.size) &&
        Objects.equals(this.userMetadata, vnfPackagesVnfPkgInfoSoftwareImages.userMetadata) &&
        Objects.equals(this.imagePath, vnfPackagesVnfPkgInfoSoftwareImages.imagePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Id, name, provider, version, checksum, isEncrypted, containerFormat, diskFormat, createdAt, minDisk, minRam, size, userMetadata, imagePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VnfPackagesVnfPkgInfoSoftwareImages {\n");
    
    sb.append("    id: ").append(toIndentedString(Id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
    sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
    sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    userMetadata: ").append(toIndentedString(userMetadata)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
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
public Set<VnfPackagesVnfPkgInfo> getinfo() {
	return info;
}
@JsonIgnore
public void setinfo(Set<VnfPackagesVnfPkgInfo> info)
{
	this.info=info;
}
}

