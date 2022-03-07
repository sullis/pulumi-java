// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.inputs.ClusterExecuteCommandLogConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for ExecuteCommand.
 * 
 */
public final class ClusterExecuteCommandConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ClusterExecuteCommandConfiguration Empty = new ClusterExecuteCommandConfiguration();

    @InputImport(name="kmsKeyId")
      private final @Nullable String kmsKeyId;

    public Optional<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Optional.empty() : Optional.ofNullable(this.kmsKeyId);
    }

    @InputImport(name="logConfiguration")
      private final @Nullable ClusterExecuteCommandLogConfiguration logConfiguration;

    public Optional<ClusterExecuteCommandLogConfiguration> getLogConfiguration() {
        return this.logConfiguration == null ? Optional.empty() : Optional.ofNullable(this.logConfiguration);
    }

    @InputImport(name="logging")
      private final @Nullable String logging;

    public Optional<String> getLogging() {
        return this.logging == null ? Optional.empty() : Optional.ofNullable(this.logging);
    }

    public ClusterExecuteCommandConfiguration(
        @Nullable String kmsKeyId,
        @Nullable ClusterExecuteCommandLogConfiguration logConfiguration,
        @Nullable String logging) {
        this.kmsKeyId = kmsKeyId;
        this.logConfiguration = logConfiguration;
        this.logging = logging;
    }

    private ClusterExecuteCommandConfiguration() {
        this.kmsKeyId = null;
        this.logConfiguration = null;
        this.logging = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterExecuteCommandConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private @Nullable ClusterExecuteCommandLogConfiguration logConfiguration;
        private @Nullable String logging;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterExecuteCommandConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.logConfiguration = defaults.logConfiguration;
    	      this.logging = defaults.logging;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setLogConfiguration(@Nullable ClusterExecuteCommandLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        public Builder setLogging(@Nullable String logging) {
            this.logging = logging;
            return this;
        }
        public ClusterExecuteCommandConfiguration build() {
            return new ClusterExecuteCommandConfiguration(kmsKeyId, logConfiguration, logging);
        }
    }
}