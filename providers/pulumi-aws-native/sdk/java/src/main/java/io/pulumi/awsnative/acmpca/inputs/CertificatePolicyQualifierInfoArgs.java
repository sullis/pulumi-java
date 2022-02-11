// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.awsnative.acmpca.inputs.CertificateQualifierArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class CertificatePolicyQualifierInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificatePolicyQualifierInfoArgs Empty = new CertificatePolicyQualifierInfoArgs();

    @InputImport(name="policyQualifierId", required=true)
    private final Input<String> policyQualifierId;

    public Input<String> getPolicyQualifierId() {
        return this.policyQualifierId;
    }

    @InputImport(name="qualifier", required=true)
    private final Input<CertificateQualifierArgs> qualifier;

    public Input<CertificateQualifierArgs> getQualifier() {
        return this.qualifier;
    }

    public CertificatePolicyQualifierInfoArgs(
        Input<String> policyQualifierId,
        Input<CertificateQualifierArgs> qualifier) {
        this.policyQualifierId = Objects.requireNonNull(policyQualifierId, "expected parameter 'policyQualifierId' to be non-null");
        this.qualifier = Objects.requireNonNull(qualifier, "expected parameter 'qualifier' to be non-null");
    }

    private CertificatePolicyQualifierInfoArgs() {
        this.policyQualifierId = Input.empty();
        this.qualifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificatePolicyQualifierInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policyQualifierId;
        private Input<CertificateQualifierArgs> qualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificatePolicyQualifierInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyQualifierId = defaults.policyQualifierId;
    	      this.qualifier = defaults.qualifier;
        }

        public Builder setPolicyQualifierId(Input<String> policyQualifierId) {
            this.policyQualifierId = Objects.requireNonNull(policyQualifierId);
            return this;
        }

        public Builder setPolicyQualifierId(String policyQualifierId) {
            this.policyQualifierId = Input.of(Objects.requireNonNull(policyQualifierId));
            return this;
        }

        public Builder setQualifier(Input<CertificateQualifierArgs> qualifier) {
            this.qualifier = Objects.requireNonNull(qualifier);
            return this;
        }

        public Builder setQualifier(CertificateQualifierArgs qualifier) {
            this.qualifier = Input.of(Objects.requireNonNull(qualifier));
            return this;
        }

        public CertificatePolicyQualifierInfoArgs build() {
            return new CertificatePolicyQualifierInfoArgs(policyQualifierId, qualifier);
        }
    }
}
