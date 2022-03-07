// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExpressRouteCircuitStatsResponse {
    /**
     * The Primary BytesIn of the peering.
     * 
     */
    private final @Nullable Double primarybytesIn;
    /**
     * The primary BytesOut of the peering.
     * 
     */
    private final @Nullable Double primarybytesOut;
    /**
     * The secondary BytesIn of the peering.
     * 
     */
    private final @Nullable Double secondarybytesIn;
    /**
     * The secondary BytesOut of the peering.
     * 
     */
    private final @Nullable Double secondarybytesOut;

    @OutputCustomType.Constructor({"primarybytesIn","primarybytesOut","secondarybytesIn","secondarybytesOut"})
    private ExpressRouteCircuitStatsResponse(
        @Nullable Double primarybytesIn,
        @Nullable Double primarybytesOut,
        @Nullable Double secondarybytesIn,
        @Nullable Double secondarybytesOut) {
        this.primarybytesIn = primarybytesIn;
        this.primarybytesOut = primarybytesOut;
        this.secondarybytesIn = secondarybytesIn;
        this.secondarybytesOut = secondarybytesOut;
    }

    /**
     * The Primary BytesIn of the peering.
     * 
    */
    public Optional<Double> getPrimarybytesIn() {
        return Optional.ofNullable(this.primarybytesIn);
    }
    /**
     * The primary BytesOut of the peering.
     * 
    */
    public Optional<Double> getPrimarybytesOut() {
        return Optional.ofNullable(this.primarybytesOut);
    }
    /**
     * The secondary BytesIn of the peering.
     * 
    */
    public Optional<Double> getSecondarybytesIn() {
        return Optional.ofNullable(this.secondarybytesIn);
    }
    /**
     * The secondary BytesOut of the peering.
     * 
    */
    public Optional<Double> getSecondarybytesOut() {
        return Optional.ofNullable(this.secondarybytesOut);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double primarybytesIn;
        private @Nullable Double primarybytesOut;
        private @Nullable Double secondarybytesIn;
        private @Nullable Double secondarybytesOut;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primarybytesIn = defaults.primarybytesIn;
    	      this.primarybytesOut = defaults.primarybytesOut;
    	      this.secondarybytesIn = defaults.secondarybytesIn;
    	      this.secondarybytesOut = defaults.secondarybytesOut;
        }

        public Builder setPrimarybytesIn(@Nullable Double primarybytesIn) {
            this.primarybytesIn = primarybytesIn;
            return this;
        }

        public Builder setPrimarybytesOut(@Nullable Double primarybytesOut) {
            this.primarybytesOut = primarybytesOut;
            return this;
        }

        public Builder setSecondarybytesIn(@Nullable Double secondarybytesIn) {
            this.secondarybytesIn = secondarybytesIn;
            return this;
        }

        public Builder setSecondarybytesOut(@Nullable Double secondarybytesOut) {
            this.secondarybytesOut = secondarybytesOut;
            return this;
        }
        public ExpressRouteCircuitStatsResponse build() {
            return new ExpressRouteCircuitStatsResponse(primarybytesIn, primarybytesOut, secondarybytesIn, secondarybytesOut);
        }
    }
}