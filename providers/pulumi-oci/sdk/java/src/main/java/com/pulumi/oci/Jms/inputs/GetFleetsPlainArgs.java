// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Jms.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Jms.inputs.GetFleetsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFleetsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFleetsPlainArgs Empty = new GetFleetsPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return The display name.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetFleetsFilter> filters;

    public Optional<List<GetFleetsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the Fleet.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the Fleet.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The state of the lifecycle.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The state of the lifecycle.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetFleetsPlainArgs() {}

    private GetFleetsPlainArgs(GetFleetsPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.id = $.id;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFleetsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFleetsPlainArgs $;

        public Builder() {
            $ = new GetFleetsPlainArgs();
        }

        public Builder(GetFleetsPlainArgs defaults) {
            $ = new GetFleetsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName The display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetFleetsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetFleetsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id The ID of the Fleet.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param state The state of the lifecycle.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetFleetsPlainArgs build() {
            return $;
        }
    }

}
