// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.outputs;

import io.pulumi.azurenative.chaos.outputs.SelectorResponse;
import io.pulumi.azurenative.chaos.outputs.StepResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExperimentPropertiesResponse {
    /**
     * List of selectors.
     * 
     */
    private final List<SelectorResponse> selectors;
    /**
     * A boolean value that indicates if experiment should be started on creation or not.
     * 
     */
    private final @Nullable Boolean startOnCreation;
    /**
     * List of steps.
     * 
     */
    private final List<StepResponse> steps;

    @OutputCustomType.Constructor({"selectors","startOnCreation","steps"})
    private ExperimentPropertiesResponse(
        List<SelectorResponse> selectors,
        @Nullable Boolean startOnCreation,
        List<StepResponse> steps) {
        this.selectors = Objects.requireNonNull(selectors);
        this.startOnCreation = startOnCreation;
        this.steps = Objects.requireNonNull(steps);
    }

    /**
     * List of selectors.
     * 
     */
    public List<SelectorResponse> getSelectors() {
        return this.selectors;
    }
    /**
     * A boolean value that indicates if experiment should be started on creation or not.
     * 
     */
    public Optional<Boolean> getStartOnCreation() {
        return Optional.ofNullable(this.startOnCreation);
    }
    /**
     * List of steps.
     * 
     */
    public List<StepResponse> getSteps() {
        return this.steps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SelectorResponse> selectors;
        private @Nullable Boolean startOnCreation;
        private List<StepResponse> steps;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectors = defaults.selectors;
    	      this.startOnCreation = defaults.startOnCreation;
    	      this.steps = defaults.steps;
        }

        public Builder setSelectors(List<SelectorResponse> selectors) {
            this.selectors = Objects.requireNonNull(selectors);
            return this;
        }

        public Builder setStartOnCreation(@Nullable Boolean startOnCreation) {
            this.startOnCreation = startOnCreation;
            return this;
        }

        public Builder setSteps(List<StepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }

        public ExperimentPropertiesResponse build() {
            return new ExperimentPropertiesResponse(selectors, startOnCreation, steps);
        }
    }
}
