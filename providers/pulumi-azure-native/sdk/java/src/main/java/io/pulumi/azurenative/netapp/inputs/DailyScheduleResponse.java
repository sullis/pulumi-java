// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Daily Schedule properties
 * 
 */
public final class DailyScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final DailyScheduleResponse Empty = new DailyScheduleResponse();

    /**
     * Indicates which hour in UTC timezone a snapshot should be taken
     * 
     */
    @InputImport(name="hour")
      private final @Nullable Integer hour;

    public Optional<Integer> getHour() {
        return this.hour == null ? Optional.empty() : Optional.ofNullable(this.hour);
    }

    /**
     * Indicates which minute snapshot should be taken
     * 
     */
    @InputImport(name="minute")
      private final @Nullable Integer minute;

    public Optional<Integer> getMinute() {
        return this.minute == null ? Optional.empty() : Optional.ofNullable(this.minute);
    }

    /**
     * Daily snapshot count to keep
     * 
     */
    @InputImport(name="snapshotsToKeep")
      private final @Nullable Integer snapshotsToKeep;

    public Optional<Integer> getSnapshotsToKeep() {
        return this.snapshotsToKeep == null ? Optional.empty() : Optional.ofNullable(this.snapshotsToKeep);
    }

    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    @InputImport(name="usedBytes")
      private final @Nullable Double usedBytes;

    public Optional<Double> getUsedBytes() {
        return this.usedBytes == null ? Optional.empty() : Optional.ofNullable(this.usedBytes);
    }

    public DailyScheduleResponse(
        @Nullable Integer hour,
        @Nullable Integer minute,
        @Nullable Integer snapshotsToKeep,
        @Nullable Double usedBytes) {
        this.hour = hour;
        this.minute = minute;
        this.snapshotsToKeep = snapshotsToKeep;
        this.usedBytes = usedBytes;
    }

    private DailyScheduleResponse() {
        this.hour = null;
        this.minute = null;
        this.snapshotsToKeep = null;
        this.usedBytes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DailyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer hour;
        private @Nullable Integer minute;
        private @Nullable Integer snapshotsToKeep;
        private @Nullable Double usedBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(DailyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hour = defaults.hour;
    	      this.minute = defaults.minute;
    	      this.snapshotsToKeep = defaults.snapshotsToKeep;
    	      this.usedBytes = defaults.usedBytes;
        }

        public Builder setHour(@Nullable Integer hour) {
            this.hour = hour;
            return this;
        }

        public Builder setMinute(@Nullable Integer minute) {
            this.minute = minute;
            return this;
        }

        public Builder setSnapshotsToKeep(@Nullable Integer snapshotsToKeep) {
            this.snapshotsToKeep = snapshotsToKeep;
            return this;
        }

        public Builder setUsedBytes(@Nullable Double usedBytes) {
            this.usedBytes = usedBytes;
            return this;
        }
        public DailyScheduleResponse build() {
            return new DailyScheduleResponse(hour, minute, snapshotsToKeep, usedBytes);
        }
    }
}