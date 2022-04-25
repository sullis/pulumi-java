// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterNodeConfigWorkloadMetadataConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigWorkloadMetadataConfigArgs Empty = new ClusterNodeConfigWorkloadMetadataConfigArgs();

    /**
     * How to expose the node metadata to the workload running on the node.
     * Accepted values are:
     * * UNSPECIFIED: Not Set
     * * GCE_METADATA: Expose all Compute Engine metadata to pods.
     * * GKE_METADATA: Run the GKE Metadata Server on this node. The GKE Metadata Server exposes a metadata API to workloads that is compatible with the V1 Compute Metadata APIs exposed by the Compute Engine and App Engine Metadata Servers. This feature can only be enabled if [workload identity](https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity) is enabled at the cluster level.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return How to expose the node metadata to the workload running on the node.
     * Accepted values are:
     * * UNSPECIFIED: Not Set
     * * GCE_METADATA: Expose all Compute Engine metadata to pods.
     * * GKE_METADATA: Run the GKE Metadata Server on this node. The GKE Metadata Server exposes a metadata API to workloads that is compatible with the V1 Compute Metadata APIs exposed by the Compute Engine and App Engine Metadata Servers. This feature can only be enabled if [workload identity](https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity) is enabled at the cluster level.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    private ClusterNodeConfigWorkloadMetadataConfigArgs() {}

    private ClusterNodeConfigWorkloadMetadataConfigArgs(ClusterNodeConfigWorkloadMetadataConfigArgs $) {
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeConfigWorkloadMetadataConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeConfigWorkloadMetadataConfigArgs $;

        public Builder() {
            $ = new ClusterNodeConfigWorkloadMetadataConfigArgs();
        }

        public Builder(ClusterNodeConfigWorkloadMetadataConfigArgs defaults) {
            $ = new ClusterNodeConfigWorkloadMetadataConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode How to expose the node metadata to the workload running on the node.
         * Accepted values are:
         * * UNSPECIFIED: Not Set
         * * GCE_METADATA: Expose all Compute Engine metadata to pods.
         * * GKE_METADATA: Run the GKE Metadata Server on this node. The GKE Metadata Server exposes a metadata API to workloads that is compatible with the V1 Compute Metadata APIs exposed by the Compute Engine and App Engine Metadata Servers. This feature can only be enabled if [workload identity](https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity) is enabled at the cluster level.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode How to expose the node metadata to the workload running on the node.
         * Accepted values are:
         * * UNSPECIFIED: Not Set
         * * GCE_METADATA: Expose all Compute Engine metadata to pods.
         * * GKE_METADATA: Run the GKE Metadata Server on this node. The GKE Metadata Server exposes a metadata API to workloads that is compatible with the V1 Compute Metadata APIs exposed by the Compute Engine and App Engine Metadata Servers. This feature can only be enabled if [workload identity](https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity) is enabled at the cluster level.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public ClusterNodeConfigWorkloadMetadataConfigArgs build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
