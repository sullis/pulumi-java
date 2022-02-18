// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceProfileLoRaWANServiceProfile {
    private final @Nullable Boolean addGwMetadata;
    private final @Nullable String channelMask;
    private final @Nullable Integer devStatusReqFreq;
    private final @Nullable Integer dlBucketSize;
    private final @Nullable Integer dlRate;
    private final @Nullable String dlRatePolicy;
    private final @Nullable Integer drMax;
    private final @Nullable Integer drMin;
    private final @Nullable Boolean hrAllowed;
    private final @Nullable Integer minGwDiversity;
    private final @Nullable Boolean nwkGeoLoc;
    private final @Nullable Boolean prAllowed;
    private final @Nullable Boolean raAllowed;
    private final @Nullable Boolean reportDevStatusBattery;
    private final @Nullable Boolean reportDevStatusMargin;
    private final @Nullable Integer targetPer;
    private final @Nullable Integer ulBucketSize;
    private final @Nullable Integer ulRate;
    private final @Nullable String ulRatePolicy;

    @OutputCustomType.Constructor({"addGwMetadata","channelMask","devStatusReqFreq","dlBucketSize","dlRate","dlRatePolicy","drMax","drMin","hrAllowed","minGwDiversity","nwkGeoLoc","prAllowed","raAllowed","reportDevStatusBattery","reportDevStatusMargin","targetPer","ulBucketSize","ulRate","ulRatePolicy"})
    private ServiceProfileLoRaWANServiceProfile(
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

    public Optional<Boolean> getAddGwMetadata() {
        return Optional.ofNullable(this.addGwMetadata);
    }
    public Optional<String> getChannelMask() {
        return Optional.ofNullable(this.channelMask);
    }
    public Optional<Integer> getDevStatusReqFreq() {
        return Optional.ofNullable(this.devStatusReqFreq);
    }
    public Optional<Integer> getDlBucketSize() {
        return Optional.ofNullable(this.dlBucketSize);
    }
    public Optional<Integer> getDlRate() {
        return Optional.ofNullable(this.dlRate);
    }
    public Optional<String> getDlRatePolicy() {
        return Optional.ofNullable(this.dlRatePolicy);
    }
    public Optional<Integer> getDrMax() {
        return Optional.ofNullable(this.drMax);
    }
    public Optional<Integer> getDrMin() {
        return Optional.ofNullable(this.drMin);
    }
    public Optional<Boolean> getHrAllowed() {
        return Optional.ofNullable(this.hrAllowed);
    }
    public Optional<Integer> getMinGwDiversity() {
        return Optional.ofNullable(this.minGwDiversity);
    }
    public Optional<Boolean> getNwkGeoLoc() {
        return Optional.ofNullable(this.nwkGeoLoc);
    }
    public Optional<Boolean> getPrAllowed() {
        return Optional.ofNullable(this.prAllowed);
    }
    public Optional<Boolean> getRaAllowed() {
        return Optional.ofNullable(this.raAllowed);
    }
    public Optional<Boolean> getReportDevStatusBattery() {
        return Optional.ofNullable(this.reportDevStatusBattery);
    }
    public Optional<Boolean> getReportDevStatusMargin() {
        return Optional.ofNullable(this.reportDevStatusMargin);
    }
    public Optional<Integer> getTargetPer() {
        return Optional.ofNullable(this.targetPer);
    }
    public Optional<Integer> getUlBucketSize() {
        return Optional.ofNullable(this.ulBucketSize);
    }
    public Optional<Integer> getUlRate() {
        return Optional.ofNullable(this.ulRate);
    }
    public Optional<String> getUlRatePolicy() {
        return Optional.ofNullable(this.ulRatePolicy);
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

        public Builder setAddGwMetadata(@Nullable Boolean addGwMetadata) {
            this.addGwMetadata = addGwMetadata;
            return this;
        }

        public Builder setChannelMask(@Nullable String channelMask) {
            this.channelMask = channelMask;
            return this;
        }

        public Builder setDevStatusReqFreq(@Nullable Integer devStatusReqFreq) {
            this.devStatusReqFreq = devStatusReqFreq;
            return this;
        }

        public Builder setDlBucketSize(@Nullable Integer dlBucketSize) {
            this.dlBucketSize = dlBucketSize;
            return this;
        }

        public Builder setDlRate(@Nullable Integer dlRate) {
            this.dlRate = dlRate;
            return this;
        }

        public Builder setDlRatePolicy(@Nullable String dlRatePolicy) {
            this.dlRatePolicy = dlRatePolicy;
            return this;
        }

        public Builder setDrMax(@Nullable Integer drMax) {
            this.drMax = drMax;
            return this;
        }

        public Builder setDrMin(@Nullable Integer drMin) {
            this.drMin = drMin;
            return this;
        }

        public Builder setHrAllowed(@Nullable Boolean hrAllowed) {
            this.hrAllowed = hrAllowed;
            return this;
        }

        public Builder setMinGwDiversity(@Nullable Integer minGwDiversity) {
            this.minGwDiversity = minGwDiversity;
            return this;
        }

        public Builder setNwkGeoLoc(@Nullable Boolean nwkGeoLoc) {
            this.nwkGeoLoc = nwkGeoLoc;
            return this;
        }

        public Builder setPrAllowed(@Nullable Boolean prAllowed) {
            this.prAllowed = prAllowed;
            return this;
        }

        public Builder setRaAllowed(@Nullable Boolean raAllowed) {
            this.raAllowed = raAllowed;
            return this;
        }

        public Builder setReportDevStatusBattery(@Nullable Boolean reportDevStatusBattery) {
            this.reportDevStatusBattery = reportDevStatusBattery;
            return this;
        }

        public Builder setReportDevStatusMargin(@Nullable Boolean reportDevStatusMargin) {
            this.reportDevStatusMargin = reportDevStatusMargin;
            return this;
        }

        public Builder setTargetPer(@Nullable Integer targetPer) {
            this.targetPer = targetPer;
            return this;
        }

        public Builder setUlBucketSize(@Nullable Integer ulBucketSize) {
            this.ulBucketSize = ulBucketSize;
            return this;
        }

        public Builder setUlRate(@Nullable Integer ulRate) {
            this.ulRate = ulRate;
            return this;
        }

        public Builder setUlRatePolicy(@Nullable String ulRatePolicy) {
            this.ulRatePolicy = ulRatePolicy;
            return this;
        }

        public ServiceProfileLoRaWANServiceProfile build() {
            return new ServiceProfileLoRaWANServiceProfile(addGwMetadata, channelMask, devStatusReqFreq, dlBucketSize, dlRate, dlRatePolicy, drMax, drMin, hrAllowed, minGwDiversity, nwkGeoLoc, prAllowed, raAllowed, reportDevStatusBattery, reportDevStatusMargin, targetPer, ulBucketSize, ulRate, ulRatePolicy);
        }
    }
}
