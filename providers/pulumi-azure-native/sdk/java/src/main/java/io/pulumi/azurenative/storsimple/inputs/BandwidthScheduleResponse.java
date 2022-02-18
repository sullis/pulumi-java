// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.azurenative.storsimple.inputs.TimeResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The schedule for bandwidth setting.
 * 
 */
public final class BandwidthScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final BandwidthScheduleResponse Empty = new BandwidthScheduleResponse();

    /**
     * The days of the week when this schedule is applicable.
     * 
     */
    @InputImport(name="days", required=true)
    private final List<String> days;

    public List<String> getDays() {
        return this.days;
    }

    /**
     * The rate in Mbps.
     * 
     */
    @InputImport(name="rateInMbps", required=true)
    private final Integer rateInMbps;

    public Integer getRateInMbps() {
        return this.rateInMbps;
    }

    /**
     * The start time of the schedule.
     * 
     */
    @InputImport(name="start", required=true)
    private final TimeResponse start;

    public TimeResponse getStart() {
        return this.start;
    }

    /**
     * The stop time of the schedule.
     * 
     */
    @InputImport(name="stop", required=true)
    private final TimeResponse stop;

    public TimeResponse getStop() {
        return this.stop;
    }

    public BandwidthScheduleResponse(
        List<String> days,
        Integer rateInMbps,
        TimeResponse start,
        TimeResponse stop) {
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
        this.rateInMbps = Objects.requireNonNull(rateInMbps, "expected parameter 'rateInMbps' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
        this.stop = Objects.requireNonNull(stop, "expected parameter 'stop' to be non-null");
    }

    private BandwidthScheduleResponse() {
        this.days = List.of();
        this.rateInMbps = null;
        this.start = null;
        this.stop = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BandwidthScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> days;
        private Integer rateInMbps;
        private TimeResponse start;
        private TimeResponse stop;

        public Builder() {
    	      // Empty
        }

        public Builder(BandwidthScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.rateInMbps = defaults.rateInMbps;
    	      this.start = defaults.start;
    	      this.stop = defaults.stop;
        }

        public Builder setDays(List<String> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setRateInMbps(Integer rateInMbps) {
            this.rateInMbps = Objects.requireNonNull(rateInMbps);
            return this;
        }

        public Builder setStart(TimeResponse start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public Builder setStop(TimeResponse stop) {
            this.stop = Objects.requireNonNull(stop);
            return this;
        }

        public BandwidthScheduleResponse build() {
            return new BandwidthScheduleResponse(days, rateInMbps, start, stop);
        }
    }
}
