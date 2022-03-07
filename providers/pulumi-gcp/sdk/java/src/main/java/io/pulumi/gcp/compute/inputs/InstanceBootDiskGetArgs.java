// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceBootDiskGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceBootDiskGetArgs Empty = new InstanceBootDiskGetArgs();

    /**
     * Whether the disk will be auto-deleted when the instance
     * is deleted. Defaults to true.
     * 
     */
    @InputImport(name="autoDelete")
      private final @Nullable Input<Boolean> autoDelete;

    public Input<Boolean> getAutoDelete() {
        return this.autoDelete == null ? Input.empty() : this.autoDelete;
    }

    /**
     * Name with which the attached disk will be accessible
     * under `/dev/disk/by-id/google-*`
     * 
     */
    @InputImport(name="deviceName")
      private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * A 256-bit [customer-supplied encryption key]
     * (https://cloud.google.com/compute/docs/disks/customer-supplied-encryption),
     * encoded in [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * to encrypt this disk. Only one of `kms_key_self_link` and `disk_encryption_key_raw` may be set.
     * 
     */
    @InputImport(name="diskEncryptionKeyRaw")
      private final @Nullable Input<String> diskEncryptionKeyRaw;

    public Input<String> getDiskEncryptionKeyRaw() {
        return this.diskEncryptionKeyRaw == null ? Input.empty() : this.diskEncryptionKeyRaw;
    }

    @InputImport(name="diskEncryptionKeySha256")
      private final @Nullable Input<String> diskEncryptionKeySha256;

    public Input<String> getDiskEncryptionKeySha256() {
        return this.diskEncryptionKeySha256 == null ? Input.empty() : this.diskEncryptionKeySha256;
    }

    /**
     * Parameters for a new disk that will be created
     * alongside the new instance. Either `initialize_params` or `source` must be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="initializeParams")
      private final @Nullable Input<InstanceBootDiskInitializeParamsGetArgs> initializeParams;

    public Input<InstanceBootDiskInitializeParamsGetArgs> getInitializeParams() {
        return this.initializeParams == null ? Input.empty() : this.initializeParams;
    }

    /**
     * The self_link of the encryption key that is
     * stored in Google Cloud KMS to encrypt this disk. Only one of `kms_key_self_link`
     * and `disk_encryption_key_raw` may be set.
     * 
     */
    @InputImport(name="kmsKeySelfLink")
      private final @Nullable Input<String> kmsKeySelfLink;

    public Input<String> getKmsKeySelfLink() {
        return this.kmsKeySelfLink == null ? Input.empty() : this.kmsKeySelfLink;
    }

    /**
     * Either "READ_ONLY" or "READ_WRITE", defaults to "READ_WRITE"
     * If you have a persistent disk with data that you want to share
     * between multiple instances, detach it from any read-write instances and
     * attach it to one or more instances in read-only mode.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The name or self_link of the disk to attach to this instance.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    public InstanceBootDiskGetArgs(
        @Nullable Input<Boolean> autoDelete,
        @Nullable Input<String> deviceName,
        @Nullable Input<String> diskEncryptionKeyRaw,
        @Nullable Input<String> diskEncryptionKeySha256,
        @Nullable Input<InstanceBootDiskInitializeParamsGetArgs> initializeParams,
        @Nullable Input<String> kmsKeySelfLink,
        @Nullable Input<String> mode,
        @Nullable Input<String> source) {
        this.autoDelete = autoDelete;
        this.deviceName = deviceName;
        this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
        this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
        this.initializeParams = initializeParams;
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.mode = mode;
        this.source = source;
    }

    private InstanceBootDiskGetArgs() {
        this.autoDelete = Input.empty();
        this.deviceName = Input.empty();
        this.diskEncryptionKeyRaw = Input.empty();
        this.diskEncryptionKeySha256 = Input.empty();
        this.initializeParams = Input.empty();
        this.kmsKeySelfLink = Input.empty();
        this.mode = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceBootDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoDelete;
        private @Nullable Input<String> deviceName;
        private @Nullable Input<String> diskEncryptionKeyRaw;
        private @Nullable Input<String> diskEncryptionKeySha256;
        private @Nullable Input<InstanceBootDiskInitializeParamsGetArgs> initializeParams;
        private @Nullable Input<String> kmsKeySelfLink;
        private @Nullable Input<String> mode;
        private @Nullable Input<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceBootDiskGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeyRaw = defaults.diskEncryptionKeyRaw;
    	      this.diskEncryptionKeySha256 = defaults.diskEncryptionKeySha256;
    	      this.initializeParams = defaults.initializeParams;
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder setAutoDelete(@Nullable Input<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }

        public Builder setAutoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Input.ofNullable(autoDelete);
            return this;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setDiskEncryptionKeyRaw(@Nullable Input<String> diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
            return this;
        }

        public Builder setDiskEncryptionKeyRaw(@Nullable String diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = Input.ofNullable(diskEncryptionKeyRaw);
            return this;
        }

        public Builder setDiskEncryptionKeySha256(@Nullable Input<String> diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
            return this;
        }

        public Builder setDiskEncryptionKeySha256(@Nullable String diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = Input.ofNullable(diskEncryptionKeySha256);
            return this;
        }

        public Builder setInitializeParams(@Nullable Input<InstanceBootDiskInitializeParamsGetArgs> initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }

        public Builder setInitializeParams(@Nullable InstanceBootDiskInitializeParamsGetArgs initializeParams) {
            this.initializeParams = Input.ofNullable(initializeParams);
            return this;
        }

        public Builder setKmsKeySelfLink(@Nullable Input<String> kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        public Builder setKmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = Input.ofNullable(kmsKeySelfLink);
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }
        public InstanceBootDiskGetArgs build() {
            return new InstanceBootDiskGetArgs(autoDelete, deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, initializeParams, kmsKeySelfLink, mode, source);
        }
    }
}