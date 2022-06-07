// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OperatorAccessControl.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.OperatorAccessControl.inputs.GetActionsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetActionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetActionsArgs Empty = new GetActionsArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable Output<List<GetActionsFilterArgs>> filters;

    public Optional<Output<List<GetActionsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the entire display name given.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A filter to return only lists of resources that match the entire given service type.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return A filter to return only lists of resources that match the entire given service type.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * A filter to return only resources whose lifecycleState matches the given OperatorAction lifecycleState.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return A filter to return only resources whose lifecycleState matches the given OperatorAction lifecycleState.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private GetActionsArgs() {}

    private GetActionsArgs(GetActionsArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.name = $.name;
        this.resourceType = $.resourceType;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetActionsArgs $;

        public Builder() {
            $ = new GetActionsArgs();
        }

        public Builder(GetActionsArgs defaults) {
            $ = new GetActionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        public Builder filters(@Nullable Output<List<GetActionsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetActionsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetActionsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceType A filter to return only lists of resources that match the entire given service type.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType A filter to return only lists of resources that match the entire given service type.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param state A filter to return only resources whose lifecycleState matches the given OperatorAction lifecycleState.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state A filter to return only resources whose lifecycleState matches the given OperatorAction lifecycleState.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public GetActionsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
