package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse400;
import io.swagger.model.VnfPackagesVnfPkgInfoAdditionalArtifacts;
import io.swagger.model.VnfPackagesVnfPkgInfoChecksum;
import io.swagger.model.VnfPackagesVnfPkgInfoLinks;
import io.swagger.model.VnfPackagesVnfPkgInfoSoftwareImages;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VnfPackagesVnfPkgInfo
 */
@Entity
@Table(name="VnfPackagesVnfPkgInfo")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class VnfPackagesVnfPkgInfo   {
  @Id
  @Column(name="id")
  @JsonProperty("id")
  private String id = null;
  
  @Column(name="vnfdId")
  @JsonProperty("vnfdId")
  private String vnfdId = null;

  @Column(name="vnfProvider")
  @JsonProperty("vnfProvider")
  private String vnfProvider = null;
  
  @Column(name="vnfProductName")
  @JsonProperty("vnfProductName")
  private String vnfProductName = null;

  @Column(name="vnfSoftwareVersion")
  @JsonProperty("vnfSoftwareVersion")
  private String vnfSoftwareVersion = null;

  @Column(name="vnfdVersion")
  @JsonProperty("vnfdVersion")
  private String vnfdVersion = null;

  @Column(name="compatibleSpecificationVersions")
  @JsonProperty("compatibleSpecificationVersions")
  private String compatibleSpecificationVersions = null;
  
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="checksum_info",referencedColumnName = "id")
  @JsonProperty("checksum")
  private VnfPackagesVnfPkgInfoChecksum checksum = null;

  /**
   * Signals the security option used by the package as defined in clause 5.1 of ETSI GS NFV-SOL 004 [5]. Valid values: OPTION_1, OPTION_2 
   */
  public enum PackageSecurityOptionEnum {
    _1("OPTION_1"),
    
    _2("OPTION_2");

    private String value;

    PackageSecurityOptionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PackageSecurityOptionEnum fromValue(String text) {
      for (PackageSecurityOptionEnum b : PackageSecurityOptionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @Column(name="packageSecurityOption")
  @JsonProperty("packageSecurityOption")
  private PackageSecurityOptionEnum packageSecurityOption = null;

  @Column(name="signingCertificate")
  @JsonProperty("signingCertificate")
  private String signingCertificate = null;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})//?
  @JoinTable(name="images_info",joinColumns=@JoinColumn(name="id_info"),inverseJoinColumns=@JoinColumn(name="id_image"))//?
  
  @JsonProperty("softwareImages")
  @Valid
  private List<VnfPackagesVnfPkgInfoSoftwareImages> softwareImages = null;
  
  
  @OneToMany
  @JoinColumn(name="additionalArtifacts_info")
  @ElementCollection
  @JsonProperty("additionalArtifacts")
  @Valid
  private List<VnfPackagesVnfPkgInfoAdditionalArtifacts> additionalArtifacts = null;

  /**
   * The enumeration PackageOnboardingStateType shall comply with the provisions defined in Table 9.5.4.3-1. Permitted values: - CREATED: The VNF package resource has been created. - UPLOADING: The associated VNF package content is being uploaded. - PROCESSING: The associated VNF package content is being processed, e.g. validation. - ONBOARDED: The associated VNF package content is successfully on-boarded. - ERROR: There was an error during upload of the VNF package content or external artifacts, or during VNF package processing. 
   */
  public enum OnboardingStateEnum {
    CREATED("CREATED"),
    
    UPLOADING("UPLOADING"),
    
    PROCESSING("PROCESSING"),
    
    ONBOARDED("ONBOARDED"),
    
    ERROR("ERROR");

    private String value;

     OnboardingStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OnboardingStateEnum fromValue(String text) {
      for (OnboardingStateEnum b : OnboardingStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

	public void OnboardingStateEnum(String onboard) {
		// TODO Auto-generated method stub
		this.value = value;
	}
  }

  @Column(name="onboardingState")
  @JsonProperty("onboardingState")
  private OnboardingStateEnum onboardingState = null;

  /**
   * \"The enumeration PackageOperationalStateType shall  comply with the provisions defined in Table 9.5.4.4-1.\" Acceptable values are: - ENABLED - The VNF package is enabled, i.e. it can be used for instantiation of new VNF instances. - DISABLED - The VNF package is disabled, i.e. it cannot be used for further VNF instantiation requests             (unless and until the VNF package is re-enabled). 
   */
  public enum OperationalStateEnum {
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED");

    private String value;

     OperationalStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationalStateEnum fromValue(String text) {
      for (OperationalStateEnum b : OperationalStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

	public void operationalState(String operate) {
		// TODO Auto-generated method stub
		this.value=operate;
	}

	
  }

  @Column(name="operationalState")
  @JsonProperty("operationalState")
  private OperationalStateEnum operationalState = null;

  /**
   * \"The enumeration PackageUsageStateType shall comply with the provisions. Acceptable values are: -IN_USE - VNF instances instantiated from this VNF package exist. -NOT_IN_USE - No existing VNF instance is instantiated from this VNF package\"       
   */
  public enum UsageStateEnum {
    IN_USE("IN_USE"),
    
    NOT_IN_USE("NOT_IN_USE");

    private String value;

     UsageStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UsageStateEnum fromValue(String text) {
      for (UsageStateEnum b : UsageStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

	public void UsageStateEnum(String usage) {
		// TODO Auto-generated method stub
		this.value=usage;
	}
  }
  
  
  @Column(name="usageState")  
  @JsonProperty("usageState")
  private UsageStateEnum usageState = null;
  
  
  @ElementCollection
  @JsonProperty("vnfmInfo")
  @Valid
  private List<String> vnfmInfo = new ArrayList<String>();
  

  @Column(name="userDefinedData")
  @JsonProperty("userDefinedData")
  private String userDefinedData = null;

  @OneToOne
  @JoinColumn(name="onboardingFailureDetails")
  @JsonProperty("onboardingFailureDetails")
  private InlineResponse400 onboardingFailureDetails = null;

  @OneToOne
  @JoinColumn(name="info_links")
  @JsonProperty("_links")
  private VnfPackagesVnfPkgInfoLinks links = null;

  public VnfPackagesVnfPkgInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * An identifier with the intention of being globally unique. 
   * @return id
  **/
  @ApiModelProperty(required = true, value = "An identifier with the intention of being globally unique. ")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VnfPackagesVnfPkgInfo vnfdId(String vnfdId) {
    this.vnfdId = vnfdId;
    return this;
  }

  /**
   * An identifier with the intention of being globally unique. 
   * @return vnfdId
  **/
  @ApiModelProperty(value = "An identifier with the intention of being globally unique. ")


  public String getVnfdId() {
    return vnfdId;
  }

  public void setVnfdId(String vnfdId) {
    this.vnfdId = vnfdId;
  }

  public VnfPackagesVnfPkgInfo vnfProvider(String vnfProvider) {
    this.vnfProvider = vnfProvider;
    return this;
  }

  /**
   * Provider of the VNF package and the VNFD. This information is copied from the VNFD.  It shall be present after the VNF package content has been on-boarded and absent otherwise. 
   * @return vnfProvider
  **/
  @ApiModelProperty(value = "Provider of the VNF package and the VNFD. This information is copied from the VNFD.  It shall be present after the VNF package content has been on-boarded and absent otherwise. ")


  public String getVnfProvider() {
    return vnfProvider;
  }

  public void setVnfProvider(String vnfProvider) {
    this.vnfProvider = vnfProvider;
  }

  public VnfPackagesVnfPkgInfo vnfProductName(String vnfProductName) {
    this.vnfProductName = vnfProductName;
    return this;
  }

  /**
   * Name to identify the VNF product.Invariant for the VNF product lifetime.  This information is copied from the VNFD. It shall be present after the VNF package content has been on-boarded and absent otherwise. 
   * @return vnfProductName
  **/
  @ApiModelProperty(value = "Name to identify the VNF product.Invariant for the VNF product lifetime.  This information is copied from the VNFD. It shall be present after the VNF package content has been on-boarded and absent otherwise. ")


  public String getVnfProductName() {
    return vnfProductName;
  }

  public void setVnfProductName(String vnfProductName) {
    this.vnfProductName = vnfProductName;
  }

  public VnfPackagesVnfPkgInfo vnfSoftwareVersion(String vnfSoftwareVersion) {
    this.vnfSoftwareVersion = vnfSoftwareVersion;
    return this;
  }

  /**
   * A Version. Representation: string of variable length. 
   * @return vnfSoftwareVersion
  **/
  @ApiModelProperty(value = "A Version. Representation: string of variable length. ")


  public String getVnfSoftwareVersion() {
    return vnfSoftwareVersion;
  }

  public void setVnfSoftwareVersion(String vnfSoftwareVersion) {
    this.vnfSoftwareVersion = vnfSoftwareVersion;
  }

  public VnfPackagesVnfPkgInfo vnfdVersion(String vnfdVersion) {
    this.vnfdVersion = vnfdVersion;
    return this;
  }

  /**
   * A Version. Representation: string of variable length. 
   * @return vnfdVersion
  **/
  @ApiModelProperty(value = "A Version. Representation: string of variable length. ")


  public String getVnfdVersion() {
    return vnfdVersion;
  }

  public void setVnfdVersion(String vnfdVersion) {
    this.vnfdVersion = vnfdVersion;
  }

  public VnfPackagesVnfPkgInfo compatibleSpecificationVersions(String compatibleSpecificationVersions) {
    this.compatibleSpecificationVersions = compatibleSpecificationVersions;
    return this;
  }

  /**
   * A Version. Representation: string of variable length. 
   * @return compatibleSpecificationVersions
  **/
  @ApiModelProperty(value = "A Version. Representation: string of variable length. ")


  public String getCompatibleSpecificationVersions() {
    return compatibleSpecificationVersions;
  }

  public void setCompatibleSpecificationVersions(String compatibleSpecificationVersions) {
    this.compatibleSpecificationVersions = compatibleSpecificationVersions;
  }

  public VnfPackagesVnfPkgInfo checksum(VnfPackagesVnfPkgInfoChecksum checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Get checksum
   * @return checksum
  **/
  @ApiModelProperty(value = "")

  @Valid

  public VnfPackagesVnfPkgInfoChecksum getChecksum() {
    return checksum;
  }

  public void setChecksum(VnfPackagesVnfPkgInfoChecksum checksum) {
    this.checksum = checksum;
  }

  public VnfPackagesVnfPkgInfo packageSecurityOption(PackageSecurityOptionEnum packageSecurityOption) {
    this.packageSecurityOption = packageSecurityOption;
    return this;
  }

  /**
   * Signals the security option used by the package as defined in clause 5.1 of ETSI GS NFV-SOL 004 [5]. Valid values: OPTION_1, OPTION_2 
   * @return packageSecurityOption
  **/
  @ApiModelProperty(required = true, value = "Signals the security option used by the package as defined in clause 5.1 of ETSI GS NFV-SOL 004 [5]. Valid values: OPTION_1, OPTION_2 ")
  @NotNull


  public PackageSecurityOptionEnum getPackageSecurityOption() {
    return packageSecurityOption;
  }

  public void setPackageSecurityOption(PackageSecurityOptionEnum packageSecurityOption) {
    this.packageSecurityOption = packageSecurityOption;
  }

  public VnfPackagesVnfPkgInfo signingCertificate(String signingCertificate) {
    this.signingCertificate = signingCertificate;
    return this;
  }

  /**
   * The singleton signing certificate if it is included as a file in the VNF package. 
   * @return signingCertificate
  **/
  @ApiModelProperty(value = "The singleton signing certificate if it is included as a file in the VNF package. ")


  public String getSigningCertificate() {
    return signingCertificate;
  }

  public void setSigningCertificate(String signingCertificate) {
    this.signingCertificate = signingCertificate;
  }

  public VnfPackagesVnfPkgInfo softwareImages(List<VnfPackagesVnfPkgInfoSoftwareImages> softwareImages) {
    this.softwareImages = softwareImages;
    return this;
  }

  public VnfPackagesVnfPkgInfo addSoftwareImagesItem(VnfPackagesVnfPkgInfoSoftwareImages softwareImagesItem) {
    if (this.softwareImages == null) {
      this.softwareImages = new ArrayList<VnfPackagesVnfPkgInfoSoftwareImages>();
    }
    this.softwareImages.add(softwareImagesItem);
    return this;
  }

  /**
   * Information about VNF package artifacts that are software images. This attribute shall not be present before the VNF package content is on-boarded. Otherwise, this attribute shall be present unless it has been requested to be excluded per attribute selector. 
   * @return softwareImages
  **/
  @ApiModelProperty(value = "Information about VNF package artifacts that are software images. This attribute shall not be present before the VNF package content is on-boarded. Otherwise, this attribute shall be present unless it has been requested to be excluded per attribute selector. ")
  
  @Valid
  public List<VnfPackagesVnfPkgInfoSoftwareImages> getSoftwareImages() {
    return softwareImages;
  }

  public void setSoftwareImages(List<VnfPackagesVnfPkgInfoSoftwareImages> softwareImages) {
    this.softwareImages = softwareImages;
  }

  public VnfPackagesVnfPkgInfo additionalArtifacts(List<VnfPackagesVnfPkgInfoAdditionalArtifacts> additionalArtifacts) {
    this.additionalArtifacts = additionalArtifacts;
    return this;
  }

  public VnfPackagesVnfPkgInfo addAdditionalArtifactsItem(VnfPackagesVnfPkgInfoAdditionalArtifacts additionalArtifactsItem) {
    if (this.additionalArtifacts == null) {
      this.additionalArtifacts = new ArrayList<VnfPackagesVnfPkgInfoAdditionalArtifacts>();
    }
    this.additionalArtifacts.add(additionalArtifactsItem);
    return this;
  }

  /**
   * Information about VNF package artifacts contained in the VNF package that are not software images. This attribute shall not be present before the VNF package content is on-boarded. Otherwise, this attribute shall be present if the VNF package contains additional artifacts. 
   * @return additionalArtifacts
  **/
  @ApiModelProperty(value = "Information about VNF package artifacts contained in the VNF package that are not software images. This attribute shall not be present before the VNF package content is on-boarded. Otherwise, this attribute shall be present if the VNF package contains additional artifacts. ")
  
  @Valid

  public List<VnfPackagesVnfPkgInfoAdditionalArtifacts> getAdditionalArtifacts() {
    return additionalArtifacts;
  }

  public void setAdditionalArtifacts(List<VnfPackagesVnfPkgInfoAdditionalArtifacts> additionalArtifacts) {
    this.additionalArtifacts = additionalArtifacts;
  }

  public VnfPackagesVnfPkgInfo onboardingState(OnboardingStateEnum onboardingState) {
    this.onboardingState = onboardingState;
    return this;
  }

  /**
   * The enumeration PackageOnboardingStateType shall comply with the provisions defined in Table 9.5.4.3-1. Permitted values: - CREATED: The VNF package resource has been created. - UPLOADING: The associated VNF package content is being uploaded. - PROCESSING: The associated VNF package content is being processed, e.g. validation. - ONBOARDED: The associated VNF package content is successfully on-boarded. - ERROR: There was an error during upload of the VNF package content or external artifacts, or during VNF package processing. 
   * @return onboardingState
  **/
  @ApiModelProperty(required = true, value = "The enumeration PackageOnboardingStateType shall comply with the provisions defined in Table 9.5.4.3-1. Permitted values: - CREATED: The VNF package resource has been created. - UPLOADING: The associated VNF package content is being uploaded. - PROCESSING: The associated VNF package content is being processed, e.g. validation. - ONBOARDED: The associated VNF package content is successfully on-boarded. - ERROR: There was an error during upload of the VNF package content or external artifacts, or during VNF package processing. ")
  @NotNull


  public OnboardingStateEnum getOnboardingState() {
    return onboardingState;
  }

  public void setOnboardingState(OnboardingStateEnum onboardingState) {
    this.onboardingState = onboardingState;
  }

  public VnfPackagesVnfPkgInfo operationalState(OperationalStateEnum operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * \"The enumeration PackageOperationalStateType shall  comply with the provisions defined in Table 9.5.4.4-1.\" Acceptable values are: - ENABLED - The VNF package is enabled, i.e. it can be used for instantiation of new VNF instances. - DISABLED - The VNF package is disabled, i.e. it cannot be used for further VNF instantiation requests             (unless and until the VNF package is re-enabled). 
   * @return operationalState
  **/
  @ApiModelProperty(required = true, value = "\"The enumeration PackageOperationalStateType shall  comply with the provisions defined in Table 9.5.4.4-1.\" Acceptable values are: - ENABLED - The VNF package is enabled, i.e. it can be used for instantiation of new VNF instances. - DISABLED - The VNF package is disabled, i.e. it cannot be used for further VNF instantiation requests             (unless and until the VNF package is re-enabled). ")
  @NotNull


  public OperationalStateEnum getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(OperationalStateEnum operationalState) {
    this.operationalState = operationalState;
  }

  public VnfPackagesVnfPkgInfo usageState(UsageStateEnum usageState) {
    this.usageState = usageState;
    return this;
  }

  /**
   * \"The enumeration PackageUsageStateType shall comply with the provisions. Acceptable values are: -IN_USE - VNF instances instantiated from this VNF package exist. -NOT_IN_USE - No existing VNF instance is instantiated from this VNF package\"       
   * @return usageState
  **/
  @ApiModelProperty(required = true, value = "\"The enumeration PackageUsageStateType shall comply with the provisions. Acceptable values are: -IN_USE - VNF instances instantiated from this VNF package exist. -NOT_IN_USE - No existing VNF instance is instantiated from this VNF package\"       ")
  @NotNull


  public UsageStateEnum getUsageState() {
    return usageState;
  }

  public void setUsageState(UsageStateEnum usageState) {
    this.usageState = usageState;
  }

  public VnfPackagesVnfPkgInfo vnfmInfo(List<String> vnfmInfo) {
    this.vnfmInfo = vnfmInfo;
    return this;
  }

  public VnfPackagesVnfPkgInfo addVnfmInfoItem(String vnfmInfoItem) {
    this.vnfmInfo.add(vnfmInfoItem);
    return this;
  }

  /**
   * Specifies VNFMs compatible with the VNF. This information is copied from the VNFD. See note 4. 
   * @return vnfmInfo
  **/
  @ApiModelProperty(required = true, value = "Specifies VNFMs compatible with the VNF. This information is copied from the VNFD. See note 4. ")
  @NotNull


  public List<String> getVnfmInfo() {
    return vnfmInfo;
  }

  public void setVnfmInfo(List<String> vnfmInfo) {
    this.vnfmInfo = vnfmInfo;
  }

  public VnfPackagesVnfPkgInfo userDefinedData(String userDefinedData) {
    this.userDefinedData = userDefinedData;
    return this;
  }

  /**
   * This type represents a list of key-value pairs. The order of the pairs in the list is not significant. In JSON, a set of key- value pairs is represented as an object. It shall comply with the provisions defined in clause 4 of IETF RFC 7159. 
   * @return userDefinedData
  **/
  @ApiModelProperty(value = "This type represents a list of key-value pairs. The order of the pairs in the list is not significant. In JSON, a set of key- value pairs is represented as an object. It shall comply with the provisions defined in clause 4 of IETF RFC 7159. ")


  public Object getUserDefinedData() {
    return userDefinedData;
  }

  public void setUserDefinedData(@Valid String user) {
    this.userDefinedData = user;
  }

  public VnfPackagesVnfPkgInfo onboardingFailureDetails(InlineResponse400 onboardingFailureDetails) {
    this.onboardingFailureDetails = onboardingFailureDetails;
    return this;
  }

  /**
   * Get onboardingFailureDetails
   * @return onboardingFailureDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse400 getOnboardingFailureDetails() {
    return onboardingFailureDetails;
  }

  public void setOnboardingFailureDetails(InlineResponse400 onboardingFailureDetails) {
    this.onboardingFailureDetails = onboardingFailureDetails;
  }

  public VnfPackagesVnfPkgInfo links(VnfPackagesVnfPkgInfoLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VnfPackagesVnfPkgInfoLinks getLinks() {
    return links;
  }

  public void setLinks(VnfPackagesVnfPkgInfoLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnfPackagesVnfPkgInfo vnfPackagesVnfPkgInfo = (VnfPackagesVnfPkgInfo) o;
    return Objects.equals(this.id, vnfPackagesVnfPkgInfo.id) &&
        Objects.equals(this.vnfdId, vnfPackagesVnfPkgInfo.vnfdId) &&
        Objects.equals(this.vnfProvider, vnfPackagesVnfPkgInfo.vnfProvider) &&
        Objects.equals(this.vnfProductName, vnfPackagesVnfPkgInfo.vnfProductName) &&
        Objects.equals(this.vnfSoftwareVersion, vnfPackagesVnfPkgInfo.vnfSoftwareVersion) &&
        Objects.equals(this.vnfdVersion, vnfPackagesVnfPkgInfo.vnfdVersion) &&
        Objects.equals(this.compatibleSpecificationVersions, vnfPackagesVnfPkgInfo.compatibleSpecificationVersions) &&
        Objects.equals(this.checksum, vnfPackagesVnfPkgInfo.checksum) &&
        Objects.equals(this.packageSecurityOption, vnfPackagesVnfPkgInfo.packageSecurityOption) &&
        Objects.equals(this.signingCertificate, vnfPackagesVnfPkgInfo.signingCertificate) &&
        Objects.equals(this.softwareImages, vnfPackagesVnfPkgInfo.softwareImages) &&
        Objects.equals(this.additionalArtifacts, vnfPackagesVnfPkgInfo.additionalArtifacts) &&
        Objects.equals(this.onboardingState, vnfPackagesVnfPkgInfo.onboardingState) &&
        Objects.equals(this.operationalState, vnfPackagesVnfPkgInfo.operationalState) &&
        Objects.equals(this.usageState, vnfPackagesVnfPkgInfo.usageState) &&
        Objects.equals(this.vnfmInfo, vnfPackagesVnfPkgInfo.vnfmInfo) &&
        Objects.equals(this.userDefinedData, vnfPackagesVnfPkgInfo.userDefinedData) &&
        Objects.equals(this.onboardingFailureDetails, vnfPackagesVnfPkgInfo.onboardingFailureDetails) &&
        Objects.equals(this.links, vnfPackagesVnfPkgInfo.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vnfdId, vnfProvider, vnfProductName, vnfSoftwareVersion, vnfdVersion, compatibleSpecificationVersions, checksum, packageSecurityOption, signingCertificate, softwareImages, additionalArtifacts, onboardingState, operationalState, usageState, vnfmInfo, userDefinedData, onboardingFailureDetails, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VnfPackagesVnfPkgInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vnfdId: ").append(toIndentedString(vnfdId)).append("\n");
    sb.append("    vnfProvider: ").append(toIndentedString(vnfProvider)).append("\n");
    sb.append("    vnfProductName: ").append(toIndentedString(vnfProductName)).append("\n");
    sb.append("    vnfSoftwareVersion: ").append(toIndentedString(vnfSoftwareVersion)).append("\n");
    sb.append("    vnfdVersion: ").append(toIndentedString(vnfdVersion)).append("\n");
    sb.append("    compatibleSpecificationVersions: ").append(toIndentedString(compatibleSpecificationVersions)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    packageSecurityOption: ").append(toIndentedString(packageSecurityOption)).append("\n");
    sb.append("    signingCertificate: ").append(toIndentedString(signingCertificate)).append("\n");
    sb.append("    softwareImages: ").append(toIndentedString(softwareImages)).append("\n");
    sb.append("    additionalArtifacts: ").append(toIndentedString(additionalArtifacts)).append("\n");
    sb.append("    onboardingState: ").append(toIndentedString(onboardingState)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    usageState: ").append(toIndentedString(usageState)).append("\n");
    sb.append("    vnfmInfo: ").append(toIndentedString(vnfmInfo)).append("\n");
    sb.append("    userDefinedData: ").append(toIndentedString(userDefinedData)).append("\n");
    sb.append("    onboardingFailureDetails: ").append(toIndentedString(onboardingFailureDetails)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

