// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The policy describes the baseline against which VM instance boot integrity is measured.
 * 
 */
public final class ShieldedVmIntegrityPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShieldedVmIntegrityPolicyResponse Empty = new ShieldedVmIntegrityPolicyResponse();

    /**
     * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
     * 
     */
    @InputImport(name="updateAutoLearnPolicy", required=true)
      private final Boolean updateAutoLearnPolicy;

    public Boolean getUpdateAutoLearnPolicy() {
        return this.updateAutoLearnPolicy;
    }

    public ShieldedVmIntegrityPolicyResponse(Boolean updateAutoLearnPolicy) {
        this.updateAutoLearnPolicy = Objects.requireNonNull(updateAutoLearnPolicy, "expected parameter 'updateAutoLearnPolicy' to be non-null");
    }

    private ShieldedVmIntegrityPolicyResponse() {
        this.updateAutoLearnPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedVmIntegrityPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean updateAutoLearnPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedVmIntegrityPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateAutoLearnPolicy = defaults.updateAutoLearnPolicy;
        }

        public Builder setUpdateAutoLearnPolicy(Boolean updateAutoLearnPolicy) {
            this.updateAutoLearnPolicy = Objects.requireNonNull(updateAutoLearnPolicy);
            return this;
        }
        public ShieldedVmIntegrityPolicyResponse build() {
            return new ShieldedVmIntegrityPolicyResponse(updateAutoLearnPolicy);
        }
    }
}