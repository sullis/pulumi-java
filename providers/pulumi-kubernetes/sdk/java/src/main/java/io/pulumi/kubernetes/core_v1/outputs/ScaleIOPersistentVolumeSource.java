// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.SecretReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScaleIOPersistentVolumeSource {
    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs"
     * 
     */
    private final @Nullable String fsType;
    /**
     * The host address of the ScaleIO API Gateway.
     * 
     */
    private final String gateway;
    /**
     * The name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    private final @Nullable String protectionDomain;
    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
     * 
     */
    private final SecretReference secretRef;
    /**
     * Flag to enable/disable SSL communication with Gateway, default false
     * 
     */
    private final @Nullable Boolean sslEnabled;
    /**
     * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    private final @Nullable String storageMode;
    /**
     * The ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    private final @Nullable String storagePool;
    /**
     * The name of the storage system as configured in ScaleIO.
     * 
     */
    private final String system;
    /**
     * The name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    private final @Nullable String volumeName;

    @OutputCustomType.Constructor
    private ScaleIOPersistentVolumeSource(
        @OutputCustomType.Parameter("fsType") @Nullable String fsType,
        @OutputCustomType.Parameter("gateway") String gateway,
        @OutputCustomType.Parameter("protectionDomain") @Nullable String protectionDomain,
        @OutputCustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @OutputCustomType.Parameter("secretRef") SecretReference secretRef,
        @OutputCustomType.Parameter("sslEnabled") @Nullable Boolean sslEnabled,
        @OutputCustomType.Parameter("storageMode") @Nullable String storageMode,
        @OutputCustomType.Parameter("storagePool") @Nullable String storagePool,
        @OutputCustomType.Parameter("system") String system,
        @OutputCustomType.Parameter("volumeName") @Nullable String volumeName) {
        this.fsType = fsType;
        this.gateway = gateway;
        this.protectionDomain = protectionDomain;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.sslEnabled = sslEnabled;
        this.storageMode = storageMode;
        this.storagePool = storagePool;
        this.system = system;
        this.volumeName = volumeName;
    }

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs"
     * 
    */
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * The host address of the ScaleIO API Gateway.
     * 
    */
    public String getGateway() {
        return this.gateway;
    }
    /**
     * The name of the ScaleIO Protection Domain for the configured storage.
     * 
    */
    public Optional<String> getProtectionDomain() {
        return Optional.ofNullable(this.protectionDomain);
    }
    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
    */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
     * 
    */
    public SecretReference getSecretRef() {
        return this.secretRef;
    }
    /**
     * Flag to enable/disable SSL communication with Gateway, default false
     * 
    */
    public Optional<Boolean> getSslEnabled() {
        return Optional.ofNullable(this.sslEnabled);
    }
    /**
     * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
    */
    public Optional<String> getStorageMode() {
        return Optional.ofNullable(this.storageMode);
    }
    /**
     * The ScaleIO Storage Pool associated with the protection domain.
     * 
    */
    public Optional<String> getStoragePool() {
        return Optional.ofNullable(this.storagePool);
    }
    /**
     * The name of the storage system as configured in ScaleIO.
     * 
    */
    public String getSystem() {
        return this.system;
    }
    /**
     * The name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
    */
    public Optional<String> getVolumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleIOPersistentVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private String gateway;
        private @Nullable String protectionDomain;
        private @Nullable Boolean readOnly;
        private SecretReference secretRef;
        private @Nullable Boolean sslEnabled;
        private @Nullable String storageMode;
        private @Nullable String storagePool;
        private String system;
        private @Nullable String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleIOPersistentVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.gateway = defaults.gateway;
    	      this.protectionDomain = defaults.protectionDomain;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.sslEnabled = defaults.sslEnabled;
    	      this.storageMode = defaults.storageMode;
    	      this.storagePool = defaults.storagePool;
    	      this.system = defaults.system;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setGateway(String gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }

        public Builder setProtectionDomain(@Nullable String protectionDomain) {
            this.protectionDomain = protectionDomain;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSecretRef(SecretReference secretRef) {
            this.secretRef = Objects.requireNonNull(secretRef);
            return this;
        }

        public Builder setSslEnabled(@Nullable Boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }

        public Builder setStorageMode(@Nullable String storageMode) {
            this.storageMode = storageMode;
            return this;
        }

        public Builder setStoragePool(@Nullable String storagePool) {
            this.storagePool = storagePool;
            return this;
        }

        public Builder setSystem(String system) {
            this.system = Objects.requireNonNull(system);
            return this;
        }

        public Builder setVolumeName(@Nullable String volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public ScaleIOPersistentVolumeSource build() {
            return new ScaleIOPersistentVolumeSource(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
        }
    }
}
