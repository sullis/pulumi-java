// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a weekly schedule.
 * 
 */
public final class WeeklyScheduleResponse extends com.pulumi.resources.InvokeArgs {

    public static final WeeklyScheduleResponse Empty = new WeeklyScheduleResponse();

    /**
     * Day of the week.
     * 
     */
    @Import(name="dayOfWeek", required=true)
    private String dayOfWeek;

    /**
     * @return Day of the week.
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }

    private WeeklyScheduleResponse() {}

    private WeeklyScheduleResponse(WeeklyScheduleResponse $) {
        this.dayOfWeek = $.dayOfWeek;
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
         * @param dayOfWeek Day of the week.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(String dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        public WeeklyScheduleResponse build() {
            $.dayOfWeek = Objects.requireNonNull($.dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
            return $;
        }
    }

}
