// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLogAnalyticExportThrottledRequestsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogAnalyticExportThrottledRequestsArgs Empty = new GetLogAnalyticExportThrottledRequestsArgs();

    /**
     * SAS Uri of the logging blob container to which LogAnalytics Api writes output logs to.
     * 
     */
    @Import(name="blobContainerSasUri", required=true)
    private String blobContainerSasUri;

    /**
     * @return SAS Uri of the logging blob container to which LogAnalytics Api writes output logs to.
     * 
     */
    public String blobContainerSasUri() {
        return this.blobContainerSasUri;
    }

    /**
     * From time of the query
     * 
     */
    @Import(name="fromTime", required=true)
    private String fromTime;

    /**
     * @return From time of the query
     * 
     */
    public String fromTime() {
        return this.fromTime;
    }

    /**
     * Group query result by Client Application ID.
     * 
     */
    @Import(name="groupByClientApplicationId")
    private @Nullable Boolean groupByClientApplicationId;

    /**
     * @return Group query result by Client Application ID.
     * 
     */
    public Optional<Boolean> groupByClientApplicationId() {
        return Optional.ofNullable(this.groupByClientApplicationId);
    }

    /**
     * Group query result by Operation Name.
     * 
     */
    @Import(name="groupByOperationName")
    private @Nullable Boolean groupByOperationName;

    /**
     * @return Group query result by Operation Name.
     * 
     */
    public Optional<Boolean> groupByOperationName() {
        return Optional.ofNullable(this.groupByOperationName);
    }

    /**
     * Group query result by Resource Name.
     * 
     */
    @Import(name="groupByResourceName")
    private @Nullable Boolean groupByResourceName;

    /**
     * @return Group query result by Resource Name.
     * 
     */
    public Optional<Boolean> groupByResourceName() {
        return Optional.ofNullable(this.groupByResourceName);
    }

    /**
     * Group query result by Throttle Policy applied.
     * 
     */
    @Import(name="groupByThrottlePolicy")
    private @Nullable Boolean groupByThrottlePolicy;

    /**
     * @return Group query result by Throttle Policy applied.
     * 
     */
    public Optional<Boolean> groupByThrottlePolicy() {
        return Optional.ofNullable(this.groupByThrottlePolicy);
    }

    /**
     * Group query result by User Agent.
     * 
     */
    @Import(name="groupByUserAgent")
    private @Nullable Boolean groupByUserAgent;

    /**
     * @return Group query result by User Agent.
     * 
     */
    public Optional<Boolean> groupByUserAgent() {
        return Optional.ofNullable(this.groupByUserAgent);
    }

    /**
     * The location upon which virtual-machine-sizes is queried.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The location upon which virtual-machine-sizes is queried.
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * To time of the query
     * 
     */
    @Import(name="toTime", required=true)
    private String toTime;

    /**
     * @return To time of the query
     * 
     */
    public String toTime() {
        return this.toTime;
    }

    private GetLogAnalyticExportThrottledRequestsArgs() {}

    private GetLogAnalyticExportThrottledRequestsArgs(GetLogAnalyticExportThrottledRequestsArgs $) {
        this.blobContainerSasUri = $.blobContainerSasUri;
        this.fromTime = $.fromTime;
        this.groupByClientApplicationId = $.groupByClientApplicationId;
        this.groupByOperationName = $.groupByOperationName;
        this.groupByResourceName = $.groupByResourceName;
        this.groupByThrottlePolicy = $.groupByThrottlePolicy;
        this.groupByUserAgent = $.groupByUserAgent;
        this.location = $.location;
        this.toTime = $.toTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogAnalyticExportThrottledRequestsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogAnalyticExportThrottledRequestsArgs $;

        public Builder() {
            $ = new GetLogAnalyticExportThrottledRequestsArgs();
        }

        public Builder(GetLogAnalyticExportThrottledRequestsArgs defaults) {
            $ = new GetLogAnalyticExportThrottledRequestsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blobContainerSasUri SAS Uri of the logging blob container to which LogAnalytics Api writes output logs to.
         * 
         * @return builder
         * 
         */
        public Builder blobContainerSasUri(String blobContainerSasUri) {
            $.blobContainerSasUri = blobContainerSasUri;
            return this;
        }

        /**
         * @param fromTime From time of the query
         * 
         * @return builder
         * 
         */
        public Builder fromTime(String fromTime) {
            $.fromTime = fromTime;
            return this;
        }

        /**
         * @param groupByClientApplicationId Group query result by Client Application ID.
         * 
         * @return builder
         * 
         */
        public Builder groupByClientApplicationId(@Nullable Boolean groupByClientApplicationId) {
            $.groupByClientApplicationId = groupByClientApplicationId;
            return this;
        }

        /**
         * @param groupByOperationName Group query result by Operation Name.
         * 
         * @return builder
         * 
         */
        public Builder groupByOperationName(@Nullable Boolean groupByOperationName) {
            $.groupByOperationName = groupByOperationName;
            return this;
        }

        /**
         * @param groupByResourceName Group query result by Resource Name.
         * 
         * @return builder
         * 
         */
        public Builder groupByResourceName(@Nullable Boolean groupByResourceName) {
            $.groupByResourceName = groupByResourceName;
            return this;
        }

        /**
         * @param groupByThrottlePolicy Group query result by Throttle Policy applied.
         * 
         * @return builder
         * 
         */
        public Builder groupByThrottlePolicy(@Nullable Boolean groupByThrottlePolicy) {
            $.groupByThrottlePolicy = groupByThrottlePolicy;
            return this;
        }

        /**
         * @param groupByUserAgent Group query result by User Agent.
         * 
         * @return builder
         * 
         */
        public Builder groupByUserAgent(@Nullable Boolean groupByUserAgent) {
            $.groupByUserAgent = groupByUserAgent;
            return this;
        }

        /**
         * @param location The location upon which virtual-machine-sizes is queried.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param toTime To time of the query
         * 
         * @return builder
         * 
         */
        public Builder toTime(String toTime) {
            $.toTime = toTime;
            return this;
        }

        public GetLogAnalyticExportThrottledRequestsArgs build() {
            $.blobContainerSasUri = Objects.requireNonNull($.blobContainerSasUri, "expected parameter 'blobContainerSasUri' to be non-null");
            $.fromTime = Objects.requireNonNull($.fromTime, "expected parameter 'fromTime' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.toTime = Objects.requireNonNull($.toTime, "expected parameter 'toTime' to be non-null");
            return $;
        }
    }

}
