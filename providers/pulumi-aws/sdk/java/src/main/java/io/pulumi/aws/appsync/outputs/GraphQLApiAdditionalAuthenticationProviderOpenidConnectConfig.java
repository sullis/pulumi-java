// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig {
    /**
     * Number of milliseconds a token is valid after being authenticated.
     * 
     */
    private final @Nullable Integer authTtl;
    /**
     * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
     * 
     */
    private final @Nullable String clientId;
    /**
     * Number of milliseconds a token is valid after being issued to a user.
     * 
     */
    private final @Nullable Integer iatTtl;
    /**
     * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
     * 
     */
    private final String issuer;

    @CustomType.Constructor
    private GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig(
        @CustomType.Parameter("authTtl") @Nullable Integer authTtl,
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("iatTtl") @Nullable Integer iatTtl,
        @CustomType.Parameter("issuer") String issuer) {
        this.authTtl = authTtl;
        this.clientId = clientId;
        this.iatTtl = iatTtl;
        this.issuer = issuer;
    }

    /**
     * Number of milliseconds a token is valid after being authenticated.
     * 
    */
    public Optional<Integer> authTtl() {
        return Optional.ofNullable(this.authTtl);
    }
    /**
     * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
     * 
    */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * Number of milliseconds a token is valid after being issued to a user.
     * 
    */
    public Optional<Integer> iatTtl() {
        return Optional.ofNullable(this.iatTtl);
    }
    /**
     * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
     * 
    */
    public String issuer() {
        return this.issuer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer authTtl;
        private @Nullable String clientId;
        private @Nullable Integer iatTtl;
        private String issuer;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authTtl = defaults.authTtl;
    	      this.clientId = defaults.clientId;
    	      this.iatTtl = defaults.iatTtl;
    	      this.issuer = defaults.issuer;
        }

        public Builder authTtl(@Nullable Integer authTtl) {
            this.authTtl = authTtl;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder iatTtl(@Nullable Integer iatTtl) {
            this.iatTtl = iatTtl;
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }        public GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig build() {
            return new GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig(authTtl, clientId, iatTtl, issuer);
        }
    }
}
