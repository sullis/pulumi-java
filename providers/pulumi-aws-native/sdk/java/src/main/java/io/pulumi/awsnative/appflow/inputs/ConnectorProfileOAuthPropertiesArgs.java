// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileOAuthPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileOAuthPropertiesArgs Empty = new ConnectorProfileOAuthPropertiesArgs();

    @InputImport(name="authCodeUrl")
      private final @Nullable Input<String> authCodeUrl;

    public Input<String> getAuthCodeUrl() {
        return this.authCodeUrl == null ? Input.empty() : this.authCodeUrl;
    }

    @InputImport(name="oAuthScopes")
      private final @Nullable Input<List<String>> oAuthScopes;

    public Input<List<String>> getOAuthScopes() {
        return this.oAuthScopes == null ? Input.empty() : this.oAuthScopes;
    }

    @InputImport(name="tokenUrl")
      private final @Nullable Input<String> tokenUrl;

    public Input<String> getTokenUrl() {
        return this.tokenUrl == null ? Input.empty() : this.tokenUrl;
    }

    public ConnectorProfileOAuthPropertiesArgs(
        @Nullable Input<String> authCodeUrl,
        @Nullable Input<List<String>> oAuthScopes,
        @Nullable Input<String> tokenUrl) {
        this.authCodeUrl = authCodeUrl;
        this.oAuthScopes = oAuthScopes;
        this.tokenUrl = tokenUrl;
    }

    private ConnectorProfileOAuthPropertiesArgs() {
        this.authCodeUrl = Input.empty();
        this.oAuthScopes = Input.empty();
        this.tokenUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileOAuthPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authCodeUrl;
        private @Nullable Input<List<String>> oAuthScopes;
        private @Nullable Input<String> tokenUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileOAuthPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authCodeUrl = defaults.authCodeUrl;
    	      this.oAuthScopes = defaults.oAuthScopes;
    	      this.tokenUrl = defaults.tokenUrl;
        }

        public Builder setAuthCodeUrl(@Nullable Input<String> authCodeUrl) {
            this.authCodeUrl = authCodeUrl;
            return this;
        }

        public Builder setAuthCodeUrl(@Nullable String authCodeUrl) {
            this.authCodeUrl = Input.ofNullable(authCodeUrl);
            return this;
        }

        public Builder setOAuthScopes(@Nullable Input<List<String>> oAuthScopes) {
            this.oAuthScopes = oAuthScopes;
            return this;
        }

        public Builder setOAuthScopes(@Nullable List<String> oAuthScopes) {
            this.oAuthScopes = Input.ofNullable(oAuthScopes);
            return this;
        }

        public Builder setTokenUrl(@Nullable Input<String> tokenUrl) {
            this.tokenUrl = tokenUrl;
            return this;
        }

        public Builder setTokenUrl(@Nullable String tokenUrl) {
            this.tokenUrl = Input.ofNullable(tokenUrl);
            return this;
        }
        public ConnectorProfileOAuthPropertiesArgs build() {
            return new ConnectorProfileOAuthPropertiesArgs(authCodeUrl, oAuthScopes, tokenUrl);
        }
    }
}