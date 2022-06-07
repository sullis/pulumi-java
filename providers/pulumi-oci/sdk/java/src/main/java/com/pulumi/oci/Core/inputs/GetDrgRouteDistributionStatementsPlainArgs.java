// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetDrgRouteDistributionStatementsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDrgRouteDistributionStatementsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDrgRouteDistributionStatementsPlainArgs Empty = new GetDrgRouteDistributionStatementsPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route distribution.
     * 
     */
    @Import(name="drgRouteDistributionId", required=true)
    private String drgRouteDistributionId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route distribution.
     * 
     */
    public String drgRouteDistributionId() {
        return this.drgRouteDistributionId;
    }

    @Import(name="filters")
    private @Nullable List<GetDrgRouteDistributionStatementsFilter> filters;

    public Optional<List<GetDrgRouteDistributionStatementsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetDrgRouteDistributionStatementsPlainArgs() {}

    private GetDrgRouteDistributionStatementsPlainArgs(GetDrgRouteDistributionStatementsPlainArgs $) {
        this.drgRouteDistributionId = $.drgRouteDistributionId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDrgRouteDistributionStatementsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDrgRouteDistributionStatementsPlainArgs $;

        public Builder() {
            $ = new GetDrgRouteDistributionStatementsPlainArgs();
        }

        public Builder(GetDrgRouteDistributionStatementsPlainArgs defaults) {
            $ = new GetDrgRouteDistributionStatementsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param drgRouteDistributionId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route distribution.
         * 
         * @return builder
         * 
         */
        public Builder drgRouteDistributionId(String drgRouteDistributionId) {
            $.drgRouteDistributionId = drgRouteDistributionId;
            return this;
        }

        public Builder filters(@Nullable List<GetDrgRouteDistributionStatementsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDrgRouteDistributionStatementsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetDrgRouteDistributionStatementsPlainArgs build() {
            $.drgRouteDistributionId = Objects.requireNonNull($.drgRouteDistributionId, "expected parameter 'drgRouteDistributionId' to be non-null");
            return $;
        }
    }

}
