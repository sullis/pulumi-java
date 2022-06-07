// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetDbHomesFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbHomesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbHomesArgs Empty = new GetDbHomesArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup. Specify a backupId to list only the DB systems or DB homes that support creating a database using this backup in this compartment.
     * 
     */
    @Import(name="backupId")
    private @Nullable Output<String> backupId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup. Specify a backupId to list only the DB systems or DB homes that support creating a database using this backup in this compartment.
     * 
     */
    public Optional<Output<String>> backupId() {
        return Optional.ofNullable(this.backupId);
    }

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
     * 
     */
    @Import(name="dbSystemId")
    private @Nullable Output<String> dbSystemId;

    /**
     * @return The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
     * 
     */
    public Optional<Output<String>> dbSystemId() {
        return Optional.ofNullable(this.dbSystemId);
    }

    /**
     * A filter to return only DB Homes that match the specified dbVersion.
     * 
     */
    @Import(name="dbVersion")
    private @Nullable Output<String> dbVersion;

    /**
     * @return A filter to return only DB Homes that match the specified dbVersion.
     * 
     */
    public Optional<Output<String>> dbVersion() {
        return Optional.ofNullable(this.dbVersion);
    }

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetDbHomesFilterArgs>> filters;

    public Optional<Output<List<GetDbHomesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
     * 
     */
    @Import(name="vmClusterId")
    private @Nullable Output<String> vmClusterId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
     * 
     */
    public Optional<Output<String>> vmClusterId() {
        return Optional.ofNullable(this.vmClusterId);
    }

    private GetDbHomesArgs() {}

    private GetDbHomesArgs(GetDbHomesArgs $) {
        this.backupId = $.backupId;
        this.compartmentId = $.compartmentId;
        this.dbSystemId = $.dbSystemId;
        this.dbVersion = $.dbVersion;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
        this.vmClusterId = $.vmClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbHomesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbHomesArgs $;

        public Builder() {
            $ = new GetDbHomesArgs();
        }

        public Builder(GetDbHomesArgs defaults) {
            $ = new GetDbHomesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup. Specify a backupId to list only the DB systems or DB homes that support creating a database using this backup in this compartment.
         * 
         * @return builder
         * 
         */
        public Builder backupId(@Nullable Output<String> backupId) {
            $.backupId = backupId;
            return this;
        }

        /**
         * @param backupId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup. Specify a backupId to list only the DB systems or DB homes that support creating a database using this backup in this compartment.
         * 
         * @return builder
         * 
         */
        public Builder backupId(String backupId) {
            return backupId(Output.of(backupId));
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param dbSystemId The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
         * 
         * @return builder
         * 
         */
        public Builder dbSystemId(@Nullable Output<String> dbSystemId) {
            $.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * @param dbSystemId The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
         * 
         * @return builder
         * 
         */
        public Builder dbSystemId(String dbSystemId) {
            return dbSystemId(Output.of(dbSystemId));
        }

        /**
         * @param dbVersion A filter to return only DB Homes that match the specified dbVersion.
         * 
         * @return builder
         * 
         */
        public Builder dbVersion(@Nullable Output<String> dbVersion) {
            $.dbVersion = dbVersion;
            return this;
        }

        /**
         * @param dbVersion A filter to return only DB Homes that match the specified dbVersion.
         * 
         * @return builder
         * 
         */
        public Builder dbVersion(String dbVersion) {
            return dbVersion(Output.of(dbVersion));
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetDbHomesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetDbHomesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetDbHomesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state A filter to return only resources that match the given lifecycle state exactly.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state A filter to return only resources that match the given lifecycle state exactly.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param vmClusterId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(@Nullable Output<String> vmClusterId) {
            $.vmClusterId = vmClusterId;
            return this;
        }

        /**
         * @param vmClusterId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(String vmClusterId) {
            return vmClusterId(Output.of(vmClusterId));
        }

        public GetDbHomesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
