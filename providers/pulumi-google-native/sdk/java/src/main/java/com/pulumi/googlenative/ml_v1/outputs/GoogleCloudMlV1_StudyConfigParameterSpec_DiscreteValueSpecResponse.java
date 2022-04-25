// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse {
    /**
     * @return Must be specified if type is `DISCRETE`. A list of feasible points. The list should be in strictly increasing order. For instance, this parameter might have possible settings of 1.5, 2.5, and 4.0. This list should not contain more than 1,000 values.
     * 
     */
    private final List<Double> values;

    @CustomType.Constructor
    private GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse(@CustomType.Parameter("values") List<Double> values) {
        this.values = values;
    }

    /**
     * @return Must be specified if type is `DISCRETE`. A list of feasible points. The list should be in strictly increasing order. For instance, this parameter might have possible settings of 1.5, 2.5, and 4.0. This list should not contain more than 1,000 values.
     * 
     */
    public List<Double> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Double> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder values(List<Double> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(Double... values) {
            return values(List.of(values));
        }        public GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse(values);
        }
    }
}
