// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PrePostStepResponse {
    /**
     * The resource Id of the step to be run.
     * 
     */
    private final String stepId;

    @OutputCustomType.Constructor({"stepId"})
    private PrePostStepResponse(String stepId) {
        this.stepId = Objects.requireNonNull(stepId);
    }

    /**
     * The resource Id of the step to be run.
     * 
     */
    public String getStepId() {
        return this.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrePostStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrePostStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stepId = defaults.stepId;
        }

        public Builder setStepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }

        public PrePostStepResponse build() {
            return new PrePostStepResponse(stepId);
        }
    }
}
