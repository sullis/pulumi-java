// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.KeyToPath;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecretVolumeSource {
    /**
     * Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private final @Nullable Integer defaultMode;
    /**
     * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
     */
    private final @Nullable List<KeyToPath> items;
    /**
     * Specify whether the Secret or its keys must be defined
     * 
     */
    private final @Nullable Boolean optional;
    /**
     * Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * 
     */
    private final @Nullable String secretName;

    @OutputCustomType.Constructor
    private SecretVolumeSource(
        @OutputCustomType.Parameter("defaultMode") @Nullable Integer defaultMode,
        @OutputCustomType.Parameter("items") @Nullable List<KeyToPath> items,
        @OutputCustomType.Parameter("optional") @Nullable Boolean optional,
        @OutputCustomType.Parameter("secretName") @Nullable String secretName) {
        this.defaultMode = defaultMode;
        this.items = items;
        this.optional = optional;
        this.secretName = secretName;
    }

    /**
     * Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
    */
    public Optional<Integer> getDefaultMode() {
        return Optional.ofNullable(this.defaultMode);
    }
    /**
     * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
    */
    public List<KeyToPath> getItems() {
        return this.items == null ? List.of() : this.items;
    }
    /**
     * Specify whether the Secret or its keys must be defined
     * 
    */
    public Optional<Boolean> getOptional() {
        return Optional.ofNullable(this.optional);
    }
    /**
     * Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * 
    */
    public Optional<String> getSecretName() {
        return Optional.ofNullable(this.secretName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer defaultMode;
        private @Nullable List<KeyToPath> items;
        private @Nullable Boolean optional;
        private @Nullable String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.optional = defaults.optional;
    	      this.secretName = defaults.secretName;
        }

        public Builder setDefaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        public Builder setItems(@Nullable List<KeyToPath> items) {
            this.items = items;
            return this;
        }

        public Builder setOptional(@Nullable Boolean optional) {
            this.optional = optional;
            return this;
        }

        public Builder setSecretName(@Nullable String secretName) {
            this.secretName = secretName;
            return this;
        }
        public SecretVolumeSource build() {
            return new SecretVolumeSource(defaultMode, items, optional, secretName);
        }
    }
}
