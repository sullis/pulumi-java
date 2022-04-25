// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMetricsSourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetricsSourceArgs Empty = new GetMetricsSourceArgs();

    /**
     * Metrics Account resource name
     * 
     */
    @Import(name="metricsSourceName", required=true)
    private String metricsSourceName;

    /**
     * @return Metrics Account resource name
     * 
     */
    public String metricsSourceName() {
        return this.metricsSourceName;
    }

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private String monitorName;

    /**
     * @return Monitor resource name
     * 
     */
    public String monitorName() {
        return this.monitorName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetMetricsSourceArgs() {}

    private GetMetricsSourceArgs(GetMetricsSourceArgs $) {
        this.metricsSourceName = $.metricsSourceName;
        this.monitorName = $.monitorName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetricsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetricsSourceArgs $;

        public Builder() {
            $ = new GetMetricsSourceArgs();
        }

        public Builder(GetMetricsSourceArgs defaults) {
            $ = new GetMetricsSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricsSourceName Metrics Account resource name
         * 
         * @return builder
         * 
         */
        public Builder metricsSourceName(String metricsSourceName) {
            $.metricsSourceName = metricsSourceName;
            return this;
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(String monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetMetricsSourceArgs build() {
            $.metricsSourceName = Objects.requireNonNull($.metricsSourceName, "expected parameter 'metricsSourceName' to be non-null");
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
