// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The disk encryption configuration applied on compute nodes in the pool. Disk encryption configuration is not supported on Linux pool created with Virtual Machine Image or Shared Image Gallery Image.
 * 
 */
public final class DiskEncryptionConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskEncryptionConfigurationResponse Empty = new DiskEncryptionConfigurationResponse();

    /**
     * On Linux pool, only "TemporaryDisk" is supported; on Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     * 
     */
    @InputImport(name="targets")
    private final @Nullable List<String> targets;

    public List<String> getTargets() {
        return this.targets == null ? List.of() : this.targets;
    }

    public DiskEncryptionConfigurationResponse(@Nullable List<String> targets) {
        this.targets = targets;
    }

    private DiskEncryptionConfigurationResponse() {
        this.targets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targets = defaults.targets;
        }

        public Builder setTargets(@Nullable List<String> targets) {
            this.targets = targets;
            return this;
        }

        public DiskEncryptionConfigurationResponse build() {
            return new DiskEncryptionConfigurationResponse(targets);
        }
    }
}
