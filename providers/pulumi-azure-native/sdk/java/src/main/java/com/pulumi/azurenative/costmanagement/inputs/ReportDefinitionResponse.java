// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.inputs.ReportDatasetResponse;
import com.pulumi.azurenative.costmanagement.inputs.ReportTimePeriodResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of a report.
 * 
 */
public final class ReportDefinitionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReportDefinitionResponse Empty = new ReportDefinitionResponse();

    /**
     * Has definition for data in this report.
     * 
     */
    @Import(name="dataset")
    private @Nullable ReportDatasetResponse dataset;

    /**
     * @return Has definition for data in this report.
     * 
     */
    public Optional<ReportDatasetResponse> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * Has time period for pulling data for the report.
     * 
     */
    @Import(name="timePeriod")
    private @Nullable ReportTimePeriodResponse timePeriod;

    /**
     * @return Has time period for pulling data for the report.
     * 
     */
    public Optional<ReportTimePeriodResponse> timePeriod() {
        return Optional.ofNullable(this.timePeriod);
    }

    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    @Import(name="timeframe", required=true)
    private String timeframe;

    /**
     * @return The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    public String timeframe() {
        return this.timeframe;
    }

    /**
     * The type of the report.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of the report.
     * 
     */
    public String type() {
        return this.type;
    }

    private ReportDefinitionResponse() {}

    private ReportDefinitionResponse(ReportDefinitionResponse $) {
        this.dataset = $.dataset;
        this.timePeriod = $.timePeriod;
        this.timeframe = $.timeframe;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDefinitionResponse $;

        public Builder() {
            $ = new ReportDefinitionResponse();
        }

        public Builder(ReportDefinitionResponse defaults) {
            $ = new ReportDefinitionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset Has definition for data in this report.
         * 
         * @return builder
         * 
         */
        public Builder dataset(@Nullable ReportDatasetResponse dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param timePeriod Has time period for pulling data for the report.
         * 
         * @return builder
         * 
         */
        public Builder timePeriod(@Nullable ReportTimePeriodResponse timePeriod) {
            $.timePeriod = timePeriod;
            return this;
        }

        /**
         * @param timeframe The time frame for pulling data for the report. If custom, then a specific time period must be provided.
         * 
         * @return builder
         * 
         */
        public Builder timeframe(String timeframe) {
            $.timeframe = timeframe;
            return this;
        }

        /**
         * @param type The type of the report.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ReportDefinitionResponse build() {
            $.timeframe = Objects.requireNonNull($.timeframe, "expected parameter 'timeframe' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
