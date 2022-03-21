// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The start and end date for recurrence schedule.
 * 
 */
public final class ReportRecurrencePeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportRecurrencePeriodArgs Empty = new ReportRecurrencePeriodArgs();

    /**
     * The start date of recurrence.
     * 
     */
    @Import(name="from", required=true)
      private final Output<String> from;

    public Output<String> getFrom() {
        return this.from;
    }

    /**
     * The end date of recurrence.
     * 
     */
    @Import(name="to")
      private final @Nullable Output<String> to;

    public Output<String> getTo() {
        return this.to == null ? Output.empty() : this.to;
    }

    public ReportRecurrencePeriodArgs(
        Output<String> from,
        @Nullable Output<String> to) {
        this.from = Objects.requireNonNull(from, "expected parameter 'from' to be non-null");
        this.to = to;
    }

    private ReportRecurrencePeriodArgs() {
        this.from = Output.empty();
        this.to = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportRecurrencePeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> from;
        private @Nullable Output<String> to;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportRecurrencePeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder from(Output<String> from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }
        public Builder from(String from) {
            this.from = Output.of(Objects.requireNonNull(from));
            return this;
        }
        public Builder to(@Nullable Output<String> to) {
            this.to = to;
            return this;
        }
        public Builder to(@Nullable String to) {
            this.to = Output.ofNullable(to);
            return this;
        }        public ReportRecurrencePeriodArgs build() {
            return new ReportRecurrencePeriodArgs(from, to);
        }
    }
}
