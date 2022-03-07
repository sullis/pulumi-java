// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance;
import io.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformance;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SloWindowsBasedSliGoodTotalRatioThreshold {
    /**
     * Basic SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
     */
    private final @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance basicSliPerformance;
    /**
     * Request-based SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
     */
    private final @Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformance performance;
    /**
     * A duration string, e.g. 10s.
     * Good service is defined to be the count of requests made to
     * this service that return in no more than threshold.
     * 
     */
    private final @Nullable Double threshold;

    @OutputCustomType.Constructor({"basicSliPerformance","performance","threshold"})
    private SloWindowsBasedSliGoodTotalRatioThreshold(
        @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance basicSliPerformance,
        @Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformance performance,
        @Nullable Double threshold) {
        this.basicSliPerformance = basicSliPerformance;
        this.performance = performance;
        this.threshold = threshold;
    }

    /**
     * Basic SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
    */
    public Optional<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance> getBasicSliPerformance() {
        return Optional.ofNullable(this.basicSliPerformance);
    }
    /**
     * Request-based SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
    */
    public Optional<SloWindowsBasedSliGoodTotalRatioThresholdPerformance> getPerformance() {
        return Optional.ofNullable(this.performance);
    }
    /**
     * A duration string, e.g. 10s.
     * Good service is defined to be the count of requests made to
     * this service that return in no more than threshold.
     * 
    */
    public Optional<Double> getThreshold() {
        return Optional.ofNullable(this.threshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance basicSliPerformance;
        private @Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformance performance;
        private @Nullable Double threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicSliPerformance = defaults.basicSliPerformance;
    	      this.performance = defaults.performance;
    	      this.threshold = defaults.threshold;
        }

        public Builder setBasicSliPerformance(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance basicSliPerformance) {
            this.basicSliPerformance = basicSliPerformance;
            return this;
        }

        public Builder setPerformance(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformance performance) {
            this.performance = performance;
            return this;
        }

        public Builder setThreshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public SloWindowsBasedSliGoodTotalRatioThreshold build() {
            return new SloWindowsBasedSliGoodTotalRatioThreshold(basicSliPerformance, performance, threshold);
        }
    }
}