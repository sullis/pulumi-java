// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1TraceSamplingConfigResponse {
    /**
     * Sampler of distributed tracing. OFF is the default value.
     * 
     */
    private final String sampler;
    /**
     * Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The supported values are > 0 and <= 0.5.
     * 
     */
    private final Double samplingRate;

    @OutputCustomType.Constructor({"sampler","samplingRate"})
    private GoogleCloudApigeeV1TraceSamplingConfigResponse(
        String sampler,
        Double samplingRate) {
        this.sampler = Objects.requireNonNull(sampler);
        this.samplingRate = Objects.requireNonNull(samplingRate);
    }

    /**
     * Sampler of distributed tracing. OFF is the default value.
     * 
    */
    public String getSampler() {
        return this.sampler;
    }
    /**
     * Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The supported values are > 0 and <= 0.5.
     * 
    */
    public Double getSamplingRate() {
        return this.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1TraceSamplingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sampler;
        private Double samplingRate;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1TraceSamplingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sampler = defaults.sampler;
    	      this.samplingRate = defaults.samplingRate;
        }

        public Builder setSampler(String sampler) {
            this.sampler = Objects.requireNonNull(sampler);
            return this;
        }

        public Builder setSamplingRate(Double samplingRate) {
            this.samplingRate = Objects.requireNonNull(samplingRate);
            return this;
        }
        public GoogleCloudApigeeV1TraceSamplingConfigResponse build() {
            return new GoogleCloudApigeeV1TraceSamplingConfigResponse(sampler, samplingRate);
        }
    }
}