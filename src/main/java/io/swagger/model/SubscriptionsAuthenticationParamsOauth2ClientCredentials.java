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
 * Parameters for authentication/authorization using OAUTH2_CLIENT_CREDENTIALS. Shall be present if authType is \&quot;OAUTH2_CLIENT_CREDENTIALS\&quot; and the contained information has not been provisioned out of band. Shall be absent otherwise. 
 */
@ApiModel(description = "Parameters for authentication/authorization using OAUTH2_CLIENT_CREDENTIALS. Shall be present if authType is \"OAUTH2_CLIENT_CREDENTIALS\" and the contained information has not been provisioned out of band. Shall be absent otherwise. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class SubscriptionsAuthenticationParamsOauth2ClientCredentials   {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientPassword")
  private String clientPassword = null;

  @JsonProperty("tokenEndpoint")
  private String tokenEndpoint = null;

  public SubscriptionsAuthenticationParamsOauth2ClientCredentials clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client identifier to be used in the access token request of the OAuth 2.0 client credentials grant type. Shall be present if it has not been provisioned out of band. The clientId and clientPassword passed in a subscription shall not be the same as the clientId and clientPassword that are used to obtain authorization for API requests. Client credentials may differ between subscriptions. The value of clientPassword should be generated by a random process. 
   * @return clientId
  **/
  @ApiModelProperty(value = "Client identifier to be used in the access token request of the OAuth 2.0 client credentials grant type. Shall be present if it has not been provisioned out of band. The clientId and clientPassword passed in a subscription shall not be the same as the clientId and clientPassword that are used to obtain authorization for API requests. Client credentials may differ between subscriptions. The value of clientPassword should be generated by a random process. ")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public SubscriptionsAuthenticationParamsOauth2ClientCredentials clientPassword(String clientPassword) {
    this.clientPassword = clientPassword;
    return this;
  }

  /**
   * Client password to be used in the access token request of the OAuth 2.0 client credentials grant type. Shall be present if it has not been provisioned out of band. The clientId and clientPassword passed in a subscription shall not be the same as the clientId and clientPassword that are used to obtain authorization for API requests. Client credentials may differ between subscriptions. The value of clientPassword should be generated by a random process. 
   * @return clientPassword
  **/
  @ApiModelProperty(value = "Client password to be used in the access token request of the OAuth 2.0 client credentials grant type. Shall be present if it has not been provisioned out of band. The clientId and clientPassword passed in a subscription shall not be the same as the clientId and clientPassword that are used to obtain authorization for API requests. Client credentials may differ between subscriptions. The value of clientPassword should be generated by a random process. ")


  public String getClientPassword() {
    return clientPassword;
  }

  public void setClientPassword(String clientPassword) {
    this.clientPassword = clientPassword;
  }

  public SubscriptionsAuthenticationParamsOauth2ClientCredentials tokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
    return this;
  }

  /**
   * String formatted according to IETF RFC 3986. 
   * @return tokenEndpoint
  **/
  @ApiModelProperty(value = "String formatted according to IETF RFC 3986. ")


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
    SubscriptionsAuthenticationParamsOauth2ClientCredentials subscriptionsAuthenticationParamsOauth2ClientCredentials = (SubscriptionsAuthenticationParamsOauth2ClientCredentials) o;
    return Objects.equals(this.clientId, subscriptionsAuthenticationParamsOauth2ClientCredentials.clientId) &&
        Objects.equals(this.clientPassword, subscriptionsAuthenticationParamsOauth2ClientCredentials.clientPassword) &&
        Objects.equals(this.tokenEndpoint, subscriptionsAuthenticationParamsOauth2ClientCredentials.tokenEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientPassword, tokenEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionsAuthenticationParamsOauth2ClientCredentials {\n");
    
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

