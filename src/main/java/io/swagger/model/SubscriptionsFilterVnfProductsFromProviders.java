package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubscriptionsFilterVnfProducts;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionsFilterVnfProductsFromProviders
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class SubscriptionsFilterVnfProductsFromProviders   {
  @JsonProperty("vnfProvider")
  private String vnfProvider = null;

  @JsonProperty("vnfProducts")
  @Valid
  private List<SubscriptionsFilterVnfProducts> vnfProducts = null;

  @JsonProperty("vnfdId")
  @Valid
  private List<String> vnfdId = null;

  @JsonProperty("vnfPkgId")
  @Valid
  private List<String> vnfPkgId = null;

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
  }

  @JsonProperty("operationalState")
  @Valid
  private List<OperationalStateEnum> operationalState = null;

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
  }

  @JsonProperty("usageState")
  @Valid
  private List<UsageStateEnum> usageState = null;

  @JsonProperty("vnfmInfo")
  @Valid
  private List<String> vnfmInfo = null;

  public SubscriptionsFilterVnfProductsFromProviders vnfProvider(String vnfProvider) {
    this.vnfProvider = vnfProvider;
    return this;
  }

  /**
   * Name of the VNFprovider to match. 
   * @return vnfProvider
  **/
  @ApiModelProperty(required = true, value = "Name of the VNFprovider to match. ")
  @NotNull


  public String getVnfProvider() {
    return vnfProvider;
  }

  public void setVnfProvider(String vnfProvider) {
    this.vnfProvider = vnfProvider;
  }

  public SubscriptionsFilterVnfProductsFromProviders vnfProducts(List<SubscriptionsFilterVnfProducts> vnfProducts) {
    this.vnfProducts = vnfProducts;
    return this;
  }

  public SubscriptionsFilterVnfProductsFromProviders addVnfProductsItem(SubscriptionsFilterVnfProducts vnfProductsItem) {
    if (this.vnfProducts == null) {
      this.vnfProducts = new ArrayList<SubscriptionsFilterVnfProducts>();
    }
    this.vnfProducts.add(vnfProductsItem);
    return this;
  }

  /**
   * If present, match VNF packages that contain VNF products with certain product names, from one particular provider. 
   * @return vnfProducts
  **/
  @ApiModelProperty(value = "If present, match VNF packages that contain VNF products with certain product names, from one particular provider. ")

  @Valid

  public List<SubscriptionsFilterVnfProducts> getVnfProducts() {
    return vnfProducts;
  }

  public void setVnfProducts(List<SubscriptionsFilterVnfProducts> vnfProducts) {
    this.vnfProducts = vnfProducts;
  }

  public SubscriptionsFilterVnfProductsFromProviders vnfdId(List<String> vnfdId) {
    this.vnfdId = vnfdId;
    return this;
  }

  public SubscriptionsFilterVnfProductsFromProviders addVnfdIdItem(String vnfdIdItem) {
    if (this.vnfdId == null) {
      this.vnfdId = new ArrayList<String>();
    }
    this.vnfdId.add(vnfdIdItem);
    return this;
  }

  /**
   * Match VNF packages with a VNFD identifier listed in the attribute. 
   * @return vnfdId
  **/
  @ApiModelProperty(value = "Match VNF packages with a VNFD identifier listed in the attribute. ")


  public List<String> getVnfdId() {
    return vnfdId;
  }

  public void setVnfdId(List<String> vnfdId) {
    this.vnfdId = vnfdId;
  }

  public SubscriptionsFilterVnfProductsFromProviders vnfPkgId(List<String> vnfPkgId) {
    this.vnfPkgId = vnfPkgId;
    return this;
  }

  public SubscriptionsFilterVnfProductsFromProviders addVnfPkgIdItem(String vnfPkgIdItem) {
    if (this.vnfPkgId == null) {
      this.vnfPkgId = new ArrayList<String>();
    }
    this.vnfPkgId.add(vnfPkgIdItem);
    return this;
  }

  /**
   * Match VNF packages with a package identifier listed in the attribute. May be present if the \"notificationTypes\" attribute contains the value \"VnfPackageChangeNotification\", and shall be absent otherwise. 
   * @return vnfPkgId
  **/
  @ApiModelProperty(value = "Match VNF packages with a package identifier listed in the attribute. May be present if the \"notificationTypes\" attribute contains the value \"VnfPackageChangeNotification\", and shall be absent otherwise. ")


  public List<String> getVnfPkgId() {
    return vnfPkgId;
  }

  public void setVnfPkgId(List<String> vnfPkgId) {
    this.vnfPkgId = vnfPkgId;
  }

  public SubscriptionsFilterVnfProductsFromProviders operationalState(List<OperationalStateEnum> operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  public SubscriptionsFilterVnfProductsFromProviders addOperationalStateItem(OperationalStateEnum operationalStateItem) {
    if (this.operationalState == null) {
      this.operationalState = new ArrayList<OperationalStateEnum>();
    }
    this.operationalState.add(operationalStateItem);
    return this;
  }

  /**
   * Match VNF packages with a package identifier listed in the attribute. May be present if the \"notificationTypes\" attribute contains the value \"VnfPackageChangeNotification\", and shall be absent otherwise. 
   * @return operationalState
  **/
  @ApiModelProperty(value = "Match VNF packages with a package identifier listed in the attribute. May be present if the \"notificationTypes\" attribute contains the value \"VnfPackageChangeNotification\", and shall be absent otherwise. ")


  public List<OperationalStateEnum> getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(List<OperationalStateEnum> operationalState) {
    this.operationalState = operationalState;
  }

  public SubscriptionsFilterVnfProductsFromProviders usageState(List<UsageStateEnum> usageState) {
    this.usageState = usageState;
    return this;
  }

  public SubscriptionsFilterVnfProductsFromProviders addUsageStateItem(UsageStateEnum usageStateItem) {
    if (this.usageState == null) {
      this.usageState = new ArrayList<UsageStateEnum>();
    }
    this.usageState.add(usageStateItem);
    return this;
  }

  /**
   * Match particular usage state of the on-boarded VNF package. May be present if the \"notificationTypes\" attribute contains the value \"VnfPackageChangeNotification\", and shall be absent otherwise. 
   * @return usageState
  **/
  @ApiModelProperty(value = "Match particular usage state of the on-boarded VNF package. May be present if the \"notificationTypes\" attribute contains the value \"VnfPackageChangeNotification\", and shall be absent otherwise. ")


  public List<UsageStateEnum> getUsageState() {
    return usageState;
  }

  public void setUsageState(List<UsageStateEnum> usageState) {
    this.usageState = usageState;
  }

  public SubscriptionsFilterVnfProductsFromProviders vnfmInfo(List<String> vnfmInfo) {
    this.vnfmInfo = vnfmInfo;
    return this;
  }

  public SubscriptionsFilterVnfProductsFromProviders addVnfmInfoItem(String vnfmInfoItem) {
    if (this.vnfmInfo == null) {
      this.vnfmInfo = new ArrayList<String>();
    }
    this.vnfmInfo.add(vnfmInfoItem);
    return this;
  }

  /**
   * Match strings that specify VNFMs compatible with the VNF. See Table 9.5.2.5-1. 
   * @return vnfmInfo
  **/
  @ApiModelProperty(value = "Match strings that specify VNFMs compatible with the VNF. See Table 9.5.2.5-1. ")


  public List<String> getVnfmInfo() {
    return vnfmInfo;
  }

  public void setVnfmInfo(List<String> vnfmInfo) {
    this.vnfmInfo = vnfmInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionsFilterVnfProductsFromProviders subscriptionsFilterVnfProductsFromProviders = (SubscriptionsFilterVnfProductsFromProviders) o;
    return Objects.equals(this.vnfProvider, subscriptionsFilterVnfProductsFromProviders.vnfProvider) &&
        Objects.equals(this.vnfProducts, subscriptionsFilterVnfProductsFromProviders.vnfProducts) &&
        Objects.equals(this.vnfdId, subscriptionsFilterVnfProductsFromProviders.vnfdId) &&
        Objects.equals(this.vnfPkgId, subscriptionsFilterVnfProductsFromProviders.vnfPkgId) &&
        Objects.equals(this.operationalState, subscriptionsFilterVnfProductsFromProviders.operationalState) &&
        Objects.equals(this.usageState, subscriptionsFilterVnfProductsFromProviders.usageState) &&
        Objects.equals(this.vnfmInfo, subscriptionsFilterVnfProductsFromProviders.vnfmInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vnfProvider, vnfProducts, vnfdId, vnfPkgId, operationalState, usageState, vnfmInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionsFilterVnfProductsFromProviders {\n");
    
    sb.append("    vnfProvider: ").append(toIndentedString(vnfProvider)).append("\n");
    sb.append("    vnfProducts: ").append(toIndentedString(vnfProducts)).append("\n");
    sb.append("    vnfdId: ").append(toIndentedString(vnfdId)).append("\n");
    sb.append("    vnfPkgId: ").append(toIndentedString(vnfPkgId)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    usageState: ").append(toIndentedString(usageState)).append("\n");
    sb.append("    vnfmInfo: ").append(toIndentedString(vnfmInfo)).append("\n");
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

