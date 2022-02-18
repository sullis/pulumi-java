// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFilePersistentVolumeSource {
    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * the name of secret that contains Azure Storage Account Name and Key
     * 
     */
    private final String secretName;
    /**
     * the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
     * 
     */
    private final @Nullable String secretNamespace;
    /**
     * Share Name
     * 
     */
    private final String shareName;

    @OutputCustomType.Constructor({"readOnly","secretName","secretNamespace","shareName"})
    private AzureFilePersistentVolumeSource(
        @Nullable Boolean readOnly,
        String secretName,
        @Nullable String secretNamespace,
        String shareName) {
        this.readOnly = readOnly;
        this.secretName = Objects.requireNonNull(secretName);
        this.secretNamespace = secretNamespace;
        this.shareName = Objects.requireNonNull(shareName);
    }

    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * the name of secret that contains Azure Storage Account Name and Key
     * 
     */
    public String getSecretName() {
        return this.secretName;
    }
    /**
     * the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
     * 
     */
    public Optional<String> getSecretNamespace() {
        return Optional.ofNullable(this.secretNamespace);
    }
    /**
     * Share Name
     * 
     */
    public String getShareName() {
        return this.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFilePersistentVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean readOnly;
        private String secretName;
        private @Nullable String secretNamespace;
        private String shareName;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFilePersistentVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readOnly = defaults.readOnly;
    	      this.secretName = defaults.secretName;
    	      this.secretNamespace = defaults.secretNamespace;
    	      this.shareName = defaults.shareName;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSecretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }

        public Builder setSecretNamespace(@Nullable String secretNamespace) {
            this.secretNamespace = secretNamespace;
            return this;
        }

        public Builder setShareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public AzureFilePersistentVolumeSource build() {
            return new AzureFilePersistentVolumeSource(readOnly, secretName, secretNamespace, shareName);
        }
    }
}
