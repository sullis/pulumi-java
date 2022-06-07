// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.LoadBalancer.inputs.GetPoliciesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPoliciesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPoliciesPlainArgs Empty = new GetPoliciesPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the load balancer policies to list.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the load balancer policies to list.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetPoliciesFilter> filters;

    public Optional<List<GetPoliciesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetPoliciesPlainArgs() {}

    private GetPoliciesPlainArgs(GetPoliciesPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPoliciesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPoliciesPlainArgs $;

        public Builder() {
            $ = new GetPoliciesPlainArgs();
        }

        public Builder(GetPoliciesPlainArgs defaults) {
            $ = new GetPoliciesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the load balancer policies to list.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetPoliciesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetPoliciesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetPoliciesPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
