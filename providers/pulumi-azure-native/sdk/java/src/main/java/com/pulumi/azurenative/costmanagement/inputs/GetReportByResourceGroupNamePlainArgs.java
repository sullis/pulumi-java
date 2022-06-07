// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReportByResourceGroupNamePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReportByResourceGroupNamePlainArgs Empty = new GetReportByResourceGroupNamePlainArgs();

    /**
     * Report Name.
     * 
     */
    @Import(name="reportName", required=true)
    private String reportName;

    /**
     * @return Report Name.
     * 
     */
    public String reportName() {
        return this.reportName;
    }

    /**
     * Azure Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Azure Resource Group Name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetReportByResourceGroupNamePlainArgs() {}

    private GetReportByResourceGroupNamePlainArgs(GetReportByResourceGroupNamePlainArgs $) {
        this.reportName = $.reportName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReportByResourceGroupNamePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReportByResourceGroupNamePlainArgs $;

        public Builder() {
            $ = new GetReportByResourceGroupNamePlainArgs();
        }

        public Builder(GetReportByResourceGroupNamePlainArgs defaults) {
            $ = new GetReportByResourceGroupNamePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param reportName Report Name.
         * 
         * @return builder
         * 
         */
        public Builder reportName(String reportName) {
            $.reportName = reportName;
            return this;
        }

        /**
         * @param resourceGroupName Azure Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetReportByResourceGroupNamePlainArgs build() {
            $.reportName = Objects.requireNonNull($.reportName, "expected parameter 'reportName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
