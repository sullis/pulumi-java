// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waf.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Waf.inputs.GetNetworkAddressListsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkAddressListsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkAddressListsArgs Empty = new GetNetworkAddressListsArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only resources that match the entire display name given.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetNetworkAddressListsFilterArgs>> filters;

    public Optional<Output<List<GetNetworkAddressListsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only the NetworkAddressList with the given [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return A filter to return only the NetworkAddressList with the given [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A filter to return only resources that match the given lifecycleState.
     * 
     */
    @Import(name="states")
    private @Nullable Output<List<String>> states;

    /**
     * @return A filter to return only resources that match the given lifecycleState.
     * 
     */
    public Optional<Output<List<String>>> states() {
        return Optional.ofNullable(this.states);
    }

    private GetNetworkAddressListsArgs() {}

    private GetNetworkAddressListsArgs(GetNetworkAddressListsArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.id = $.id;
        this.states = $.states;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkAddressListsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkAddressListsArgs $;

        public Builder() {
            $ = new GetNetworkAddressListsArgs();
        }

        public Builder(GetNetworkAddressListsArgs defaults) {
            $ = new GetNetworkAddressListsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetNetworkAddressListsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetNetworkAddressListsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetNetworkAddressListsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id A filter to return only the NetworkAddressList with the given [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id A filter to return only the NetworkAddressList with the given [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param states A filter to return only resources that match the given lifecycleState.
         * 
         * @return builder
         * 
         */
        public Builder states(@Nullable Output<List<String>> states) {
            $.states = states;
            return this;
        }

        /**
         * @param states A filter to return only resources that match the given lifecycleState.
         * 
         * @return builder
         * 
         */
        public Builder states(List<String> states) {
            return states(Output.of(states));
        }

        /**
         * @param states A filter to return only resources that match the given lifecycleState.
         * 
         * @return builder
         * 
         */
        public Builder states(String... states) {
            return states(List.of(states));
        }

        public GetNetworkAddressListsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
