package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Parameters for authentication/authorization using OAUTH2_CLIENT_CREDENTIALS. 
 */
@ApiModel(description = "Parameters for authentication/authorization using OAUTH2_CLIENT_CREDENTIALS. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class VnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials   {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientPassword")
  private String clientPassword = null;

  @JsonProperty("tokenEndpoint")
  private String tokenEndpoint = null;

  public VnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client identifier to be used in the access token request of the OAuth 2.0 client credentials grant type. 
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "Client identifier to be used in the access token request of the OAuth 2.0 client credentials grant type. ")
  @NotNull


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public VnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials clientPassword(String clientPassword) {
    this.clientPassword = clientPassword;
    return this;
  }

  /**
   * Client password to be used in the access token request of the OAuth 2.0 client credentials grant type. Shall not be present in response bodies. 
   * @return clientPassword
  **/
  @ApiModelProperty(required = true, value = "Client password to be used in the access token request of the OAuth 2.0 client credentials grant type. Shall not be present in response bodies. ")
  @NotNull


  public String getClientPassword() {
    return clientPassword;
  }

  public void setClientPassword(String clientPassword) {
    this.clientPassword = clientPassword;
  }

  public VnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials tokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
    return this;
  }

  /**
   * String formatted according to IETF RFC 3986. 
   * @return tokenEndpoint
  **/
  @ApiModelProperty(required = true, value = "String formatted according to IETF RFC 3986. ")
  @NotNull


  public String getTokenEndpoint() {
    return tokenEndpoint;
  }

  public void setTokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials vnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials = (VnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials) o;
    return Objects.equals(this.clientId, vnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials.clientId) &&
        Objects.equals(this.clientPassword, vnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials.clientPassword) &&
        Objects.equals(this.tokenEndpoint, vnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials.tokenEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientPassword, tokenEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VnfPackagesvnfPkgIdextArtifactsAccessArtifactParamsOauth2ClientCredentials {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientPassword: ").append(toIndentedString(clientPassword)).append("\n");
    sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
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

