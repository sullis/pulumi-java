// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsManagement.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.OsManagement.inputs.GetManagedInstanceGroupsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagedInstanceGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedInstanceGroupsPlainArgs Empty = new GetManagedInstanceGroupsPlainArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetManagedInstanceGroupsFilter> filters;

    public Optional<List<GetManagedInstanceGroupsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OS family for which to list resources.
     * 
     */
    @Import(name="osFamily")
    private @Nullable String osFamily;

    /**
     * @return The OS family for which to list resources.
     * 
     */
    public Optional<String> osFamily() {
        return Optional.ofNullable(this.osFamily);
    }

    /**
     * The current lifecycle state for the object.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The current lifecycle state for the object.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetManagedInstanceGroupsPlainArgs() {}

    private GetManagedInstanceGroupsPlainArgs(GetManagedInstanceGroupsPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.osFamily = $.osFamily;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedInstanceGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedInstanceGroupsPlainArgs $;

        public Builder() {
            $ = new GetManagedInstanceGroupsPlainArgs();
        }

        public Builder(GetManagedInstanceGroupsPlainArgs defaults) {
            $ = new GetManagedInstanceGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A user-friendly name. Does not have to be unique, and it&#39;s changeable.  Example: `My new resource`
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetManagedInstanceGroupsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetManagedInstanceGroupsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param osFamily The OS family for which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder osFamily(@Nullable String osFamily) {
            $.osFamily = osFamily;
            return this;
        }

        /**
         * @param state The current lifecycle state for the object.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetManagedInstanceGroupsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
