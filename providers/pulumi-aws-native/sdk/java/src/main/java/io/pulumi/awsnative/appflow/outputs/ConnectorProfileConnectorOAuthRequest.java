// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorProfileConnectorOAuthRequest {
    private final @Nullable String authCode;
    private final @Nullable String redirectUri;

    @OutputCustomType.Constructor({"authCode","redirectUri"})
    private ConnectorProfileConnectorOAuthRequest(
        @Nullable String authCode,
        @Nullable String redirectUri) {
        this.authCode = authCode;
        this.redirectUri = redirectUri;
    }

    public Optional<String> getAuthCode() {
        return Optional.ofNullable(this.authCode);
    }
    public Optional<String> getRedirectUri() {
        return Optional.ofNullable(this.redirectUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorOAuthRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authCode;
        private @Nullable String redirectUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileConnectorOAuthRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authCode = defaults.authCode;
    	      this.redirectUri = defaults.redirectUri;
        }

        public Builder setAuthCode(@Nullable String authCode) {
            this.authCode = authCode;
            return this;
        }

        public Builder setRedirectUri(@Nullable String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public ConnectorProfileConnectorOAuthRequest build() {
            return new ConnectorProfileConnectorOAuthRequest(authCode, redirectUri);
        }
    }
}
