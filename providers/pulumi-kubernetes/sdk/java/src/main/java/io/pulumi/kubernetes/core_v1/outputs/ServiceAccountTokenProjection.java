// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceAccountTokenProjection {
    /**
     * Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
     * 
     */
    private final @Nullable String audience;
    /**
     * ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
     * 
     */
    private final @Nullable Integer expirationSeconds;
    /**
     * Path is the path relative to the mount point of the file to project the token into.
     * 
     */
    private final String path;

    @OutputCustomType.Constructor
    private ServiceAccountTokenProjection(
        @OutputCustomType.Parameter("audience") @Nullable String audience,
        @OutputCustomType.Parameter("expirationSeconds") @Nullable Integer expirationSeconds,
        @OutputCustomType.Parameter("path") String path) {
        this.audience = audience;
        this.expirationSeconds = expirationSeconds;
        this.path = path;
    }

    /**
     * Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
     * 
    */
    public Optional<String> getAudience() {
        return Optional.ofNullable(this.audience);
    }
    /**
     * ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
     * 
    */
    public Optional<Integer> getExpirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }
    /**
     * Path is the path relative to the mount point of the file to project the token into.
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountTokenProjection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audience;
        private @Nullable Integer expirationSeconds;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountTokenProjection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.expirationSeconds = defaults.expirationSeconds;
    	      this.path = defaults.path;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }

        public Builder setExpirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public ServiceAccountTokenProjection build() {
            return new ServiceAccountTokenProjection(audience, expirationSeconds, path);
        }
    }
}
