// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Counts of various compute node states on the amlCompute.
 * 
 */
public final class NodeStateCountsResponse extends com.pulumi.resources.InvokeArgs {

    public static final NodeStateCountsResponse Empty = new NodeStateCountsResponse();

    /**
     * Number of compute nodes in idle state.
     * 
     */
    @Import(name="idleNodeCount", required=true)
    private Integer idleNodeCount;

    /**
     * @return Number of compute nodes in idle state.
     * 
     */
    public Integer idleNodeCount() {
        return this.idleNodeCount;
    }

    /**
     * Number of compute nodes which are leaving the amlCompute.
     * 
     */
    @Import(name="leavingNodeCount", required=true)
    private Integer leavingNodeCount;

    /**
     * @return Number of compute nodes which are leaving the amlCompute.
     * 
     */
    public Integer leavingNodeCount() {
        return this.leavingNodeCount;
    }

    /**
     * Number of compute nodes which are in preempted state.
     * 
     */
    @Import(name="preemptedNodeCount", required=true)
    private Integer preemptedNodeCount;

    /**
     * @return Number of compute nodes which are in preempted state.
     * 
     */
    public Integer preemptedNodeCount() {
        return this.preemptedNodeCount;
    }

    /**
     * Number of compute nodes which are being prepared.
     * 
     */
    @Import(name="preparingNodeCount", required=true)
    private Integer preparingNodeCount;

    /**
     * @return Number of compute nodes which are being prepared.
     * 
     */
    public Integer preparingNodeCount() {
        return this.preparingNodeCount;
    }

    /**
     * Number of compute nodes which are running jobs.
     * 
     */
    @Import(name="runningNodeCount", required=true)
    private Integer runningNodeCount;

    /**
     * @return Number of compute nodes which are running jobs.
     * 
     */
    public Integer runningNodeCount() {
        return this.runningNodeCount;
    }

    /**
     * Number of compute nodes which are in unusable state.
     * 
     */
    @Import(name="unusableNodeCount", required=true)
    private Integer unusableNodeCount;

    /**
     * @return Number of compute nodes which are in unusable state.
     * 
     */
    public Integer unusableNodeCount() {
        return this.unusableNodeCount;
    }

    private NodeStateCountsResponse() {}

    private NodeStateCountsResponse(NodeStateCountsResponse $) {
        this.idleNodeCount = $.idleNodeCount;
        this.leavingNodeCount = $.leavingNodeCount;
        this.preemptedNodeCount = $.preemptedNodeCount;
        this.preparingNodeCount = $.preparingNodeCount;
        this.runningNodeCount = $.runningNodeCount;
        this.unusableNodeCount = $.unusableNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeStateCountsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeStateCountsResponse $;

        public Builder() {
            $ = new NodeStateCountsResponse();
        }

        public Builder(NodeStateCountsResponse defaults) {
            $ = new NodeStateCountsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param idleNodeCount Number of compute nodes in idle state.
         * 
         * @return builder
         * 
         */
        public Builder idleNodeCount(Integer idleNodeCount) {
            $.idleNodeCount = idleNodeCount;
            return this;
        }

        /**
         * @param leavingNodeCount Number of compute nodes which are leaving the amlCompute.
         * 
         * @return builder
         * 
         */
        public Builder leavingNodeCount(Integer leavingNodeCount) {
            $.leavingNodeCount = leavingNodeCount;
            return this;
        }

        /**
         * @param preemptedNodeCount Number of compute nodes which are in preempted state.
         * 
         * @return builder
         * 
         */
        public Builder preemptedNodeCount(Integer preemptedNodeCount) {
            $.preemptedNodeCount = preemptedNodeCount;
            return this;
        }

        /**
         * @param preparingNodeCount Number of compute nodes which are being prepared.
         * 
         * @return builder
         * 
         */
        public Builder preparingNodeCount(Integer preparingNodeCount) {
            $.preparingNodeCount = preparingNodeCount;
            return this;
        }

        /**
         * @param runningNodeCount Number of compute nodes which are running jobs.
         * 
         * @return builder
         * 
         */
        public Builder runningNodeCount(Integer runningNodeCount) {
            $.runningNodeCount = runningNodeCount;
            return this;
        }

        /**
         * @param unusableNodeCount Number of compute nodes which are in unusable state.
         * 
         * @return builder
         * 
         */
        public Builder unusableNodeCount(Integer unusableNodeCount) {
            $.unusableNodeCount = unusableNodeCount;
            return this;
        }

        public NodeStateCountsResponse build() {
            $.idleNodeCount = Objects.requireNonNull($.idleNodeCount, "expected parameter 'idleNodeCount' to be non-null");
            $.leavingNodeCount = Objects.requireNonNull($.leavingNodeCount, "expected parameter 'leavingNodeCount' to be non-null");
            $.preemptedNodeCount = Objects.requireNonNull($.preemptedNodeCount, "expected parameter 'preemptedNodeCount' to be non-null");
            $.preparingNodeCount = Objects.requireNonNull($.preparingNodeCount, "expected parameter 'preparingNodeCount' to be non-null");
            $.runningNodeCount = Objects.requireNonNull($.runningNodeCount, "expected parameter 'runningNodeCount' to be non-null");
            $.unusableNodeCount = Objects.requireNonNull($.unusableNodeCount, "expected parameter 'unusableNodeCount' to be non-null");
            return $;
        }
    }

}
