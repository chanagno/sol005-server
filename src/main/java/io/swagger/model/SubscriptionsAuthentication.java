package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubscriptionsAuthenticationParamsBasic;
import io.swagger.model.SubscriptionsAuthenticationParamsOauth2ClientCredentials;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionsAuthentication
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

public class SubscriptionsAuthentication   {
  /**
   * Gets or Sets authType
   */
  public enum AuthTypeEnum {
    BASIC("BASIC"),
    
    OAUTH2_CLIENT_CREDENTIALS("OAUTH2_CLIENT_CREDENTIALS"),
    
    TLS_CERT("TLS_CERT");

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
  @Valid
  private List<AuthTypeEnum> authType = new ArrayList<AuthTypeEnum>();

  @JsonProperty("paramsBasic")
  private SubscriptionsAuthenticationParamsBasic paramsBasic = null;

  @JsonProperty("paramsOauth2ClientCredentials")
  private SubscriptionsAuthenticationParamsOauth2ClientCredentials paramsOauth2ClientCredentials = null;

  public SubscriptionsAuthentication authType(List<AuthTypeEnum> authType) {
    this.authType = authType;
    return this;
  }

  public SubscriptionsAuthentication addAuthTypeItem(AuthTypeEnum authTypeItem) {
    this.authType.add(authTypeItem);
    return this;
  }

  /**
   * Defines the types of Authentication / Authorization which the API consumer is willing to accept when receiving a notification. Permitted values: - BASIC: In every HTTP request to the notification endpoint, use   HTTP Basic authentication with the client credentials. - OAUTH2_CLIENT_CREDENTIALS: In every HTTP request to the   notification endpoint, use an OAuth 2.0 Bearer token, obtained   using the client credentials grant type. - TLS_CERT: Every HTTP request to the notification endpoint is sent   over a mutually authenticated TLS session, i.e. not only the   server is authenticated, but also the client is authenticated   during the TLS tunnel setup. 
   * @return authType
  **/
  @ApiModelProperty(required = true, value = "Defines the types of Authentication / Authorization which the API consumer is willing to accept when receiving a notification. Permitted values: - BASIC: In every HTTP request to the notification endpoint, use   HTTP Basic authentication with the client credentials. - OAUTH2_CLIENT_CREDENTIALS: In every HTTP request to the   notification endpoint, use an OAuth 2.0 Bearer token, obtained   using the client credentials grant type. - TLS_CERT: Every HTTP request to the notification endpoint is sent   over a mutually authenticated TLS session, i.e. not only the   server is authenticated, but also the client is authenticated   during the TLS tunnel setup. ")
  @NotNull


  public List<AuthTypeEnum> getAuthType() {
    return authType;
  }

  public void setAuthType(List<AuthTypeEnum> authType) {
    this.authType = authType;
  }

  public SubscriptionsAuthentication paramsBasic(SubscriptionsAuthenticationParamsBasic paramsBasic) {
    this.paramsBasic = paramsBasic;
    return this;
  }

  /**
   * Get paramsBasic
   * @return paramsBasic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SubscriptionsAuthenticationParamsBasic getParamsBasic() {
    return paramsBasic;
  }

  public void setParamsBasic(SubscriptionsAuthenticationParamsBasic paramsBasic) {
    this.paramsBasic = paramsBasic;
  }

  public SubscriptionsAuthentication paramsOauth2ClientCredentials(SubscriptionsAuthenticationParamsOauth2ClientCredentials paramsOauth2ClientCredentials) {
    this.paramsOauth2ClientCredentials = paramsOauth2ClientCredentials;
    return this;
  }

  /**
   * Get paramsOauth2ClientCredentials
   * @return paramsOauth2ClientCredentials
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SubscriptionsAuthenticationParamsOauth2ClientCredentials getParamsOauth2ClientCredentials() {
    return paramsOauth2ClientCredentials;
  }

  public void setParamsOauth2ClientCredentials(SubscriptionsAuthenticationParamsOauth2ClientCredentials paramsOauth2ClientCredentials) {
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
    SubscriptionsAuthentication subscriptionsAuthentication = (SubscriptionsAuthentication) o;
    return Objects.equals(this.authType, subscriptionsAuthentication.authType) &&
        Objects.equals(this.paramsBasic, subscriptionsAuthentication.paramsBasic) &&
        Objects.equals(this.paramsOauth2ClientCredentials, subscriptionsAuthentication.paramsOauth2ClientCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, paramsBasic, paramsOauth2ClientCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionsAuthentication {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    paramsBasic: ").append(toIndentedString(paramsBasic)).append("\n");
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

