// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ReportAggregationResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportDatasetConfigurationResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportFilterResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportGroupingResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReportDatasetResponse {
    /**
     * Dictionary of aggregation expression to use in the report. The key of each item in the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
     * 
     */
    private final @Nullable Map<String,ReportAggregationResponse> aggregation;
    /**
     * Has configuration information for the data in the report. The configuration will be ignored if aggregation and grouping are provided.
     * 
     */
    private final @Nullable ReportDatasetConfigurationResponse configuration;
    /**
     * Has filter expression to use in the report.
     * 
     */
    private final @Nullable ReportFilterResponse filter;
    /**
     * The granularity of rows in the report.
     * 
     */
    private final @Nullable String granularity;
    /**
     * Array of group by expression to use in the report. Report can have up to 2 group by clauses.
     * 
     */
    private final @Nullable List<ReportGroupingResponse> grouping;

    @OutputCustomType.Constructor({"aggregation","configuration","filter","granularity","grouping"})
    private ReportDatasetResponse(
        @Nullable Map<String,ReportAggregationResponse> aggregation,
        @Nullable ReportDatasetConfigurationResponse configuration,
        @Nullable ReportFilterResponse filter,
        @Nullable String granularity,
        @Nullable List<ReportGroupingResponse> grouping) {
        this.aggregation = aggregation;
        this.configuration = configuration;
        this.filter = filter;
        this.granularity = granularity;
        this.grouping = grouping;
    }

    /**
     * Dictionary of aggregation expression to use in the report. The key of each item in the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
     * 
     */
    public Map<String,ReportAggregationResponse> getAggregation() {
        return this.aggregation == null ? Map.of() : this.aggregation;
    }
    /**
     * Has configuration information for the data in the report. The configuration will be ignored if aggregation and grouping are provided.
     * 
     */
    public Optional<ReportDatasetConfigurationResponse> getConfiguration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * Has filter expression to use in the report.
     * 
     */
    public Optional<ReportFilterResponse> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * The granularity of rows in the report.
     * 
     */
    public Optional<String> getGranularity() {
        return Optional.ofNullable(this.granularity);
    }
    /**
     * Array of group by expression to use in the report. Report can have up to 2 group by clauses.
     * 
     */
    public List<ReportGroupingResponse> getGrouping() {
        return this.grouping == null ? List.of() : this.grouping;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,ReportAggregationResponse> aggregation;
        private @Nullable ReportDatasetConfigurationResponse configuration;
        private @Nullable ReportFilterResponse filter;
        private @Nullable String granularity;
        private @Nullable List<ReportGroupingResponse> grouping;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.configuration = defaults.configuration;
    	      this.filter = defaults.filter;
    	      this.granularity = defaults.granularity;
    	      this.grouping = defaults.grouping;
        }

        public Builder setAggregation(@Nullable Map<String,ReportAggregationResponse> aggregation) {
            this.aggregation = aggregation;
            return this;
        }

        public Builder setConfiguration(@Nullable ReportDatasetConfigurationResponse configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setFilter(@Nullable ReportFilterResponse filter) {
            this.filter = filter;
            return this;
        }

        public Builder setGranularity(@Nullable String granularity) {
            this.granularity = granularity;
            return this;
        }

        public Builder setGrouping(@Nullable List<ReportGroupingResponse> grouping) {
            this.grouping = grouping;
            return this;
        }

        public ReportDatasetResponse build() {
            return new ReportDatasetResponse(aggregation, configuration, filter, granularity, grouping);
        }
    }
}
