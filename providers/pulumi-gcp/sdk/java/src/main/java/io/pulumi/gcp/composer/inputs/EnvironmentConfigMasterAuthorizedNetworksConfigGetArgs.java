// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs Empty = new EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs();

    @InputImport(name="cidrBlocks")
      private final @Nullable Input<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks;

    public Input<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs>> getCidrBlocks() {
        return this.cidrBlocks == null ? Input.empty() : this.cidrBlocks;
    }

    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs(
        @Nullable Input<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks,
        Input<Boolean> enabled) {
        this.cidrBlocks = cidrBlocks;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs() {
        this.cidrBlocks = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks;
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        public Builder setCidrBlocks(@Nullable Input<List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        public Builder setCidrBlocks(@Nullable List<EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs> cidrBlocks) {
            this.cidrBlocks = Input.ofNullable(cidrBlocks);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }
        public EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs build() {
            return new EnvironmentConfigMasterAuthorizedNetworksConfigGetArgs(cidrBlocks, enabled);
        }
    }
}