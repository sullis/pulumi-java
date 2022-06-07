// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OspGateway.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.OspGateway.inputs.GetSubscriptionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscriptionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionsPlainArgs Empty = new GetSubscriptionsPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetSubscriptionsFilter> filters;

    public Optional<List<GetSubscriptionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The home region&#39;s public name of the logged in user.
     * 
     */
    @Import(name="ospHomeRegion", required=true)
    private String ospHomeRegion;

    /**
     * @return The home region&#39;s public name of the logged in user.
     * 
     */
    public String ospHomeRegion() {
        return this.ospHomeRegion;
    }

    private GetSubscriptionsPlainArgs() {}

    private GetSubscriptionsPlainArgs(GetSubscriptionsPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.ospHomeRegion = $.ospHomeRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionsPlainArgs $;

        public Builder() {
            $ = new GetSubscriptionsPlainArgs();
        }

        public Builder(GetSubscriptionsPlainArgs defaults) {
            $ = new GetSubscriptionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetSubscriptionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetSubscriptionsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param ospHomeRegion The home region&#39;s public name of the logged in user.
         * 
         * @return builder
         * 
         */
        public Builder ospHomeRegion(String ospHomeRegion) {
            $.ospHomeRegion = ospHomeRegion;
            return this;
        }

        public GetSubscriptionsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.ospHomeRegion = Objects.requireNonNull($.ospHomeRegion, "expected parameter 'ospHomeRegion' to be non-null");
            return $;
        }
    }

}
