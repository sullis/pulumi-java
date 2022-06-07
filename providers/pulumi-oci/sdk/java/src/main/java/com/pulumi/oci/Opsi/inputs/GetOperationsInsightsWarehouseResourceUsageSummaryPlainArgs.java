// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs Empty = new GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs();

    /**
     * Unique Operations Insights Warehouse identifier
     * 
     */
    @Import(name="operationsInsightsWarehouseId", required=true)
    private String operationsInsightsWarehouseId;

    /**
     * @return Unique Operations Insights Warehouse identifier
     * 
     */
    public String operationsInsightsWarehouseId() {
        return this.operationsInsightsWarehouseId;
    }

    private GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs() {}

    private GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs(GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs $) {
        this.operationsInsightsWarehouseId = $.operationsInsightsWarehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs $;

        public Builder() {
            $ = new GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs();
        }

        public Builder(GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs defaults) {
            $ = new GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operationsInsightsWarehouseId Unique Operations Insights Warehouse identifier
         * 
         * @return builder
         * 
         */
        public Builder operationsInsightsWarehouseId(String operationsInsightsWarehouseId) {
            $.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
            return this;
        }

        public GetOperationsInsightsWarehouseResourceUsageSummaryPlainArgs build() {
            $.operationsInsightsWarehouseId = Objects.requireNonNull($.operationsInsightsWarehouseId, "expected parameter 'operationsInsightsWarehouseId' to be non-null");
            return $;
        }
    }

}
