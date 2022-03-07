// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeGroupAutoscalingPolicyResponse {
    /**
     * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
     * 
     */
    private final Integer maxNodes;
    /**
     * The minimum number of nodes that the group should have.
     * 
     */
    private final Integer minNodes;
    /**
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * 
     */
    private final String mode;

    @OutputCustomType.Constructor({"maxNodes","minNodes","mode"})
    private NodeGroupAutoscalingPolicyResponse(
        Integer maxNodes,
        Integer minNodes,
        String mode) {
        this.maxNodes = Objects.requireNonNull(maxNodes);
        this.minNodes = Objects.requireNonNull(minNodes);
        this.mode = Objects.requireNonNull(mode);
    }

    /**
     * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
     * 
    */
    public Integer getMaxNodes() {
        return this.maxNodes;
    }
    /**
     * The minimum number of nodes that the group should have.
     * 
    */
    public Integer getMinNodes() {
        return this.minNodes;
    }
    /**
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * 
    */
    public String getMode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupAutoscalingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxNodes;
        private Integer minNodes;
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupAutoscalingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodes = defaults.maxNodes;
    	      this.minNodes = defaults.minNodes;
    	      this.mode = defaults.mode;
        }

        public Builder setMaxNodes(Integer maxNodes) {
            this.maxNodes = Objects.requireNonNull(maxNodes);
            return this;
        }

        public Builder setMinNodes(Integer minNodes) {
            this.minNodes = Objects.requireNonNull(minNodes);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public NodeGroupAutoscalingPolicyResponse build() {
            return new NodeGroupAutoscalingPolicyResponse(maxNodes, minNodes, mode);
        }
    }
}