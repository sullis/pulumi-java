// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Opsi.inputs.GetEnterpriseManagerBridgesFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnterpriseManagerBridgesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnterpriseManagerBridgesArgs Empty = new GetEnterpriseManagerBridgesArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * A flag to search all resources within a given compartment and all sub-compartments.
     * 
     */
    @Import(name="compartmentIdInSubtree")
    private @Nullable Output<Boolean> compartmentIdInSubtree;

    /**
     * @return A flag to search all resources within a given compartment and all sub-compartments.
     * 
     */
    public Optional<Output<Boolean>> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }

    /**
     * A filter to return only resources that match the entire display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A filter to return only resources that match the entire display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetEnterpriseManagerBridgesFilterArgs>> filters;

    public Optional<Output<List<GetEnterpriseManagerBridgesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Unique Enterprise Manager bridge identifier
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique Enterprise Manager bridge identifier
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Lifecycle states
     * 
     */
    @Import(name="states")
    private @Nullable Output<List<String>> states;

    /**
     * @return Lifecycle states
     * 
     */
    public Optional<Output<List<String>>> states() {
        return Optional.ofNullable(this.states);
    }

    private GetEnterpriseManagerBridgesArgs() {}

    private GetEnterpriseManagerBridgesArgs(GetEnterpriseManagerBridgesArgs $) {
        this.compartmentId = $.compartmentId;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.id = $.id;
        this.states = $.states;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnterpriseManagerBridgesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnterpriseManagerBridgesArgs $;

        public Builder() {
            $ = new GetEnterpriseManagerBridgesArgs();
        }

        public Builder(GetEnterpriseManagerBridgesArgs defaults) {
            $ = new GetEnterpriseManagerBridgesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param compartmentIdInSubtree A flag to search all resources within a given compartment and all sub-compartments.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(@Nullable Output<Boolean> compartmentIdInSubtree) {
            $.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * @param compartmentIdInSubtree A flag to search all resources within a given compartment and all sub-compartments.
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            return compartmentIdInSubtree(Output.of(compartmentIdInSubtree));
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetEnterpriseManagerBridgesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetEnterpriseManagerBridgesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetEnterpriseManagerBridgesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id Unique Enterprise Manager bridge identifier
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique Enterprise Manager bridge identifier
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param states Lifecycle states
         * 
         * @return builder
         * 
         */
        public Builder states(@Nullable Output<List<String>> states) {
            $.states = states;
            return this;
        }

        /**
         * @param states Lifecycle states
         * 
         * @return builder
         * 
         */
        public Builder states(List<String> states) {
            return states(Output.of(states));
        }

        /**
         * @param states Lifecycle states
         * 
         * @return builder
         * 
         */
        public Builder states(String... states) {
            return states(List.of(states));
        }

        public GetEnterpriseManagerBridgesArgs build() {
            return $;
        }
    }

}
