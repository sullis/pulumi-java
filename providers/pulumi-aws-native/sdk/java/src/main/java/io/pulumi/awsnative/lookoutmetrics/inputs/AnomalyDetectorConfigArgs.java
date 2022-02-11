// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorFrequency;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class AnomalyDetectorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorConfigArgs Empty = new AnomalyDetectorConfigArgs();

    @InputImport(name="anomalyDetectorFrequency", required=true)
    private final Input<AnomalyDetectorFrequency> anomalyDetectorFrequency;

    public Input<AnomalyDetectorFrequency> getAnomalyDetectorFrequency() {
        return this.anomalyDetectorFrequency;
    }

    public AnomalyDetectorConfigArgs(Input<AnomalyDetectorFrequency> anomalyDetectorFrequency) {
        this.anomalyDetectorFrequency = Objects.requireNonNull(anomalyDetectorFrequency, "expected parameter 'anomalyDetectorFrequency' to be non-null");
    }

    private AnomalyDetectorConfigArgs() {
        this.anomalyDetectorFrequency = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AnomalyDetectorFrequency> anomalyDetectorFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anomalyDetectorFrequency = defaults.anomalyDetectorFrequency;
        }

        public Builder setAnomalyDetectorFrequency(Input<AnomalyDetectorFrequency> anomalyDetectorFrequency) {
            this.anomalyDetectorFrequency = Objects.requireNonNull(anomalyDetectorFrequency);
            return this;
        }

        public Builder setAnomalyDetectorFrequency(AnomalyDetectorFrequency anomalyDetectorFrequency) {
            this.anomalyDetectorFrequency = Input.of(Objects.requireNonNull(anomalyDetectorFrequency));
            return this;
        }

        public AnomalyDetectorConfigArgs build() {
            return new AnomalyDetectorConfigArgs(anomalyDetectorFrequency);
        }
    }
}
