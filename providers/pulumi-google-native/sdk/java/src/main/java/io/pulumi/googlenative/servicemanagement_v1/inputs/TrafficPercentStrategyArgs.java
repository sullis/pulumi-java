// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Strategy that specifies how clients of Google Service Controller want to send traffic to use different config versions. This is generally used by API proxy to split traffic based on your configured percentage for each config version. One example of how to gradually rollout a new service configuration using this strategy: Day 1 Rollout { id: "example.googleapis.com/rollout_20160206" traffic_percent_strategy { percentages: { "example.googleapis.com/20160201": 70.00 "example.googleapis.com/20160206": 30.00 } } } Day 2 Rollout { id: "example.googleapis.com/rollout_20160207" traffic_percent_strategy: { percentages: { "example.googleapis.com/20160206": 100.00 } } }
 * 
 */
public final class TrafficPercentStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficPercentStrategyArgs Empty = new TrafficPercentStrategyArgs();

    /**
     * Maps service configuration IDs to their corresponding traffic percentage. Key is the service configuration ID, Value is the traffic percentage which must be greater than 0.0 and the sum must equal to 100.0.
     * 
     */
    @InputImport(name="percentages")
      private final @Nullable Input<Map<String,String>> percentages;

    public Input<Map<String,String>> getPercentages() {
        return this.percentages == null ? Input.empty() : this.percentages;
    }

    public TrafficPercentStrategyArgs(@Nullable Input<Map<String,String>> percentages) {
        this.percentages = percentages;
    }

    private TrafficPercentStrategyArgs() {
        this.percentages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficPercentStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> percentages;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficPercentStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentages = defaults.percentages;
        }

        public Builder setPercentages(@Nullable Input<Map<String,String>> percentages) {
            this.percentages = percentages;
            return this;
        }

        public Builder setPercentages(@Nullable Map<String,String> percentages) {
            this.percentages = Input.ofNullable(percentages);
            return this;
        }
        public TrafficPercentStrategyArgs build() {
            return new TrafficPercentStrategyArgs(percentages);
        }
    }
}