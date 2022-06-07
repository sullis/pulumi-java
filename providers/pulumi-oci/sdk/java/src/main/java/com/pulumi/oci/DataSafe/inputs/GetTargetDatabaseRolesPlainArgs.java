// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetTargetDatabaseRolesFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetDatabaseRolesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetDatabaseRolesPlainArgs Empty = new GetTargetDatabaseRolesPlainArgs();

    /**
     * A filter to return roles based on authentication type.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable String authenticationType;

    /**
     * @return A filter to return roles based on authentication type.
     * 
     */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    @Import(name="filters")
    private @Nullable List<GetTargetDatabaseRolesFilter> filters;

    public Optional<List<GetTargetDatabaseRolesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return roles based on whether they are maintained by oracle or not.
     * 
     */
    @Import(name="isOracleMaintained")
    private @Nullable Boolean isOracleMaintained;

    /**
     * @return A filter to return roles based on whether they are maintained by oracle or not.
     * 
     */
    public Optional<Boolean> isOracleMaintained() {
        return Optional.ofNullable(this.isOracleMaintained);
    }

    /**
     * A filter to return only items if role name contains a specific string.
     * 
     */
    @Import(name="roleNameContains")
    private @Nullable String roleNameContains;

    /**
     * @return A filter to return only items if role name contains a specific string.
     * 
     */
    public Optional<String> roleNameContains() {
        return Optional.ofNullable(this.roleNameContains);
    }

    /**
     * A filter to return only a specific role based on role name.
     * 
     */
    @Import(name="roleNames")
    private @Nullable List<String> roleNames;

    /**
     * @return A filter to return only a specific role based on role name.
     * 
     */
    public Optional<List<String>> roleNames() {
        return Optional.ofNullable(this.roleNames);
    }

    /**
     * The OCID of the Data Safe target database.
     * 
     */
    @Import(name="targetDatabaseId", required=true)
    private String targetDatabaseId;

    /**
     * @return The OCID of the Data Safe target database.
     * 
     */
    public String targetDatabaseId() {
        return this.targetDatabaseId;
    }

    private GetTargetDatabaseRolesPlainArgs() {}

    private GetTargetDatabaseRolesPlainArgs(GetTargetDatabaseRolesPlainArgs $) {
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
    public static Builder builder(GetTargetDatabaseRolesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetDatabaseRolesPlainArgs $;

        public Builder() {
            $ = new GetTargetDatabaseRolesPlainArgs();
        }

        public Builder(GetTargetDatabaseRolesPlainArgs defaults) {
            $ = new GetTargetDatabaseRolesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationType A filter to return roles based on authentication type.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable String authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder filters(@Nullable List<GetTargetDatabaseRolesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetTargetDatabaseRolesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param isOracleMaintained A filter to return roles based on whether they are maintained by oracle or not.
         * 
         * @return builder
         * 
         */
        public Builder isOracleMaintained(@Nullable Boolean isOracleMaintained) {
            $.isOracleMaintained = isOracleMaintained;
            return this;
        }

        /**
         * @param roleNameContains A filter to return only items if role name contains a specific string.
         * 
         * @return builder
         * 
         */
        public Builder roleNameContains(@Nullable String roleNameContains) {
            $.roleNameContains = roleNameContains;
            return this;
        }

        /**
         * @param roleNames A filter to return only a specific role based on role name.
         * 
         * @return builder
         * 
         */
        public Builder roleNames(@Nullable List<String> roleNames) {
            $.roleNames = roleNames;
            return this;
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
        public Builder targetDatabaseId(String targetDatabaseId) {
            $.targetDatabaseId = targetDatabaseId;
            return this;
        }

        public GetTargetDatabaseRolesPlainArgs build() {
            $.targetDatabaseId = Objects.requireNonNull($.targetDatabaseId, "expected parameter 'targetDatabaseId' to be non-null");
            return $;
        }
    }

}
