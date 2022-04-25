// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.DayResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Daily retention format.
 * 
 */
public final class DailyRetentionFormatResponse extends com.pulumi.resources.InvokeArgs {

    public static final DailyRetentionFormatResponse Empty = new DailyRetentionFormatResponse();

    /**
     * List of days of the month.
     * 
     */
    @Import(name="daysOfTheMonth")
    private @Nullable List<DayResponse> daysOfTheMonth;

    /**
     * @return List of days of the month.
     * 
     */
    public Optional<List<DayResponse>> daysOfTheMonth() {
        return Optional.ofNullable(this.daysOfTheMonth);
    }

    private DailyRetentionFormatResponse() {}

    private DailyRetentionFormatResponse(DailyRetentionFormatResponse $) {
        this.daysOfTheMonth = $.daysOfTheMonth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DailyRetentionFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DailyRetentionFormatResponse $;

        public Builder() {
            $ = new DailyRetentionFormatResponse();
        }

        public Builder(DailyRetentionFormatResponse defaults) {
            $ = new DailyRetentionFormatResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param daysOfTheMonth List of days of the month.
         * 
         * @return builder
         * 
         */
        public Builder daysOfTheMonth(@Nullable List<DayResponse> daysOfTheMonth) {
            $.daysOfTheMonth = daysOfTheMonth;
            return this;
        }

        /**
         * @param daysOfTheMonth List of days of the month.
         * 
         * @return builder
         * 
         */
        public Builder daysOfTheMonth(DayResponse... daysOfTheMonth) {
            return daysOfTheMonth(List.of(daysOfTheMonth));
        }

        public DailyRetentionFormatResponse build() {
            return $;
        }
    }

}
