// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SubResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudServiceVaultAndSecretReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudServiceVaultAndSecretReferenceResponse Empty = new CloudServiceVaultAndSecretReferenceResponse();

    @InputImport(name="secretUrl")
      private final @Nullable String secretUrl;

    public Optional<String> getSecretUrl() {
        return this.secretUrl == null ? Optional.empty() : Optional.ofNullable(this.secretUrl);
    }

    @InputImport(name="sourceVault")
      private final @Nullable SubResourceResponse sourceVault;

    public Optional<SubResourceResponse> getSourceVault() {
        return this.sourceVault == null ? Optional.empty() : Optional.ofNullable(this.sourceVault);
    }

    public CloudServiceVaultAndSecretReferenceResponse(
        @Nullable String secretUrl,
        @Nullable SubResourceResponse sourceVault) {
        this.secretUrl = secretUrl;
        this.sourceVault = sourceVault;
    }

    private CloudServiceVaultAndSecretReferenceResponse() {
        this.secretUrl = null;
        this.sourceVault = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceVaultAndSecretReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String secretUrl;
        private @Nullable SubResourceResponse sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceVaultAndSecretReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretUrl = defaults.secretUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setSecretUrl(@Nullable String secretUrl) {
            this.secretUrl = secretUrl;
            return this;
        }

        public Builder setSourceVault(@Nullable SubResourceResponse sourceVault) {
            this.sourceVault = sourceVault;
            return this;
        }
        public CloudServiceVaultAndSecretReferenceResponse build() {
            return new CloudServiceVaultAndSecretReferenceResponse(secretUrl, sourceVault);
        }
    }
}