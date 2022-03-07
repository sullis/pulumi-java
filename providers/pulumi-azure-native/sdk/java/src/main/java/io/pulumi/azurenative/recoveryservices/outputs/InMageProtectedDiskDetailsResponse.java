// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InMageProtectedDiskDetailsResponse {
    /**
     * The disk capacity in bytes.
     * 
     */
    private final @Nullable Double diskCapacityInBytes;
    /**
     * The disk id.
     * 
     */
    private final @Nullable String diskId;
    /**
     * The disk name.
     * 
     */
    private final @Nullable String diskName;
    /**
     * A value indicating whether disk is resized.
     * 
     */
    private final @Nullable String diskResized;
    /**
     * The file system capacity in bytes.
     * 
     */
    private final @Nullable Double fileSystemCapacityInBytes;
    /**
     * The health error code for the disk.
     * 
     */
    private final @Nullable String healthErrorCode;
    /**
     * The last RPO calculated time.
     * 
     */
    private final @Nullable String lastRpoCalculatedTime;
    /**
     * The protection stage.
     * 
     */
    private final @Nullable String protectionStage;
    /**
     * The PS data transit in MB.
     * 
     */
    private final @Nullable Double psDataInMB;
    /**
     * The resync duration in seconds.
     * 
     */
    private final @Nullable Double resyncDurationInSeconds;
    /**
     * The resync progress percentage.
     * 
     */
    private final @Nullable Integer resyncProgressPercentage;
    /**
     * A value indicating whether resync is required for this disk.
     * 
     */
    private final @Nullable String resyncRequired;
    /**
     * The RPO in seconds.
     * 
     */
    private final @Nullable Double rpoInSeconds;
    /**
     * The source data transit in MB.
     * 
     */
    private final @Nullable Double sourceDataInMB;
    /**
     * The target data transit in MB.
     * 
     */
    private final @Nullable Double targetDataInMB;

    @OutputCustomType.Constructor({"diskCapacityInBytes","diskId","diskName","diskResized","fileSystemCapacityInBytes","healthErrorCode","lastRpoCalculatedTime","protectionStage","psDataInMB","resyncDurationInSeconds","resyncProgressPercentage","resyncRequired","rpoInSeconds","sourceDataInMB","targetDataInMB"})
    private InMageProtectedDiskDetailsResponse(
        @Nullable Double diskCapacityInBytes,
        @Nullable String diskId,
        @Nullable String diskName,
        @Nullable String diskResized,
        @Nullable Double fileSystemCapacityInBytes,
        @Nullable String healthErrorCode,
        @Nullable String lastRpoCalculatedTime,
        @Nullable String protectionStage,
        @Nullable Double psDataInMB,
        @Nullable Double resyncDurationInSeconds,
        @Nullable Integer resyncProgressPercentage,
        @Nullable String resyncRequired,
        @Nullable Double rpoInSeconds,
        @Nullable Double sourceDataInMB,
        @Nullable Double targetDataInMB) {
        this.diskCapacityInBytes = diskCapacityInBytes;
        this.diskId = diskId;
        this.diskName = diskName;
        this.diskResized = diskResized;
        this.fileSystemCapacityInBytes = fileSystemCapacityInBytes;
        this.healthErrorCode = healthErrorCode;
        this.lastRpoCalculatedTime = lastRpoCalculatedTime;
        this.protectionStage = protectionStage;
        this.psDataInMB = psDataInMB;
        this.resyncDurationInSeconds = resyncDurationInSeconds;
        this.resyncProgressPercentage = resyncProgressPercentage;
        this.resyncRequired = resyncRequired;
        this.rpoInSeconds = rpoInSeconds;
        this.sourceDataInMB = sourceDataInMB;
        this.targetDataInMB = targetDataInMB;
    }

    /**
     * The disk capacity in bytes.
     * 
    */
    public Optional<Double> getDiskCapacityInBytes() {
        return Optional.ofNullable(this.diskCapacityInBytes);
    }
    /**
     * The disk id.
     * 
    */
    public Optional<String> getDiskId() {
        return Optional.ofNullable(this.diskId);
    }
    /**
     * The disk name.
     * 
    */
    public Optional<String> getDiskName() {
        return Optional.ofNullable(this.diskName);
    }
    /**
     * A value indicating whether disk is resized.
     * 
    */
    public Optional<String> getDiskResized() {
        return Optional.ofNullable(this.diskResized);
    }
    /**
     * The file system capacity in bytes.
     * 
    */
    public Optional<Double> getFileSystemCapacityInBytes() {
        return Optional.ofNullable(this.fileSystemCapacityInBytes);
    }
    /**
     * The health error code for the disk.
     * 
    */
    public Optional<String> getHealthErrorCode() {
        return Optional.ofNullable(this.healthErrorCode);
    }
    /**
     * The last RPO calculated time.
     * 
    */
    public Optional<String> getLastRpoCalculatedTime() {
        return Optional.ofNullable(this.lastRpoCalculatedTime);
    }
    /**
     * The protection stage.
     * 
    */
    public Optional<String> getProtectionStage() {
        return Optional.ofNullable(this.protectionStage);
    }
    /**
     * The PS data transit in MB.
     * 
    */
    public Optional<Double> getPsDataInMB() {
        return Optional.ofNullable(this.psDataInMB);
    }
    /**
     * The resync duration in seconds.
     * 
    */
    public Optional<Double> getResyncDurationInSeconds() {
        return Optional.ofNullable(this.resyncDurationInSeconds);
    }
    /**
     * The resync progress percentage.
     * 
    */
    public Optional<Integer> getResyncProgressPercentage() {
        return Optional.ofNullable(this.resyncProgressPercentage);
    }
    /**
     * A value indicating whether resync is required for this disk.
     * 
    */
    public Optional<String> getResyncRequired() {
        return Optional.ofNullable(this.resyncRequired);
    }
    /**
     * The RPO in seconds.
     * 
    */
    public Optional<Double> getRpoInSeconds() {
        return Optional.ofNullable(this.rpoInSeconds);
    }
    /**
     * The source data transit in MB.
     * 
    */
    public Optional<Double> getSourceDataInMB() {
        return Optional.ofNullable(this.sourceDataInMB);
    }
    /**
     * The target data transit in MB.
     * 
    */
    public Optional<Double> getTargetDataInMB() {
        return Optional.ofNullable(this.targetDataInMB);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageProtectedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double diskCapacityInBytes;
        private @Nullable String diskId;
        private @Nullable String diskName;
        private @Nullable String diskResized;
        private @Nullable Double fileSystemCapacityInBytes;
        private @Nullable String healthErrorCode;
        private @Nullable String lastRpoCalculatedTime;
        private @Nullable String protectionStage;
        private @Nullable Double psDataInMB;
        private @Nullable Double resyncDurationInSeconds;
        private @Nullable Integer resyncProgressPercentage;
        private @Nullable String resyncRequired;
        private @Nullable Double rpoInSeconds;
        private @Nullable Double sourceDataInMB;
        private @Nullable Double targetDataInMB;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageProtectedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskCapacityInBytes = defaults.diskCapacityInBytes;
    	      this.diskId = defaults.diskId;
    	      this.diskName = defaults.diskName;
    	      this.diskResized = defaults.diskResized;
    	      this.fileSystemCapacityInBytes = defaults.fileSystemCapacityInBytes;
    	      this.healthErrorCode = defaults.healthErrorCode;
    	      this.lastRpoCalculatedTime = defaults.lastRpoCalculatedTime;
    	      this.protectionStage = defaults.protectionStage;
    	      this.psDataInMB = defaults.psDataInMB;
    	      this.resyncDurationInSeconds = defaults.resyncDurationInSeconds;
    	      this.resyncProgressPercentage = defaults.resyncProgressPercentage;
    	      this.resyncRequired = defaults.resyncRequired;
    	      this.rpoInSeconds = defaults.rpoInSeconds;
    	      this.sourceDataInMB = defaults.sourceDataInMB;
    	      this.targetDataInMB = defaults.targetDataInMB;
        }

        public Builder setDiskCapacityInBytes(@Nullable Double diskCapacityInBytes) {
            this.diskCapacityInBytes = diskCapacityInBytes;
            return this;
        }

        public Builder setDiskId(@Nullable String diskId) {
            this.diskId = diskId;
            return this;
        }

        public Builder setDiskName(@Nullable String diskName) {
            this.diskName = diskName;
            return this;
        }

        public Builder setDiskResized(@Nullable String diskResized) {
            this.diskResized = diskResized;
            return this;
        }

        public Builder setFileSystemCapacityInBytes(@Nullable Double fileSystemCapacityInBytes) {
            this.fileSystemCapacityInBytes = fileSystemCapacityInBytes;
            return this;
        }

        public Builder setHealthErrorCode(@Nullable String healthErrorCode) {
            this.healthErrorCode = healthErrorCode;
            return this;
        }

        public Builder setLastRpoCalculatedTime(@Nullable String lastRpoCalculatedTime) {
            this.lastRpoCalculatedTime = lastRpoCalculatedTime;
            return this;
        }

        public Builder setProtectionStage(@Nullable String protectionStage) {
            this.protectionStage = protectionStage;
            return this;
        }

        public Builder setPsDataInMB(@Nullable Double psDataInMB) {
            this.psDataInMB = psDataInMB;
            return this;
        }

        public Builder setResyncDurationInSeconds(@Nullable Double resyncDurationInSeconds) {
            this.resyncDurationInSeconds = resyncDurationInSeconds;
            return this;
        }

        public Builder setResyncProgressPercentage(@Nullable Integer resyncProgressPercentage) {
            this.resyncProgressPercentage = resyncProgressPercentage;
            return this;
        }

        public Builder setResyncRequired(@Nullable String resyncRequired) {
            this.resyncRequired = resyncRequired;
            return this;
        }

        public Builder setRpoInSeconds(@Nullable Double rpoInSeconds) {
            this.rpoInSeconds = rpoInSeconds;
            return this;
        }

        public Builder setSourceDataInMB(@Nullable Double sourceDataInMB) {
            this.sourceDataInMB = sourceDataInMB;
            return this;
        }

        public Builder setTargetDataInMB(@Nullable Double targetDataInMB) {
            this.targetDataInMB = targetDataInMB;
            return this;
        }
        public InMageProtectedDiskDetailsResponse build() {
            return new InMageProtectedDiskDetailsResponse(diskCapacityInBytes, diskId, diskName, diskResized, fileSystemCapacityInBytes, healthErrorCode, lastRpoCalculatedTime, protectionStage, psDataInMB, resyncDurationInSeconds, resyncProgressPercentage, resyncRequired, rpoInSeconds, sourceDataInMB, targetDataInMB);
        }
    }
}