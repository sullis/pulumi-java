// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The start and end date for pulling data for the report.
 * 
 */
public final class ReportTimePeriodResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportTimePeriodResponse Empty = new ReportTimePeriodResponse();

    /**
     * The start date to pull data from.
     * 
     */
    @InputImport(name="from", required=true)
    private final String from;

    public String getFrom() {
        return this.from;
    }

    /**
     * The end date to pull data to.
     * 
     */
    @InputImport(name="to", required=true)
    private final String to;

    public String getTo() {
        return this.to;
    }

    public ReportTimePeriodResponse(
        String from,
        String to) {
        this.from = Objects.requireNonNull(from, "expected parameter 'from' to be non-null");
        this.to = Objects.requireNonNull(to, "expected parameter 'to' to be non-null");
    }

    private ReportTimePeriodResponse() {
        this.from = null;
        this.to = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportTimePeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String from;
        private String to;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportTimePeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder setFrom(String from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }

        public Builder setTo(String to) {
            this.to = Objects.requireNonNull(to);
            return this;
        }

        public ReportTimePeriodResponse build() {
            return new ReportTimePeriodResponse(from, to);
        }
    }
}
