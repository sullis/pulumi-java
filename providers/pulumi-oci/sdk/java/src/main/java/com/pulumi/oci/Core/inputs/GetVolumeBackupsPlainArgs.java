// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetVolumeBackupsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumeBackupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeBackupsPlainArgs Empty = new GetVolumeBackupsPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only resources that match the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetVolumeBackupsFilter> filters;

    public Optional<List<GetVolumeBackupsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that originated from the given source volume backup.
     * 
     */
    @Import(name="sourceVolumeBackupId")
    private @Nullable String sourceVolumeBackupId;

    /**
     * @return A filter to return only resources that originated from the given source volume backup.
     * 
     */
    public Optional<String> sourceVolumeBackupId() {
        return Optional.ofNullable(this.sourceVolumeBackupId);
    }

    /**
     * A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The OCID of the volume.
     * 
     */
    @Import(name="volumeId")
    private @Nullable String volumeId;

    /**
     * @return The OCID of the volume.
     * 
     */
    public Optional<String> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    private GetVolumeBackupsPlainArgs() {}

    private GetVolumeBackupsPlainArgs(GetVolumeBackupsPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.sourceVolumeBackupId = $.sourceVolumeBackupId;
        this.state = $.state;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeBackupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeBackupsPlainArgs $;

        public Builder() {
            $ = new GetVolumeBackupsPlainArgs();
        }

        public Builder(GetVolumeBackupsPlainArgs defaults) {
            $ = new GetVolumeBackupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetVolumeBackupsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetVolumeBackupsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param sourceVolumeBackupId A filter to return only resources that originated from the given source volume backup.
         * 
         * @return builder
         * 
         */
        public Builder sourceVolumeBackupId(@Nullable String sourceVolumeBackupId) {
            $.sourceVolumeBackupId = sourceVolumeBackupId;
            return this;
        }

        /**
         * @param state A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param volumeId The OCID of the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(@Nullable String volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        public GetVolumeBackupsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
