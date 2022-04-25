// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Weekly Schedule properties, make a snapshot every week at a specific day or days
 * 
 */
public final class WeeklyScheduleResponse extends com.pulumi.resources.InvokeArgs {

    public static final WeeklyScheduleResponse Empty = new WeeklyScheduleResponse();

    /**
     * Indicates which weekdays snapshot should be taken, accepts a comma separated list of week day names in english
     * 
     */
    @Import(name="day")
    private @Nullable String day;

    /**
     * @return Indicates which weekdays snapshot should be taken, accepts a comma separated list of week day names in english
     * 
     */
    public Optional<String> day() {
        return Optional.ofNullable(this.day);
    }

    /**
     * Indicates which hour in UTC timezone a snapshot should be taken
     * 
     */
    @Import(name="hour")
    private @Nullable Integer hour;

    /**
     * @return Indicates which hour in UTC timezone a snapshot should be taken
     * 
     */
    public Optional<Integer> hour() {
        return Optional.ofNullable(this.hour);
    }

    /**
     * Indicates which minute snapshot should be taken
     * 
     */
    @Import(name="minute")
    private @Nullable Integer minute;

    /**
     * @return Indicates which minute snapshot should be taken
     * 
     */
    public Optional<Integer> minute() {
        return Optional.ofNullable(this.minute);
    }

    /**
     * Weekly snapshot count to keep
     * 
     */
    @Import(name="snapshotsToKeep")
    private @Nullable Integer snapshotsToKeep;

    /**
     * @return Weekly snapshot count to keep
     * 
     */
    public Optional<Integer> snapshotsToKeep() {
        return Optional.ofNullable(this.snapshotsToKeep);
    }

    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    @Import(name="usedBytes")
    private @Nullable Double usedBytes;

    /**
     * @return Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    public Optional<Double> usedBytes() {
        return Optional.ofNullable(this.usedBytes);
    }

    private WeeklyScheduleResponse() {}

    private WeeklyScheduleResponse(WeeklyScheduleResponse $) {
        this.day = $.day;
        this.hour = $.hour;
        this.minute = $.minute;
        this.snapshotsToKeep = $.snapshotsToKeep;
        this.usedBytes = $.usedBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WeeklyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WeeklyScheduleResponse $;

        public Builder() {
            $ = new WeeklyScheduleResponse();
        }

        public Builder(WeeklyScheduleResponse defaults) {
            $ = new WeeklyScheduleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param day Indicates which weekdays snapshot should be taken, accepts a comma separated list of week day names in english
         * 
         * @return builder
         * 
         */
        public Builder day(@Nullable String day) {
            $.day = day;
            return this;
        }

        /**
         * @param hour Indicates which hour in UTC timezone a snapshot should be taken
         * 
         * @return builder
         * 
         */
        public Builder hour(@Nullable Integer hour) {
            $.hour = hour;
            return this;
        }

        /**
         * @param minute Indicates which minute snapshot should be taken
         * 
         * @return builder
         * 
         */
        public Builder minute(@Nullable Integer minute) {
            $.minute = minute;
            return this;
        }

        /**
         * @param snapshotsToKeep Weekly snapshot count to keep
         * 
         * @return builder
         * 
         */
        public Builder snapshotsToKeep(@Nullable Integer snapshotsToKeep) {
            $.snapshotsToKeep = snapshotsToKeep;
            return this;
        }

        /**
         * @param usedBytes Resource size in bytes, current storage usage for the volume in bytes
         * 
         * @return builder
         * 
         */
        public Builder usedBytes(@Nullable Double usedBytes) {
            $.usedBytes = usedBytes;
            return this;
        }

        public WeeklyScheduleResponse build() {
            return $;
        }
    }

}
