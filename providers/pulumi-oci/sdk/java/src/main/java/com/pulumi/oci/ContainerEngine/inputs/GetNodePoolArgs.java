// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNodePoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodePoolArgs Empty = new GetNodePoolArgs();

    /**
     * The OCID of the node pool.
     * 
     */
    @Import(name="nodePoolId", required=true)
    private Output<String> nodePoolId;

    /**
     * @return The OCID of the node pool.
     * 
     */
    public Output<String> nodePoolId() {
        return this.nodePoolId;
    }

    private GetNodePoolArgs() {}

    private GetNodePoolArgs(GetNodePoolArgs $) {
        this.nodePoolId = $.nodePoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodePoolArgs $;

        public Builder() {
            $ = new GetNodePoolArgs();
        }

        public Builder(GetNodePoolArgs defaults) {
            $ = new GetNodePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodePoolId The OCID of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolId(Output<String> nodePoolId) {
            $.nodePoolId = nodePoolId;
            return this;
        }

        /**
         * @param nodePoolId The OCID of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolId(String nodePoolId) {
            return nodePoolId(Output.of(nodePoolId));
        }

        public GetNodePoolArgs build() {
            $.nodePoolId = Objects.requireNonNull($.nodePoolId, "expected parameter 'nodePoolId' to be non-null");
            return $;
        }
    }

}
