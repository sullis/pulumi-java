// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs Empty = new ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs();

    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    @Import(name="localSsdCount", required=true)
    private Output<Integer> localSsdCount;

    /**
     * @return Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    public Output<Integer> localSsdCount() {
        return this.localSsdCount;
    }

    private ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs() {}

    private ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs(ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs $) {
        this.localSsdCount = $.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs $;

        public Builder() {
            $ = new ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs();
        }

        public Builder(ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs defaults) {
            $ = new ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localSsdCount Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(Output<Integer> localSsdCount) {
            $.localSsdCount = localSsdCount;
            return this;
        }

        /**
         * @param localSsdCount Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(Integer localSsdCount) {
            return localSsdCount(Output.of(localSsdCount));
        }

        public ClusterNodePoolNodeConfigEphemeralStorageConfigGetArgs build() {
            $.localSsdCount = Objects.requireNonNull($.localSsdCount, "expected parameter 'localSsdCount' to be non-null");
            return $;
        }
    }

}
