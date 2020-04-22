package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This type represents modifications to the information of a VNF package.  It shall comply with the provisions defined in Table 9.5.2.3-1. 
 */
@ApiModel(description = "This type represents modifications to the information of a VNF package.  It shall comply with the provisions defined in Table 9.5.2.3-1. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class Body1   {
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
  private OperationalStateEnum operationalState = null;

  @JsonProperty("userDefinedData")
  private Object userDefinedData = null;

  public Body1 operationalState(OperationalStateEnum operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * \"The enumeration PackageOperationalStateType shall  comply with the provisions defined in Table 9.5.4.4-1.\" Acceptable values are: - ENABLED - The VNF package is enabled, i.e. it can be used for instantiation of new VNF instances. - DISABLED - The VNF package is disabled, i.e. it cannot be used for further VNF instantiation requests             (unless and until the VNF package is re-enabled). 
   * @return operationalState
  **/
  @ApiModelProperty(value = "\"The enumeration PackageOperationalStateType shall  comply with the provisions defined in Table 9.5.4.4-1.\" Acceptable values are: - ENABLED - The VNF package is enabled, i.e. it can be used for instantiation of new VNF instances. - DISABLED - The VNF package is disabled, i.e. it cannot be used for further VNF instantiation requests             (unless and until the VNF package is re-enabled). ")


  public OperationalStateEnum getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(OperationalStateEnum operationalState) {
    this.operationalState = operationalState;
  }

  public Body1 userDefinedData(Object userDefinedData) {
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

  public void setUserDefinedData(Object userDefinedData) {
    this.userDefinedData = userDefinedData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(this.operationalState, body1.operationalState) &&
        Objects.equals(this.userDefinedData, body1.userDefinedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalState, userDefinedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    userDefinedData: ").append(toIndentedString(userDefinedData)).append("\n");
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

