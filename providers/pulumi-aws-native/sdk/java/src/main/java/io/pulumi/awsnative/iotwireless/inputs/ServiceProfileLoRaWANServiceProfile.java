// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceProfileLoRaWANServiceProfile extends io.pulumi.resources.InvokeArgs {

    public static final ServiceProfileLoRaWANServiceProfile Empty = new ServiceProfileLoRaWANServiceProfile();

    @Import(name="addGwMetadata")
      private final @Nullable Boolean addGwMetadata;

    public Optional<Boolean> getAddGwMetadata() {
        return this.addGwMetadata == null ? Optional.empty() : Optional.ofNullable(this.addGwMetadata);
    }

    @Import(name="channelMask")
      private final @Nullable String channelMask;

    public Optional<String> getChannelMask() {
        return this.channelMask == null ? Optional.empty() : Optional.ofNullable(this.channelMask);
    }

    @Import(name="devStatusReqFreq")
      private final @Nullable Integer devStatusReqFreq;

    public Optional<Integer> getDevStatusReqFreq() {
        return this.devStatusReqFreq == null ? Optional.empty() : Optional.ofNullable(this.devStatusReqFreq);
    }

    @Import(name="dlBucketSize")
      private final @Nullable Integer dlBucketSize;

    public Optional<Integer> getDlBucketSize() {
        return this.dlBucketSize == null ? Optional.empty() : Optional.ofNullable(this.dlBucketSize);
    }

    @Import(name="dlRate")
      private final @Nullable Integer dlRate;

    public Optional<Integer> getDlRate() {
        return this.dlRate == null ? Optional.empty() : Optional.ofNullable(this.dlRate);
    }

    @Import(name="dlRatePolicy")
      private final @Nullable String dlRatePolicy;

    public Optional<String> getDlRatePolicy() {
        return this.dlRatePolicy == null ? Optional.empty() : Optional.ofNullable(this.dlRatePolicy);
    }

    @Import(name="drMax")
      private final @Nullable Integer drMax;

    public Optional<Integer> getDrMax() {
        return this.drMax == null ? Optional.empty() : Optional.ofNullable(this.drMax);
    }

    @Import(name="drMin")
      private final @Nullable Integer drMin;

    public Optional<Integer> getDrMin() {
        return this.drMin == null ? Optional.empty() : Optional.ofNullable(this.drMin);
    }

    @Import(name="hrAllowed")
      private final @Nullable Boolean hrAllowed;

    public Optional<Boolean> getHrAllowed() {
        return this.hrAllowed == null ? Optional.empty() : Optional.ofNullable(this.hrAllowed);
    }

    @Import(name="minGwDiversity")
      private final @Nullable Integer minGwDiversity;

    public Optional<Integer> getMinGwDiversity() {
        return this.minGwDiversity == null ? Optional.empty() : Optional.ofNullable(this.minGwDiversity);
    }

    @Import(name="nwkGeoLoc")
      private final @Nullable Boolean nwkGeoLoc;

    public Optional<Boolean> getNwkGeoLoc() {
        return this.nwkGeoLoc == null ? Optional.empty() : Optional.ofNullable(this.nwkGeoLoc);
    }

    @Import(name="prAllowed")
      private final @Nullable Boolean prAllowed;

    public Optional<Boolean> getPrAllowed() {
        return this.prAllowed == null ? Optional.empty() : Optional.ofNullable(this.prAllowed);
    }

    @Import(name="raAllowed")
      private final @Nullable Boolean raAllowed;

    public Optional<Boolean> getRaAllowed() {
        return this.raAllowed == null ? Optional.empty() : Optional.ofNullable(this.raAllowed);
    }

    @Import(name="reportDevStatusBattery")
      private final @Nullable Boolean reportDevStatusBattery;

    public Optional<Boolean> getReportDevStatusBattery() {
        return this.reportDevStatusBattery == null ? Optional.empty() : Optional.ofNullable(this.reportDevStatusBattery);
    }

    @Import(name="reportDevStatusMargin")
      private final @Nullable Boolean reportDevStatusMargin;

    public Optional<Boolean> getReportDevStatusMargin() {
        return this.reportDevStatusMargin == null ? Optional.empty() : Optional.ofNullable(this.reportDevStatusMargin);
    }

    @Import(name="targetPer")
      private final @Nullable Integer targetPer;

    public Optional<Integer> getTargetPer() {
        return this.targetPer == null ? Optional.empty() : Optional.ofNullable(this.targetPer);
    }

    @Import(name="ulBucketSize")
      private final @Nullable Integer ulBucketSize;

    public Optional<Integer> getUlBucketSize() {
        return this.ulBucketSize == null ? Optional.empty() : Optional.ofNullable(this.ulBucketSize);
    }

    @Import(name="ulRate")
      private final @Nullable Integer ulRate;

    public Optional<Integer> getUlRate() {
        return this.ulRate == null ? Optional.empty() : Optional.ofNullable(this.ulRate);
    }

    @Import(name="ulRatePolicy")
      private final @Nullable String ulRatePolicy;

    public Optional<String> getUlRatePolicy() {
        return this.ulRatePolicy == null ? Optional.empty() : Optional.ofNullable(this.ulRatePolicy);
    }

    public ServiceProfileLoRaWANServiceProfile(
        @Nullable Boolean addGwMetadata,
        @Nullable String channelMask,
        @Nullable Integer devStatusReqFreq,
        @Nullable Integer dlBucketSize,
        @Nullable Integer dlRate,
        @Nullable String dlRatePolicy,
        @Nullable Integer drMax,
        @Nullable Integer drMin,
        @Nullable Boolean hrAllowed,
        @Nullable Integer minGwDiversity,
        @Nullable Boolean nwkGeoLoc,
        @Nullable Boolean prAllowed,
        @Nullable Boolean raAllowed,
        @Nullable Boolean reportDevStatusBattery,
        @Nullable Boolean reportDevStatusMargin,
        @Nullable Integer targetPer,
        @Nullable Integer ulBucketSize,
        @Nullable Integer ulRate,
        @Nullable String ulRatePolicy) {
        this.addGwMetadata = addGwMetadata;
        this.channelMask = channelMask;
        this.devStatusReqFreq = devStatusReqFreq;
        this.dlBucketSize = dlBucketSize;
        this.dlRate = dlRate;
        this.dlRatePolicy = dlRatePolicy;
        this.drMax = drMax;
        this.drMin = drMin;
        this.hrAllowed = hrAllowed;
        this.minGwDiversity = minGwDiversity;
        this.nwkGeoLoc = nwkGeoLoc;
        this.prAllowed = prAllowed;
        this.raAllowed = raAllowed;
        this.reportDevStatusBattery = reportDevStatusBattery;
        this.reportDevStatusMargin = reportDevStatusMargin;
        this.targetPer = targetPer;
        this.ulBucketSize = ulBucketSize;
        this.ulRate = ulRate;
        this.ulRatePolicy = ulRatePolicy;
    }

    private ServiceProfileLoRaWANServiceProfile() {
        this.addGwMetadata = null;
        this.channelMask = null;
        this.devStatusReqFreq = null;
        this.dlBucketSize = null;
        this.dlRate = null;
        this.dlRatePolicy = null;
        this.drMax = null;
        this.drMin = null;
        this.hrAllowed = null;
        this.minGwDiversity = null;
        this.nwkGeoLoc = null;
        this.prAllowed = null;
        this.raAllowed = null;
        this.reportDevStatusBattery = null;
        this.reportDevStatusMargin = null;
        this.targetPer = null;
        this.ulBucketSize = null;
        this.ulRate = null;
        this.ulRatePolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileLoRaWANServiceProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean addGwMetadata;
        private @Nullable String channelMask;
        private @Nullable Integer devStatusReqFreq;
        private @Nullable Integer dlBucketSize;
        private @Nullable Integer dlRate;
        private @Nullable String dlRatePolicy;
        private @Nullable Integer drMax;
        private @Nullable Integer drMin;
        private @Nullable Boolean hrAllowed;
        private @Nullable Integer minGwDiversity;
        private @Nullable Boolean nwkGeoLoc;
        private @Nullable Boolean prAllowed;
        private @Nullable Boolean raAllowed;
        private @Nullable Boolean reportDevStatusBattery;
        private @Nullable Boolean reportDevStatusMargin;
        private @Nullable Integer targetPer;
        private @Nullable Integer ulBucketSize;
        private @Nullable Integer ulRate;
        private @Nullable String ulRatePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProfileLoRaWANServiceProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addGwMetadata = defaults.addGwMetadata;
    	      this.channelMask = defaults.channelMask;
    	      this.devStatusReqFreq = defaults.devStatusReqFreq;
    	      this.dlBucketSize = defaults.dlBucketSize;
    	      this.dlRate = defaults.dlRate;
    	      this.dlRatePolicy = defaults.dlRatePolicy;
    	      this.drMax = defaults.drMax;
    	      this.drMin = defaults.drMin;
    	      this.hrAllowed = defaults.hrAllowed;
    	      this.minGwDiversity = defaults.minGwDiversity;
    	      this.nwkGeoLoc = defaults.nwkGeoLoc;
    	      this.prAllowed = defaults.prAllowed;
    	      this.raAllowed = defaults.raAllowed;
    	      this.reportDevStatusBattery = defaults.reportDevStatusBattery;
    	      this.reportDevStatusMargin = defaults.reportDevStatusMargin;
    	      this.targetPer = defaults.targetPer;
    	      this.ulBucketSize = defaults.ulBucketSize;
    	      this.ulRate = defaults.ulRate;
    	      this.ulRatePolicy = defaults.ulRatePolicy;
        }

        public Builder addGwMetadata(@Nullable Boolean addGwMetadata) {
            this.addGwMetadata = addGwMetadata;
            return this;
        }
        public Builder channelMask(@Nullable String channelMask) {
            this.channelMask = channelMask;
            return this;
        }
        public Builder devStatusReqFreq(@Nullable Integer devStatusReqFreq) {
            this.devStatusReqFreq = devStatusReqFreq;
            return this;
        }
        public Builder dlBucketSize(@Nullable Integer dlBucketSize) {
            this.dlBucketSize = dlBucketSize;
            return this;
        }
        public Builder dlRate(@Nullable Integer dlRate) {
            this.dlRate = dlRate;
            return this;
        }
        public Builder dlRatePolicy(@Nullable String dlRatePolicy) {
            this.dlRatePolicy = dlRatePolicy;
            return this;
        }
        public Builder drMax(@Nullable Integer drMax) {
            this.drMax = drMax;
            return this;
        }
        public Builder drMin(@Nullable Integer drMin) {
            this.drMin = drMin;
            return this;
        }
        public Builder hrAllowed(@Nullable Boolean hrAllowed) {
            this.hrAllowed = hrAllowed;
            return this;
        }
        public Builder minGwDiversity(@Nullable Integer minGwDiversity) {
            this.minGwDiversity = minGwDiversity;
            return this;
        }
        public Builder nwkGeoLoc(@Nullable Boolean nwkGeoLoc) {
            this.nwkGeoLoc = nwkGeoLoc;
            return this;
        }
        public Builder prAllowed(@Nullable Boolean prAllowed) {
            this.prAllowed = prAllowed;
            return this;
        }
        public Builder raAllowed(@Nullable Boolean raAllowed) {
            this.raAllowed = raAllowed;
            return this;
        }
        public Builder reportDevStatusBattery(@Nullable Boolean reportDevStatusBattery) {
            this.reportDevStatusBattery = reportDevStatusBattery;
            return this;
        }
        public Builder reportDevStatusMargin(@Nullable Boolean reportDevStatusMargin) {
            this.reportDevStatusMargin = reportDevStatusMargin;
            return this;
        }
        public Builder targetPer(@Nullable Integer targetPer) {
            this.targetPer = targetPer;
            return this;
        }
        public Builder ulBucketSize(@Nullable Integer ulBucketSize) {
            this.ulBucketSize = ulBucketSize;
            return this;
        }
        public Builder ulRate(@Nullable Integer ulRate) {
            this.ulRate = ulRate;
            return this;
        }
        public Builder ulRatePolicy(@Nullable String ulRatePolicy) {
            this.ulRatePolicy = ulRatePolicy;
            return this;
        }        public ServiceProfileLoRaWANServiceProfile build() {
            return new ServiceProfileLoRaWANServiceProfile(addGwMetadata, channelMask, devStatusReqFreq, dlBucketSize, dlRate, dlRatePolicy, drMax, drMin, hrAllowed, minGwDiversity, nwkGeoLoc, prAllowed, raAllowed, reportDevStatusBattery, reportDevStatusMargin, targetPer, ulBucketSize, ulRate, ulRatePolicy);
        }
    }
}
