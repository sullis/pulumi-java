// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TimelineAggregationResponse {
    /**
     * the total items found for a kind
     * 
     */
    private final Integer count;
    /**
     * the query kind
     * 
     */
    private final String kind;

    @OutputCustomType.Constructor({"count","kind"})
    private TimelineAggregationResponse(
        Integer count,
        String kind) {
        this.count = Objects.requireNonNull(count);
        this.kind = Objects.requireNonNull(kind);
    }

    /**
     * the total items found for a kind
     * 
     */
    public Integer getCount() {
        return this.count;
    }
    /**
     * the query kind
     * 
     */
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimelineAggregationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(TimelineAggregationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.kind = defaults.kind;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public TimelineAggregationResponse build() {
            return new TimelineAggregationResponse(count, kind);
        }
    }
}
