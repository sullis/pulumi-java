// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ExperimentTreatmentToWeight {
    private final Integer splitWeight;
    private final String treatment;

    @OutputCustomType.Constructor({"splitWeight","treatment"})
    private ExperimentTreatmentToWeight(
        Integer splitWeight,
        String treatment) {
        this.splitWeight = Objects.requireNonNull(splitWeight);
        this.treatment = Objects.requireNonNull(treatment);
    }

    public Integer getSplitWeight() {
        return this.splitWeight;
    }
    public String getTreatment() {
        return this.treatment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTreatmentToWeight defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer splitWeight;
        private String treatment;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentTreatmentToWeight defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.splitWeight = defaults.splitWeight;
    	      this.treatment = defaults.treatment;
        }

        public Builder setSplitWeight(Integer splitWeight) {
            this.splitWeight = Objects.requireNonNull(splitWeight);
            return this;
        }

        public Builder setTreatment(String treatment) {
            this.treatment = Objects.requireNonNull(treatment);
            return this;
        }

        public ExperimentTreatmentToWeight build() {
            return new ExperimentTreatmentToWeight(splitWeight, treatment);
        }
    }
}
