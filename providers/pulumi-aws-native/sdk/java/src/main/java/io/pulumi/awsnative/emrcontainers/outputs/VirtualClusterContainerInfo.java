// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emrcontainers.outputs;

import io.pulumi.awsnative.emrcontainers.outputs.VirtualClusterEksInfo;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class VirtualClusterContainerInfo {
    private final VirtualClusterEksInfo eksInfo;

    @CustomType.Constructor
    private VirtualClusterContainerInfo(@CustomType.Parameter("eksInfo") VirtualClusterEksInfo eksInfo) {
        this.eksInfo = eksInfo;
    }

    public VirtualClusterEksInfo eksInfo() {
        return this.eksInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterContainerInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualClusterEksInfo eksInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualClusterContainerInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eksInfo = defaults.eksInfo;
        }

        public Builder eksInfo(VirtualClusterEksInfo eksInfo) {
            this.eksInfo = Objects.requireNonNull(eksInfo);
            return this;
        }        public VirtualClusterContainerInfo build() {
            return new VirtualClusterContainerInfo(eksInfo);
        }
    }
}
