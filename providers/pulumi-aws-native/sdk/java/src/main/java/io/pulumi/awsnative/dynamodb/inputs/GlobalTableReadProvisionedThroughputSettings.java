// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.awsnative.dynamodb.inputs.GlobalTableCapacityAutoScalingSettings;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalTableReadProvisionedThroughputSettings extends io.pulumi.resources.InvokeArgs {

    public static final GlobalTableReadProvisionedThroughputSettings Empty = new GlobalTableReadProvisionedThroughputSettings();

    @Import(name="readCapacityAutoScalingSettings")
      private final @Nullable GlobalTableCapacityAutoScalingSettings readCapacityAutoScalingSettings;

    public Optional<GlobalTableCapacityAutoScalingSettings> readCapacityAutoScalingSettings() {
        return this.readCapacityAutoScalingSettings == null ? Optional.empty() : Optional.ofNullable(this.readCapacityAutoScalingSettings);
    }

    @Import(name="readCapacityUnits")
      private final @Nullable Integer readCapacityUnits;

    public Optional<Integer> readCapacityUnits() {
        return this.readCapacityUnits == null ? Optional.empty() : Optional.ofNullable(this.readCapacityUnits);
    }

    public GlobalTableReadProvisionedThroughputSettings(
        @Nullable GlobalTableCapacityAutoScalingSettings readCapacityAutoScalingSettings,
        @Nullable Integer readCapacityUnits) {
        this.readCapacityAutoScalingSettings = readCapacityAutoScalingSettings;
        this.readCapacityUnits = readCapacityUnits;
    }

    private GlobalTableReadProvisionedThroughputSettings() {
        this.readCapacityAutoScalingSettings = null;
        this.readCapacityUnits = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReadProvisionedThroughputSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GlobalTableCapacityAutoScalingSettings readCapacityAutoScalingSettings;
        private @Nullable Integer readCapacityUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReadProvisionedThroughputSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readCapacityAutoScalingSettings = defaults.readCapacityAutoScalingSettings;
    	      this.readCapacityUnits = defaults.readCapacityUnits;
        }

        public Builder readCapacityAutoScalingSettings(@Nullable GlobalTableCapacityAutoScalingSettings readCapacityAutoScalingSettings) {
            this.readCapacityAutoScalingSettings = readCapacityAutoScalingSettings;
            return this;
        }
        public Builder readCapacityUnits(@Nullable Integer readCapacityUnits) {
            this.readCapacityUnits = readCapacityUnits;
            return this;
        }        public GlobalTableReadProvisionedThroughputSettings build() {
            return new GlobalTableReadProvisionedThroughputSettings(readCapacityAutoScalingSettings, readCapacityUnits);
        }
    }
}
