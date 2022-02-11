// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.awsnative.acmpca.outputs.CertificatePolicyQualifierInfo;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificatePolicyInformation {
    private final String certPolicyId;
    private final @Nullable List<CertificatePolicyQualifierInfo> policyQualifiers;

    @OutputCustomType.Constructor({"certPolicyId","policyQualifiers"})
    private CertificatePolicyInformation(
        String certPolicyId,
        @Nullable List<CertificatePolicyQualifierInfo> policyQualifiers) {
        this.certPolicyId = Objects.requireNonNull(certPolicyId);
        this.policyQualifiers = policyQualifiers;
    }

    public String getCertPolicyId() {
        return this.certPolicyId;
    }
    public List<CertificatePolicyQualifierInfo> getPolicyQualifiers() {
        return this.policyQualifiers == null ? List.of() : this.policyQualifiers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificatePolicyInformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certPolicyId;
        private @Nullable List<CertificatePolicyQualifierInfo> policyQualifiers;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificatePolicyInformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certPolicyId = defaults.certPolicyId;
    	      this.policyQualifiers = defaults.policyQualifiers;
        }

        public Builder setCertPolicyId(String certPolicyId) {
            this.certPolicyId = Objects.requireNonNull(certPolicyId);
            return this;
        }

        public Builder setPolicyQualifiers(@Nullable List<CertificatePolicyQualifierInfo> policyQualifiers) {
            this.policyQualifiers = policyQualifiers;
            return this;
        }

        public CertificatePolicyInformation build() {
            return new CertificatePolicyInformation(certPolicyId, policyQualifiers);
        }
    }
}
