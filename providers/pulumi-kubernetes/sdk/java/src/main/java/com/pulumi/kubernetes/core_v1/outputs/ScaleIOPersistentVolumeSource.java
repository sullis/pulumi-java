// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.SecretReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleIOPersistentVolumeSource {
    /**
     * @return Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Default is &#34;xfs&#34;
     * 
     */
    private final @Nullable String fsType;
    /**
     * @return The host address of the ScaleIO API Gateway.
     * 
     */
    private final String gateway;
    /**
     * @return The name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    private final @Nullable String protectionDomain;
    /**
     * @return Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * @return SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
     * 
     */
    private final SecretReference secretRef;
    /**
     * @return Flag to enable/disable SSL communication with Gateway, default false
     * 
     */
    private final @Nullable Boolean sslEnabled;
    /**
     * @return Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    private final @Nullable String storageMode;
    /**
     * @return The ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    private final @Nullable String storagePool;
    /**
     * @return The name of the storage system as configured in ScaleIO.
     * 
     */
    private final String system;
    /**
     * @return The name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    private final @Nullable String volumeName;

    @CustomType.Constructor
    private ScaleIOPersistentVolumeSource(
        @CustomType.Parameter("fsType") @Nullable String fsType,
        @CustomType.Parameter("gateway") String gateway,
        @CustomType.Parameter("protectionDomain") @Nullable String protectionDomain,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("secretRef") SecretReference secretRef,
        @CustomType.Parameter("sslEnabled") @Nullable Boolean sslEnabled,
        @CustomType.Parameter("storageMode") @Nullable String storageMode,
        @CustomType.Parameter("storagePool") @Nullable String storagePool,
        @CustomType.Parameter("system") String system,
        @CustomType.Parameter("volumeName") @Nullable String volumeName) {
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
     * @return Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Default is &#34;xfs&#34;
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return The host address of the ScaleIO API Gateway.
     * 
     */
    public String gateway() {
        return this.gateway;
    }
    /**
     * @return The name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    public Optional<String> protectionDomain() {
        return Optional.ofNullable(this.protectionDomain);
    }
    /**
     * @return Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
     * 
     */
    public SecretReference secretRef() {
        return this.secretRef;
    }
    /**
     * @return Flag to enable/disable SSL communication with Gateway, default false
     * 
     */
    public Optional<Boolean> sslEnabled() {
        return Optional.ofNullable(this.sslEnabled);
    }
    /**
     * @return Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    public Optional<String> storageMode() {
        return Optional.ofNullable(this.storageMode);
    }
    /**
     * @return The ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    public Optional<String> storagePool() {
        return Optional.ofNullable(this.storagePool);
    }
    /**
     * @return The name of the storage system as configured in ScaleIO.
     * 
     */
    public String system() {
        return this.system;
    }
    /**
     * @return The name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    public Optional<String> volumeName() {
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

        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder gateway(String gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }
        public Builder protectionDomain(@Nullable String protectionDomain) {
            this.protectionDomain = protectionDomain;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder secretRef(SecretReference secretRef) {
            this.secretRef = Objects.requireNonNull(secretRef);
            return this;
        }
        public Builder sslEnabled(@Nullable Boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }
        public Builder storageMode(@Nullable String storageMode) {
            this.storageMode = storageMode;
            return this;
        }
        public Builder storagePool(@Nullable String storagePool) {
            this.storagePool = storagePool;
            return this;
        }
        public Builder system(String system) {
            this.system = Objects.requireNonNull(system);
            return this;
        }
        public Builder volumeName(@Nullable String volumeName) {
            this.volumeName = volumeName;
            return this;
        }        public ScaleIOPersistentVolumeSource build() {
            return new ScaleIOPersistentVolumeSource(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
        }
    }
}
