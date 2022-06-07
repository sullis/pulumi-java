// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetVolumeBackupPolicyAssignmentsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumeBackupPolicyAssignmentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeBackupPolicyAssignmentsPlainArgs Empty = new GetVolumeBackupPolicyAssignmentsPlainArgs();

    /**
     * The OCID of an asset (e.g. a volume).
     * 
     */
    @Import(name="assetId", required=true)
    private String assetId;

    /**
     * @return The OCID of an asset (e.g. a volume).
     * 
     */
    public String assetId() {
        return this.assetId;
    }

    @Import(name="filters")
    private @Nullable List<GetVolumeBackupPolicyAssignmentsFilter> filters;

    public Optional<List<GetVolumeBackupPolicyAssignmentsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetVolumeBackupPolicyAssignmentsPlainArgs() {}

    private GetVolumeBackupPolicyAssignmentsPlainArgs(GetVolumeBackupPolicyAssignmentsPlainArgs $) {
        this.assetId = $.assetId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeBackupPolicyAssignmentsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeBackupPolicyAssignmentsPlainArgs $;

        public Builder() {
            $ = new GetVolumeBackupPolicyAssignmentsPlainArgs();
        }

        public Builder(GetVolumeBackupPolicyAssignmentsPlainArgs defaults) {
            $ = new GetVolumeBackupPolicyAssignmentsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assetId The OCID of an asset (e.g. a volume).
         * 
         * @return builder
         * 
         */
        public Builder assetId(String assetId) {
            $.assetId = assetId;
            return this;
        }

        public Builder filters(@Nullable List<GetVolumeBackupPolicyAssignmentsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetVolumeBackupPolicyAssignmentsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetVolumeBackupPolicyAssignmentsPlainArgs build() {
            $.assetId = Objects.requireNonNull($.assetId, "expected parameter 'assetId' to be non-null");
            return $;
        }
    }

}
