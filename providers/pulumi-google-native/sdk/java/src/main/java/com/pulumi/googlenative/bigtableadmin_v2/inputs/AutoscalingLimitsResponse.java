// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Limits for the number of nodes a Cluster can autoscale up/down to.
 * 
 */
public final class AutoscalingLimitsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoscalingLimitsResponse Empty = new AutoscalingLimitsResponse();

    /**
     * Maximum number of nodes to scale up to.
     * 
     */
    @Import(name="maxServeNodes", required=true)
    private Integer maxServeNodes;

    /**
     * @return Maximum number of nodes to scale up to.
     * 
     */
    public Integer maxServeNodes() {
        return this.maxServeNodes;
    }

    /**
     * Minimum number of nodes to scale down to.
     * 
     */
    @Import(name="minServeNodes", required=true)
    private Integer minServeNodes;

    /**
     * @return Minimum number of nodes to scale down to.
     * 
     */
    public Integer minServeNodes() {
        return this.minServeNodes;
    }

    private AutoscalingLimitsResponse() {}

    private AutoscalingLimitsResponse(AutoscalingLimitsResponse $) {
        this.maxServeNodes = $.maxServeNodes;
        this.minServeNodes = $.minServeNodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingLimitsResponse $;

        public Builder() {
            $ = new AutoscalingLimitsResponse();
        }

        public Builder(AutoscalingLimitsResponse defaults) {
            $ = new AutoscalingLimitsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxServeNodes Maximum number of nodes to scale up to.
         * 
         * @return builder
         * 
         */
        public Builder maxServeNodes(Integer maxServeNodes) {
            $.maxServeNodes = maxServeNodes;
            return this;
        }

        /**
         * @param minServeNodes Minimum number of nodes to scale down to.
         * 
         * @return builder
         * 
         */
        public Builder minServeNodes(Integer minServeNodes) {
            $.minServeNodes = minServeNodes;
            return this;
        }

        public AutoscalingLimitsResponse build() {
            $.maxServeNodes = Objects.requireNonNull($.maxServeNodes, "expected parameter 'maxServeNodes' to be non-null");
            $.minServeNodes = Objects.requireNonNull($.minServeNodes, "expected parameter 'minServeNodes' to be non-null");
            return $;
        }
    }

}
