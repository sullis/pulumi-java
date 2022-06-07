// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Identity.inputs.GetTagDefaultsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagDefaultsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagDefaultsPlainArgs Empty = new GetTagDefaultsPlainArgs();

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return The OCID of the compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    @Import(name="filters")
    private @Nullable List<GetTagDefaultsFilter> filters;

    public Optional<List<GetTagDefaultsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to only return resources that match the specified OCID exactly.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return A filter to only return resources that match the specified OCID exactly.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The OCID of the tag definition.
     * 
     */
    @Import(name="tagDefinitionId")
    private @Nullable String tagDefinitionId;

    /**
     * @return The OCID of the tag definition.
     * 
     */
    public Optional<String> tagDefinitionId() {
        return Optional.ofNullable(this.tagDefinitionId);
    }

    private GetTagDefaultsPlainArgs() {}

    private GetTagDefaultsPlainArgs(GetTagDefaultsPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.id = $.id;
        this.state = $.state;
        this.tagDefinitionId = $.tagDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagDefaultsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagDefaultsPlainArgs $;

        public Builder() {
            $ = new GetTagDefaultsPlainArgs();
        }

        public Builder(GetTagDefaultsPlainArgs defaults) {
            $ = new GetTagDefaultsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment (remember that the tenancy is simply the root compartment).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetTagDefaultsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetTagDefaultsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id A filter to only return resources that match the specified OCID exactly.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param state A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param tagDefinitionId The OCID of the tag definition.
         * 
         * @return builder
         * 
         */
        public Builder tagDefinitionId(@Nullable String tagDefinitionId) {
            $.tagDefinitionId = tagDefinitionId;
            return this;
        }

        public GetTagDefaultsPlainArgs build() {
            return $;
        }
    }

}
