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
public final class DeviceProfileLoRaWANDeviceProfile {
    private final @Nullable Integer classBTimeout;
    private final @Nullable Integer classCTimeout;
    private final @Nullable String macVersion;
    private final @Nullable Integer maxDutyCycle;
    private final @Nullable Integer maxEirp;
    private final @Nullable Integer pingSlotDr;
    private final @Nullable Integer pingSlotFreq;
    private final @Nullable Integer pingSlotPeriod;
    private final @Nullable String regParamsRevision;
    private final @Nullable String rfRegion;
    private final @Nullable Boolean supports32BitFCnt;
    private final @Nullable Boolean supportsClassB;
    private final @Nullable Boolean supportsClassC;
    private final @Nullable Boolean supportsJoin;

    @OutputCustomType.Constructor({"classBTimeout","classCTimeout","macVersion","maxDutyCycle","maxEirp","pingSlotDr","pingSlotFreq","pingSlotPeriod","regParamsRevision","rfRegion","supports32BitFCnt","supportsClassB","supportsClassC","supportsJoin"})
    private DeviceProfileLoRaWANDeviceProfile(
        @Nullable Integer classBTimeout,
        @Nullable Integer classCTimeout,
        @Nullable String macVersion,
        @Nullable Integer maxDutyCycle,
        @Nullable Integer maxEirp,
        @Nullable Integer pingSlotDr,
        @Nullable Integer pingSlotFreq,
        @Nullable Integer pingSlotPeriod,
        @Nullable String regParamsRevision,
        @Nullable String rfRegion,
        @Nullable Boolean supports32BitFCnt,
        @Nullable Boolean supportsClassB,
        @Nullable Boolean supportsClassC,
        @Nullable Boolean supportsJoin) {
        this.classBTimeout = classBTimeout;
        this.classCTimeout = classCTimeout;
        this.macVersion = macVersion;
        this.maxDutyCycle = maxDutyCycle;
        this.maxEirp = maxEirp;
        this.pingSlotDr = pingSlotDr;
        this.pingSlotFreq = pingSlotFreq;
        this.pingSlotPeriod = pingSlotPeriod;
        this.regParamsRevision = regParamsRevision;
        this.rfRegion = rfRegion;
        this.supports32BitFCnt = supports32BitFCnt;
        this.supportsClassB = supportsClassB;
        this.supportsClassC = supportsClassC;
        this.supportsJoin = supportsJoin;
    }

    public Optional<Integer> getClassBTimeout() {
        return Optional.ofNullable(this.classBTimeout);
    }
    public Optional<Integer> getClassCTimeout() {
        return Optional.ofNullable(this.classCTimeout);
    }
    public Optional<String> getMacVersion() {
        return Optional.ofNullable(this.macVersion);
    }
    public Optional<Integer> getMaxDutyCycle() {
        return Optional.ofNullable(this.maxDutyCycle);
    }
    public Optional<Integer> getMaxEirp() {
        return Optional.ofNullable(this.maxEirp);
    }
    public Optional<Integer> getPingSlotDr() {
        return Optional.ofNullable(this.pingSlotDr);
    }
    public Optional<Integer> getPingSlotFreq() {
        return Optional.ofNullable(this.pingSlotFreq);
    }
    public Optional<Integer> getPingSlotPeriod() {
        return Optional.ofNullable(this.pingSlotPeriod);
    }
    public Optional<String> getRegParamsRevision() {
        return Optional.ofNullable(this.regParamsRevision);
    }
    public Optional<String> getRfRegion() {
        return Optional.ofNullable(this.rfRegion);
    }
    public Optional<Boolean> getSupports32BitFCnt() {
        return Optional.ofNullable(this.supports32BitFCnt);
    }
    public Optional<Boolean> getSupportsClassB() {
        return Optional.ofNullable(this.supportsClassB);
    }
    public Optional<Boolean> getSupportsClassC() {
        return Optional.ofNullable(this.supportsClassC);
    }
    public Optional<Boolean> getSupportsJoin() {
        return Optional.ofNullable(this.supportsJoin);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceProfileLoRaWANDeviceProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer classBTimeout;
        private @Nullable Integer classCTimeout;
        private @Nullable String macVersion;
        private @Nullable Integer maxDutyCycle;
        private @Nullable Integer maxEirp;
        private @Nullable Integer pingSlotDr;
        private @Nullable Integer pingSlotFreq;
        private @Nullable Integer pingSlotPeriod;
        private @Nullable String regParamsRevision;
        private @Nullable String rfRegion;
        private @Nullable Boolean supports32BitFCnt;
        private @Nullable Boolean supportsClassB;
        private @Nullable Boolean supportsClassC;
        private @Nullable Boolean supportsJoin;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceProfileLoRaWANDeviceProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classBTimeout = defaults.classBTimeout;
    	      this.classCTimeout = defaults.classCTimeout;
    	      this.macVersion = defaults.macVersion;
    	      this.maxDutyCycle = defaults.maxDutyCycle;
    	      this.maxEirp = defaults.maxEirp;
    	      this.pingSlotDr = defaults.pingSlotDr;
    	      this.pingSlotFreq = defaults.pingSlotFreq;
    	      this.pingSlotPeriod = defaults.pingSlotPeriod;
    	      this.regParamsRevision = defaults.regParamsRevision;
    	      this.rfRegion = defaults.rfRegion;
    	      this.supports32BitFCnt = defaults.supports32BitFCnt;
    	      this.supportsClassB = defaults.supportsClassB;
    	      this.supportsClassC = defaults.supportsClassC;
    	      this.supportsJoin = defaults.supportsJoin;
        }

        public Builder setClassBTimeout(@Nullable Integer classBTimeout) {
            this.classBTimeout = classBTimeout;
            return this;
        }

        public Builder setClassCTimeout(@Nullable Integer classCTimeout) {
            this.classCTimeout = classCTimeout;
            return this;
        }

        public Builder setMacVersion(@Nullable String macVersion) {
            this.macVersion = macVersion;
            return this;
        }

        public Builder setMaxDutyCycle(@Nullable Integer maxDutyCycle) {
            this.maxDutyCycle = maxDutyCycle;
            return this;
        }

        public Builder setMaxEirp(@Nullable Integer maxEirp) {
            this.maxEirp = maxEirp;
            return this;
        }

        public Builder setPingSlotDr(@Nullable Integer pingSlotDr) {
            this.pingSlotDr = pingSlotDr;
            return this;
        }

        public Builder setPingSlotFreq(@Nullable Integer pingSlotFreq) {
            this.pingSlotFreq = pingSlotFreq;
            return this;
        }

        public Builder setPingSlotPeriod(@Nullable Integer pingSlotPeriod) {
            this.pingSlotPeriod = pingSlotPeriod;
            return this;
        }

        public Builder setRegParamsRevision(@Nullable String regParamsRevision) {
            this.regParamsRevision = regParamsRevision;
            return this;
        }

        public Builder setRfRegion(@Nullable String rfRegion) {
            this.rfRegion = rfRegion;
            return this;
        }

        public Builder setSupports32BitFCnt(@Nullable Boolean supports32BitFCnt) {
            this.supports32BitFCnt = supports32BitFCnt;
            return this;
        }

        public Builder setSupportsClassB(@Nullable Boolean supportsClassB) {
            this.supportsClassB = supportsClassB;
            return this;
        }

        public Builder setSupportsClassC(@Nullable Boolean supportsClassC) {
            this.supportsClassC = supportsClassC;
            return this;
        }

        public Builder setSupportsJoin(@Nullable Boolean supportsJoin) {
            this.supportsJoin = supportsJoin;
            return this;
        }

        public DeviceProfileLoRaWANDeviceProfile build() {
            return new DeviceProfileLoRaWANDeviceProfile(classBTimeout, classCTimeout, macVersion, maxDutyCycle, maxEirp, pingSlotDr, pingSlotFreq, pingSlotPeriod, regParamsRevision, rfRegion, supports32BitFCnt, supportsClassB, supportsClassC, supportsJoin);
        }
    }
}
