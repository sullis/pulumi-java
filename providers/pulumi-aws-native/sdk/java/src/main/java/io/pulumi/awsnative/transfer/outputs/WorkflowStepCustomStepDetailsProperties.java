// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowStepCustomStepDetailsProperties {
    /**
     * The name of the step, used as an identifier.
     * 
     */
    private final @Nullable String name;
    /**
     * The ARN for the lambda function that is being called.
     * 
     */
    private final @Nullable String target;
    /**
     * Timeout, in seconds, for the step.
     * 
     */
    private final @Nullable Integer timeoutSeconds;

    @OutputCustomType.Constructor({"name","target","timeoutSeconds"})
    private WorkflowStepCustomStepDetailsProperties(
        @Nullable String name,
        @Nullable String target,
        @Nullable Integer timeoutSeconds) {
        this.name = name;
        this.target = target;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * The name of the step, used as an identifier.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The ARN for the lambda function that is being called.
     * 
     */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }
    /**
     * Timeout, in seconds, for the step.
     * 
     */
    public Optional<Integer> getTimeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepCustomStepDetailsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String target;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowStepCustomStepDetailsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.target = defaults.target;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public WorkflowStepCustomStepDetailsProperties build() {
            return new WorkflowStepCustomStepDetailsProperties(name, target, timeoutSeconds);
        }
    }
}
