// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReportTimePeriodResponse {
    /**
     * The start date to pull data from.
     * 
     */
    private final String from;
    /**
     * The end date to pull data to.
     * 
     */
    private final String to;

    @OutputCustomType.Constructor({"from","to"})
    private ReportTimePeriodResponse(
        String from,
        String to) {
        this.from = Objects.requireNonNull(from);
        this.to = Objects.requireNonNull(to);
    }

    /**
     * The start date to pull data from.
     * 
     */
    public String getFrom() {
        return this.from;
    }
    /**
     * The end date to pull data to.
     * 
     */
    public String getTo() {
        return this.to;
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
