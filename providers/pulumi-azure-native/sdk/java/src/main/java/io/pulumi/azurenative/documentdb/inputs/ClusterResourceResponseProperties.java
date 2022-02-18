// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.CertificateResponse;
import io.pulumi.azurenative.documentdb.inputs.SeedNodeResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a managed Cassandra cluster.
 * 
 */
public final class ClusterResourceResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final ClusterResourceResponseProperties Empty = new ClusterResourceResponseProperties();

    /**
     * Which authentication method Cassandra should use to authenticate clients. 'None' turns off authentication, so should not be used except in emergencies. 'Cassandra' is the default password based authentication. The default is 'Cassandra'.
     * 
     */
    @InputImport(name="authenticationMethod")
    private final @Nullable String authenticationMethod;

    public Optional<String> getAuthenticationMethod() {
        return this.authenticationMethod == null ? Optional.empty() : Optional.ofNullable(this.authenticationMethod);
    }

    /**
     * Which version of Cassandra should this cluster converge to running (e.g., 3.11). When updated, the cluster may take some time to migrate to the new version.
     * 
     */
    @InputImport(name="cassandraVersion")
    private final @Nullable String cassandraVersion;

    public Optional<String> getCassandraVersion() {
        return this.cassandraVersion == null ? Optional.empty() : Optional.ofNullable(this.cassandraVersion);
    }

    /**
     * List of TLS certificates used to authorize clients connecting to the cluster. All connections are TLS encrypted whether clientCertificates is set or not, but if clientCertificates is set, the managed Cassandra cluster will reject all connections not bearing a TLS client certificate that can be validated from one or more of the public certificates in this property.
     * 
     */
    @InputImport(name="clientCertificates")
    private final @Nullable List<CertificateResponse> clientCertificates;

    public List<CertificateResponse> getClientCertificates() {
        return this.clientCertificates == null ? List.of() : this.clientCertificates;
    }

    /**
     * If you need to set the clusterName property in cassandra.yaml to something besides the resource name of the cluster, set the value to use on this property.
     * 
     */
    @InputImport(name="clusterNameOverride")
    private final @Nullable String clusterNameOverride;

    public Optional<String> getClusterNameOverride() {
        return this.clusterNameOverride == null ? Optional.empty() : Optional.ofNullable(this.clusterNameOverride);
    }

    /**
     * Resource id of a subnet that this cluster's management service should have its network interface attached to. The subnet must be routable to all subnets that will be delegated to data centers. The resource id must be of the form '/subscriptions/<subscription id>/resourceGroups/<resource group>/providers/Microsoft.Network/virtualNetworks/<virtual network>/subnets/<subnet>'
     * 
     */
    @InputImport(name="delegatedManagementSubnetId")
    private final @Nullable String delegatedManagementSubnetId;

    public Optional<String> getDelegatedManagementSubnetId() {
        return this.delegatedManagementSubnetId == null ? Optional.empty() : Optional.ofNullable(this.delegatedManagementSubnetId);
    }

    /**
     * List of TLS certificates used to authorize gossip from unmanaged data centers. The TLS certificates of all nodes in unmanaged data centers must be verifiable using one of the certificates provided in this property.
     * 
     */
    @InputImport(name="externalGossipCertificates")
    private final @Nullable List<CertificateResponse> externalGossipCertificates;

    public List<CertificateResponse> getExternalGossipCertificates() {
        return this.externalGossipCertificates == null ? List.of() : this.externalGossipCertificates;
    }

    /**
     * List of IP addresses of seed nodes in unmanaged data centers. These will be added to the seed node lists of all managed nodes.
     * 
     */
    @InputImport(name="externalSeedNodes")
    private final @Nullable List<SeedNodeResponse> externalSeedNodes;

    public List<SeedNodeResponse> getExternalSeedNodes() {
        return this.externalSeedNodes == null ? List.of() : this.externalSeedNodes;
    }

    /**
     * List of TLS certificates that unmanaged nodes must trust for gossip with managed nodes. All managed nodes will present TLS client certificates that are verifiable using one of the certificates provided in this property.
     * 
     */
    @InputImport(name="gossipCertificates", required=true)
    private final List<CertificateResponse> gossipCertificates;

    public List<CertificateResponse> getGossipCertificates() {
        return this.gossipCertificates;
    }

    /**
     * Number of hours to wait between taking a backup of the cluster. To disable backups, set this property to 0.
     * 
     */
    @InputImport(name="hoursBetweenBackups")
    private final @Nullable Integer hoursBetweenBackups;

    public Optional<Integer> getHoursBetweenBackups() {
        return this.hoursBetweenBackups == null ? Optional.empty() : Optional.ofNullable(this.hoursBetweenBackups);
    }

    /**
     * Hostname or IP address where the Prometheus endpoint containing data about the managed Cassandra nodes can be reached.
     * 
     */
    @InputImport(name="prometheusEndpoint")
    private final @Nullable SeedNodeResponse prometheusEndpoint;

    public Optional<SeedNodeResponse> getPrometheusEndpoint() {
        return this.prometheusEndpoint == null ? Optional.empty() : Optional.ofNullable(this.prometheusEndpoint);
    }

    /**
     * The status of the resource at the time the operation was called.
     * 
     */
    @InputImport(name="provisioningState")
    private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * Should automatic repairs run on this cluster? If omitted, this is true, and should stay true unless you are running a hybrid cluster where you are already doing your own repairs.
     * 
     */
    @InputImport(name="repairEnabled")
    private final @Nullable Boolean repairEnabled;

    public Optional<Boolean> getRepairEnabled() {
        return this.repairEnabled == null ? Optional.empty() : Optional.ofNullable(this.repairEnabled);
    }

    /**
     * List of IP addresses of seed nodes in the managed data centers. These should be added to the seed node lists of all unmanaged nodes.
     * 
     */
    @InputImport(name="seedNodes", required=true)
    private final List<SeedNodeResponse> seedNodes;

    public List<SeedNodeResponse> getSeedNodes() {
        return this.seedNodes;
    }

    public ClusterResourceResponseProperties(
        @Nullable String authenticationMethod,
        @Nullable String cassandraVersion,
        @Nullable List<CertificateResponse> clientCertificates,
        @Nullable String clusterNameOverride,
        @Nullable String delegatedManagementSubnetId,
        @Nullable List<CertificateResponse> externalGossipCertificates,
        @Nullable List<SeedNodeResponse> externalSeedNodes,
        List<CertificateResponse> gossipCertificates,
        @Nullable Integer hoursBetweenBackups,
        @Nullable SeedNodeResponse prometheusEndpoint,
        @Nullable String provisioningState,
        @Nullable Boolean repairEnabled,
        List<SeedNodeResponse> seedNodes) {
        this.authenticationMethod = authenticationMethod;
        this.cassandraVersion = cassandraVersion;
        this.clientCertificates = clientCertificates;
        this.clusterNameOverride = clusterNameOverride;
        this.delegatedManagementSubnetId = delegatedManagementSubnetId;
        this.externalGossipCertificates = externalGossipCertificates;
        this.externalSeedNodes = externalSeedNodes;
        this.gossipCertificates = Objects.requireNonNull(gossipCertificates, "expected parameter 'gossipCertificates' to be non-null");
        this.hoursBetweenBackups = hoursBetweenBackups;
        this.prometheusEndpoint = prometheusEndpoint;
        this.provisioningState = provisioningState;
        this.repairEnabled = repairEnabled;
        this.seedNodes = Objects.requireNonNull(seedNodes, "expected parameter 'seedNodes' to be non-null");
    }

    private ClusterResourceResponseProperties() {
        this.authenticationMethod = null;
        this.cassandraVersion = null;
        this.clientCertificates = List.of();
        this.clusterNameOverride = null;
        this.delegatedManagementSubnetId = null;
        this.externalGossipCertificates = List.of();
        this.externalSeedNodes = List.of();
        this.gossipCertificates = List.of();
        this.hoursBetweenBackups = null;
        this.prometheusEndpoint = null;
        this.provisioningState = null;
        this.repairEnabled = null;
        this.seedNodes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterResourceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationMethod;
        private @Nullable String cassandraVersion;
        private @Nullable List<CertificateResponse> clientCertificates;
        private @Nullable String clusterNameOverride;
        private @Nullable String delegatedManagementSubnetId;
        private @Nullable List<CertificateResponse> externalGossipCertificates;
        private @Nullable List<SeedNodeResponse> externalSeedNodes;
        private List<CertificateResponse> gossipCertificates;
        private @Nullable Integer hoursBetweenBackups;
        private @Nullable SeedNodeResponse prometheusEndpoint;
        private @Nullable String provisioningState;
        private @Nullable Boolean repairEnabled;
        private List<SeedNodeResponse> seedNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterResourceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationMethod = defaults.authenticationMethod;
    	      this.cassandraVersion = defaults.cassandraVersion;
    	      this.clientCertificates = defaults.clientCertificates;
    	      this.clusterNameOverride = defaults.clusterNameOverride;
    	      this.delegatedManagementSubnetId = defaults.delegatedManagementSubnetId;
    	      this.externalGossipCertificates = defaults.externalGossipCertificates;
    	      this.externalSeedNodes = defaults.externalSeedNodes;
    	      this.gossipCertificates = defaults.gossipCertificates;
    	      this.hoursBetweenBackups = defaults.hoursBetweenBackups;
    	      this.prometheusEndpoint = defaults.prometheusEndpoint;
    	      this.provisioningState = defaults.provisioningState;
    	      this.repairEnabled = defaults.repairEnabled;
    	      this.seedNodes = defaults.seedNodes;
        }

        public Builder setAuthenticationMethod(@Nullable String authenticationMethod) {
            this.authenticationMethod = authenticationMethod;
            return this;
        }

        public Builder setCassandraVersion(@Nullable String cassandraVersion) {
            this.cassandraVersion = cassandraVersion;
            return this;
        }

        public Builder setClientCertificates(@Nullable List<CertificateResponse> clientCertificates) {
            this.clientCertificates = clientCertificates;
            return this;
        }

        public Builder setClusterNameOverride(@Nullable String clusterNameOverride) {
            this.clusterNameOverride = clusterNameOverride;
            return this;
        }

        public Builder setDelegatedManagementSubnetId(@Nullable String delegatedManagementSubnetId) {
            this.delegatedManagementSubnetId = delegatedManagementSubnetId;
            return this;
        }

        public Builder setExternalGossipCertificates(@Nullable List<CertificateResponse> externalGossipCertificates) {
            this.externalGossipCertificates = externalGossipCertificates;
            return this;
        }

        public Builder setExternalSeedNodes(@Nullable List<SeedNodeResponse> externalSeedNodes) {
            this.externalSeedNodes = externalSeedNodes;
            return this;
        }

        public Builder setGossipCertificates(List<CertificateResponse> gossipCertificates) {
            this.gossipCertificates = Objects.requireNonNull(gossipCertificates);
            return this;
        }

        public Builder setHoursBetweenBackups(@Nullable Integer hoursBetweenBackups) {
            this.hoursBetweenBackups = hoursBetweenBackups;
            return this;
        }

        public Builder setPrometheusEndpoint(@Nullable SeedNodeResponse prometheusEndpoint) {
            this.prometheusEndpoint = prometheusEndpoint;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setRepairEnabled(@Nullable Boolean repairEnabled) {
            this.repairEnabled = repairEnabled;
            return this;
        }

        public Builder setSeedNodes(List<SeedNodeResponse> seedNodes) {
            this.seedNodes = Objects.requireNonNull(seedNodes);
            return this;
        }

        public ClusterResourceResponseProperties build() {
            return new ClusterResourceResponseProperties(authenticationMethod, cassandraVersion, clientCertificates, clusterNameOverride, delegatedManagementSubnetId, externalGossipCertificates, externalSeedNodes, gossipCertificates, hoursBetweenBackups, prometheusEndpoint, provisioningState, repairEnabled, seedNodes);
        }
    }
}
