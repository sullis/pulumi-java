// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Application Insights component daily data volume cap
 * 
 */
public final class ApplicationInsightsComponentDataVolumeCapArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationInsightsComponentDataVolumeCapArgs Empty = new ApplicationInsightsComponentDataVolumeCapArgs();

    /**
     * Daily data volume cap in GB.
     * 
     */
    @InputImport(name="cap")
      private final @Nullable Input<Double> cap;

    public Input<Double> getCap() {
        return this.cap == null ? Input.empty() : this.cap;
    }

    /**
     * Do not send a notification email when the daily data volume cap is met.
     * 
     */
    @InputImport(name="stopSendNotificationWhenHitCap")
      private final @Nullable Input<Boolean> stopSendNotificationWhenHitCap;

    public Input<Boolean> getStopSendNotificationWhenHitCap() {
        return this.stopSendNotificationWhenHitCap == null ? Input.empty() : this.stopSendNotificationWhenHitCap;
    }

    /**
     * Reserved, not used for now.
     * 
     */
    @InputImport(name="stopSendNotificationWhenHitThreshold")
      private final @Nullable Input<Boolean> stopSendNotificationWhenHitThreshold;

    public Input<Boolean> getStopSendNotificationWhenHitThreshold() {
        return this.stopSendNotificationWhenHitThreshold == null ? Input.empty() : this.stopSendNotificationWhenHitThreshold;
    }

    /**
     * Reserved, not used for now.
     * 
     */
    @InputImport(name="warningThreshold")
      private final @Nullable Input<Integer> warningThreshold;

    public Input<Integer> getWarningThreshold() {
        return this.warningThreshold == null ? Input.empty() : this.warningThreshold;
    }

    public ApplicationInsightsComponentDataVolumeCapArgs(
        @Nullable Input<Double> cap,
        @Nullable Input<Boolean> stopSendNotificationWhenHitCap,
        @Nullable Input<Boolean> stopSendNotificationWhenHitThreshold,
        @Nullable Input<Integer> warningThreshold) {
        this.cap = cap;
        this.stopSendNotificationWhenHitCap = stopSendNotificationWhenHitCap;
        this.stopSendNotificationWhenHitThreshold = stopSendNotificationWhenHitThreshold;
        this.warningThreshold = warningThreshold;
    }

    private ApplicationInsightsComponentDataVolumeCapArgs() {
        this.cap = Input.empty();
        this.stopSendNotificationWhenHitCap = Input.empty();
        this.stopSendNotificationWhenHitThreshold = Input.empty();
        this.warningThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInsightsComponentDataVolumeCapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> cap;
        private @Nullable Input<Boolean> stopSendNotificationWhenHitCap;
        private @Nullable Input<Boolean> stopSendNotificationWhenHitThreshold;
        private @Nullable Input<Integer> warningThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInsightsComponentDataVolumeCapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cap = defaults.cap;
    	      this.stopSendNotificationWhenHitCap = defaults.stopSendNotificationWhenHitCap;
    	      this.stopSendNotificationWhenHitThreshold = defaults.stopSendNotificationWhenHitThreshold;
    	      this.warningThreshold = defaults.warningThreshold;
        }

        public Builder setCap(@Nullable Input<Double> cap) {
            this.cap = cap;
            return this;
        }

        public Builder setCap(@Nullable Double cap) {
            this.cap = Input.ofNullable(cap);
            return this;
        }

        public Builder setStopSendNotificationWhenHitCap(@Nullable Input<Boolean> stopSendNotificationWhenHitCap) {
            this.stopSendNotificationWhenHitCap = stopSendNotificationWhenHitCap;
            return this;
        }

        public Builder setStopSendNotificationWhenHitCap(@Nullable Boolean stopSendNotificationWhenHitCap) {
            this.stopSendNotificationWhenHitCap = Input.ofNullable(stopSendNotificationWhenHitCap);
            return this;
        }

        public Builder setStopSendNotificationWhenHitThreshold(@Nullable Input<Boolean> stopSendNotificationWhenHitThreshold) {
            this.stopSendNotificationWhenHitThreshold = stopSendNotificationWhenHitThreshold;
            return this;
        }

        public Builder setStopSendNotificationWhenHitThreshold(@Nullable Boolean stopSendNotificationWhenHitThreshold) {
            this.stopSendNotificationWhenHitThreshold = Input.ofNullable(stopSendNotificationWhenHitThreshold);
            return this;
        }

        public Builder setWarningThreshold(@Nullable Input<Integer> warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }

        public Builder setWarningThreshold(@Nullable Integer warningThreshold) {
            this.warningThreshold = Input.ofNullable(warningThreshold);
            return this;
        }
        public ApplicationInsightsComponentDataVolumeCapArgs build() {
            return new ApplicationInsightsComponentDataVolumeCapArgs(cap, stopSendNotificationWhenHitCap, stopSendNotificationWhenHitThreshold, warningThreshold);
        }
    }
}