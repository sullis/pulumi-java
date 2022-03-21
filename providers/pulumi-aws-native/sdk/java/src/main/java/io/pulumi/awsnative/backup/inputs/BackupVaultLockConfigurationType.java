// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupVaultLockConfigurationType extends io.pulumi.resources.InvokeArgs {

    public static final BackupVaultLockConfigurationType Empty = new BackupVaultLockConfigurationType();

    @Import(name="changeableForDays")
      private final @Nullable Double changeableForDays;

    public Optional<Double> getChangeableForDays() {
        return this.changeableForDays == null ? Optional.empty() : Optional.ofNullable(this.changeableForDays);
    }

    @Import(name="maxRetentionDays")
      private final @Nullable Double maxRetentionDays;

    public Optional<Double> getMaxRetentionDays() {
        return this.maxRetentionDays == null ? Optional.empty() : Optional.ofNullable(this.maxRetentionDays);
    }

    @Import(name="minRetentionDays", required=true)
      private final Double minRetentionDays;

    public Double getMinRetentionDays() {
        return this.minRetentionDays;
    }

    public BackupVaultLockConfigurationType(
        @Nullable Double changeableForDays,
        @Nullable Double maxRetentionDays,
        Double minRetentionDays) {
        this.changeableForDays = changeableForDays;
        this.maxRetentionDays = maxRetentionDays;
        this.minRetentionDays = Objects.requireNonNull(minRetentionDays, "expected parameter 'minRetentionDays' to be non-null");
    }

    private BackupVaultLockConfigurationType() {
        this.changeableForDays = null;
        this.maxRetentionDays = null;
        this.minRetentionDays = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultLockConfigurationType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double changeableForDays;
        private @Nullable Double maxRetentionDays;
        private Double minRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultLockConfigurationType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeableForDays = defaults.changeableForDays;
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.minRetentionDays = defaults.minRetentionDays;
        }

        public Builder changeableForDays(@Nullable Double changeableForDays) {
            this.changeableForDays = changeableForDays;
            return this;
        }
        public Builder maxRetentionDays(@Nullable Double maxRetentionDays) {
            this.maxRetentionDays = maxRetentionDays;
            return this;
        }
        public Builder minRetentionDays(Double minRetentionDays) {
            this.minRetentionDays = Objects.requireNonNull(minRetentionDays);
            return this;
        }        public BackupVaultLockConfigurationType build() {
            return new BackupVaultLockConfigurationType(changeableForDays, maxRetentionDays, minRetentionDays);
        }
    }
}
