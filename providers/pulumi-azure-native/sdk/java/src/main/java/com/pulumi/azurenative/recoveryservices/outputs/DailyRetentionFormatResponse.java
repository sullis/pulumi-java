// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.DayResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DailyRetentionFormatResponse {
    /**
     * @return List of days of the month.
     * 
     */
    private final @Nullable List<DayResponse> daysOfTheMonth;

    @CustomType.Constructor
    private DailyRetentionFormatResponse(@CustomType.Parameter("daysOfTheMonth") @Nullable List<DayResponse> daysOfTheMonth) {
        this.daysOfTheMonth = daysOfTheMonth;
    }

    /**
     * @return List of days of the month.
     * 
     */
    public List<DayResponse> daysOfTheMonth() {
        return this.daysOfTheMonth == null ? List.of() : this.daysOfTheMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DailyRetentionFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DayResponse> daysOfTheMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(DailyRetentionFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfTheMonth = defaults.daysOfTheMonth;
        }

        public Builder daysOfTheMonth(@Nullable List<DayResponse> daysOfTheMonth) {
            this.daysOfTheMonth = daysOfTheMonth;
            return this;
        }
        public Builder daysOfTheMonth(DayResponse... daysOfTheMonth) {
            return daysOfTheMonth(List.of(daysOfTheMonth));
        }        public DailyRetentionFormatResponse build() {
            return new DailyRetentionFormatResponse(daysOfTheMonth);
        }
    }
}
