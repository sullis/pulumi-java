// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.DayResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Daily retention format.
 * 
 */
public final class DailyRetentionFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final DailyRetentionFormatResponse Empty = new DailyRetentionFormatResponse();

    /**
     * List of days of the month.
     * 
     */
    @Import(name="daysOfTheMonth")
      private final @Nullable List<DayResponse> daysOfTheMonth;

    public List<DayResponse> getDaysOfTheMonth() {
        return this.daysOfTheMonth == null ? List.of() : this.daysOfTheMonth;
    }

    public DailyRetentionFormatResponse(@Nullable List<DayResponse> daysOfTheMonth) {
        this.daysOfTheMonth = daysOfTheMonth;
    }

    private DailyRetentionFormatResponse() {
        this.daysOfTheMonth = List.of();
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
