// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstantRPAdditionalDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstantRPAdditionalDetailsArgs Empty = new InstantRPAdditionalDetailsArgs();

    @InputImport(name="azureBackupRGNamePrefix")
      private final @Nullable Input<String> azureBackupRGNamePrefix;

    public Input<String> getAzureBackupRGNamePrefix() {
        return this.azureBackupRGNamePrefix == null ? Input.empty() : this.azureBackupRGNamePrefix;
    }

    @InputImport(name="azureBackupRGNameSuffix")
      private final @Nullable Input<String> azureBackupRGNameSuffix;

    public Input<String> getAzureBackupRGNameSuffix() {
        return this.azureBackupRGNameSuffix == null ? Input.empty() : this.azureBackupRGNameSuffix;
    }

    public InstantRPAdditionalDetailsArgs(
        @Nullable Input<String> azureBackupRGNamePrefix,
        @Nullable Input<String> azureBackupRGNameSuffix) {
        this.azureBackupRGNamePrefix = azureBackupRGNamePrefix;
        this.azureBackupRGNameSuffix = azureBackupRGNameSuffix;
    }

    private InstantRPAdditionalDetailsArgs() {
        this.azureBackupRGNamePrefix = Input.empty();
        this.azureBackupRGNameSuffix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstantRPAdditionalDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> azureBackupRGNamePrefix;
        private @Nullable Input<String> azureBackupRGNameSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(InstantRPAdditionalDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBackupRGNamePrefix = defaults.azureBackupRGNamePrefix;
    	      this.azureBackupRGNameSuffix = defaults.azureBackupRGNameSuffix;
        }

        public Builder setAzureBackupRGNamePrefix(@Nullable Input<String> azureBackupRGNamePrefix) {
            this.azureBackupRGNamePrefix = azureBackupRGNamePrefix;
            return this;
        }

        public Builder setAzureBackupRGNamePrefix(@Nullable String azureBackupRGNamePrefix) {
            this.azureBackupRGNamePrefix = Input.ofNullable(azureBackupRGNamePrefix);
            return this;
        }

        public Builder setAzureBackupRGNameSuffix(@Nullable Input<String> azureBackupRGNameSuffix) {
            this.azureBackupRGNameSuffix = azureBackupRGNameSuffix;
            return this;
        }

        public Builder setAzureBackupRGNameSuffix(@Nullable String azureBackupRGNameSuffix) {
            this.azureBackupRGNameSuffix = Input.ofNullable(azureBackupRGNameSuffix);
            return this;
        }
        public InstantRPAdditionalDetailsArgs build() {
            return new InstantRPAdditionalDetailsArgs(azureBackupRGNamePrefix, azureBackupRGNameSuffix);
        }
    }
}