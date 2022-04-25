// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterClusterConfigAutoscalingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigAutoscalingConfigArgs Empty = new ClusterClusterConfigAutoscalingConfigArgs();

    /**
     * The autoscaling policy used by the cluster.
     * 
     */
    @Import(name="policyUri", required=true)
    private Output<String> policyUri;

    /**
     * @return The autoscaling policy used by the cluster.
     * 
     */
    public Output<String> policyUri() {
        return this.policyUri;
    }

    private ClusterClusterConfigAutoscalingConfigArgs() {}

    private ClusterClusterConfigAutoscalingConfigArgs(ClusterClusterConfigAutoscalingConfigArgs $) {
        this.policyUri = $.policyUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterConfigAutoscalingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigAutoscalingConfigArgs $;

        public Builder() {
            $ = new ClusterClusterConfigAutoscalingConfigArgs();
        }

        public Builder(ClusterClusterConfigAutoscalingConfigArgs defaults) {
            $ = new ClusterClusterConfigAutoscalingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyUri The autoscaling policy used by the cluster.
         * 
         * @return builder
         * 
         */
        public Builder policyUri(Output<String> policyUri) {
            $.policyUri = policyUri;
            return this;
        }

        /**
         * @param policyUri The autoscaling policy used by the cluster.
         * 
         * @return builder
         * 
         */
        public Builder policyUri(String policyUri) {
            return policyUri(Output.of(policyUri));
        }

        public ClusterClusterConfigAutoscalingConfigArgs build() {
            $.policyUri = Objects.requireNonNull($.policyUri, "expected parameter 'policyUri' to be non-null");
            return $;
        }
    }

}
