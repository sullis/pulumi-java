// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TokenRequest contains parameters of a service account token.
 * 
 */
public final class TokenRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final TokenRequestArgs Empty = new TokenRequestArgs();

    /**
     * Audience is the intended audience of the token in "TokenRequestSpec". It will default to the audiences of kube apiserver.
     * 
     */
    @InputImport(name="audience", required=true)
    private final Input<String> audience;

    public Input<String> getAudience() {
        return this.audience;
    }

    /**
     * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec". It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
     * 
     */
    @InputImport(name="expirationSeconds")
    private final @Nullable Input<Integer> expirationSeconds;

    public Input<Integer> getExpirationSeconds() {
        return this.expirationSeconds == null ? Input.empty() : this.expirationSeconds;
    }

    public TokenRequestArgs(
        Input<String> audience,
        @Nullable Input<Integer> expirationSeconds) {
        this.audience = Objects.requireNonNull(audience, "expected parameter 'audience' to be non-null");
        this.expirationSeconds = expirationSeconds;
    }

    private TokenRequestArgs() {
        this.audience = Input.empty();
        this.expirationSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> audience;
        private @Nullable Input<Integer> expirationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.expirationSeconds = defaults.expirationSeconds;
        }

        public Builder setAudience(Input<String> audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }

        public Builder setAudience(String audience) {
            this.audience = Input.of(Objects.requireNonNull(audience));
            return this;
        }

        public Builder setExpirationSeconds(@Nullable Input<Integer> expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        public Builder setExpirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = Input.ofNullable(expirationSeconds);
            return this;
        }

        public TokenRequestArgs build() {
            return new TokenRequestArgs(audience, expirationSeconds);
        }
    }
}
