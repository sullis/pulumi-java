// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigtableadmin_v2.inputs.ClusterAutoscalingConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for a cluster.
 * 
 */
public final class ClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterConfigArgs Empty = new ClusterConfigArgs();

    /**
     * Autoscaling configuration for this cluster.
     * 
     */
    @Import(name="clusterAutoscalingConfig")
    private @Nullable Output<ClusterAutoscalingConfigArgs> clusterAutoscalingConfig;

    /**
     * @return Autoscaling configuration for this cluster.
     * 
     */
    public Optional<Output<ClusterAutoscalingConfigArgs>> clusterAutoscalingConfig() {
        return Optional.ofNullable(this.clusterAutoscalingConfig);
    }

    private ClusterConfigArgs() {}

    private ClusterConfigArgs(ClusterConfigArgs $) {
        this.clusterAutoscalingConfig = $.clusterAutoscalingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterConfigArgs $;

        public Builder() {
            $ = new ClusterConfigArgs();
        }

        public Builder(ClusterConfigArgs defaults) {
            $ = new ClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterAutoscalingConfig Autoscaling configuration for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterAutoscalingConfig(@Nullable Output<ClusterAutoscalingConfigArgs> clusterAutoscalingConfig) {
            $.clusterAutoscalingConfig = clusterAutoscalingConfig;
            return this;
        }

        /**
         * @param clusterAutoscalingConfig Autoscaling configuration for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterAutoscalingConfig(ClusterAutoscalingConfigArgs clusterAutoscalingConfig) {
            return clusterAutoscalingConfig(Output.of(clusterAutoscalingConfig));
        }

        public ClusterConfigArgs build() {
            return $;
        }
    }

}
