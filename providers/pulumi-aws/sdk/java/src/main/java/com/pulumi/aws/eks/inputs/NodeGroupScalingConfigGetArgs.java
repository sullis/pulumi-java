// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class NodeGroupScalingConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeGroupScalingConfigGetArgs Empty = new NodeGroupScalingConfigGetArgs();

    /**
     * Desired number of worker nodes.
     * 
     */
    @Import(name="desiredSize", required=true)
    private Output<Integer> desiredSize;

    /**
     * @return Desired number of worker nodes.
     * 
     */
    public Output<Integer> desiredSize() {
        return this.desiredSize;
    }

    /**
     * Maximum number of worker nodes.
     * 
     */
    @Import(name="maxSize", required=true)
    private Output<Integer> maxSize;

    /**
     * @return Maximum number of worker nodes.
     * 
     */
    public Output<Integer> maxSize() {
        return this.maxSize;
    }

    /**
     * Minimum number of worker nodes.
     * 
     */
    @Import(name="minSize", required=true)
    private Output<Integer> minSize;

    /**
     * @return Minimum number of worker nodes.
     * 
     */
    public Output<Integer> minSize() {
        return this.minSize;
    }

    private NodeGroupScalingConfigGetArgs() {}

    private NodeGroupScalingConfigGetArgs(NodeGroupScalingConfigGetArgs $) {
        this.desiredSize = $.desiredSize;
        this.maxSize = $.maxSize;
        this.minSize = $.minSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeGroupScalingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeGroupScalingConfigGetArgs $;

        public Builder() {
            $ = new NodeGroupScalingConfigGetArgs();
        }

        public Builder(NodeGroupScalingConfigGetArgs defaults) {
            $ = new NodeGroupScalingConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param desiredSize Desired number of worker nodes.
         * 
         * @return builder
         * 
         */
        public Builder desiredSize(Output<Integer> desiredSize) {
            $.desiredSize = desiredSize;
            return this;
        }

        /**
         * @param desiredSize Desired number of worker nodes.
         * 
         * @return builder
         * 
         */
        public Builder desiredSize(Integer desiredSize) {
            return desiredSize(Output.of(desiredSize));
        }

        /**
         * @param maxSize Maximum number of worker nodes.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize Maximum number of worker nodes.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param minSize Minimum number of worker nodes.
         * 
         * @return builder
         * 
         */
        public Builder minSize(Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize Minimum number of worker nodes.
         * 
         * @return builder
         * 
         */
        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        public NodeGroupScalingConfigGetArgs build() {
            $.desiredSize = Objects.requireNonNull($.desiredSize, "expected parameter 'desiredSize' to be non-null");
            $.maxSize = Objects.requireNonNull($.maxSize, "expected parameter 'maxSize' to be non-null");
            $.minSize = Objects.requireNonNull($.minSize, "expected parameter 'minSize' to be non-null");
            return $;
        }
    }

}
