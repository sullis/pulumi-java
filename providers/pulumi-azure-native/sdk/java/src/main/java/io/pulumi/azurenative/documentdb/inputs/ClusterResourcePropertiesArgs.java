// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.enums.AuthenticationMethod;
import io.pulumi.azurenative.documentdb.enums.ManagedCassandraProvisioningState;
import io.pulumi.azurenative.documentdb.inputs.CertificateArgs;
import io.pulumi.azurenative.documentdb.inputs.SeedNodeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a managed Cassandra cluster.
 * 
 */
public final class ClusterResourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterResourcePropertiesArgs Empty = new ClusterResourcePropertiesArgs();

    /**
     * Which authentication method Cassandra should use to authenticate clients. 'None' turns off authentication, so should not be used except in emergencies. 'Cassandra' is the default password based authentication. The default is 'Cassandra'.
     * 
     */
    @InputImport(name="authenticationMethod")
    private final @Nullable Input<Either<String,AuthenticationMethod>> authenticationMethod;

    public Input<Either<String,AuthenticationMethod>> getAuthenticationMethod() {
        return this.authenticationMethod == null ? Input.empty() : this.authenticationMethod;
    }

    /**
     * Which version of Cassandra should this cluster converge to running (e.g., 3.11). When updated, the cluster may take some time to migrate to the new version.
     * 
     */
    @InputImport(name="cassandraVersion")
    private final @Nullable Input<String> cassandraVersion;

    public Input<String> getCassandraVersion() {
        return this.cassandraVersion == null ? Input.empty() : this.cassandraVersion;
    }

    /**
     * List of TLS certificates used to authorize clients connecting to the cluster. All connections are TLS encrypted whether clientCertificates is set or not, but if clientCertificates is set, the managed Cassandra cluster will reject all connections not bearing a TLS client certificate that can be validated from one or more of the public certificates in this property.
     * 
     */
    @InputImport(name="clientCertificates")
    private final @Nullable Input<List<CertificateArgs>> clientCertificates;

    public Input<List<CertificateArgs>> getClientCertificates() {
        return this.clientCertificates == null ? Input.empty() : this.clientCertificates;
    }

    /**
     * If you need to set the clusterName property in cassandra.yaml to something besides the resource name of the cluster, set the value to use on this property.
     * 
     */
    @InputImport(name="clusterNameOverride")
    private final @Nullable Input<String> clusterNameOverride;

    public Input<String> getClusterNameOverride() {
        return this.clusterNameOverride == null ? Input.empty() : this.clusterNameOverride;
    }

    /**
     * Resource id of a subnet that this cluster's management service should have its network interface attached to. The subnet must be routable to all subnets that will be delegated to data centers. The resource id must be of the form '/subscriptions/<subscription id>/resourceGroups/<resource group>/providers/Microsoft.Network/virtualNetworks/<virtual network>/subnets/<subnet>'
     * 
     */
    @InputImport(name="delegatedManagementSubnetId")
    private final @Nullable Input<String> delegatedManagementSubnetId;

    public Input<String> getDelegatedManagementSubnetId() {
        return this.delegatedManagementSubnetId == null ? Input.empty() : this.delegatedManagementSubnetId;
    }

    /**
     * List of TLS certificates used to authorize gossip from unmanaged data centers. The TLS certificates of all nodes in unmanaged data centers must be verifiable using one of the certificates provided in this property.
     * 
     */
    @InputImport(name="externalGossipCertificates")
    private final @Nullable Input<List<CertificateArgs>> externalGossipCertificates;

    public Input<List<CertificateArgs>> getExternalGossipCertificates() {
        return this.externalGossipCertificates == null ? Input.empty() : this.externalGossipCertificates;
    }

    /**
     * List of IP addresses of seed nodes in unmanaged data centers. These will be added to the seed node lists of all managed nodes.
     * 
     */
    @InputImport(name="externalSeedNodes")
    private final @Nullable Input<List<SeedNodeArgs>> externalSeedNodes;

    public Input<List<SeedNodeArgs>> getExternalSeedNodes() {
        return this.externalSeedNodes == null ? Input.empty() : this.externalSeedNodes;
    }

    /**
     * Number of hours to wait between taking a backup of the cluster. To disable backups, set this property to 0.
     * 
     */
    @InputImport(name="hoursBetweenBackups")
    private final @Nullable Input<Integer> hoursBetweenBackups;

    public Input<Integer> getHoursBetweenBackups() {
        return this.hoursBetweenBackups == null ? Input.empty() : this.hoursBetweenBackups;
    }

    /**
     * Initial password for clients connecting as admin to the cluster. Should be changed after cluster creation. Returns null on GET. This field only applies when the authenticationMethod field is 'Cassandra'.
     * 
     */
    @InputImport(name="initialCassandraAdminPassword")
    private final @Nullable Input<String> initialCassandraAdminPassword;

    public Input<String> getInitialCassandraAdminPassword() {
        return this.initialCassandraAdminPassword == null ? Input.empty() : this.initialCassandraAdminPassword;
    }

    /**
     * Hostname or IP address where the Prometheus endpoint containing data about the managed Cassandra nodes can be reached.
     * 
     */
    @InputImport(name="prometheusEndpoint")
    private final @Nullable Input<SeedNodeArgs> prometheusEndpoint;

    public Input<SeedNodeArgs> getPrometheusEndpoint() {
        return this.prometheusEndpoint == null ? Input.empty() : this.prometheusEndpoint;
    }

    /**
     * The status of the resource at the time the operation was called.
     * 
     */
    @InputImport(name="provisioningState")
    private final @Nullable Input<Either<String,ManagedCassandraProvisioningState>> provisioningState;

    public Input<Either<String,ManagedCassandraProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * Should automatic repairs run on this cluster? If omitted, this is true, and should stay true unless you are running a hybrid cluster where you are already doing your own repairs.
     * 
     */
    @InputImport(name="repairEnabled")
    private final @Nullable Input<Boolean> repairEnabled;

    public Input<Boolean> getRepairEnabled() {
        return this.repairEnabled == null ? Input.empty() : this.repairEnabled;
    }

    /**
     * To create an empty cluster, omit this field or set it to null. To restore a backup into a new cluster, set this field to the resource id of the backup.
     * 
     */
    @InputImport(name="restoreFromBackupId")
    private final @Nullable Input<String> restoreFromBackupId;

    public Input<String> getRestoreFromBackupId() {
        return this.restoreFromBackupId == null ? Input.empty() : this.restoreFromBackupId;
    }

    public ClusterResourcePropertiesArgs(
        @Nullable Input<Either<String,AuthenticationMethod>> authenticationMethod,
        @Nullable Input<String> cassandraVersion,
        @Nullable Input<List<CertificateArgs>> clientCertificates,
        @Nullable Input<String> clusterNameOverride,
        @Nullable Input<String> delegatedManagementSubnetId,
        @Nullable Input<List<CertificateArgs>> externalGossipCertificates,
        @Nullable Input<List<SeedNodeArgs>> externalSeedNodes,
        @Nullable Input<Integer> hoursBetweenBackups,
        @Nullable Input<String> initialCassandraAdminPassword,
        @Nullable Input<SeedNodeArgs> prometheusEndpoint,
        @Nullable Input<Either<String,ManagedCassandraProvisioningState>> provisioningState,
        @Nullable Input<Boolean> repairEnabled,
        @Nullable Input<String> restoreFromBackupId) {
        this.authenticationMethod = authenticationMethod;
        this.cassandraVersion = cassandraVersion;
        this.clientCertificates = clientCertificates;
        this.clusterNameOverride = clusterNameOverride;
        this.delegatedManagementSubnetId = delegatedManagementSubnetId;
        this.externalGossipCertificates = externalGossipCertificates;
        this.externalSeedNodes = externalSeedNodes;
        this.hoursBetweenBackups = hoursBetweenBackups;
        this.initialCassandraAdminPassword = initialCassandraAdminPassword;
        this.prometheusEndpoint = prometheusEndpoint;
        this.provisioningState = provisioningState;
        this.repairEnabled = repairEnabled;
        this.restoreFromBackupId = restoreFromBackupId;
    }

    private ClusterResourcePropertiesArgs() {
        this.authenticationMethod = Input.empty();
        this.cassandraVersion = Input.empty();
        this.clientCertificates = Input.empty();
        this.clusterNameOverride = Input.empty();
        this.delegatedManagementSubnetId = Input.empty();
        this.externalGossipCertificates = Input.empty();
        this.externalSeedNodes = Input.empty();
        this.hoursBetweenBackups = Input.empty();
        this.initialCassandraAdminPassword = Input.empty();
        this.prometheusEndpoint = Input.empty();
        this.provisioningState = Input.empty();
        this.repairEnabled = Input.empty();
        this.restoreFromBackupId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AuthenticationMethod>> authenticationMethod;
        private @Nullable Input<String> cassandraVersion;
        private @Nullable Input<List<CertificateArgs>> clientCertificates;
        private @Nullable Input<String> clusterNameOverride;
        private @Nullable Input<String> delegatedManagementSubnetId;
        private @Nullable Input<List<CertificateArgs>> externalGossipCertificates;
        private @Nullable Input<List<SeedNodeArgs>> externalSeedNodes;
        private @Nullable Input<Integer> hoursBetweenBackups;
        private @Nullable Input<String> initialCassandraAdminPassword;
        private @Nullable Input<SeedNodeArgs> prometheusEndpoint;
        private @Nullable Input<Either<String,ManagedCassandraProvisioningState>> provisioningState;
        private @Nullable Input<Boolean> repairEnabled;
        private @Nullable Input<String> restoreFromBackupId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterResourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationMethod = defaults.authenticationMethod;
    	      this.cassandraVersion = defaults.cassandraVersion;
    	      this.clientCertificates = defaults.clientCertificates;
    	      this.clusterNameOverride = defaults.clusterNameOverride;
    	      this.delegatedManagementSubnetId = defaults.delegatedManagementSubnetId;
    	      this.externalGossipCertificates = defaults.externalGossipCertificates;
    	      this.externalSeedNodes = defaults.externalSeedNodes;
    	      this.hoursBetweenBackups = defaults.hoursBetweenBackups;
    	      this.initialCassandraAdminPassword = defaults.initialCassandraAdminPassword;
    	      this.prometheusEndpoint = defaults.prometheusEndpoint;
    	      this.provisioningState = defaults.provisioningState;
    	      this.repairEnabled = defaults.repairEnabled;
    	      this.restoreFromBackupId = defaults.restoreFromBackupId;
        }

        public Builder setAuthenticationMethod(@Nullable Input<Either<String,AuthenticationMethod>> authenticationMethod) {
            this.authenticationMethod = authenticationMethod;
            return this;
        }

        public Builder setAuthenticationMethod(@Nullable Either<String,AuthenticationMethod> authenticationMethod) {
            this.authenticationMethod = Input.ofNullable(authenticationMethod);
            return this;
        }

        public Builder setCassandraVersion(@Nullable Input<String> cassandraVersion) {
            this.cassandraVersion = cassandraVersion;
            return this;
        }

        public Builder setCassandraVersion(@Nullable String cassandraVersion) {
            this.cassandraVersion = Input.ofNullable(cassandraVersion);
            return this;
        }

        public Builder setClientCertificates(@Nullable Input<List<CertificateArgs>> clientCertificates) {
            this.clientCertificates = clientCertificates;
            return this;
        }

        public Builder setClientCertificates(@Nullable List<CertificateArgs> clientCertificates) {
            this.clientCertificates = Input.ofNullable(clientCertificates);
            return this;
        }

        public Builder setClusterNameOverride(@Nullable Input<String> clusterNameOverride) {
            this.clusterNameOverride = clusterNameOverride;
            return this;
        }

        public Builder setClusterNameOverride(@Nullable String clusterNameOverride) {
            this.clusterNameOverride = Input.ofNullable(clusterNameOverride);
            return this;
        }

        public Builder setDelegatedManagementSubnetId(@Nullable Input<String> delegatedManagementSubnetId) {
            this.delegatedManagementSubnetId = delegatedManagementSubnetId;
            return this;
        }

        public Builder setDelegatedManagementSubnetId(@Nullable String delegatedManagementSubnetId) {
            this.delegatedManagementSubnetId = Input.ofNullable(delegatedManagementSubnetId);
            return this;
        }

        public Builder setExternalGossipCertificates(@Nullable Input<List<CertificateArgs>> externalGossipCertificates) {
            this.externalGossipCertificates = externalGossipCertificates;
            return this;
        }

        public Builder setExternalGossipCertificates(@Nullable List<CertificateArgs> externalGossipCertificates) {
            this.externalGossipCertificates = Input.ofNullable(externalGossipCertificates);
            return this;
        }

        public Builder setExternalSeedNodes(@Nullable Input<List<SeedNodeArgs>> externalSeedNodes) {
            this.externalSeedNodes = externalSeedNodes;
            return this;
        }

        public Builder setExternalSeedNodes(@Nullable List<SeedNodeArgs> externalSeedNodes) {
            this.externalSeedNodes = Input.ofNullable(externalSeedNodes);
            return this;
        }

        public Builder setHoursBetweenBackups(@Nullable Input<Integer> hoursBetweenBackups) {
            this.hoursBetweenBackups = hoursBetweenBackups;
            return this;
        }

        public Builder setHoursBetweenBackups(@Nullable Integer hoursBetweenBackups) {
            this.hoursBetweenBackups = Input.ofNullable(hoursBetweenBackups);
            return this;
        }

        public Builder setInitialCassandraAdminPassword(@Nullable Input<String> initialCassandraAdminPassword) {
            this.initialCassandraAdminPassword = initialCassandraAdminPassword;
            return this;
        }

        public Builder setInitialCassandraAdminPassword(@Nullable String initialCassandraAdminPassword) {
            this.initialCassandraAdminPassword = Input.ofNullable(initialCassandraAdminPassword);
            return this;
        }

        public Builder setPrometheusEndpoint(@Nullable Input<SeedNodeArgs> prometheusEndpoint) {
            this.prometheusEndpoint = prometheusEndpoint;
            return this;
        }

        public Builder setPrometheusEndpoint(@Nullable SeedNodeArgs prometheusEndpoint) {
            this.prometheusEndpoint = Input.ofNullable(prometheusEndpoint);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<Either<String,ManagedCassandraProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable Either<String,ManagedCassandraProvisioningState> provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder setRepairEnabled(@Nullable Input<Boolean> repairEnabled) {
            this.repairEnabled = repairEnabled;
            return this;
        }

        public Builder setRepairEnabled(@Nullable Boolean repairEnabled) {
            this.repairEnabled = Input.ofNullable(repairEnabled);
            return this;
        }

        public Builder setRestoreFromBackupId(@Nullable Input<String> restoreFromBackupId) {
            this.restoreFromBackupId = restoreFromBackupId;
            return this;
        }

        public Builder setRestoreFromBackupId(@Nullable String restoreFromBackupId) {
            this.restoreFromBackupId = Input.ofNullable(restoreFromBackupId);
            return this;
        }

        public ClusterResourcePropertiesArgs build() {
            return new ClusterResourcePropertiesArgs(authenticationMethod, cassandraVersion, clientCertificates, clusterNameOverride, delegatedManagementSubnetId, externalGossipCertificates, externalSeedNodes, hoursBetweenBackups, initialCassandraAdminPassword, prometheusEndpoint, provisioningState, repairEnabled, restoreFromBackupId);
        }
    }
}
