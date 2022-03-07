// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloudServiceVaultAndSecretReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceVaultAndSecretReferenceArgs Empty = new CloudServiceVaultAndSecretReferenceArgs();

    @InputImport(name="secretUrl")
      private final @Nullable Input<String> secretUrl;

    public Input<String> getSecretUrl() {
        return this.secretUrl == null ? Input.empty() : this.secretUrl;
    }

    @InputImport(name="sourceVault")
      private final @Nullable Input<SubResourceArgs> sourceVault;

    public Input<SubResourceArgs> getSourceVault() {
        return this.sourceVault == null ? Input.empty() : this.sourceVault;
    }

    public CloudServiceVaultAndSecretReferenceArgs(
        @Nullable Input<String> secretUrl,
        @Nullable Input<SubResourceArgs> sourceVault) {
        this.secretUrl = secretUrl;
        this.sourceVault = sourceVault;
    }

    private CloudServiceVaultAndSecretReferenceArgs() {
        this.secretUrl = Input.empty();
        this.sourceVault = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceVaultAndSecretReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> secretUrl;
        private @Nullable Input<SubResourceArgs> sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceVaultAndSecretReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretUrl = defaults.secretUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setSecretUrl(@Nullable Input<String> secretUrl) {
            this.secretUrl = secretUrl;
            return this;
        }

        public Builder setSecretUrl(@Nullable String secretUrl) {
            this.secretUrl = Input.ofNullable(secretUrl);
            return this;
        }

        public Builder setSourceVault(@Nullable Input<SubResourceArgs> sourceVault) {
            this.sourceVault = sourceVault;
            return this;
        }

        public Builder setSourceVault(@Nullable SubResourceArgs sourceVault) {
            this.sourceVault = Input.ofNullable(sourceVault);
            return this;
        }
        public CloudServiceVaultAndSecretReferenceArgs build() {
            return new CloudServiceVaultAndSecretReferenceArgs(secretUrl, sourceVault);
        }
    }
}