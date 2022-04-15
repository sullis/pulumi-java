// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class BrokerMaintenanceWindowStartTimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrokerMaintenanceWindowStartTimeArgs Empty = new BrokerMaintenanceWindowStartTimeArgs();

    /**
     * Day of the week, e.g., `MONDAY`, `TUESDAY`, or `WEDNESDAY`.
     * 
     */
    @Import(name="dayOfWeek", required=true)
      private final Output<String> dayOfWeek;

    public Output<String> dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Time, in 24-hour format, e.g., `02:00`.
     * 
     */
    @Import(name="timeOfDay", required=true)
      private final Output<String> timeOfDay;

    public Output<String> timeOfDay() {
        return this.timeOfDay;
    }

    /**
     * Time zone in either the Country/City format or the UTC offset format, e.g., `CET`.
     * 
     */
    @Import(name="timeZone", required=true)
      private final Output<String> timeZone;

    public Output<String> timeZone() {
        return this.timeZone;
    }

    public BrokerMaintenanceWindowStartTimeArgs(
        Output<String> dayOfWeek,
        Output<String> timeOfDay,
        Output<String> timeZone) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
        this.timeOfDay = Objects.requireNonNull(timeOfDay, "expected parameter 'timeOfDay' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private BrokerMaintenanceWindowStartTimeArgs() {
        this.dayOfWeek = Codegen.empty();
        this.timeOfDay = Codegen.empty();
        this.timeZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerMaintenanceWindowStartTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dayOfWeek;
        private Output<String> timeOfDay;
        private Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerMaintenanceWindowStartTimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.timeOfDay = defaults.timeOfDay;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder dayOfWeek(Output<String> dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Output.of(Objects.requireNonNull(dayOfWeek));
            return this;
        }
        public Builder timeOfDay(Output<String> timeOfDay) {
            this.timeOfDay = Objects.requireNonNull(timeOfDay);
            return this;
        }
        public Builder timeOfDay(String timeOfDay) {
            this.timeOfDay = Output.of(Objects.requireNonNull(timeOfDay));
            return this;
        }
        public Builder timeZone(Output<String> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Output.of(Objects.requireNonNull(timeZone));
            return this;
        }        public BrokerMaintenanceWindowStartTimeArgs build() {
            return new BrokerMaintenanceWindowStartTimeArgs(dayOfWeek, timeOfDay, timeZone);
        }
    }
}
