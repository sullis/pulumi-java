// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.FlowAggregationType;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowAggregationConfig {
    private final @Nullable FlowAggregationType aggregationType;

    @OutputCustomType.Constructor({"aggregationType"})
    private FlowAggregationConfig(@Nullable FlowAggregationType aggregationType) {
        this.aggregationType = aggregationType;
    }

    public Optional<FlowAggregationType> getAggregationType() {
        return Optional.ofNullable(this.aggregationType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowAggregationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowAggregationType aggregationType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowAggregationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationType = defaults.aggregationType;
        }

        public Builder setAggregationType(@Nullable FlowAggregationType aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }

        public FlowAggregationConfig build() {
            return new FlowAggregationConfig(aggregationType);
        }
    }
}
