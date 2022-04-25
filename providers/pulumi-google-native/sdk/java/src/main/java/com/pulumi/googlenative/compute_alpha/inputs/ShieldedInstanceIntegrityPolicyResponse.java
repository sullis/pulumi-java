// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The policy describes the baseline against which Instance boot integrity is measured.
 * 
 */
public final class ShieldedInstanceIntegrityPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ShieldedInstanceIntegrityPolicyResponse Empty = new ShieldedInstanceIntegrityPolicyResponse();

    /**
     * Updates the integrity policy baseline using the measurements from the VM instance&#39;s most recent boot.
     * 
     */
    @Import(name="updateAutoLearnPolicy", required=true)
    private Boolean updateAutoLearnPolicy;

    /**
     * @return Updates the integrity policy baseline using the measurements from the VM instance&#39;s most recent boot.
     * 
     */
    public Boolean updateAutoLearnPolicy() {
        return this.updateAutoLearnPolicy;
    }

    private ShieldedInstanceIntegrityPolicyResponse() {}

    private ShieldedInstanceIntegrityPolicyResponse(ShieldedInstanceIntegrityPolicyResponse $) {
        this.updateAutoLearnPolicy = $.updateAutoLearnPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShieldedInstanceIntegrityPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShieldedInstanceIntegrityPolicyResponse $;

        public Builder() {
            $ = new ShieldedInstanceIntegrityPolicyResponse();
        }

        public Builder(ShieldedInstanceIntegrityPolicyResponse defaults) {
            $ = new ShieldedInstanceIntegrityPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param updateAutoLearnPolicy Updates the integrity policy baseline using the measurements from the VM instance&#39;s most recent boot.
         * 
         * @return builder
         * 
         */
        public Builder updateAutoLearnPolicy(Boolean updateAutoLearnPolicy) {
            $.updateAutoLearnPolicy = updateAutoLearnPolicy;
            return this;
        }

        public ShieldedInstanceIntegrityPolicyResponse build() {
            $.updateAutoLearnPolicy = Objects.requireNonNull($.updateAutoLearnPolicy, "expected parameter 'updateAutoLearnPolicy' to be non-null");
            return $;
        }
    }

}
