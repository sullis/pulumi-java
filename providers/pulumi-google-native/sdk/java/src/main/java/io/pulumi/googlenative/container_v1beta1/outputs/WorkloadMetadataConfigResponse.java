// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WorkloadMetadataConfigResponse {
    /**
     * Mode is the configuration for how to expose metadata to workloads running on the node pool.
     * 
     */
    private final String mode;
    /**
     * NodeMetadata is the configuration for how to expose metadata to the workloads running on the node.
     * 
     */
    private final String nodeMetadata;

    @OutputCustomType.Constructor({"mode","nodeMetadata"})
    private WorkloadMetadataConfigResponse(
        String mode,
        String nodeMetadata) {
        this.mode = Objects.requireNonNull(mode);
        this.nodeMetadata = Objects.requireNonNull(nodeMetadata);
    }

    /**
     * Mode is the configuration for how to expose metadata to workloads running on the node pool.
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * NodeMetadata is the configuration for how to expose metadata to the workloads running on the node.
     * 
    */
    public String getNodeMetadata() {
        return this.nodeMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadMetadataConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;
        private String nodeMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadMetadataConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.nodeMetadata = defaults.nodeMetadata;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setNodeMetadata(String nodeMetadata) {
            this.nodeMetadata = Objects.requireNonNull(nodeMetadata);
            return this;
        }
        public WorkloadMetadataConfigResponse build() {
            return new WorkloadMetadataConfigResponse(mode, nodeMetadata);
        }
    }
}