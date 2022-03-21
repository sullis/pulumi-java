// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.enums.OSType;
import io.pulumi.azurenative.hdinsight.enums.Tier;
import io.pulumi.azurenative.hdinsight.inputs.ClusterDefinitionArgs;
import io.pulumi.azurenative.hdinsight.inputs.ComputeIsolationPropertiesArgs;
import io.pulumi.azurenative.hdinsight.inputs.ComputeProfileArgs;
import io.pulumi.azurenative.hdinsight.inputs.DiskEncryptionPropertiesArgs;
import io.pulumi.azurenative.hdinsight.inputs.EncryptionInTransitPropertiesArgs;
import io.pulumi.azurenative.hdinsight.inputs.KafkaRestPropertiesArgs;
import io.pulumi.azurenative.hdinsight.inputs.NetworkPropertiesArgs;
import io.pulumi.azurenative.hdinsight.inputs.SecurityProfileArgs;
import io.pulumi.azurenative.hdinsight.inputs.StorageProfileArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The cluster create parameters.
 * 
 */
public final class ClusterCreatePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCreatePropertiesArgs Empty = new ClusterCreatePropertiesArgs();

    /**
     * The cluster definition.
     * 
     */
    @Import(name="clusterDefinition")
      private final @Nullable Output<ClusterDefinitionArgs> clusterDefinition;

    public Output<ClusterDefinitionArgs> getClusterDefinition() {
        return this.clusterDefinition == null ? Output.empty() : this.clusterDefinition;
    }

    /**
     * The version of the cluster.
     * 
     */
    @Import(name="clusterVersion")
      private final @Nullable Output<String> clusterVersion;

    public Output<String> getClusterVersion() {
        return this.clusterVersion == null ? Output.empty() : this.clusterVersion;
    }

    /**
     * The compute isolation properties.
     * 
     */
    @Import(name="computeIsolationProperties")
      private final @Nullable Output<ComputeIsolationPropertiesArgs> computeIsolationProperties;

    public Output<ComputeIsolationPropertiesArgs> getComputeIsolationProperties() {
        return this.computeIsolationProperties == null ? Output.empty() : this.computeIsolationProperties;
    }

    /**
     * The compute profile.
     * 
     */
    @Import(name="computeProfile")
      private final @Nullable Output<ComputeProfileArgs> computeProfile;

    public Output<ComputeProfileArgs> getComputeProfile() {
        return this.computeProfile == null ? Output.empty() : this.computeProfile;
    }

    /**
     * The disk encryption properties.
     * 
     */
    @Import(name="diskEncryptionProperties")
      private final @Nullable Output<DiskEncryptionPropertiesArgs> diskEncryptionProperties;

    public Output<DiskEncryptionPropertiesArgs> getDiskEncryptionProperties() {
        return this.diskEncryptionProperties == null ? Output.empty() : this.diskEncryptionProperties;
    }

    /**
     * The encryption-in-transit properties.
     * 
     */
    @Import(name="encryptionInTransitProperties")
      private final @Nullable Output<EncryptionInTransitPropertiesArgs> encryptionInTransitProperties;

    public Output<EncryptionInTransitPropertiesArgs> getEncryptionInTransitProperties() {
        return this.encryptionInTransitProperties == null ? Output.empty() : this.encryptionInTransitProperties;
    }

    /**
     * The cluster kafka rest proxy configuration.
     * 
     */
    @Import(name="kafkaRestProperties")
      private final @Nullable Output<KafkaRestPropertiesArgs> kafkaRestProperties;

    public Output<KafkaRestPropertiesArgs> getKafkaRestProperties() {
        return this.kafkaRestProperties == null ? Output.empty() : this.kafkaRestProperties;
    }

    /**
     * The minimal supported tls version.
     * 
     */
    @Import(name="minSupportedTlsVersion")
      private final @Nullable Output<String> minSupportedTlsVersion;

    public Output<String> getMinSupportedTlsVersion() {
        return this.minSupportedTlsVersion == null ? Output.empty() : this.minSupportedTlsVersion;
    }

    /**
     * The network properties.
     * 
     */
    @Import(name="networkProperties")
      private final @Nullable Output<NetworkPropertiesArgs> networkProperties;

    public Output<NetworkPropertiesArgs> getNetworkProperties() {
        return this.networkProperties == null ? Output.empty() : this.networkProperties;
    }

    /**
     * The type of operating system.
     * 
     */
    @Import(name="osType")
      private final @Nullable Output<OSType> osType;

    public Output<OSType> getOsType() {
        return this.osType == null ? Output.empty() : this.osType;
    }

    /**
     * The security profile.
     * 
     */
    @Import(name="securityProfile")
      private final @Nullable Output<SecurityProfileArgs> securityProfile;

    public Output<SecurityProfileArgs> getSecurityProfile() {
        return this.securityProfile == null ? Output.empty() : this.securityProfile;
    }

    /**
     * The storage profile.
     * 
     */
    @Import(name="storageProfile")
      private final @Nullable Output<StorageProfileArgs> storageProfile;

    public Output<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile == null ? Output.empty() : this.storageProfile;
    }

    /**
     * The cluster tier.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Tier> tier;

    public Output<Tier> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    public ClusterCreatePropertiesArgs(
        @Nullable Output<ClusterDefinitionArgs> clusterDefinition,
        @Nullable Output<String> clusterVersion,
        @Nullable Output<ComputeIsolationPropertiesArgs> computeIsolationProperties,
        @Nullable Output<ComputeProfileArgs> computeProfile,
        @Nullable Output<DiskEncryptionPropertiesArgs> diskEncryptionProperties,
        @Nullable Output<EncryptionInTransitPropertiesArgs> encryptionInTransitProperties,
        @Nullable Output<KafkaRestPropertiesArgs> kafkaRestProperties,
        @Nullable Output<String> minSupportedTlsVersion,
        @Nullable Output<NetworkPropertiesArgs> networkProperties,
        @Nullable Output<OSType> osType,
        @Nullable Output<SecurityProfileArgs> securityProfile,
        @Nullable Output<StorageProfileArgs> storageProfile,
        @Nullable Output<Tier> tier) {
        this.clusterDefinition = clusterDefinition;
        this.clusterVersion = clusterVersion;
        this.computeIsolationProperties = computeIsolationProperties;
        this.computeProfile = computeProfile;
        this.diskEncryptionProperties = diskEncryptionProperties;
        this.encryptionInTransitProperties = encryptionInTransitProperties;
        this.kafkaRestProperties = kafkaRestProperties;
        this.minSupportedTlsVersion = minSupportedTlsVersion;
        this.networkProperties = networkProperties;
        this.osType = osType;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.tier = tier == null ? Output.ofNullable(io.pulumi.azurenative.hdinsight.enums.Tier.Standard) : tier;
    }

    private ClusterCreatePropertiesArgs() {
        this.clusterDefinition = Output.empty();
        this.clusterVersion = Output.empty();
        this.computeIsolationProperties = Output.empty();
        this.computeProfile = Output.empty();
        this.diskEncryptionProperties = Output.empty();
        this.encryptionInTransitProperties = Output.empty();
        this.kafkaRestProperties = Output.empty();
        this.minSupportedTlsVersion = Output.empty();
        this.networkProperties = Output.empty();
        this.osType = Output.empty();
        this.securityProfile = Output.empty();
        this.storageProfile = Output.empty();
        this.tier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCreatePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterDefinitionArgs> clusterDefinition;
        private @Nullable Output<String> clusterVersion;
        private @Nullable Output<ComputeIsolationPropertiesArgs> computeIsolationProperties;
        private @Nullable Output<ComputeProfileArgs> computeProfile;
        private @Nullable Output<DiskEncryptionPropertiesArgs> diskEncryptionProperties;
        private @Nullable Output<EncryptionInTransitPropertiesArgs> encryptionInTransitProperties;
        private @Nullable Output<KafkaRestPropertiesArgs> kafkaRestProperties;
        private @Nullable Output<String> minSupportedTlsVersion;
        private @Nullable Output<NetworkPropertiesArgs> networkProperties;
        private @Nullable Output<OSType> osType;
        private @Nullable Output<SecurityProfileArgs> securityProfile;
        private @Nullable Output<StorageProfileArgs> storageProfile;
        private @Nullable Output<Tier> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCreatePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDefinition = defaults.clusterDefinition;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.computeIsolationProperties = defaults.computeIsolationProperties;
    	      this.computeProfile = defaults.computeProfile;
    	      this.diskEncryptionProperties = defaults.diskEncryptionProperties;
    	      this.encryptionInTransitProperties = defaults.encryptionInTransitProperties;
    	      this.kafkaRestProperties = defaults.kafkaRestProperties;
    	      this.minSupportedTlsVersion = defaults.minSupportedTlsVersion;
    	      this.networkProperties = defaults.networkProperties;
    	      this.osType = defaults.osType;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tier = defaults.tier;
        }

        public Builder clusterDefinition(@Nullable Output<ClusterDefinitionArgs> clusterDefinition) {
            this.clusterDefinition = clusterDefinition;
            return this;
        }
        public Builder clusterDefinition(@Nullable ClusterDefinitionArgs clusterDefinition) {
            this.clusterDefinition = Output.ofNullable(clusterDefinition);
            return this;
        }
        public Builder clusterVersion(@Nullable Output<String> clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }
        public Builder clusterVersion(@Nullable String clusterVersion) {
            this.clusterVersion = Output.ofNullable(clusterVersion);
            return this;
        }
        public Builder computeIsolationProperties(@Nullable Output<ComputeIsolationPropertiesArgs> computeIsolationProperties) {
            this.computeIsolationProperties = computeIsolationProperties;
            return this;
        }
        public Builder computeIsolationProperties(@Nullable ComputeIsolationPropertiesArgs computeIsolationProperties) {
            this.computeIsolationProperties = Output.ofNullable(computeIsolationProperties);
            return this;
        }
        public Builder computeProfile(@Nullable Output<ComputeProfileArgs> computeProfile) {
            this.computeProfile = computeProfile;
            return this;
        }
        public Builder computeProfile(@Nullable ComputeProfileArgs computeProfile) {
            this.computeProfile = Output.ofNullable(computeProfile);
            return this;
        }
        public Builder diskEncryptionProperties(@Nullable Output<DiskEncryptionPropertiesArgs> diskEncryptionProperties) {
            this.diskEncryptionProperties = diskEncryptionProperties;
            return this;
        }
        public Builder diskEncryptionProperties(@Nullable DiskEncryptionPropertiesArgs diskEncryptionProperties) {
            this.diskEncryptionProperties = Output.ofNullable(diskEncryptionProperties);
            return this;
        }
        public Builder encryptionInTransitProperties(@Nullable Output<EncryptionInTransitPropertiesArgs> encryptionInTransitProperties) {
            this.encryptionInTransitProperties = encryptionInTransitProperties;
            return this;
        }
        public Builder encryptionInTransitProperties(@Nullable EncryptionInTransitPropertiesArgs encryptionInTransitProperties) {
            this.encryptionInTransitProperties = Output.ofNullable(encryptionInTransitProperties);
            return this;
        }
        public Builder kafkaRestProperties(@Nullable Output<KafkaRestPropertiesArgs> kafkaRestProperties) {
            this.kafkaRestProperties = kafkaRestProperties;
            return this;
        }
        public Builder kafkaRestProperties(@Nullable KafkaRestPropertiesArgs kafkaRestProperties) {
            this.kafkaRestProperties = Output.ofNullable(kafkaRestProperties);
            return this;
        }
        public Builder minSupportedTlsVersion(@Nullable Output<String> minSupportedTlsVersion) {
            this.minSupportedTlsVersion = minSupportedTlsVersion;
            return this;
        }
        public Builder minSupportedTlsVersion(@Nullable String minSupportedTlsVersion) {
            this.minSupportedTlsVersion = Output.ofNullable(minSupportedTlsVersion);
            return this;
        }
        public Builder networkProperties(@Nullable Output<NetworkPropertiesArgs> networkProperties) {
            this.networkProperties = networkProperties;
            return this;
        }
        public Builder networkProperties(@Nullable NetworkPropertiesArgs networkProperties) {
            this.networkProperties = Output.ofNullable(networkProperties);
            return this;
        }
        public Builder osType(@Nullable Output<OSType> osType) {
            this.osType = osType;
            return this;
        }
        public Builder osType(@Nullable OSType osType) {
            this.osType = Output.ofNullable(osType);
            return this;
        }
        public Builder securityProfile(@Nullable Output<SecurityProfileArgs> securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }
        public Builder securityProfile(@Nullable SecurityProfileArgs securityProfile) {
            this.securityProfile = Output.ofNullable(securityProfile);
            return this;
        }
        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }
        public Builder storageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Output.ofNullable(storageProfile);
            return this;
        }
        public Builder tier(@Nullable Output<Tier> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Tier tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }        public ClusterCreatePropertiesArgs build() {
            return new ClusterCreatePropertiesArgs(clusterDefinition, clusterVersion, computeIsolationProperties, computeProfile, diskEncryptionProperties, encryptionInTransitProperties, kafkaRestProperties, minSupportedTlsVersion, networkProperties, osType, securityProfile, storageProfile, tier);
        }
    }
}
