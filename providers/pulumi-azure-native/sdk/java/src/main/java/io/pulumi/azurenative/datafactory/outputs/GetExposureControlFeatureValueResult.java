// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetExposureControlFeatureValueResult {
    /**
     * The feature name.
     * 
     */
    private final String featureName;
    /**
     * The feature value.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"featureName","value"})
    private GetExposureControlFeatureValueResult(
        String featureName,
        String value) {
        this.featureName = Objects.requireNonNull(featureName);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The feature name.
     * 
    */
    public String getFeatureName() {
        return this.featureName;
    }
    /**
     * The feature value.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExposureControlFeatureValueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String featureName;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExposureControlFeatureValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureName = defaults.featureName;
    	      this.value = defaults.value;
        }

        public Builder setFeatureName(String featureName) {
            this.featureName = Objects.requireNonNull(featureName);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetExposureControlFeatureValueResult build() {
            return new GetExposureControlFeatureValueResult(featureName, value);
        }
    }
}