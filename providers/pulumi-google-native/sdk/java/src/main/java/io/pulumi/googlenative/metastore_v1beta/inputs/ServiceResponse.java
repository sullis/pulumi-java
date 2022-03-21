// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.metastore_v1beta.inputs.EncryptionConfigResponse;
import io.pulumi.googlenative.metastore_v1beta.inputs.HiveMetastoreConfigResponse;
import io.pulumi.googlenative.metastore_v1beta.inputs.MaintenanceWindowResponse;
import io.pulumi.googlenative.metastore_v1beta.inputs.MetadataIntegrationResponse;
import io.pulumi.googlenative.metastore_v1beta.inputs.MetadataManagementActivityResponse;
import io.pulumi.googlenative.metastore_v1beta.inputs.NetworkConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A managed metastore service that serves metadata queries.
 * 
 */
public final class ServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceResponse Empty = new ServiceResponse();

    /**
     * A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     * 
     */
    @Import(name="artifactGcsUri", required=true)
      private final String artifactGcsUri;

    public String getArtifactGcsUri() {
        return this.artifactGcsUri;
    }

    /**
     * The time when the metastore service was created.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * Immutable. The database type that the Metastore service stores its data.
     * 
     */
    @Import(name="databaseType", required=true)
      private final String databaseType;

    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
     * 
     */
    @Import(name="encryptionConfig", required=true)
      private final EncryptionConfigResponse encryptionConfig;

    public EncryptionConfigResponse getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * The URI of the endpoint used to access the metastore service.
     * 
     */
    @Import(name="endpointUri", required=true)
      private final String endpointUri;

    public String getEndpointUri() {
        return this.endpointUri;
    }

    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * 
     */
    @Import(name="hiveMetastoreConfig", required=true)
      private final HiveMetastoreConfigResponse hiveMetastoreConfig;

    public HiveMetastoreConfigResponse getHiveMetastoreConfig() {
        return this.hiveMetastoreConfig;
    }

    /**
     * User-defined labels for the metastore service.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
     * 
     */
    @Import(name="maintenanceWindow", required=true)
      private final MaintenanceWindowResponse maintenanceWindow;

    public MaintenanceWindowResponse getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     * 
     */
    @Import(name="metadataIntegration", required=true)
      private final MetadataIntegrationResponse metadataIntegration;

    public MetadataIntegrationResponse getMetadataIntegration() {
        return this.metadataIntegration;
    }

    /**
     * The metadata management activities of the metastore service.
     * 
     */
    @Import(name="metadataManagementActivity", required=true)
      private final MetadataManagementActivityResponse metadataManagementActivity;

    public MetadataManagementActivityResponse getMetadataManagementActivity() {
        return this.metadataManagementActivity;
    }

    /**
     * Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
     * 
     */
    @Import(name="network", required=true)
      private final String network;

    public String getNetwork() {
        return this.network;
    }

    /**
     * Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
     * 
     */
    @Import(name="networkConfig", required=true)
      private final NetworkConfigResponse networkConfig;

    public NetworkConfigResponse getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    @Import(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
     */
    @Import(name="releaseChannel", required=true)
      private final String releaseChannel;

    public String getReleaseChannel() {
        return this.releaseChannel;
    }

    /**
     * The current state of the metastore service.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Additional information about the current state of the metastore service, if available.
     * 
     */
    @Import(name="stateMessage", required=true)
      private final String stateMessage;

    public String getStateMessage() {
        return this.stateMessage;
    }

    /**
     * The tier of the service.
     * 
     */
    @Import(name="tier", required=true)
      private final String tier;

    public String getTier() {
        return this.tier;
    }

    /**
     * The globally unique resource identifier of the metastore service.
     * 
     */
    @Import(name="uid", required=true)
      private final String uid;

    public String getUid() {
        return this.uid;
    }

    /**
     * The time when the metastore service was last updated.
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public ServiceResponse(
        String artifactGcsUri,
        String createTime,
        String databaseType,
        EncryptionConfigResponse encryptionConfig,
        String endpointUri,
        HiveMetastoreConfigResponse hiveMetastoreConfig,
        Map<String,String> labels,
        MaintenanceWindowResponse maintenanceWindow,
        MetadataIntegrationResponse metadataIntegration,
        MetadataManagementActivityResponse metadataManagementActivity,
        String name,
        String network,
        NetworkConfigResponse networkConfig,
        Integer port,
        String releaseChannel,
        String state,
        String stateMessage,
        String tier,
        String uid,
        String updateTime) {
        this.artifactGcsUri = Objects.requireNonNull(artifactGcsUri, "expected parameter 'artifactGcsUri' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.databaseType = Objects.requireNonNull(databaseType, "expected parameter 'databaseType' to be non-null");
        this.encryptionConfig = Objects.requireNonNull(encryptionConfig, "expected parameter 'encryptionConfig' to be non-null");
        this.endpointUri = Objects.requireNonNull(endpointUri, "expected parameter 'endpointUri' to be non-null");
        this.hiveMetastoreConfig = Objects.requireNonNull(hiveMetastoreConfig, "expected parameter 'hiveMetastoreConfig' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow, "expected parameter 'maintenanceWindow' to be non-null");
        this.metadataIntegration = Objects.requireNonNull(metadataIntegration, "expected parameter 'metadataIntegration' to be non-null");
        this.metadataManagementActivity = Objects.requireNonNull(metadataManagementActivity, "expected parameter 'metadataManagementActivity' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.networkConfig = Objects.requireNonNull(networkConfig, "expected parameter 'networkConfig' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.releaseChannel = Objects.requireNonNull(releaseChannel, "expected parameter 'releaseChannel' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.stateMessage = Objects.requireNonNull(stateMessage, "expected parameter 'stateMessage' to be non-null");
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private ServiceResponse() {
        this.artifactGcsUri = null;
        this.createTime = null;
        this.databaseType = null;
        this.encryptionConfig = null;
        this.endpointUri = null;
        this.hiveMetastoreConfig = null;
        this.labels = Map.of();
        this.maintenanceWindow = null;
        this.metadataIntegration = null;
        this.metadataManagementActivity = null;
        this.name = null;
        this.network = null;
        this.networkConfig = null;
        this.port = null;
        this.releaseChannel = null;
        this.state = null;
        this.stateMessage = null;
        this.tier = null;
        this.uid = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactGcsUri;
        private String createTime;
        private String databaseType;
        private EncryptionConfigResponse encryptionConfig;
        private String endpointUri;
        private HiveMetastoreConfigResponse hiveMetastoreConfig;
        private Map<String,String> labels;
        private MaintenanceWindowResponse maintenanceWindow;
        private MetadataIntegrationResponse metadataIntegration;
        private MetadataManagementActivityResponse metadataManagementActivity;
        private String name;
        private String network;
        private NetworkConfigResponse networkConfig;
        private Integer port;
        private String releaseChannel;
        private String state;
        private String stateMessage;
        private String tier;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactGcsUri = defaults.artifactGcsUri;
    	      this.createTime = defaults.createTime;
    	      this.databaseType = defaults.databaseType;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpointUri = defaults.endpointUri;
    	      this.hiveMetastoreConfig = defaults.hiveMetastoreConfig;
    	      this.labels = defaults.labels;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.metadataIntegration = defaults.metadataIntegration;
    	      this.metadataManagementActivity = defaults.metadataManagementActivity;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkConfig = defaults.networkConfig;
    	      this.port = defaults.port;
    	      this.releaseChannel = defaults.releaseChannel;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.tier = defaults.tier;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder artifactGcsUri(String artifactGcsUri) {
            this.artifactGcsUri = Objects.requireNonNull(artifactGcsUri);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder databaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }
        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }
        public Builder endpointUri(String endpointUri) {
            this.endpointUri = Objects.requireNonNull(endpointUri);
            return this;
        }
        public Builder hiveMetastoreConfig(HiveMetastoreConfigResponse hiveMetastoreConfig) {
            this.hiveMetastoreConfig = Objects.requireNonNull(hiveMetastoreConfig);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder maintenanceWindow(MaintenanceWindowResponse maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        public Builder metadataIntegration(MetadataIntegrationResponse metadataIntegration) {
            this.metadataIntegration = Objects.requireNonNull(metadataIntegration);
            return this;
        }
        public Builder metadataManagementActivity(MetadataManagementActivityResponse metadataManagementActivity) {
            this.metadataManagementActivity = Objects.requireNonNull(metadataManagementActivity);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder networkConfig(NetworkConfigResponse networkConfig) {
            this.networkConfig = Objects.requireNonNull(networkConfig);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder releaseChannel(String releaseChannel) {
            this.releaseChannel = Objects.requireNonNull(releaseChannel);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public ServiceResponse build() {
            return new ServiceResponse(artifactGcsUri, createTime, databaseType, encryptionConfig, endpointUri, hiveMetastoreConfig, labels, maintenanceWindow, metadataIntegration, metadataManagementActivity, name, network, networkConfig, port, releaseChannel, state, stateMessage, tier, uid, updateTime);
        }
    }
}
