// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * scale settings for AML Compute
 * 
 */
public final class ScaleSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScaleSettingsArgs Empty = new ScaleSettingsArgs();

    /**
     * Max number of nodes to use
     * 
     */
    @InputImport(name="maxNodeCount", required=true)
    private final Input<Integer> maxNodeCount;

    public Input<Integer> getMaxNodeCount() {
        return this.maxNodeCount;
    }

    /**
     * Min number of nodes to use
     * 
     */
    @InputImport(name="minNodeCount")
    private final @Nullable Input<Integer> minNodeCount;

    public Input<Integer> getMinNodeCount() {
        return this.minNodeCount == null ? Input.empty() : this.minNodeCount;
    }

    /**
     * Node Idle Time before scaling down amlCompute. This string needs to be in the RFC Format.
     * 
     */
    @InputImport(name="nodeIdleTimeBeforeScaleDown")
    private final @Nullable Input<String> nodeIdleTimeBeforeScaleDown;

    public Input<String> getNodeIdleTimeBeforeScaleDown() {
        return this.nodeIdleTimeBeforeScaleDown == null ? Input.empty() : this.nodeIdleTimeBeforeScaleDown;
    }

    public ScaleSettingsArgs(
        Input<Integer> maxNodeCount,
        @Nullable Input<Integer> minNodeCount,
        @Nullable Input<String> nodeIdleTimeBeforeScaleDown) {
        this.maxNodeCount = Objects.requireNonNull(maxNodeCount, "expected parameter 'maxNodeCount' to be non-null");
        this.minNodeCount = minNodeCount == null ? Input.ofNullable(0) : minNodeCount;
        this.nodeIdleTimeBeforeScaleDown = nodeIdleTimeBeforeScaleDown;
    }

    private ScaleSettingsArgs() {
        this.maxNodeCount = Input.empty();
        this.minNodeCount = Input.empty();
        this.nodeIdleTimeBeforeScaleDown = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxNodeCount;
        private @Nullable Input<Integer> minNodeCount;
        private @Nullable Input<String> nodeIdleTimeBeforeScaleDown;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
    	      this.nodeIdleTimeBeforeScaleDown = defaults.nodeIdleTimeBeforeScaleDown;
        }

        public Builder setMaxNodeCount(Input<Integer> maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }

        public Builder setMaxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Input.of(Objects.requireNonNull(maxNodeCount));
            return this;
        }

        public Builder setMinNodeCount(@Nullable Input<Integer> minNodeCount) {
            this.minNodeCount = minNodeCount;
            return this;
        }

        public Builder setMinNodeCount(@Nullable Integer minNodeCount) {
            this.minNodeCount = Input.ofNullable(minNodeCount);
            return this;
        }

        public Builder setNodeIdleTimeBeforeScaleDown(@Nullable Input<String> nodeIdleTimeBeforeScaleDown) {
            this.nodeIdleTimeBeforeScaleDown = nodeIdleTimeBeforeScaleDown;
            return this;
        }

        public Builder setNodeIdleTimeBeforeScaleDown(@Nullable String nodeIdleTimeBeforeScaleDown) {
            this.nodeIdleTimeBeforeScaleDown = Input.ofNullable(nodeIdleTimeBeforeScaleDown);
            return this;
        }

        public ScaleSettingsArgs build() {
            return new ScaleSettingsArgs(maxNodeCount, minNodeCount, nodeIdleTimeBeforeScaleDown);
        }
    }
}
