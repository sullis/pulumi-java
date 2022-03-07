// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.ComputeNodeDeallocationOption;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FixedScaleSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FixedScaleSettingsArgs Empty = new FixedScaleSettingsArgs();

    /**
     * If omitted, the default value is Requeue.
     * 
     */
    @InputImport(name="nodeDeallocationOption")
      private final @Nullable Input<ComputeNodeDeallocationOption> nodeDeallocationOption;

    public Input<ComputeNodeDeallocationOption> getNodeDeallocationOption() {
        return this.nodeDeallocationOption == null ? Input.empty() : this.nodeDeallocationOption;
    }

    /**
     * The default value is 15 minutes. Timeout values use ISO 8601 format. For example, use PT10M for 10 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service rejects the request with an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     * 
     */
    @InputImport(name="resizeTimeout")
      private final @Nullable Input<String> resizeTimeout;

    public Input<String> getResizeTimeout() {
        return this.resizeTimeout == null ? Input.empty() : this.resizeTimeout;
    }

    /**
     * At least one of targetDedicatedNodes, targetLowPriorityNodes must be set.
     * 
     */
    @InputImport(name="targetDedicatedNodes")
      private final @Nullable Input<Integer> targetDedicatedNodes;

    public Input<Integer> getTargetDedicatedNodes() {
        return this.targetDedicatedNodes == null ? Input.empty() : this.targetDedicatedNodes;
    }

    /**
     * At least one of targetDedicatedNodes, targetLowPriorityNodes must be set.
     * 
     */
    @InputImport(name="targetLowPriorityNodes")
      private final @Nullable Input<Integer> targetLowPriorityNodes;

    public Input<Integer> getTargetLowPriorityNodes() {
        return this.targetLowPriorityNodes == null ? Input.empty() : this.targetLowPriorityNodes;
    }

    public FixedScaleSettingsArgs(
        @Nullable Input<ComputeNodeDeallocationOption> nodeDeallocationOption,
        @Nullable Input<String> resizeTimeout,
        @Nullable Input<Integer> targetDedicatedNodes,
        @Nullable Input<Integer> targetLowPriorityNodes) {
        this.nodeDeallocationOption = nodeDeallocationOption;
        this.resizeTimeout = resizeTimeout;
        this.targetDedicatedNodes = targetDedicatedNodes;
        this.targetLowPriorityNodes = targetLowPriorityNodes;
    }

    private FixedScaleSettingsArgs() {
        this.nodeDeallocationOption = Input.empty();
        this.resizeTimeout = Input.empty();
        this.targetDedicatedNodes = Input.empty();
        this.targetLowPriorityNodes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FixedScaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ComputeNodeDeallocationOption> nodeDeallocationOption;
        private @Nullable Input<String> resizeTimeout;
        private @Nullable Input<Integer> targetDedicatedNodes;
        private @Nullable Input<Integer> targetLowPriorityNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(FixedScaleSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeDeallocationOption = defaults.nodeDeallocationOption;
    	      this.resizeTimeout = defaults.resizeTimeout;
    	      this.targetDedicatedNodes = defaults.targetDedicatedNodes;
    	      this.targetLowPriorityNodes = defaults.targetLowPriorityNodes;
        }

        public Builder setNodeDeallocationOption(@Nullable Input<ComputeNodeDeallocationOption> nodeDeallocationOption) {
            this.nodeDeallocationOption = nodeDeallocationOption;
            return this;
        }

        public Builder setNodeDeallocationOption(@Nullable ComputeNodeDeallocationOption nodeDeallocationOption) {
            this.nodeDeallocationOption = Input.ofNullable(nodeDeallocationOption);
            return this;
        }

        public Builder setResizeTimeout(@Nullable Input<String> resizeTimeout) {
            this.resizeTimeout = resizeTimeout;
            return this;
        }

        public Builder setResizeTimeout(@Nullable String resizeTimeout) {
            this.resizeTimeout = Input.ofNullable(resizeTimeout);
            return this;
        }

        public Builder setTargetDedicatedNodes(@Nullable Input<Integer> targetDedicatedNodes) {
            this.targetDedicatedNodes = targetDedicatedNodes;
            return this;
        }

        public Builder setTargetDedicatedNodes(@Nullable Integer targetDedicatedNodes) {
            this.targetDedicatedNodes = Input.ofNullable(targetDedicatedNodes);
            return this;
        }

        public Builder setTargetLowPriorityNodes(@Nullable Input<Integer> targetLowPriorityNodes) {
            this.targetLowPriorityNodes = targetLowPriorityNodes;
            return this;
        }

        public Builder setTargetLowPriorityNodes(@Nullable Integer targetLowPriorityNodes) {
            this.targetLowPriorityNodes = Input.ofNullable(targetLowPriorityNodes);
            return this;
        }
        public FixedScaleSettingsArgs build() {
            return new FixedScaleSettingsArgs(nodeDeallocationOption, resizeTimeout, targetDedicatedNodes, targetLowPriorityNodes);
        }
    }
}