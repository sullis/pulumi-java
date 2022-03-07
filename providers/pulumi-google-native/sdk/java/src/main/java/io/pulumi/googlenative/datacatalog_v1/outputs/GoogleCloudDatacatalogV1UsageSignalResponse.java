// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1UsageSignalResponse {
    /**
     * The end timestamp of the duration of usage statistics.
     * 
     */
    private final String updateTime;
    /**
     * Usage statistics over each of the predefined time ranges. Supported time ranges are `{"24H", "7D", "30D"}`.
     * 
     */
    private final Map<String,String> usageWithinTimeRange;

    @OutputCustomType.Constructor({"updateTime","usageWithinTimeRange"})
    private GoogleCloudDatacatalogV1UsageSignalResponse(
        String updateTime,
        Map<String,String> usageWithinTimeRange) {
        this.updateTime = Objects.requireNonNull(updateTime);
        this.usageWithinTimeRange = Objects.requireNonNull(usageWithinTimeRange);
    }

    /**
     * The end timestamp of the duration of usage statistics.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Usage statistics over each of the predefined time ranges. Supported time ranges are `{"24H", "7D", "30D"}`.
     * 
    */
    public Map<String,String> getUsageWithinTimeRange() {
        return this.usageWithinTimeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1UsageSignalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String updateTime;
        private Map<String,String> usageWithinTimeRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1UsageSignalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateTime = defaults.updateTime;
    	      this.usageWithinTimeRange = defaults.usageWithinTimeRange;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setUsageWithinTimeRange(Map<String,String> usageWithinTimeRange) {
            this.usageWithinTimeRange = Objects.requireNonNull(usageWithinTimeRange);
            return this;
        }
        public GoogleCloudDatacatalogV1UsageSignalResponse build() {
            return new GoogleCloudDatacatalogV1UsageSignalResponse(updateTime, usageWithinTimeRange);
        }
    }
}