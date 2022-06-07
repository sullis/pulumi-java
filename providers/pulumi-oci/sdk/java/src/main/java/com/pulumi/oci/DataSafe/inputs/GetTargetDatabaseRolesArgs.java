// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetTargetDatabaseRolesFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetDatabaseRolesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetDatabaseRolesArgs Empty = new GetTargetDatabaseRolesArgs();

    /**
     * A filter to return roles based on authentication type.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<String> authenticationType;

    /**
     * @return A filter to return roles based on authentication type.
     * 
     */
    public Optional<Output<String>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetTargetDatabaseRolesFilterArgs>> filters;

    public Optional<Output<List<GetTargetDatabaseRolesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return roles based on whether they are maintained by oracle or not.
     * 
     */
    @Import(name="isOracleMaintained")
    private @Nullable Output<Boolean> isOracleMaintained;

    /**
     * @return A filter to return roles based on whether they are maintained by oracle or not.
     * 
     */
    public Optional<Output<Boolean>> isOracleMaintained() {
        return Optional.ofNullable(this.isOracleMaintained);
    }

    /**
     * A filter to return only items if role name contains a specific string.
     * 
     */
    @Import(name="roleNameContains")
    private @Nullable Output<String> roleNameContains;

    /**
     * @return A filter to return only items if role name contains a specific string.
     * 
     */
    public Optional<Output<String>> roleNameContains() {
        return Optional.ofNullable(this.roleNameContains);
    }

    /**
     * A filter to return only a specific role based on role name.
     * 
     */
    @Import(name="roleNames")
    private @Nullable Output<List<String>> roleNames;

    /**
     * @return A filter to return only a specific role based on role name.
     * 
     */
    public Optional<Output<List<String>>> roleNames() {
        return Optional.ofNullable(this.roleNames);
    }

    /**
     * The OCID of the Data Safe target database.
     * 
     */
    @Import(name="targetDatabaseId", required=true)
    private Output<String> targetDatabaseId;

    /**
     * @return The OCID of the Data Safe target database.
     * 
     */
    public Output<String> targetDatabaseId() {
        return this.targetDatabaseId;
    }

    private GetTargetDatabaseRolesArgs() {}

    private GetTargetDatabaseRolesArgs(GetTargetDatabaseRolesArgs $) {
        this.authenticationType = $.authenticationType;
        this.filters = $.filters;
        this.isOracleMaintained = $.isOracleMaintained;
        this.roleNameContains = $.roleNameContains;
        this.roleNames = $.roleNames;
        this.targetDatabaseId = $.targetDatabaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetDatabaseRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetDatabaseRolesArgs $;

        public Builder() {
            $ = new GetTargetDatabaseRolesArgs();
        }

        public Builder(GetTargetDatabaseRolesArgs defaults) {
            $ = new GetTargetDatabaseRolesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationType A filter to return roles based on authentication type.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType A filter to return roles based on authentication type.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder filters(@Nullable Output<List<GetTargetDatabaseRolesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetTargetDatabaseRolesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetTargetDatabaseRolesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param isOracleMaintained A filter to return roles based on whether they are maintained by oracle or not.
         * 
         * @return builder
         * 
         */
        public Builder isOracleMaintained(@Nullable Output<Boolean> isOracleMaintained) {
            $.isOracleMaintained = isOracleMaintained;
            return this;
        }

        /**
         * @param isOracleMaintained A filter to return roles based on whether they are maintained by oracle or not.
         * 
         * @return builder
         * 
         */
        public Builder isOracleMaintained(Boolean isOracleMaintained) {
            return isOracleMaintained(Output.of(isOracleMaintained));
        }

        /**
         * @param roleNameContains A filter to return only items if role name contains a specific string.
         * 
         * @return builder
         * 
         */
        public Builder roleNameContains(@Nullable Output<String> roleNameContains) {
            $.roleNameContains = roleNameContains;
            return this;
        }

        /**
         * @param roleNameContains A filter to return only items if role name contains a specific string.
         * 
         * @return builder
         * 
         */
        public Builder roleNameContains(String roleNameContains) {
            return roleNameContains(Output.of(roleNameContains));
        }

        /**
         * @param roleNames A filter to return only a specific role based on role name.
         * 
         * @return builder
         * 
         */
        public Builder roleNames(@Nullable Output<List<String>> roleNames) {
            $.roleNames = roleNames;
            return this;
        }

        /**
         * @param roleNames A filter to return only a specific role based on role name.
         * 
         * @return builder
         * 
         */
        public Builder roleNames(List<String> roleNames) {
            return roleNames(Output.of(roleNames));
        }

        /**
         * @param roleNames A filter to return only a specific role based on role name.
         * 
         * @return builder
         * 
         */
        public Builder roleNames(String... roleNames) {
            return roleNames(List.of(roleNames));
        }

        /**
         * @param targetDatabaseId The OCID of the Data Safe target database.
         * 
         * @return builder
         * 
         */
        public Builder targetDatabaseId(Output<String> targetDatabaseId) {
            $.targetDatabaseId = targetDatabaseId;
            return this;
        }

        /**
         * @param targetDatabaseId The OCID of the Data Safe target database.
         * 
         * @return builder
         * 
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            return targetDatabaseId(Output.of(targetDatabaseId));
        }

        public GetTargetDatabaseRolesArgs build() {
            $.targetDatabaseId = Objects.requireNonNull($.targetDatabaseId, "expected parameter 'targetDatabaseId' to be non-null");
            return $;
        }
    }

}
