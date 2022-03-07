// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.awsnative.backup.outputs.BackupPlanLifecycleResourceType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackupPlanCopyActionResourceType {
    private final String destinationBackupVaultArn;
    private final @Nullable BackupPlanLifecycleResourceType lifecycle;

    @OutputCustomType.Constructor({"destinationBackupVaultArn","lifecycle"})
    private BackupPlanCopyActionResourceType(
        String destinationBackupVaultArn,
        @Nullable BackupPlanLifecycleResourceType lifecycle) {
        this.destinationBackupVaultArn = Objects.requireNonNull(destinationBackupVaultArn);
        this.lifecycle = lifecycle;
    }

    public String getDestinationBackupVaultArn() {
        return this.destinationBackupVaultArn;
    }
    public Optional<BackupPlanLifecycleResourceType> getLifecycle() {
        return Optional.ofNullable(this.lifecycle);
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