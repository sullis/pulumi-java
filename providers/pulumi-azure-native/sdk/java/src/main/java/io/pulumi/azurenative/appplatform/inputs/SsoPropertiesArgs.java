// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Single sign-on related configuration
 * 
 */
public final class SsoPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SsoPropertiesArgs Empty = new SsoPropertiesArgs();

    /**
     * The public identifier for the application
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * The secret known only to the application and the authorization server
     * 
     */
    @InputImport(name="clientSecret")
      private final @Nullable Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    /**
     * The URI of Issuer Identifier
     * 
     */
    @InputImport(name="issuerUri")
      private final @Nullable Input<String> issuerUri;

    public Input<String> getIssuerUri() {
        return this.issuerUri == null ? Input.empty() : this.issuerUri;
    }

    /**
     * It defines the specific actions applications can be allowed to do on a user's behalf
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<List<String>> scope;

    public Input<List<String>> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    public SsoPropertiesArgs(
        @Nullable Input<String> clientId,
        @Nullable Input<String> clientSecret,
        @Nullable Input<String> issuerUri,
        @Nullable Input<List<String>> scope) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.issuerUri = issuerUri;
        this.scope = scope;
    }

    private SsoPropertiesArgs() {
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.issuerUri = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsoPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> clientSecret;
        private @Nullable Input<String> issuerUri;
        private @Nullable Input<List<String>> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(SsoPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuerUri = defaults.issuerUri;
    	      this.scope = defaults.scope;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setClientSecret(@Nullable Input<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
            return this;
        }

        public Builder setIssuerUri(@Nullable Input<String> issuerUri) {
            this.issuerUri = issuerUri;
            return this;
        }

        public Builder setIssuerUri(@Nullable String issuerUri) {
            this.issuerUri = Input.ofNullable(issuerUri);
            return this;
        }

        public Builder setScope(@Nullable Input<List<String>> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable List<String> scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }
        public SsoPropertiesArgs build() {
            return new SsoPropertiesArgs(clientId, clientSecret, issuerUri, scope);
        }
    }
}