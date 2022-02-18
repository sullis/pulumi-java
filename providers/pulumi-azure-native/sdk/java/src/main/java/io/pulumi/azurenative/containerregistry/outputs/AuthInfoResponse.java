// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AuthInfoResponse {
    /**
     * Time in seconds that the token remains valid
     * 
     */
    private final @Nullable Integer expiresIn;
    /**
     * The refresh token used to refresh the access token.
     * 
     */
    private final @Nullable String refreshToken;
    /**
     * The scope of the access token.
     * 
     */
    private final @Nullable String scope;
    /**
     * The access token used to access the source control provider.
     * 
     */
    private final String token;
    /**
     * The type of Auth token.
     * 
     */
    private final String tokenType;

    @OutputCustomType.Constructor({"expiresIn","refreshToken","scope","token","tokenType"})
    private AuthInfoResponse(
        @Nullable Integer expiresIn,
        @Nullable String refreshToken,
        @Nullable String scope,
        String token,
        String tokenType) {
        this.expiresIn = expiresIn;
        this.refreshToken = refreshToken;
        this.scope = scope;
        this.token = Objects.requireNonNull(token);
        this.tokenType = Objects.requireNonNull(tokenType);
    }

    /**
     * Time in seconds that the token remains valid
     * 
     */
    public Optional<Integer> getExpiresIn() {
        return Optional.ofNullable(this.expiresIn);
    }
    /**
     * The refresh token used to refresh the access token.
     * 
     */
    public Optional<String> getRefreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }
    /**
     * The scope of the access token.
     * 
     */
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * The access token used to access the source control provider.
     * 
     */
    public String getToken() {
        return this.token;
    }
    /**
     * The type of Auth token.
     * 
     */
    public String getTokenType() {
        return this.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer expiresIn;
        private @Nullable String refreshToken;
        private @Nullable String scope;
        private String token;
        private String tokenType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiresIn = defaults.expiresIn;
    	      this.refreshToken = defaults.refreshToken;
    	      this.scope = defaults.scope;
    	      this.token = defaults.token;
    	      this.tokenType = defaults.tokenType;
        }

        public Builder setExpiresIn(@Nullable Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder setToken(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }

        public Builder setTokenType(String tokenType) {
            this.tokenType = Objects.requireNonNull(tokenType);
            return this;
        }

        public AuthInfoResponse build() {
            return new AuthInfoResponse(expiresIn, refreshToken, scope, token, tokenType);
        }
    }
}
