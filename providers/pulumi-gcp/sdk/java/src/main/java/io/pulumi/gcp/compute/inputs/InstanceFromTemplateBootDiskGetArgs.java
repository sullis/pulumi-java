// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskInitializeParamsGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateBootDiskGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateBootDiskGetArgs Empty = new InstanceFromTemplateBootDiskGetArgs();

    @Import(name="autoDelete")
      private final @Nullable Output<Boolean> autoDelete;

    public Output<Boolean> getAutoDelete() {
        return this.autoDelete == null ? Output.empty() : this.autoDelete;
    }

    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Output.empty() : this.deviceName;
    }

    @Import(name="diskEncryptionKeyRaw")
      private final @Nullable Output<String> diskEncryptionKeyRaw;

    public Output<String> getDiskEncryptionKeyRaw() {
        return this.diskEncryptionKeyRaw == null ? Output.empty() : this.diskEncryptionKeyRaw;
    }

    @Import(name="diskEncryptionKeySha256")
      private final @Nullable Output<String> diskEncryptionKeySha256;

    public Output<String> getDiskEncryptionKeySha256() {
        return this.diskEncryptionKeySha256 == null ? Output.empty() : this.diskEncryptionKeySha256;
    }

    @Import(name="initializeParams")
      private final @Nullable Output<InstanceFromTemplateBootDiskInitializeParamsGetArgs> initializeParams;

    public Output<InstanceFromTemplateBootDiskInitializeParamsGetArgs> getInitializeParams() {
        return this.initializeParams == null ? Output.empty() : this.initializeParams;
    }

    @Import(name="kmsKeySelfLink")
      private final @Nullable Output<String> kmsKeySelfLink;

    public Output<String> getKmsKeySelfLink() {
        return this.kmsKeySelfLink == null ? Output.empty() : this.kmsKeySelfLink;
    }

    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> getSource() {
        return this.source == null ? Output.empty() : this.source;
    }

    public InstanceFromTemplateBootDiskGetArgs(
        @Nullable Output<Boolean> autoDelete,
        @Nullable Output<String> deviceName,
        @Nullable Output<String> diskEncryptionKeyRaw,
        @Nullable Output<String> diskEncryptionKeySha256,
        @Nullable Output<InstanceFromTemplateBootDiskInitializeParamsGetArgs> initializeParams,
        @Nullable Output<String> kmsKeySelfLink,
        @Nullable Output<String> mode,
        @Nullable Output<String> source) {
        this.autoDelete = autoDelete;
        this.deviceName = deviceName;
        this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
        this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
        this.initializeParams = initializeParams;
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.mode = mode;
        this.source = source;
    }

    private InstanceFromTemplateBootDiskGetArgs() {
        this.autoDelete = Output.empty();
        this.deviceName = Output.empty();
        this.diskEncryptionKeyRaw = Output.empty();
        this.diskEncryptionKeySha256 = Output.empty();
        this.initializeParams = Output.empty();
        this.kmsKeySelfLink = Output.empty();
        this.mode = Output.empty();
        this.source = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateBootDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoDelete;
        private @Nullable Output<String> deviceName;
        private @Nullable Output<String> diskEncryptionKeyRaw;
        private @Nullable Output<String> diskEncryptionKeySha256;
        private @Nullable Output<InstanceFromTemplateBootDiskInitializeParamsGetArgs> initializeParams;
        private @Nullable Output<String> kmsKeySelfLink;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateBootDiskGetArgs defaults) {
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

        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        public Builder autoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Output.ofNullable(autoDelete);
            return this;
        }
        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Output.ofNullable(deviceName);
            return this;
        }
        public Builder diskEncryptionKeyRaw(@Nullable Output<String> diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
            return this;
        }
        public Builder diskEncryptionKeyRaw(@Nullable String diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = Output.ofNullable(diskEncryptionKeyRaw);
            return this;
        }
        public Builder diskEncryptionKeySha256(@Nullable Output<String> diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
            return this;
        }
        public Builder diskEncryptionKeySha256(@Nullable String diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = Output.ofNullable(diskEncryptionKeySha256);
            return this;
        }
        public Builder initializeParams(@Nullable Output<InstanceFromTemplateBootDiskInitializeParamsGetArgs> initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }
        public Builder initializeParams(@Nullable InstanceFromTemplateBootDiskInitializeParamsGetArgs initializeParams) {
            this.initializeParams = Output.ofNullable(initializeParams);
            return this;
        }
        public Builder kmsKeySelfLink(@Nullable Output<String> kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }
        public Builder kmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = Output.ofNullable(kmsKeySelfLink);
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }
        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = Output.ofNullable(source);
            return this;
        }        public InstanceFromTemplateBootDiskGetArgs build() {
            return new InstanceFromTemplateBootDiskGetArgs(autoDelete, deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, initializeParams, kmsKeySelfLink, mode, source);
        }
    }
}
