// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.TimelineAggregationResponse;
import io.pulumi.azurenative.securityinsights.outputs.TimelineErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class TimelineResultsMetadataResponse {
    /**
     * timeline aggregation per kind
     * 
     */
    private final List<TimelineAggregationResponse> aggregations;
    /**
     * information about the failure queries
     * 
     */
    private final @Nullable List<TimelineErrorResponse> errors;
    /**
     * the total items found for the timeline request
     * 
     */
    private final Integer totalCount;

    @OutputCustomType.Constructor({"aggregations","errors","totalCount"})
    private TimelineResultsMetadataResponse(
        List<TimelineAggregationResponse> aggregations,
        @Nullable List<TimelineErrorResponse> errors,
        Integer totalCount) {
        this.aggregations = Objects.requireNonNull(aggregations);
        this.errors = errors;
        this.totalCount = Objects.requireNonNull(totalCount);
    }

    /**
     * timeline aggregation per kind
     * 
    */
    public List<TimelineAggregationResponse> getAggregations() {
        return this.aggregations;
    }
    /**
     * information about the failure queries
     * 
    */
    public List<TimelineErrorResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }
    /**
     * the total items found for the timeline request
     * 
    */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimelineResultsMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TimelineAggregationResponse> aggregations;
        private @Nullable List<TimelineErrorResponse> errors;
        private Integer totalCount;

        public Builder() {
    	      // Empty
        }

        public Builder(TimelineResultsMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.errors = defaults.errors;
    	      this.totalCount = defaults.totalCount;
        }

        public Builder setAggregations(List<TimelineAggregationResponse> aggregations) {
            this.aggregations = Objects.requireNonNull(aggregations);
            return this;
        }

        public Builder setErrors(@Nullable List<TimelineErrorResponse> errors) {
            this.errors = errors;
            return this;
        }

        public Builder setTotalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }
        public TimelineResultsMetadataResponse build() {
            return new TimelineResultsMetadataResponse(aggregations, errors, totalCount);
        }
    }
}