// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.authentication.k8s.io_v1.outputs.UserInfo;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TokenReviewStatus {
    /**
     * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is "true", the token is valid against the audience of the Kubernetes API server.
     * 
     */
    private final @Nullable List<String> audiences;
    /**
     * Authenticated indicates that the token was associated with a known user.
     * 
     */
    private final @Nullable Boolean authenticated;
    /**
     * Error indicates that the token couldn't be checked
     * 
     */
    private final @Nullable String error;
    /**
     * User is the UserInfo associated with the provided token.
     * 
     */
    private final @Nullable UserInfo user;

    @OutputCustomType.Constructor({"audiences","authenticated","error","user"})
    private TokenReviewStatus(
        @Nullable List<String> audiences,
        @Nullable Boolean authenticated,
        @Nullable String error,
        @Nullable UserInfo user) {
        this.audiences = audiences;
        this.authenticated = authenticated;
        this.error = error;
        this.user = user;
    }

    /**
     * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is "true", the token is valid against the audience of the Kubernetes API server.
     * 
    */
    public List<String> getAudiences() {
        return this.audiences == null ? List.of() : this.audiences;
    }
    /**
     * Authenticated indicates that the token was associated with a known user.
     * 
    */
    public Optional<Boolean> getAuthenticated() {
        return Optional.ofNullable(this.authenticated);
    }
    /**
     * Error indicates that the token couldn't be checked
     * 
    */
    public Optional<String> getError() {
        return Optional.ofNullable(this.error);
    }
    /**
     * User is the UserInfo associated with the provided token.
     * 
    */
    public Optional<UserInfo> getUser() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenReviewStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> audiences;
        private @Nullable Boolean authenticated;
        private @Nullable String error;
        private @Nullable UserInfo user;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenReviewStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.authenticated = defaults.authenticated;
    	      this.error = defaults.error;
    	      this.user = defaults.user;
        }

        public Builder setAudiences(@Nullable List<String> audiences) {
            this.audiences = audiences;
            return this;
        }

        public Builder setAuthenticated(@Nullable Boolean authenticated) {
            this.authenticated = authenticated;
            return this;
        }

        public Builder setError(@Nullable String error) {
            this.error = error;
            return this;
        }

        public Builder setUser(@Nullable UserInfo user) {
            this.user = user;
            return this;
        }
        public TokenReviewStatus build() {
            return new TokenReviewStatus(audiences, authenticated, error, user);
        }
    }
}