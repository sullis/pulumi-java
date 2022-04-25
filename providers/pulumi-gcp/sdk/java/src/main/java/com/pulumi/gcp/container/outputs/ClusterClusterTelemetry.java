// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterClusterTelemetry {
    /**
     * @return The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ClusterClusterTelemetry(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * @return The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterTelemetry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterTelemetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ClusterClusterTelemetry build() {
            return new ClusterClusterTelemetry(type);
        }
    }
}
