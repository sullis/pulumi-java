// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__IntegratedGradientsAttributionResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__SampledShapleyAttributionResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__XraiAttributionResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__ExplanationConfigResponse {
    /**
     * Attributes credit by computing the Aumann-Shapley value taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1703.01365
     * 
     */
    private final GoogleCloudMlV1__IntegratedGradientsAttributionResponse integratedGradientsAttribution;
    /**
     * An attribution method that approximates Shapley values for features that contribute to the label being predicted. A sampling strategy is used to approximate the value rather than considering all subsets of features.
     * 
     */
    private final GoogleCloudMlV1__SampledShapleyAttributionResponse sampledShapleyAttribution;
    /**
     * Attributes credit by computing the XRAI taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1906.02825 Currently only implemented for models with natural image inputs.
     * 
     */
    private final GoogleCloudMlV1__XraiAttributionResponse xraiAttribution;

    @OutputCustomType.Constructor({"integratedGradientsAttribution","sampledShapleyAttribution","xraiAttribution"})
    private GoogleCloudMlV1__ExplanationConfigResponse(
        GoogleCloudMlV1__IntegratedGradientsAttributionResponse integratedGradientsAttribution,
        GoogleCloudMlV1__SampledShapleyAttributionResponse sampledShapleyAttribution,
        GoogleCloudMlV1__XraiAttributionResponse xraiAttribution) {
        this.integratedGradientsAttribution = Objects.requireNonNull(integratedGradientsAttribution);
        this.sampledShapleyAttribution = Objects.requireNonNull(sampledShapleyAttribution);
        this.xraiAttribution = Objects.requireNonNull(xraiAttribution);
    }

    /**
     * Attributes credit by computing the Aumann-Shapley value taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1703.01365
     * 
    */
    public GoogleCloudMlV1__IntegratedGradientsAttributionResponse getIntegratedGradientsAttribution() {
        return this.integratedGradientsAttribution;
    }
    /**
     * An attribution method that approximates Shapley values for features that contribute to the label being predicted. A sampling strategy is used to approximate the value rather than considering all subsets of features.
     * 
    */
    public GoogleCloudMlV1__SampledShapleyAttributionResponse getSampledShapleyAttribution() {
        return this.sampledShapleyAttribution;
    }
    /**
     * Attributes credit by computing the XRAI taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1906.02825 Currently only implemented for models with natural image inputs.
     * 
    */
    public GoogleCloudMlV1__XraiAttributionResponse getXraiAttribution() {
        return this.xraiAttribution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ExplanationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__IntegratedGradientsAttributionResponse integratedGradientsAttribution;
        private GoogleCloudMlV1__SampledShapleyAttributionResponse sampledShapleyAttribution;
        private GoogleCloudMlV1__XraiAttributionResponse xraiAttribution;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ExplanationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integratedGradientsAttribution = defaults.integratedGradientsAttribution;
    	      this.sampledShapleyAttribution = defaults.sampledShapleyAttribution;
    	      this.xraiAttribution = defaults.xraiAttribution;
        }

        public Builder setIntegratedGradientsAttribution(GoogleCloudMlV1__IntegratedGradientsAttributionResponse integratedGradientsAttribution) {
            this.integratedGradientsAttribution = Objects.requireNonNull(integratedGradientsAttribution);
            return this;
        }

        public Builder setSampledShapleyAttribution(GoogleCloudMlV1__SampledShapleyAttributionResponse sampledShapleyAttribution) {
            this.sampledShapleyAttribution = Objects.requireNonNull(sampledShapleyAttribution);
            return this;
        }

        public Builder setXraiAttribution(GoogleCloudMlV1__XraiAttributionResponse xraiAttribution) {
            this.xraiAttribution = Objects.requireNonNull(xraiAttribution);
            return this;
        }
        public GoogleCloudMlV1__ExplanationConfigResponse build() {
            return new GoogleCloudMlV1__ExplanationConfigResponse(integratedGradientsAttribution, sampledShapleyAttribution, xraiAttribution);
        }
    }
}