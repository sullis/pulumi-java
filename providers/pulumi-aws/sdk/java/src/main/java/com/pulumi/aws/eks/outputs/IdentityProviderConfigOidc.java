// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IdentityProviderConfigOidc {
    /**
     * @return Client ID for the OpenID Connect identity provider.
     * 
     */
    private final String clientId;
    /**
     * @return The JWT claim that the provider will use to return groups.
     * 
     */
    private final @Nullable String groupsClaim;
    /**
     * @return A prefix that is prepended to group claims e.g., `oidc:`.
     * 
     */
    private final @Nullable String groupsPrefix;
    /**
     * @return The name of the identity provider config.
     * 
     */
    private final String identityProviderConfigName;
    /**
     * @return Issuer URL for the OpenID Connect identity provider.
     * 
     */
    private final String issuerUrl;
    /**
     * @return The key value pairs that describe required claims in the identity token.
     * 
     */
    private final @Nullable Map<String,String> requiredClaims;
    /**
     * @return The JWT claim that the provider will use as the username.
     * 
     */
    private final @Nullable String usernameClaim;
    /**
     * @return A prefix that is prepended to username claims.
     * 
     */
    private final @Nullable String usernamePrefix;

    @CustomType.Constructor
    private IdentityProviderConfigOidc(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("groupsClaim") @Nullable String groupsClaim,
        @CustomType.Parameter("groupsPrefix") @Nullable String groupsPrefix,
        @CustomType.Parameter("identityProviderConfigName") String identityProviderConfigName,
        @CustomType.Parameter("issuerUrl") String issuerUrl,
        @CustomType.Parameter("requiredClaims") @Nullable Map<String,String> requiredClaims,
        @CustomType.Parameter("usernameClaim") @Nullable String usernameClaim,
        @CustomType.Parameter("usernamePrefix") @Nullable String usernamePrefix) {
        this.clientId = clientId;
        this.groupsClaim = groupsClaim;
        this.groupsPrefix = groupsPrefix;
        this.identityProviderConfigName = identityProviderConfigName;
        this.issuerUrl = issuerUrl;
        this.requiredClaims = requiredClaims;
        this.usernameClaim = usernameClaim;
        this.usernamePrefix = usernamePrefix;
    }

    /**
     * @return Client ID for the OpenID Connect identity provider.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The JWT claim that the provider will use to return groups.
     * 
     */
    public Optional<String> groupsClaim() {
        return Optional.ofNullable(this.groupsClaim);
    }
    /**
     * @return A prefix that is prepended to group claims e.g., `oidc:`.
     * 
     */
    public Optional<String> groupsPrefix() {
        return Optional.ofNullable(this.groupsPrefix);
    }
    /**
     * @return The name of the identity provider config.
     * 
     */
    public String identityProviderConfigName() {
        return this.identityProviderConfigName;
    }
    /**
     * @return Issuer URL for the OpenID Connect identity provider.
     * 
     */
    public String issuerUrl() {
        return this.issuerUrl;
    }
    /**
     * @return The key value pairs that describe required claims in the identity token.
     * 
     */
    public Map<String,String> requiredClaims() {
        return this.requiredClaims == null ? Map.of() : this.requiredClaims;
    }
    /**
     * @return The JWT claim that the provider will use as the username.
     * 
     */
    public Optional<String> usernameClaim() {
        return Optional.ofNullable(this.usernameClaim);
    }
    /**
     * @return A prefix that is prepended to username claims.
     * 
     */
    public Optional<String> usernamePrefix() {
        return Optional.ofNullable(this.usernamePrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProviderConfigOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private @Nullable String groupsClaim;
        private @Nullable String groupsPrefix;
        private String identityProviderConfigName;
        private String issuerUrl;
        private @Nullable Map<String,String> requiredClaims;
        private @Nullable String usernameClaim;
        private @Nullable String usernamePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProviderConfigOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.groupsClaim = defaults.groupsClaim;
    	      this.groupsPrefix = defaults.groupsPrefix;
    	      this.identityProviderConfigName = defaults.identityProviderConfigName;
    	      this.issuerUrl = defaults.issuerUrl;
    	      this.requiredClaims = defaults.requiredClaims;
    	      this.usernameClaim = defaults.usernameClaim;
    	      this.usernamePrefix = defaults.usernamePrefix;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder groupsClaim(@Nullable String groupsClaim) {
            this.groupsClaim = groupsClaim;
            return this;
        }
        public Builder groupsPrefix(@Nullable String groupsPrefix) {
            this.groupsPrefix = groupsPrefix;
            return this;
        }
        public Builder identityProviderConfigName(String identityProviderConfigName) {
            this.identityProviderConfigName = Objects.requireNonNull(identityProviderConfigName);
            return this;
        }
        public Builder issuerUrl(String issuerUrl) {
            this.issuerUrl = Objects.requireNonNull(issuerUrl);
            return this;
        }
        public Builder requiredClaims(@Nullable Map<String,String> requiredClaims) {
            this.requiredClaims = requiredClaims;
            return this;
        }
        public Builder usernameClaim(@Nullable String usernameClaim) {
            this.usernameClaim = usernameClaim;
            return this;
        }
        public Builder usernamePrefix(@Nullable String usernamePrefix) {
            this.usernamePrefix = usernamePrefix;
            return this;
        }        public IdentityProviderConfigOidc build() {
            return new IdentityProviderConfigOidc(clientId, groupsClaim, groupsPrefix, identityProviderConfigName, issuerUrl, requiredClaims, usernameClaim, usernamePrefix);
        }
    }
}
