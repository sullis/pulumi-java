// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Single sign-on related configuration
 * 
 */
public final class SsoPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SsoPropertiesResponse Empty = new SsoPropertiesResponse();

    /**
     * The public identifier for the application
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The secret known only to the application and the authorization server
     * 
     */
    @InputImport(name="clientSecret")
      private final @Nullable String clientSecret;

    public Optional<String> getClientSecret() {
        return this.clientSecret == null ? Optional.empty() : Optional.ofNullable(this.clientSecret);
    }

    /**
     * The URI of Issuer Identifier
     * 
     */
    @InputImport(name="issuerUri")
      private final @Nullable String issuerUri;

    public Optional<String> getIssuerUri() {
        return this.issuerUri == null ? Optional.empty() : Optional.ofNullable(this.issuerUri);
    }

    /**
     * It defines the specific actions applications can be allowed to do on a user's behalf
     * 
     */
    @InputImport(name="scope")
      private final @Nullable List<String> scope;

    public List<String> getScope() {
        return this.scope == null ? List.of() : this.scope;
    }

    public SsoPropertiesResponse(
        @Nullable String clientId,
        @Nullable String clientSecret,
        @Nullable String issuerUri,
        @Nullable List<String> scope) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.issuerUri = issuerUri;
        this.scope = scope;
    }

    private SsoPropertiesResponse() {
        this.clientId = null;
        this.clientSecret = null;
        this.issuerUri = null;
        this.scope = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsoPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String issuerUri;
        private @Nullable List<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(SsoPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuerUri = defaults.issuerUri;
    	      this.scope = defaults.scope;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setIssuerUri(@Nullable String issuerUri) {
            this.issuerUri = issuerUri;
            return this;
        }

        public Builder setScope(@Nullable List<String> scope) {
            this.scope = scope;
            return this;
        }
        public SsoPropertiesResponse build() {
            return new SsoPropertiesResponse(clientId, clientSecret, issuerUri, scope);
        }
    }
}