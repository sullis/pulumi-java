// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterEndpointArgs Empty = new ClusterClusterEndpointArgs();

    /**
     * Cluster endpoint.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> endpoint() {
        return this.endpoint == null ? Codegen.empty() : this.endpoint;
    }

    /**
     * Region of the endpoint.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    public ClusterClusterEndpointArgs(
        @Nullable Output<String> endpoint,
        @Nullable Output<String> region) {
        this.endpoint = endpoint;
        this.region = region;
    }

    private ClusterClusterEndpointArgs() {
        this.endpoint = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endpoint;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.region = defaults.region;
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Codegen.ofNullable(endpoint);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }        public ClusterClusterEndpointArgs build() {
            return new ClusterClusterEndpointArgs(endpoint, region);
        }
    }
}
