// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.outputs;

import com.pulumi.azurenative.netapp.outputs.MountTargetPropertiesResponse;
import com.pulumi.azurenative.netapp.outputs.VolumePropertiesResponseDataProtection;
import com.pulumi.azurenative.netapp.outputs.VolumePropertiesResponseExportPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVolumeResult {
    /**
     * @return UUID v4 or resource identifier used to identify the Backup.
     * 
     */
    private final @Nullable String backupId;
    /**
     * @return Unique Baremetal Tenant Identifier.
     * 
     */
    private final String baremetalTenantId;
    /**
     * @return A unique file path for the volume. Used when creating mount targets
     * 
     */
    private final String creationToken;
    /**
     * @return DataProtection type volumes include an object containing details of the replication
     * 
     */
    private final @Nullable VolumePropertiesResponseDataProtection dataProtection;
    /**
     * @return Encryption Key Source. Possible values are: &#39;Microsoft.NetApp&#39;
     * 
     */
    private final @Nullable String encryptionKeySource;
    /**
     * @return Set of export policy rules
     * 
     */
    private final @Nullable VolumePropertiesResponseExportPolicy exportPolicy;
    /**
     * @return Unique FileSystem Identifier.
     * 
     */
    private final String fileSystemId;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Restoring
     * 
     */
    private final @Nullable Boolean isRestoring;
    /**
     * @return Describe if a volume is KerberosEnabled. To be use with swagger version 2020-05-01 or later
     * 
     */
    private final @Nullable Boolean kerberosEnabled;
    /**
     * @return Specifies whether LDAP is enabled or not for a given NFS volume.
     * 
     */
    private final @Nullable Boolean ldapEnabled;
    /**
     * @return Resource location
     * 
     */
    private final String location;
    /**
     * @return List of mount targets
     * 
     */
    private final List<MountTargetPropertiesResponse> mountTargets;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Set of protocol types, default NFSv3, CIFS for SMB protocol
     * 
     */
    private final @Nullable List<String> protocolTypes;
    /**
     * @return Azure lifecycle management
     * 
     */
    private final String provisioningState;
    /**
     * @return The security style of volume, default unix, defaults to ntfs for dual protocol or CIFS protocol
     * 
     */
    private final @Nullable String securityStyle;
    /**
     * @return The service level of the file system
     * 
     */
    private final @Nullable String serviceLevel;
    /**
     * @return Enables continuously available share property for smb volume. Only applicable for SMB volume
     * 
     */
    private final @Nullable Boolean smbContinuouslyAvailable;
    /**
     * @return Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol volume. To be used with swagger version 2020-08-01 or later
     * 
     */
    private final @Nullable Boolean smbEncryption;
    /**
     * @return If enabled (true) the volume will contain a read-only snapshot directory which provides access to each of the volume&#39;s snapshots (default to true).
     * 
     */
    private final @Nullable Boolean snapshotDirectoryVisible;
    /**
     * @return UUID v4 or resource identifier used to identify the Snapshot.
     * 
     */
    private final @Nullable String snapshotId;
    /**
     * @return The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes
     * 
     */
    private final String subnetId;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    private final @Nullable Double throughputMibps;
    /**
     * @return Resource type
     * 
     */
    private final String type;
    /**
     * @return Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     * 
     */
    private final Double usageThreshold;
    /**
     * @return What type of volume is this
     * 
     */
    private final @Nullable String volumeType;

    @CustomType.Constructor
    private GetVolumeResult(
        @CustomType.Parameter("backupId") @Nullable String backupId,
        @CustomType.Parameter("baremetalTenantId") String baremetalTenantId,
        @CustomType.Parameter("creationToken") String creationToken,
        @CustomType.Parameter("dataProtection") @Nullable VolumePropertiesResponseDataProtection dataProtection,
        @CustomType.Parameter("encryptionKeySource") @Nullable String encryptionKeySource,
        @CustomType.Parameter("exportPolicy") @Nullable VolumePropertiesResponseExportPolicy exportPolicy,
        @CustomType.Parameter("fileSystemId") String fileSystemId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isRestoring") @Nullable Boolean isRestoring,
        @CustomType.Parameter("kerberosEnabled") @Nullable Boolean kerberosEnabled,
        @CustomType.Parameter("ldapEnabled") @Nullable Boolean ldapEnabled,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("mountTargets") List<MountTargetPropertiesResponse> mountTargets,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protocolTypes") @Nullable List<String> protocolTypes,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("securityStyle") @Nullable String securityStyle,
        @CustomType.Parameter("serviceLevel") @Nullable String serviceLevel,
        @CustomType.Parameter("smbContinuouslyAvailable") @Nullable Boolean smbContinuouslyAvailable,
        @CustomType.Parameter("smbEncryption") @Nullable Boolean smbEncryption,
        @CustomType.Parameter("snapshotDirectoryVisible") @Nullable Boolean snapshotDirectoryVisible,
        @CustomType.Parameter("snapshotId") @Nullable String snapshotId,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("throughputMibps") @Nullable Double throughputMibps,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("usageThreshold") Double usageThreshold,
        @CustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.backupId = backupId;
        this.baremetalTenantId = baremetalTenantId;
        this.creationToken = creationToken;
        this.dataProtection = dataProtection;
        this.encryptionKeySource = encryptionKeySource;
        this.exportPolicy = exportPolicy;
        this.fileSystemId = fileSystemId;
        this.id = id;
        this.isRestoring = isRestoring;
        this.kerberosEnabled = kerberosEnabled;
        this.ldapEnabled = ldapEnabled;
        this.location = location;
        this.mountTargets = mountTargets;
        this.name = name;
        this.protocolTypes = protocolTypes;
        this.provisioningState = provisioningState;
        this.securityStyle = securityStyle;
        this.serviceLevel = serviceLevel;
        this.smbContinuouslyAvailable = smbContinuouslyAvailable;
        this.smbEncryption = smbEncryption;
        this.snapshotDirectoryVisible = snapshotDirectoryVisible;
        this.snapshotId = snapshotId;
        this.subnetId = subnetId;
        this.tags = tags;
        this.throughputMibps = throughputMibps;
        this.type = type;
        this.usageThreshold = usageThreshold;
        this.volumeType = volumeType;
    }

    /**
     * @return UUID v4 or resource identifier used to identify the Backup.
     * 
     */
    public Optional<String> backupId() {
        return Optional.ofNullable(this.backupId);
    }
    /**
     * @return Unique Baremetal Tenant Identifier.
     * 
     */
    public String baremetalTenantId() {
        return this.baremetalTenantId;
    }
    /**
     * @return A unique file path for the volume. Used when creating mount targets
     * 
     */
    public String creationToken() {
        return this.creationToken;
    }
    /**
     * @return DataProtection type volumes include an object containing details of the replication
     * 
     */
    public Optional<VolumePropertiesResponseDataProtection> dataProtection() {
        return Optional.ofNullable(this.dataProtection);
    }
    /**
     * @return Encryption Key Source. Possible values are: &#39;Microsoft.NetApp&#39;
     * 
     */
    public Optional<String> encryptionKeySource() {
        return Optional.ofNullable(this.encryptionKeySource);
    }
    /**
     * @return Set of export policy rules
     * 
     */
    public Optional<VolumePropertiesResponseExportPolicy> exportPolicy() {
        return Optional.ofNullable(this.exportPolicy);
    }
    /**
     * @return Unique FileSystem Identifier.
     * 
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Restoring
     * 
     */
    public Optional<Boolean> isRestoring() {
        return Optional.ofNullable(this.isRestoring);
    }
    /**
     * @return Describe if a volume is KerberosEnabled. To be use with swagger version 2020-05-01 or later
     * 
     */
    public Optional<Boolean> kerberosEnabled() {
        return Optional.ofNullable(this.kerberosEnabled);
    }
    /**
     * @return Specifies whether LDAP is enabled or not for a given NFS volume.
     * 
     */
    public Optional<Boolean> ldapEnabled() {
        return Optional.ofNullable(this.ldapEnabled);
    }
    /**
     * @return Resource location
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return List of mount targets
     * 
     */
    public List<MountTargetPropertiesResponse> mountTargets() {
        return this.mountTargets;
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Set of protocol types, default NFSv3, CIFS for SMB protocol
     * 
     */
    public List<String> protocolTypes() {
        return this.protocolTypes == null ? List.of() : this.protocolTypes;
    }
    /**
     * @return Azure lifecycle management
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The security style of volume, default unix, defaults to ntfs for dual protocol or CIFS protocol
     * 
     */
    public Optional<String> securityStyle() {
        return Optional.ofNullable(this.securityStyle);
    }
    /**
     * @return The service level of the file system
     * 
     */
    public Optional<String> serviceLevel() {
        return Optional.ofNullable(this.serviceLevel);
    }
    /**
     * @return Enables continuously available share property for smb volume. Only applicable for SMB volume
     * 
     */
    public Optional<Boolean> smbContinuouslyAvailable() {
        return Optional.ofNullable(this.smbContinuouslyAvailable);
    }
    /**
     * @return Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol volume. To be used with swagger version 2020-08-01 or later
     * 
     */
    public Optional<Boolean> smbEncryption() {
        return Optional.ofNullable(this.smbEncryption);
    }
    /**
     * @return If enabled (true) the volume will contain a read-only snapshot directory which provides access to each of the volume&#39;s snapshots (default to true).
     * 
     */
    public Optional<Boolean> snapshotDirectoryVisible() {
        return Optional.ofNullable(this.snapshotDirectoryVisible);
    }
    /**
     * @return UUID v4 or resource identifier used to identify the Snapshot.
     * 
     */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * @return The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<Double> throughputMibps() {
        return Optional.ofNullable(this.throughputMibps);
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     * 
     */
    public Double usageThreshold() {
        return this.usageThreshold;
    }
    /**
     * @return What type of volume is this
     * 
     */
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupId;
        private String baremetalTenantId;
        private String creationToken;
        private @Nullable VolumePropertiesResponseDataProtection dataProtection;
        private @Nullable String encryptionKeySource;
        private @Nullable VolumePropertiesResponseExportPolicy exportPolicy;
        private String fileSystemId;
        private String id;
        private @Nullable Boolean isRestoring;
        private @Nullable Boolean kerberosEnabled;
        private @Nullable Boolean ldapEnabled;
        private String location;
        private List<MountTargetPropertiesResponse> mountTargets;
        private String name;
        private @Nullable List<String> protocolTypes;
        private String provisioningState;
        private @Nullable String securityStyle;
        private @Nullable String serviceLevel;
        private @Nullable Boolean smbContinuouslyAvailable;
        private @Nullable Boolean smbEncryption;
        private @Nullable Boolean snapshotDirectoryVisible;
        private @Nullable String snapshotId;
        private String subnetId;
        private @Nullable Map<String,String> tags;
        private @Nullable Double throughputMibps;
        private String type;
        private Double usageThreshold;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.baremetalTenantId = defaults.baremetalTenantId;
    	      this.creationToken = defaults.creationToken;
    	      this.dataProtection = defaults.dataProtection;
    	      this.encryptionKeySource = defaults.encryptionKeySource;
    	      this.exportPolicy = defaults.exportPolicy;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.id = defaults.id;
    	      this.isRestoring = defaults.isRestoring;
    	      this.kerberosEnabled = defaults.kerberosEnabled;
    	      this.ldapEnabled = defaults.ldapEnabled;
    	      this.location = defaults.location;
    	      this.mountTargets = defaults.mountTargets;
    	      this.name = defaults.name;
    	      this.protocolTypes = defaults.protocolTypes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.securityStyle = defaults.securityStyle;
    	      this.serviceLevel = defaults.serviceLevel;
    	      this.smbContinuouslyAvailable = defaults.smbContinuouslyAvailable;
    	      this.smbEncryption = defaults.smbEncryption;
    	      this.snapshotDirectoryVisible = defaults.snapshotDirectoryVisible;
    	      this.snapshotId = defaults.snapshotId;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.throughputMibps = defaults.throughputMibps;
    	      this.type = defaults.type;
    	      this.usageThreshold = defaults.usageThreshold;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder backupId(@Nullable String backupId) {
            this.backupId = backupId;
            return this;
        }
        public Builder baremetalTenantId(String baremetalTenantId) {
            this.baremetalTenantId = Objects.requireNonNull(baremetalTenantId);
            return this;
        }
        public Builder creationToken(String creationToken) {
            this.creationToken = Objects.requireNonNull(creationToken);
            return this;
        }
        public Builder dataProtection(@Nullable VolumePropertiesResponseDataProtection dataProtection) {
            this.dataProtection = dataProtection;
            return this;
        }
        public Builder encryptionKeySource(@Nullable String encryptionKeySource) {
            this.encryptionKeySource = encryptionKeySource;
            return this;
        }
        public Builder exportPolicy(@Nullable VolumePropertiesResponseExportPolicy exportPolicy) {
            this.exportPolicy = exportPolicy;
            return this;
        }
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isRestoring(@Nullable Boolean isRestoring) {
            this.isRestoring = isRestoring;
            return this;
        }
        public Builder kerberosEnabled(@Nullable Boolean kerberosEnabled) {
            this.kerberosEnabled = kerberosEnabled;
            return this;
        }
        public Builder ldapEnabled(@Nullable Boolean ldapEnabled) {
            this.ldapEnabled = ldapEnabled;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder mountTargets(List<MountTargetPropertiesResponse> mountTargets) {
            this.mountTargets = Objects.requireNonNull(mountTargets);
            return this;
        }
        public Builder mountTargets(MountTargetPropertiesResponse... mountTargets) {
            return mountTargets(List.of(mountTargets));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder protocolTypes(@Nullable List<String> protocolTypes) {
            this.protocolTypes = protocolTypes;
            return this;
        }
        public Builder protocolTypes(String... protocolTypes) {
            return protocolTypes(List.of(protocolTypes));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder securityStyle(@Nullable String securityStyle) {
            this.securityStyle = securityStyle;
            return this;
        }
        public Builder serviceLevel(@Nullable String serviceLevel) {
            this.serviceLevel = serviceLevel;
            return this;
        }
        public Builder smbContinuouslyAvailable(@Nullable Boolean smbContinuouslyAvailable) {
            this.smbContinuouslyAvailable = smbContinuouslyAvailable;
            return this;
        }
        public Builder smbEncryption(@Nullable Boolean smbEncryption) {
            this.smbEncryption = smbEncryption;
            return this;
        }
        public Builder snapshotDirectoryVisible(@Nullable Boolean snapshotDirectoryVisible) {
            this.snapshotDirectoryVisible = snapshotDirectoryVisible;
            return this;
        }
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder throughputMibps(@Nullable Double throughputMibps) {
            this.throughputMibps = throughputMibps;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder usageThreshold(Double usageThreshold) {
            this.usageThreshold = Objects.requireNonNull(usageThreshold);
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }        public GetVolumeResult build() {
            return new GetVolumeResult(backupId, baremetalTenantId, creationToken, dataProtection, encryptionKeySource, exportPolicy, fileSystemId, id, isRestoring, kerberosEnabled, ldapEnabled, location, mountTargets, name, protocolTypes, provisioningState, securityStyle, serviceLevel, smbContinuouslyAvailable, smbEncryption, snapshotDirectoryVisible, snapshotId, subnetId, tags, throughputMibps, type, usageThreshold, volumeType);
        }
    }
}
