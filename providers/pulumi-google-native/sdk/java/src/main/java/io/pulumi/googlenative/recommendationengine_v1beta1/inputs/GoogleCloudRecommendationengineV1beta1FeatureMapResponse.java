// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * FeatureMap represents extra features that customers want to include in the recommendation model for catalogs/user events as categorical/numerical features.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1FeatureMapResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecommendationengineV1beta1FeatureMapResponse Empty = new GoogleCloudRecommendationengineV1beta1FeatureMapResponse();

    /**
     * Categorical features that can take on one of a limited number of possible values. Some examples would be the brand/maker of a product, or country of a customer. Feature names and values must be UTF-8 encoded strings. For example: `{ "colors": {"value": ["yellow", "green"]}, "sizes": {"value":["S", "M"]}`
     * 
     */
    @InputImport(name="categoricalFeatures", required=true)
      private final Map<String,String> categoricalFeatures;

    public Map<String,String> getCategoricalFeatures() {
        return this.categoricalFeatures;
    }

    /**
     * Numerical features. Some examples would be the height/weight of a product, or age of a customer. Feature names must be UTF-8 encoded strings. For example: `{ "lengths_cm": {"value":[2.3, 15.4]}, "heights_cm": {"value":[8.1, 6.4]} }`
     * 
     */
    @InputImport(name="numericalFeatures", required=true)
      private final Map<String,String> numericalFeatures;

    public Map<String,String> getNumericalFeatures() {
        return this.numericalFeatures;
    }

    public GoogleCloudRecommendationengineV1beta1FeatureMapResponse(
        Map<String,String> categoricalFeatures,
        Map<String,String> numericalFeatures) {
        this.categoricalFeatures = Objects.requireNonNull(categoricalFeatures, "expected parameter 'categoricalFeatures' to be non-null");
        this.numericalFeatures = Objects.requireNonNull(numericalFeatures, "expected parameter 'numericalFeatures' to be non-null");
    }

    private GoogleCloudRecommendationengineV1beta1FeatureMapResponse() {
        this.categoricalFeatures = Map.of();
        this.numericalFeatures = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1FeatureMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> categoricalFeatures;
        private Map<String,String> numericalFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1FeatureMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoricalFeatures = defaults.categoricalFeatures;
    	      this.numericalFeatures = defaults.numericalFeatures;
        }

        public Builder setCategoricalFeatures(Map<String,String> categoricalFeatures) {
            this.categoricalFeatures = Objects.requireNonNull(categoricalFeatures);
            return this;
        }

        public Builder setNumericalFeatures(Map<String,String> numericalFeatures) {
            this.numericalFeatures = Objects.requireNonNull(numericalFeatures);
            return this;
        }
        public GoogleCloudRecommendationengineV1beta1FeatureMapResponse build() {
            return new GoogleCloudRecommendationengineV1beta1FeatureMapResponse(categoricalFeatures, numericalFeatures);
        }
    }
}