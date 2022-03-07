// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters for the wait step.
 * 
 */
public final class WaitStepAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final WaitStepAttributesArgs Empty = new WaitStepAttributesArgs();

    /**
     * The duration in ISO 8601 format of how long the wait should be.
     * 
     */
    @InputImport(name="duration", required=true)
      private final Input<String> duration;

    public Input<String> getDuration() {
        return this.duration;
    }

    public WaitStepAttributesArgs(Input<String> duration) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
    }

    private WaitStepAttributesArgs() {
        this.duration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WaitStepAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> duration;

        public Builder() {
    	      // Empty
        }

        public Builder(WaitStepAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
        }

        public Builder setDuration(Input<String> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Input.of(Objects.requireNonNull(duration));
            return this;
        }
        public WaitStepAttributesArgs build() {
            return new WaitStepAttributesArgs(duration);
        }
    }
}