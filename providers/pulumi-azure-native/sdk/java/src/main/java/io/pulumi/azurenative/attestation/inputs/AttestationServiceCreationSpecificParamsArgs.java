// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.attestation.inputs;

import io.pulumi.azurenative.attestation.inputs.JSONWebKeySetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Client supplied parameters used to create a new attestation provider.
 * 
 */
public final class AttestationServiceCreationSpecificParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestationServiceCreationSpecificParamsArgs Empty = new AttestationServiceCreationSpecificParamsArgs();

    /**
     * JSON Web Key Set defining a set of X.509 Certificates that will represent the parent certificate for the signing certificate used for policy operations
     * 
     */
    @InputImport(name="policySigningCertificates")
      private final @Nullable Input<JSONWebKeySetArgs> policySigningCertificates;

    public Input<JSONWebKeySetArgs> getPolicySigningCertificates() {
        return this.policySigningCertificates == null ? Input.empty() : this.policySigningCertificates;
    }

    public AttestationServiceCreationSpecificParamsArgs(@Nullable Input<JSONWebKeySetArgs> policySigningCertificates) {
        this.policySigningCertificates = policySigningCertificates;
    }

    private AttestationServiceCreationSpecificParamsArgs() {
        this.policySigningCertificates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationServiceCreationSpecificParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JSONWebKeySetArgs> policySigningCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationServiceCreationSpecificParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policySigningCertificates = defaults.policySigningCertificates;
        }

        public Builder setPolicySigningCertificates(@Nullable Input<JSONWebKeySetArgs> policySigningCertificates) {
            this.policySigningCertificates = policySigningCertificates;
            return this;
        }

        public Builder setPolicySigningCertificates(@Nullable JSONWebKeySetArgs policySigningCertificates) {
            this.policySigningCertificates = Input.ofNullable(policySigningCertificates);
            return this;
        }
        public AttestationServiceCreationSpecificParamsArgs build() {
            return new AttestationServiceCreationSpecificParamsArgs(policySigningCertificates);
        }
    }
}