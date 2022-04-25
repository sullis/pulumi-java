// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class TriggerResponse {
    /**
     * @return The absolute number of time series that must fail the predicate for the condition to be triggered.
     * 
     */
    private final Integer count;
    /**
     * @return The percentage of time series that must fail the predicate for the condition to be triggered.
     * 
     */
    private final Double percent;

    @CustomType.Constructor
    private TriggerResponse(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("percent") Double percent) {
        this.count = count;
        this.percent = percent;
    }

    /**
     * @return The absolute number of time series that must fail the predicate for the condition to be triggered.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The percentage of time series that must fail the predicate for the condition to be triggered.
     * 
     */
    public Double percent() {
        return this.percent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private Double percent;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.percent = defaults.percent;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder percent(Double percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }        public TriggerResponse build() {
            return new TriggerResponse(count, percent);
        }
    }
}
