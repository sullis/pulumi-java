// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.FeatureGroupFeatureDefinitionFeatureType;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FeatureGroupFeatureDefinition {
    private final String featureName;
    private final FeatureGroupFeatureDefinitionFeatureType featureType;

    @OutputCustomType.Constructor({"featureName","featureType"})
    private FeatureGroupFeatureDefinition(
        String featureName,
        FeatureGroupFeatureDefinitionFeatureType featureType) {
        this.featureName = Objects.requireNonNull(featureName);
        this.featureType = Objects.requireNonNull(featureType);
    }

    public String getFeatureName() {
        return this.featureName;
    }
    public FeatureGroupFeatureDefinitionFeatureType getFeatureType() {
        return this.featureType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupFeatureDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String featureName;
        private FeatureGroupFeatureDefinitionFeatureType featureType;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupFeatureDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureName = defaults.featureName;
    	      this.featureType = defaults.featureType;
        }

        public Builder setFeatureName(String featureName) {
            this.featureName = Objects.requireNonNull(featureName);
            return this;
        }

        public Builder setFeatureType(FeatureGroupFeatureDefinitionFeatureType featureType) {
            this.featureType = Objects.requireNonNull(featureType);
            return this;
        }

        public FeatureGroupFeatureDefinition build() {
            return new FeatureGroupFeatureDefinition(featureName, featureType);
        }
    }
}
