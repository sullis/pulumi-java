// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Opsi.inputs.GetOperationsInsightsPrivateEndpointsFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOperationsInsightsPrivateEndpointsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOperationsInsightsPrivateEndpointsArgs Empty = new GetOperationsInsightsPrivateEndpointsArgs();

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
    private @Nullable Output<List<GetOperationsInsightsPrivateEndpointsFilterArgs>> filters;

    public Optional<Output<List<GetOperationsInsightsPrivateEndpointsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The option to filter OPSI private endpoints that can used for RAC. Should be used along with vcnId query parameter.
     * 
     */
    @Import(name="isUsedForRacDbs")
    private @Nullable Output<Boolean> isUsedForRacDbs;

    /**
     * @return The option to filter OPSI private endpoints that can used for RAC. Should be used along with vcnId query parameter.
     * 
     */
    public Optional<Output<Boolean>> isUsedForRacDbs() {
        return Optional.ofNullable(this.isUsedForRacDbs);
    }

    /**
     * Unique Operations Insights PrivateEndpoint identifier
     * 
     */
    @Import(name="opsiPrivateEndpointId")
    private @Nullable Output<String> opsiPrivateEndpointId;

    /**
     * @return Unique Operations Insights PrivateEndpoint identifier
     * 
     */
    public Optional<Output<String>> opsiPrivateEndpointId() {
        return Optional.ofNullable(this.opsiPrivateEndpointId);
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     * 
     */
    @Import(name="vcnId")
    private @Nullable Output<String> vcnId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     * 
     */
    public Optional<Output<String>> vcnId() {
        return Optional.ofNullable(this.vcnId);
    }

    private GetOperationsInsightsPrivateEndpointsArgs() {}

    private GetOperationsInsightsPrivateEndpointsArgs(GetOperationsInsightsPrivateEndpointsArgs $) {
        this.compartmentId = $.compartmentId;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.isUsedForRacDbs = $.isUsedForRacDbs;
        this.opsiPrivateEndpointId = $.opsiPrivateEndpointId;
        this.states = $.states;
        this.vcnId = $.vcnId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOperationsInsightsPrivateEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOperationsInsightsPrivateEndpointsArgs $;

        public Builder() {
            $ = new GetOperationsInsightsPrivateEndpointsArgs();
        }

        public Builder(GetOperationsInsightsPrivateEndpointsArgs defaults) {
            $ = new GetOperationsInsightsPrivateEndpointsArgs(Objects.requireNonNull(defaults));
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

        public Builder filters(@Nullable Output<List<GetOperationsInsightsPrivateEndpointsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetOperationsInsightsPrivateEndpointsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetOperationsInsightsPrivateEndpointsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param isUsedForRacDbs The option to filter OPSI private endpoints that can used for RAC. Should be used along with vcnId query parameter.
         * 
         * @return builder
         * 
         */
        public Builder isUsedForRacDbs(@Nullable Output<Boolean> isUsedForRacDbs) {
            $.isUsedForRacDbs = isUsedForRacDbs;
            return this;
        }

        /**
         * @param isUsedForRacDbs The option to filter OPSI private endpoints that can used for RAC. Should be used along with vcnId query parameter.
         * 
         * @return builder
         * 
         */
        public Builder isUsedForRacDbs(Boolean isUsedForRacDbs) {
            return isUsedForRacDbs(Output.of(isUsedForRacDbs));
        }

        /**
         * @param opsiPrivateEndpointId Unique Operations Insights PrivateEndpoint identifier
         * 
         * @return builder
         * 
         */
        public Builder opsiPrivateEndpointId(@Nullable Output<String> opsiPrivateEndpointId) {
            $.opsiPrivateEndpointId = opsiPrivateEndpointId;
            return this;
        }

        /**
         * @param opsiPrivateEndpointId Unique Operations Insights PrivateEndpoint identifier
         * 
         * @return builder
         * 
         */
        public Builder opsiPrivateEndpointId(String opsiPrivateEndpointId) {
            return opsiPrivateEndpointId(Output.of(opsiPrivateEndpointId));
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

        /**
         * @param vcnId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
         * 
         * @return builder
         * 
         */
        public Builder vcnId(@Nullable Output<String> vcnId) {
            $.vcnId = vcnId;
            return this;
        }

        /**
         * @param vcnId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
         * 
         * @return builder
         * 
         */
        public Builder vcnId(String vcnId) {
            return vcnId(Output.of(vcnId));
        }

        public GetOperationsInsightsPrivateEndpointsArgs build() {
            return $;
        }
    }

}
