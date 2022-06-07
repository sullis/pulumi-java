// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetPublicIpPoolsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicIpPoolsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicIpPoolsPlainArgs Empty = new GetPublicIpPoolsPlainArgs();

    /**
     * A filter to return only resources that match the given BYOIP CIDR block.
     * 
     */
    @Import(name="byoipRangeId")
    private @Nullable String byoipRangeId;

    /**
     * @return A filter to return only resources that match the given BYOIP CIDR block.
     * 
     */
    public Optional<String> byoipRangeId() {
        return Optional.ofNullable(this.byoipRangeId);
    }

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

    /**
     * A filter to return only resources that match the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetPublicIpPoolsFilter> filters;

    public Optional<List<GetPublicIpPoolsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetPublicIpPoolsPlainArgs() {}

    private GetPublicIpPoolsPlainArgs(GetPublicIpPoolsPlainArgs $) {
        this.byoipRangeId = $.byoipRangeId;
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicIpPoolsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicIpPoolsPlainArgs $;

        public Builder() {
            $ = new GetPublicIpPoolsPlainArgs();
        }

        public Builder(GetPublicIpPoolsPlainArgs defaults) {
            $ = new GetPublicIpPoolsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param byoipRangeId A filter to return only resources that match the given BYOIP CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder byoipRangeId(@Nullable String byoipRangeId) {
            $.byoipRangeId = byoipRangeId;
            return this;
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

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetPublicIpPoolsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetPublicIpPoolsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetPublicIpPoolsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
