// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetTargetDatabaseRoleFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetDatabaseRoleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetDatabaseRoleArgs Empty = new GetTargetDatabaseRoleArgs();

    @Import(name="authenticationType")
    private @Nullable Output<String> authenticationType;

    public Optional<Output<String>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetTargetDatabaseRoleFilterArgs>> filters;

    public Optional<Output<List<GetTargetDatabaseRoleFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="isOracleMaintained")
    private @Nullable Output<Boolean> isOracleMaintained;

    public Optional<Output<Boolean>> isOracleMaintained() {
        return Optional.ofNullable(this.isOracleMaintained);
    }

    @Import(name="roleNameContains")
    private @Nullable Output<String> roleNameContains;

    public Optional<Output<String>> roleNameContains() {
        return Optional.ofNullable(this.roleNameContains);
    }

    @Import(name="roleNames")
    private @Nullable Output<List<String>> roleNames;

    public Optional<Output<List<String>>> roleNames() {
        return Optional.ofNullable(this.roleNames);
    }

    @Import(name="targetDatabaseId", required=true)
    private Output<String> targetDatabaseId;

    public Output<String> targetDatabaseId() {
        return this.targetDatabaseId;
    }

    private GetTargetDatabaseRoleArgs() {}

    private GetTargetDatabaseRoleArgs(GetTargetDatabaseRoleArgs $) {
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
    public static Builder builder(GetTargetDatabaseRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetDatabaseRoleArgs $;

        public Builder() {
            $ = new GetTargetDatabaseRoleArgs();
        }

        public Builder(GetTargetDatabaseRoleArgs defaults) {
            $ = new GetTargetDatabaseRoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticationType(@Nullable Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        public Builder filters(@Nullable Output<List<GetTargetDatabaseRoleFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetTargetDatabaseRoleFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetTargetDatabaseRoleFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder isOracleMaintained(@Nullable Output<Boolean> isOracleMaintained) {
            $.isOracleMaintained = isOracleMaintained;
            return this;
        }

        public Builder isOracleMaintained(Boolean isOracleMaintained) {
            return isOracleMaintained(Output.of(isOracleMaintained));
        }

        public Builder roleNameContains(@Nullable Output<String> roleNameContains) {
            $.roleNameContains = roleNameContains;
            return this;
        }

        public Builder roleNameContains(String roleNameContains) {
            return roleNameContains(Output.of(roleNameContains));
        }

        public Builder roleNames(@Nullable Output<List<String>> roleNames) {
            $.roleNames = roleNames;
            return this;
        }

        public Builder roleNames(List<String> roleNames) {
            return roleNames(Output.of(roleNames));
        }

        public Builder roleNames(String... roleNames) {
            return roleNames(List.of(roleNames));
        }

        public Builder targetDatabaseId(Output<String> targetDatabaseId) {
            $.targetDatabaseId = targetDatabaseId;
            return this;
        }

        public Builder targetDatabaseId(String targetDatabaseId) {
            return targetDatabaseId(Output.of(targetDatabaseId));
        }

        public GetTargetDatabaseRoleArgs build() {
            $.targetDatabaseId = Objects.requireNonNull($.targetDatabaseId, "expected parameter 'targetDatabaseId' to be non-null");
            return $;
        }
    }

}
