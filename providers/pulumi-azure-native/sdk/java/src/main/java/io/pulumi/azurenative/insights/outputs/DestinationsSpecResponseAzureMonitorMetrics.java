// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DestinationsSpecResponseAzureMonitorMetrics {
    /**
     * A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"name"})
    private DestinationsSpecResponseAzureMonitorMetrics(@Nullable String name) {
        this.name = name;
    }

    /**
     * A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationsSpecResponseAzureMonitorMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationsSpecResponseAzureMonitorMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public DestinationsSpecResponseAzureMonitorMetrics build() {
            return new DestinationsSpecResponseAzureMonitorMetrics(name);
        }
    }
}
