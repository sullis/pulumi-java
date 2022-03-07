// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.PrimaryStepResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Details when multiple steps are run with the same configuration as a group.
 * 
 */
public final class MultiStepResponse extends io.pulumi.resources.InvokeArgs {

    public static final MultiStepResponse Empty = new MultiStepResponse();

    /**
     * Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
     */
    @InputImport(name="multistepNumber", required=true)
      private final Integer multistepNumber;

    public Integer getMultistepNumber() {
        return this.multistepNumber;
    }

    /**
     * Present if it is a primary (original) step.
     * 
     */
    @InputImport(name="primaryStep", required=true)
      private final PrimaryStepResponse primaryStep;

    public PrimaryStepResponse getPrimaryStep() {
        return this.primaryStep;
    }

    /**
     * Step Id of the primary (original) step, which might be this step.
     * 
     */
    @InputImport(name="primaryStepId", required=true)
      private final String primaryStepId;

    public String getPrimaryStepId() {
        return this.primaryStepId;
    }

    public MultiStepResponse(
        Integer multistepNumber,
        PrimaryStepResponse primaryStep,
        String primaryStepId) {
        this.multistepNumber = Objects.requireNonNull(multistepNumber, "expected parameter 'multistepNumber' to be non-null");
        this.primaryStep = Objects.requireNonNull(primaryStep, "expected parameter 'primaryStep' to be non-null");
        this.primaryStepId = Objects.requireNonNull(primaryStepId, "expected parameter 'primaryStepId' to be non-null");
    }

    private MultiStepResponse() {
        this.multistepNumber = null;
        this.primaryStep = null;
        this.primaryStepId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer multistepNumber;
        private PrimaryStepResponse primaryStep;
        private String primaryStepId;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multistepNumber = defaults.multistepNumber;
    	      this.primaryStep = defaults.primaryStep;
    	      this.primaryStepId = defaults.primaryStepId;
        }

        public Builder setMultistepNumber(Integer multistepNumber) {
            this.multistepNumber = Objects.requireNonNull(multistepNumber);
            return this;
        }

        public Builder setPrimaryStep(PrimaryStepResponse primaryStep) {
            this.primaryStep = Objects.requireNonNull(primaryStep);
            return this;
        }

        public Builder setPrimaryStepId(String primaryStepId) {
            this.primaryStepId = Objects.requireNonNull(primaryStepId);
            return this;
        }
        public MultiStepResponse build() {
            return new MultiStepResponse(multistepNumber, primaryStep, primaryStepId);
        }
    }
}