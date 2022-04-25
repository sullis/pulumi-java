// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * The set of all usage signals that we store in Data Catalog.
 * 
 */
public final class GoogleCloudDatacatalogV1beta1UsageSignalResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1beta1UsageSignalResponse Empty = new GoogleCloudDatacatalogV1beta1UsageSignalResponse();

    /**
     * The timestamp of the end of the usage statistics duration.
     * 
     */
    @Import(name="updateTime", required=true)
    private String updateTime;

    /**
     * @return The timestamp of the end of the usage statistics duration.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    /**
     * Usage statistics over each of the pre-defined time ranges, supported strings for time ranges are {&#34;24H&#34;, &#34;7D&#34;, &#34;30D&#34;}.
     * 
     */
    @Import(name="usageWithinTimeRange", required=true)
    private Map<String,String> usageWithinTimeRange;

    /**
     * @return Usage statistics over each of the pre-defined time ranges, supported strings for time ranges are {&#34;24H&#34;, &#34;7D&#34;, &#34;30D&#34;}.
     * 
     */
    public Map<String,String> usageWithinTimeRange() {
        return this.usageWithinTimeRange;
    }

    private GoogleCloudDatacatalogV1beta1UsageSignalResponse() {}

    private GoogleCloudDatacatalogV1beta1UsageSignalResponse(GoogleCloudDatacatalogV1beta1UsageSignalResponse $) {
        this.updateTime = $.updateTime;
        this.usageWithinTimeRange = $.usageWithinTimeRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1beta1UsageSignalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1beta1UsageSignalResponse $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1beta1UsageSignalResponse();
        }

        public Builder(GoogleCloudDatacatalogV1beta1UsageSignalResponse defaults) {
            $ = new GoogleCloudDatacatalogV1beta1UsageSignalResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param updateTime The timestamp of the end of the usage statistics duration.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param usageWithinTimeRange Usage statistics over each of the pre-defined time ranges, supported strings for time ranges are {&#34;24H&#34;, &#34;7D&#34;, &#34;30D&#34;}.
         * 
         * @return builder
         * 
         */
        public Builder usageWithinTimeRange(Map<String,String> usageWithinTimeRange) {
            $.usageWithinTimeRange = usageWithinTimeRange;
            return this;
        }

        public GoogleCloudDatacatalogV1beta1UsageSignalResponse build() {
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            $.usageWithinTimeRange = Objects.requireNonNull($.usageWithinTimeRange, "expected parameter 'usageWithinTimeRange' to be non-null");
            return $;
        }
    }

}
