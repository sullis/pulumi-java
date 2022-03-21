// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.aws.cognito.outputs.GetUserPoolClientAnalyticsConfiguration;
import io.pulumi.aws.cognito.outputs.GetUserPoolClientTokenValidityUnit;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUserPoolClientResult {
    /**
     * (Optional) Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `token_validity_units`.
     * 
     */
    private final Integer accessTokenValidity;
    /**
     * (Optional) List of allowed OAuth flows (code, implicit, client_credentials).
     * 
     */
    private final List<String> allowedOauthFlows;
    /**
     * (Optional) Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
     * 
     */
    private final Boolean allowedOauthFlowsUserPoolClient;
    /**
     * (Optional) List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
     * 
     */
    private final List<String> allowedOauthScopes;
    /**
     * (Optional) Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
     * 
     */
    private final List<GetUserPoolClientAnalyticsConfiguration> analyticsConfigurations;
    /**
     * (Optional) List of allowed callback URLs for the identity providers.
     * 
     */
    private final List<String> callbackUrls;
    private final String clientId;
    private final String clientSecret;
    /**
     * (Optional) Default redirect URI. Must be in the list of callback URLs.
     * 
     */
    private final String defaultRedirectUri;
    /**
     * (Optional) Enables or disables token revocation.
     * 
     */
    private final Boolean enableTokenRevocation;
    /**
     * (Optional) List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
     * 
     */
    private final List<String> explicitAuthFlows;
    /**
     * (Optional) Should an application secret be generated.
     * 
     */
    private final Boolean generateSecret;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * (Optional) Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `token_validity_units`.
     * 
     */
    private final Integer idTokenValidity;
    /**
     * (Optional) List of allowed logout URLs for the identity providers.
     * 
     */
    private final List<String> logoutUrls;
    private final String name;
    /**
     * (Optional) Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
     * 
     */
    private final String preventUserExistenceErrors;
    /**
     * (Optional) List of user pool attributes the application client can read from.
     * 
     */
    private final List<String> readAttributes;
    /**
     * (Optional) Time limit in days refresh tokens are valid for.
     * 
     */
    private final Integer refreshTokenValidity;
    /**
     * (Optional) List of provider names for the identity providers that are supported on this client. Uses the `provider_name` attribute of `aws.cognito.IdentityProvider` resource(s), or the equivalent string(s).
     * 
     */
    private final List<String> supportedIdentityProviders;
    /**
     * (Optional) Configuration block for units in which the validity times are represented in. Detailed below.
     * 
     */
    private final List<GetUserPoolClientTokenValidityUnit> tokenValidityUnits;
    private final String userPoolId;
    /**
     * (Optional) List of user pool attributes the application client can write to.
     * 
     */
    private final List<String> writeAttributes;

    @CustomType.Constructor
    private GetUserPoolClientResult(
        @CustomType.Parameter("accessTokenValidity") Integer accessTokenValidity,
        @CustomType.Parameter("allowedOauthFlows") List<String> allowedOauthFlows,
        @CustomType.Parameter("allowedOauthFlowsUserPoolClient") Boolean allowedOauthFlowsUserPoolClient,
        @CustomType.Parameter("allowedOauthScopes") List<String> allowedOauthScopes,
        @CustomType.Parameter("analyticsConfigurations") List<GetUserPoolClientAnalyticsConfiguration> analyticsConfigurations,
        @CustomType.Parameter("callbackUrls") List<String> callbackUrls,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") String clientSecret,
        @CustomType.Parameter("defaultRedirectUri") String defaultRedirectUri,
        @CustomType.Parameter("enableTokenRevocation") Boolean enableTokenRevocation,
        @CustomType.Parameter("explicitAuthFlows") List<String> explicitAuthFlows,
        @CustomType.Parameter("generateSecret") Boolean generateSecret,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("idTokenValidity") Integer idTokenValidity,
        @CustomType.Parameter("logoutUrls") List<String> logoutUrls,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("preventUserExistenceErrors") String preventUserExistenceErrors,
        @CustomType.Parameter("readAttributes") List<String> readAttributes,
        @CustomType.Parameter("refreshTokenValidity") Integer refreshTokenValidity,
        @CustomType.Parameter("supportedIdentityProviders") List<String> supportedIdentityProviders,
        @CustomType.Parameter("tokenValidityUnits") List<GetUserPoolClientTokenValidityUnit> tokenValidityUnits,
        @CustomType.Parameter("userPoolId") String userPoolId,
        @CustomType.Parameter("writeAttributes") List<String> writeAttributes) {
        this.accessTokenValidity = accessTokenValidity;
        this.allowedOauthFlows = allowedOauthFlows;
        this.allowedOauthFlowsUserPoolClient = allowedOauthFlowsUserPoolClient;
        this.allowedOauthScopes = allowedOauthScopes;
        this.analyticsConfigurations = analyticsConfigurations;
        this.callbackUrls = callbackUrls;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.defaultRedirectUri = defaultRedirectUri;
        this.enableTokenRevocation = enableTokenRevocation;
        this.explicitAuthFlows = explicitAuthFlows;
        this.generateSecret = generateSecret;
        this.id = id;
        this.idTokenValidity = idTokenValidity;
        this.logoutUrls = logoutUrls;
        this.name = name;
        this.preventUserExistenceErrors = preventUserExistenceErrors;
        this.readAttributes = readAttributes;
        this.refreshTokenValidity = refreshTokenValidity;
        this.supportedIdentityProviders = supportedIdentityProviders;
        this.tokenValidityUnits = tokenValidityUnits;
        this.userPoolId = userPoolId;
        this.writeAttributes = writeAttributes;
    }

    /**
     * (Optional) Time limit, between 5 minutes and 1 day, after which the access token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `token_validity_units`.
     * 
    */
    public Integer getAccessTokenValidity() {
        return this.accessTokenValidity;
    }
    /**
     * (Optional) List of allowed OAuth flows (code, implicit, client_credentials).
     * 
    */
    public List<String> getAllowedOauthFlows() {
        return this.allowedOauthFlows;
    }
    /**
     * (Optional) Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
     * 
    */
    public Boolean getAllowedOauthFlowsUserPoolClient() {
        return this.allowedOauthFlowsUserPoolClient;
    }
    /**
     * (Optional) List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
     * 
    */
    public List<String> getAllowedOauthScopes() {
        return this.allowedOauthScopes;
    }
    /**
     * (Optional) Configuration block for Amazon Pinpoint analytics for collecting metrics for this user pool. Detailed below.
     * 
    */
    public List<GetUserPoolClientAnalyticsConfiguration> getAnalyticsConfigurations() {
        return this.analyticsConfigurations;
    }
    /**
     * (Optional) List of allowed callback URLs for the identity providers.
     * 
    */
    public List<String> getCallbackUrls() {
        return this.callbackUrls;
    }
    public String getClientId() {
        return this.clientId;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * (Optional) Default redirect URI. Must be in the list of callback URLs.
     * 
    */
    public String getDefaultRedirectUri() {
        return this.defaultRedirectUri;
    }
    /**
     * (Optional) Enables or disables token revocation.
     * 
    */
    public Boolean getEnableTokenRevocation() {
        return this.enableTokenRevocation;
    }
    /**
     * (Optional) List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
     * 
    */
    public List<String> getExplicitAuthFlows() {
        return this.explicitAuthFlows;
    }
    /**
     * (Optional) Should an application secret be generated.
     * 
    */
    public Boolean getGenerateSecret() {
        return this.generateSecret;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * (Optional) Time limit, between 5 minutes and 1 day, after which the ID token is no longer valid and cannot be used. This value will be overridden if you have entered a value in `token_validity_units`.
     * 
    */
    public Integer getIdTokenValidity() {
        return this.idTokenValidity;
    }
    /**
     * (Optional) List of allowed logout URLs for the identity providers.
     * 
    */
    public List<String> getLogoutUrls() {
        return this.logoutUrls;
    }
    public String getName() {
        return this.name;
    }
    /**
     * (Optional) Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
     * 
    */
    public String getPreventUserExistenceErrors() {
        return this.preventUserExistenceErrors;
    }
    /**
     * (Optional) List of user pool attributes the application client can read from.
     * 
    */
    public List<String> getReadAttributes() {
        return this.readAttributes;
    }
    /**
     * (Optional) Time limit in days refresh tokens are valid for.
     * 
    */
    public Integer getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }
    /**
     * (Optional) List of provider names for the identity providers that are supported on this client. Uses the `provider_name` attribute of `aws.cognito.IdentityProvider` resource(s), or the equivalent string(s).
     * 
    */
    public List<String> getSupportedIdentityProviders() {
        return this.supportedIdentityProviders;
    }
    /**
     * (Optional) Configuration block for units in which the validity times are represented in. Detailed below.
     * 
    */
    public List<GetUserPoolClientTokenValidityUnit> getTokenValidityUnits() {
        return this.tokenValidityUnits;
    }
    public String getUserPoolId() {
        return this.userPoolId;
    }
    /**
     * (Optional) List of user pool attributes the application client can write to.
     * 
    */
    public List<String> getWriteAttributes() {
        return this.writeAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolClientResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer accessTokenValidity;
        private List<String> allowedOauthFlows;
        private Boolean allowedOauthFlowsUserPoolClient;
        private List<String> allowedOauthScopes;
        private List<GetUserPoolClientAnalyticsConfiguration> analyticsConfigurations;
        private List<String> callbackUrls;
        private String clientId;
        private String clientSecret;
        private String defaultRedirectUri;
        private Boolean enableTokenRevocation;
        private List<String> explicitAuthFlows;
        private Boolean generateSecret;
        private String id;
        private Integer idTokenValidity;
        private List<String> logoutUrls;
        private String name;
        private String preventUserExistenceErrors;
        private List<String> readAttributes;
        private Integer refreshTokenValidity;
        private List<String> supportedIdentityProviders;
        private List<GetUserPoolClientTokenValidityUnit> tokenValidityUnits;
        private String userPoolId;
        private List<String> writeAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolClientResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTokenValidity = defaults.accessTokenValidity;
    	      this.allowedOauthFlows = defaults.allowedOauthFlows;
    	      this.allowedOauthFlowsUserPoolClient = defaults.allowedOauthFlowsUserPoolClient;
    	      this.allowedOauthScopes = defaults.allowedOauthScopes;
    	      this.analyticsConfigurations = defaults.analyticsConfigurations;
    	      this.callbackUrls = defaults.callbackUrls;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.defaultRedirectUri = defaults.defaultRedirectUri;
    	      this.enableTokenRevocation = defaults.enableTokenRevocation;
    	      this.explicitAuthFlows = defaults.explicitAuthFlows;
    	      this.generateSecret = defaults.generateSecret;
    	      this.id = defaults.id;
    	      this.idTokenValidity = defaults.idTokenValidity;
    	      this.logoutUrls = defaults.logoutUrls;
    	      this.name = defaults.name;
    	      this.preventUserExistenceErrors = defaults.preventUserExistenceErrors;
    	      this.readAttributes = defaults.readAttributes;
    	      this.refreshTokenValidity = defaults.refreshTokenValidity;
    	      this.supportedIdentityProviders = defaults.supportedIdentityProviders;
    	      this.tokenValidityUnits = defaults.tokenValidityUnits;
    	      this.userPoolId = defaults.userPoolId;
    	      this.writeAttributes = defaults.writeAttributes;
        }

        public Builder accessTokenValidity(Integer accessTokenValidity) {
            this.accessTokenValidity = Objects.requireNonNull(accessTokenValidity);
            return this;
        }
        public Builder allowedOauthFlows(List<String> allowedOauthFlows) {
            this.allowedOauthFlows = Objects.requireNonNull(allowedOauthFlows);
            return this;
        }
        public Builder allowedOauthFlows(String... allowedOauthFlows) {
            return allowedOauthFlows(List.of(allowedOauthFlows));
        }
        public Builder allowedOauthFlowsUserPoolClient(Boolean allowedOauthFlowsUserPoolClient) {
            this.allowedOauthFlowsUserPoolClient = Objects.requireNonNull(allowedOauthFlowsUserPoolClient);
            return this;
        }
        public Builder allowedOauthScopes(List<String> allowedOauthScopes) {
            this.allowedOauthScopes = Objects.requireNonNull(allowedOauthScopes);
            return this;
        }
        public Builder allowedOauthScopes(String... allowedOauthScopes) {
            return allowedOauthScopes(List.of(allowedOauthScopes));
        }
        public Builder analyticsConfigurations(List<GetUserPoolClientAnalyticsConfiguration> analyticsConfigurations) {
            this.analyticsConfigurations = Objects.requireNonNull(analyticsConfigurations);
            return this;
        }
        public Builder analyticsConfigurations(GetUserPoolClientAnalyticsConfiguration... analyticsConfigurations) {
            return analyticsConfigurations(List.of(analyticsConfigurations));
        }
        public Builder callbackUrls(List<String> callbackUrls) {
            this.callbackUrls = Objects.requireNonNull(callbackUrls);
            return this;
        }
        public Builder callbackUrls(String... callbackUrls) {
            return callbackUrls(List.of(callbackUrls));
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder defaultRedirectUri(String defaultRedirectUri) {
            this.defaultRedirectUri = Objects.requireNonNull(defaultRedirectUri);
            return this;
        }
        public Builder enableTokenRevocation(Boolean enableTokenRevocation) {
            this.enableTokenRevocation = Objects.requireNonNull(enableTokenRevocation);
            return this;
        }
        public Builder explicitAuthFlows(List<String> explicitAuthFlows) {
            this.explicitAuthFlows = Objects.requireNonNull(explicitAuthFlows);
            return this;
        }
        public Builder explicitAuthFlows(String... explicitAuthFlows) {
            return explicitAuthFlows(List.of(explicitAuthFlows));
        }
        public Builder generateSecret(Boolean generateSecret) {
            this.generateSecret = Objects.requireNonNull(generateSecret);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder idTokenValidity(Integer idTokenValidity) {
            this.idTokenValidity = Objects.requireNonNull(idTokenValidity);
            return this;
        }
        public Builder logoutUrls(List<String> logoutUrls) {
            this.logoutUrls = Objects.requireNonNull(logoutUrls);
            return this;
        }
        public Builder logoutUrls(String... logoutUrls) {
            return logoutUrls(List.of(logoutUrls));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder preventUserExistenceErrors(String preventUserExistenceErrors) {
            this.preventUserExistenceErrors = Objects.requireNonNull(preventUserExistenceErrors);
            return this;
        }
        public Builder readAttributes(List<String> readAttributes) {
            this.readAttributes = Objects.requireNonNull(readAttributes);
            return this;
        }
        public Builder readAttributes(String... readAttributes) {
            return readAttributes(List.of(readAttributes));
        }
        public Builder refreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = Objects.requireNonNull(refreshTokenValidity);
            return this;
        }
        public Builder supportedIdentityProviders(List<String> supportedIdentityProviders) {
            this.supportedIdentityProviders = Objects.requireNonNull(supportedIdentityProviders);
            return this;
        }
        public Builder supportedIdentityProviders(String... supportedIdentityProviders) {
            return supportedIdentityProviders(List.of(supportedIdentityProviders));
        }
        public Builder tokenValidityUnits(List<GetUserPoolClientTokenValidityUnit> tokenValidityUnits) {
            this.tokenValidityUnits = Objects.requireNonNull(tokenValidityUnits);
            return this;
        }
        public Builder tokenValidityUnits(GetUserPoolClientTokenValidityUnit... tokenValidityUnits) {
            return tokenValidityUnits(List.of(tokenValidityUnits));
        }
        public Builder userPoolId(String userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public Builder writeAttributes(List<String> writeAttributes) {
            this.writeAttributes = Objects.requireNonNull(writeAttributes);
            return this;
        }
        public Builder writeAttributes(String... writeAttributes) {
            return writeAttributes(List.of(writeAttributes));
        }        public GetUserPoolClientResult build() {
            return new GetUserPoolClientResult(accessTokenValidity, allowedOauthFlows, allowedOauthFlowsUserPoolClient, allowedOauthScopes, analyticsConfigurations, callbackUrls, clientId, clientSecret, defaultRedirectUri, enableTokenRevocation, explicitAuthFlows, generateSecret, id, idTokenValidity, logoutUrls, name, preventUserExistenceErrors, readAttributes, refreshTokenValidity, supportedIdentityProviders, tokenValidityUnits, userPoolId, writeAttributes);
        }
    }
}
