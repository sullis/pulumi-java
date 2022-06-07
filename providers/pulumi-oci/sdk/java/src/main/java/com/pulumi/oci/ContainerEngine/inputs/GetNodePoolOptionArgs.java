// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodePoolOptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodePoolOptionArgs Empty = new GetNodePoolOptionArgs();

    /**
     * The OCID of the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The OCID of the compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The id of the option set to retrieve. Use &#34;all&#34; get all options, or use a cluster ID to get options specific to the provided cluster.
     * 
     */
    @Import(name="nodePoolOptionId", required=true)
    private Output<String> nodePoolOptionId;

    /**
     * @return The id of the option set to retrieve. Use &#34;all&#34; get all options, or use a cluster ID to get options specific to the provided cluster.
     * 
     */
    public Output<String> nodePoolOptionId() {
        return this.nodePoolOptionId;
    }

    private GetNodePoolOptionArgs() {}

    private GetNodePoolOptionArgs(GetNodePoolOptionArgs $) {
        this.compartmentId = $.compartmentId;
        this.nodePoolOptionId = $.nodePoolOptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodePoolOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodePoolOptionArgs $;

        public Builder() {
            $ = new GetNodePoolOptionArgs();
        }

        public Builder(GetNodePoolOptionArgs defaults) {
            $ = new GetNodePoolOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param nodePoolOptionId The id of the option set to retrieve. Use &#34;all&#34; get all options, or use a cluster ID to get options specific to the provided cluster.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolOptionId(Output<String> nodePoolOptionId) {
            $.nodePoolOptionId = nodePoolOptionId;
            return this;
        }

        /**
         * @param nodePoolOptionId The id of the option set to retrieve. Use &#34;all&#34; get all options, or use a cluster ID to get options specific to the provided cluster.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolOptionId(String nodePoolOptionId) {
            return nodePoolOptionId(Output.of(nodePoolOptionId));
        }

        public GetNodePoolOptionArgs build() {
            $.nodePoolOptionId = Objects.requireNonNull($.nodePoolOptionId, "expected parameter 'nodePoolOptionId' to be non-null");
            return $;
        }
    }

}
