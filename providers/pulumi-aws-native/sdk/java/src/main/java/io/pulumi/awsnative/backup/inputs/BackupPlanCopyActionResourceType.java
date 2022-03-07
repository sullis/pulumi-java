// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.BackupPlanLifecycleResourceType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPlanCopyActionResourceType extends io.pulumi.resources.InvokeArgs {

    public static final BackupPlanCopyActionResourceType Empty = new BackupPlanCopyActionResourceType();

    @InputImport(name="destinationBackupVaultArn", required=true)
      private final String destinationBackupVaultArn;

    public String getDestinationBackupVaultArn() {
        return this.destinationBackupVaultArn;
    }

    @InputImport(name="lifecycle")
      private final @Nullable BackupPlanLifecycleResourceType lifecycle;

    public Optional<BackupPlanLifecycleResourceType> getLifecycle() {
        return this.lifecycle == null ? Optional.empty() : Optional.ofNullable(this.lifecycle);
    }

    public BackupPlanCopyActionResourceType(
        String destinationBackupVaultArn,
        @Nullable BackupPlanLifecycleResourceType lifecycle) {
        this.destinationBackupVaultArn = Objects.requireNonNull(destinationBackupVaultArn, "expected parameter 'destinationBackupVaultArn' to be non-null");
        this.lifecycle = lifecycle;
    }

    private BackupPlanCopyActionResourceType() {
        this.destinationBackupVaultArn = null;
        this.lifecycle = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanCopyActionResourceType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationBackupVaultArn;
        private @Nullable BackupPlanLifecycleResourceType lifecycle;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanCopyActionResourceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationBackupVaultArn = defaults.destinationBackupVaultArn;
    	      this.lifecycle = defaults.lifecycle;
        }

        public Builder setDestinationBackupVaultArn(String destinationBackupVaultArn) {
            this.destinationBackupVaultArn = Objects.requireNonNull(destinationBackupVaultArn);
            return this;
        }

        public Builder setLifecycle(@Nullable BackupPlanLifecycleResourceType lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public BackupPlanCopyActionResourceType build() {
            return new BackupPlanCopyActionResourceType(destinationBackupVaultArn, lifecycle);
        }
    }
}