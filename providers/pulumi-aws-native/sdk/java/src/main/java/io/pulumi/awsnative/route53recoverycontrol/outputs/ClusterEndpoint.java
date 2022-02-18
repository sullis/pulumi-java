// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterEndpoint {
    private final @Nullable String endpoint;
    private final @Nullable String region;

    @OutputCustomType.Constructor({"endpoint","region"})
    private ClusterEndpoint(
        @Nullable String endpoint,
        @Nullable String region) {
        this.endpoint = endpoint;
        this.region = region;
    }

    public Optional<String> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.region = defaults.region;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public ClusterEndpoint build() {
            return new ClusterEndpoint(endpoint, region);
        }
    }
}
