// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterOptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterOptionArgs Empty = new GetClusterOptionArgs();

    /**
     * The id of the option set to retrieve. Use &#34;all&#34; get all options, or use a cluster ID to get options specific to the provided cluster.
     * 
     */
    @Import(name="clusterOptionId", required=true)
    private Output<String> clusterOptionId;

    /**
     * @return The id of the option set to retrieve. Use &#34;all&#34; get all options, or use a cluster ID to get options specific to the provided cluster.
     * 
     */
    public Output<String> clusterOptionId() {
        return this.clusterOptionId;
    }

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

    private GetClusterOptionArgs() {}

    private GetClusterOptionArgs(GetClusterOptionArgs $) {
        this.clusterOptionId = $.clusterOptionId;
        this.compartmentId = $.compartmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterOptionArgs $;

        public Builder() {
            $ = new GetClusterOptionArgs();
        }

        public Builder(GetClusterOptionArgs defaults) {
            $ = new GetClusterOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterOptionId The id of the option set to retrieve. Use &#34;all&#34; get all options, or use a cluster ID to get options specific to the provided cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterOptionId(Output<String> clusterOptionId) {
            $.clusterOptionId = clusterOptionId;
            return this;
        }

        /**
         * @param clusterOptionId The id of the option set to retrieve. Use &#34;all&#34; get all options, or use a cluster ID to get options specific to the provided cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterOptionId(String clusterOptionId) {
            return clusterOptionId(Output.of(clusterOptionId));
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

        public GetClusterOptionArgs build() {
            $.clusterOptionId = Objects.requireNonNull($.clusterOptionId, "expected parameter 'clusterOptionId' to be non-null");
            return $;
        }
    }

}
