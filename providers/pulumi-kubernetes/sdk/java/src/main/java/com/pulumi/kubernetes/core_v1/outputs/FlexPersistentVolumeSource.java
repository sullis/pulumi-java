// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.SecretReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlexPersistentVolumeSource {
    /**
     * @return Driver is the name of the driver to use for this volume.
     * 
     */
    private final String driver;
    /**
     * @return Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default filesystem depends on FlexVolume script.
     * 
     */
    private final @Nullable String fsType;
    /**
     * @return Optional: Extra command options if any.
     * 
     */
    private final @Nullable Map<String,String> options;
    /**
     * @return Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * @return Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
     * 
     */
    private final @Nullable SecretReference secretRef;

    @CustomType.Constructor
    private FlexPersistentVolumeSource(
        @CustomType.Parameter("driver") String driver,
        @CustomType.Parameter("fsType") @Nullable String fsType,
        @CustomType.Parameter("options") @Nullable Map<String,String> options,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("secretRef") @Nullable SecretReference secretRef) {
        this.driver = driver;
        this.fsType = fsType;
        this.options = options;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
    }

    /**
     * @return Driver is the name of the driver to use for this volume.
     * 
     */
    public String driver() {
        return this.driver;
    }
    /**
     * @return Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default filesystem depends on FlexVolume script.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return Optional: Extra command options if any.
     * 
     */
    public Map<String,String> options() {
        return this.options == null ? Map.of() : this.options;
    }
    /**
     * @return Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
     * 
     */
    public Optional<SecretReference> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexPersistentVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String driver;
        private @Nullable String fsType;
        private @Nullable Map<String,String> options;
        private @Nullable Boolean readOnly;
        private @Nullable SecretReference secretRef;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexPersistentVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.fsType = defaults.fsType;
    	      this.options = defaults.options;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
        }

        public Builder driver(String driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }
        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder options(@Nullable Map<String,String> options) {
            this.options = options;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder secretRef(@Nullable SecretReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }        public FlexPersistentVolumeSource build() {
            return new FlexPersistentVolumeSource(driver, fsType, options, readOnly, secretRef);
        }
    }
}
