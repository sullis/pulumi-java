// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ChannelRetentionPeriod {
    private final @Nullable Integer numberOfDays;
    private final @Nullable Boolean unlimited;

    @OutputCustomType.Constructor
    private ChannelRetentionPeriod(
        @OutputCustomType.Parameter("numberOfDays") @Nullable Integer numberOfDays,
        @OutputCustomType.Parameter("unlimited") @Nullable Boolean unlimited) {
        this.numberOfDays = numberOfDays;
        this.unlimited = unlimited;
    }

    public Optional<Integer> getNumberOfDays() {
        return Optional.ofNullable(this.numberOfDays);
    }
    public Optional<Boolean> getUnlimited() {
        return Optional.ofNullable(this.unlimited);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelRetentionPeriod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer numberOfDays;
        private @Nullable Boolean unlimited;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelRetentionPeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numberOfDays = defaults.numberOfDays;
    	      this.unlimited = defaults.unlimited;
        }

        public Builder setNumberOfDays(@Nullable Integer numberOfDays) {
            this.numberOfDays = numberOfDays;
            return this;
        }

        public Builder setUnlimited(@Nullable Boolean unlimited) {
            this.unlimited = unlimited;
            return this;
        }
        public ChannelRetentionPeriod build() {
            return new ChannelRetentionPeriod(numberOfDays, unlimited);
        }
    }
}
