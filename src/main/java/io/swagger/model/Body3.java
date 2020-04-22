package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VnfPackagesvnfPkgIdpackageContentuploadFromUriParamsOauth2ClientCredentials;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This type represents the request parameters for uploading the content of a VNF package. The NFVO can obtain the VNF package content through the information provided in the request parameters. It shall comply with the provisions defined in Table 9.5.2.4-1. 
 */
@ApiModel(description = "This type represents the request parameters for uploading the content of a VNF package. The NFVO can obtain the VNF package content through the information provided in the request parameters. It shall comply with the provisions defined in Table 9.5.2.4-1. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class Body3   {
  @JsonProperty("addressInformation")
  private String addressInformation = null;

  /**
   * Defines the type of authentication / authorization for downloading the VNF package. Permitted values: - BASIC: Only the \"username\" and \"password\" attributes shall be present. - OAUTH2_CLIENT_CREDENTIAL S: Only the \"paramsOauth2ClientCredentials\" attribute shall be present. This attribute shall not be present if no credentials are provided for the artifact. 
   */
  public enum AuthTypeEnum {
    BASIC("BASIC"),
    
    OAUTH2_CLIENT_CREDENTIALS("OAUTH2_CLIENT_CREDENTIALS");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AuthTypeEnum fromValue(String text) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("authType")
  private AuthTypeEnum authType = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("paramsOauth2ClientCredentials")
  private VnfPackagesvnfPkgIdpackageContentuploadFromUriParamsOauth2ClientCredentials paramsOauth2ClientCredentials = null;

  public Body3 addressInformation(String addressInformation) {
    this.addressInformation = addressInformation;
    return this;
  }

  /**
   * String formatted according to IETF RFC 3986. 
   * @return addressInformation
  **/
  @ApiModelProperty(required = true, value = "String formatted according to IETF RFC 3986. ")
  @NotNull
  public String getAddressInformation() {
    return addressInformation;
  }

  public void setAddressInformation(String addressInformation) {
    this.addressInformation = addressInformation;
  }

  public Body3 authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

  /**
   * Defines the type of authentication / authorization for downloading the VNF package. Permitted values: - BASIC: Only the \"username\" and \"password\" attributes shall be present. - OAUTH2_CLIENT_CREDENTIAL S: Only the \"paramsOauth2ClientCredentials\" attribute shall be present. This attribute shall not be present if no credentials are provided for the artifact. 
   * @return authType
  **/
  @ApiModelProperty(value = "Defines the type of authentication / authorization for downloading the VNF package. Permitted values: - BASIC: Only the \"username\" and \"password\" attributes shall be present. - OAUTH2_CLIENT_CREDENTIAL S: Only the \"paramsOauth2ClientCredentials\" attribute shall be present. This attribute shall not be present if no credentials are provided for the artifact. ")


  public AuthTypeEnum getAuthType() {
    return authType;
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }

  public Body3 username(String username) {
    this.username = username;
    return this;
  }

  /**
   * User name to be used for authentication. 
   * @return username
  **/
  @ApiModelProperty(value = "User name to be used for authentication. ")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Body3 password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password to be used for authentication. Shall not be present in response bodies. 
   * @return password
  **/
  @ApiModelProperty(value = "Password to be used for authentication. Shall not be present in response bodies. ")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Body3 paramsOauth2ClientCredentials(VnfPackagesvnfPkgIdpackageContentuploadFromUriParamsOauth2ClientCredentials paramsOauth2ClientCredentials) {
    this.paramsOauth2ClientCredentials = paramsOauth2ClientCredentials;
    return this;
  }

  /**
   * Get paramsOauth2ClientCredentials
   * @return paramsOauth2ClientCredentials
  **/
  @ApiModelProperty(value = "")

  @Valid

  public VnfPackagesvnfPkgIdpackageContentuploadFromUriParamsOauth2ClientCredentials getParamsOauth2ClientCredentials() {
    return paramsOauth2ClientCredentials;
  }

  public void setParamsOauth2ClientCredentials(VnfPackagesvnfPkgIdpackageContentuploadFromUriParamsOauth2ClientCredentials paramsOauth2ClientCredentials) {
    this.paramsOauth2ClientCredentials = paramsOauth2ClientCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body3 body3 = (Body3) o;
    return Objects.equals(this.addressInformation, body3.addressInformation) &&
        Objects.equals(this.authType, body3.authType) &&
        Objects.equals(this.username, body3.username) &&
        Objects.equals(this.password, body3.password) &&
        Objects.equals(this.paramsOauth2ClientCredentials, body3.paramsOauth2ClientCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInformation, authType, username, password, paramsOauth2ClientCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body3 {\n");
    
    sb.append("    addressInformation: ").append(toIndentedString(addressInformation)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    paramsOauth2ClientCredentials: ").append(toIndentedString(paramsOauth2ClientCredentials)).append("\n");
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

