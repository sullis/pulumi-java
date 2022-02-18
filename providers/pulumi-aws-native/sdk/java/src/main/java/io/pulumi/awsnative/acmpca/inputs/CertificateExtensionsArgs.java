// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.awsnative.acmpca.inputs.CertificateExtendedKeyUsageArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateGeneralNameArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateKeyUsageArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificatePolicyInformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Structure that contains X.500 extensions for a Certificate.
 * 
 */
public final class CertificateExtensionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateExtensionsArgs Empty = new CertificateExtensionsArgs();

    @InputImport(name="certificatePolicies")
    private final @Nullable Input<List<CertificatePolicyInformationArgs>> certificatePolicies;

    public Input<List<CertificatePolicyInformationArgs>> getCertificatePolicies() {
        return this.certificatePolicies == null ? Input.empty() : this.certificatePolicies;
    }

    @InputImport(name="extendedKeyUsage")
    private final @Nullable Input<List<CertificateExtendedKeyUsageArgs>> extendedKeyUsage;

    public Input<List<CertificateExtendedKeyUsageArgs>> getExtendedKeyUsage() {
        return this.extendedKeyUsage == null ? Input.empty() : this.extendedKeyUsage;
    }

    @InputImport(name="keyUsage")
    private final @Nullable Input<CertificateKeyUsageArgs> keyUsage;

    public Input<CertificateKeyUsageArgs> getKeyUsage() {
        return this.keyUsage == null ? Input.empty() : this.keyUsage;
    }

    @InputImport(name="subjectAlternativeNames")
    private final @Nullable Input<List<CertificateGeneralNameArgs>> subjectAlternativeNames;

    public Input<List<CertificateGeneralNameArgs>> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Input.empty() : this.subjectAlternativeNames;
    }

    public CertificateExtensionsArgs(
        @Nullable Input<List<CertificatePolicyInformationArgs>> certificatePolicies,
        @Nullable Input<List<CertificateExtendedKeyUsageArgs>> extendedKeyUsage,
        @Nullable Input<CertificateKeyUsageArgs> keyUsage,
        @Nullable Input<List<CertificateGeneralNameArgs>> subjectAlternativeNames) {
        this.certificatePolicies = certificatePolicies;
        this.extendedKeyUsage = extendedKeyUsage;
        this.keyUsage = keyUsage;
        this.subjectAlternativeNames = subjectAlternativeNames;
    }

    private CertificateExtensionsArgs() {
        this.certificatePolicies = Input.empty();
        this.extendedKeyUsage = Input.empty();
        this.keyUsage = Input.empty();
        this.subjectAlternativeNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateExtensionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CertificatePolicyInformationArgs>> certificatePolicies;
        private @Nullable Input<List<CertificateExtendedKeyUsageArgs>> extendedKeyUsage;
        private @Nullable Input<CertificateKeyUsageArgs> keyUsage;
        private @Nullable Input<List<CertificateGeneralNameArgs>> subjectAlternativeNames;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateExtensionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePolicies = defaults.certificatePolicies;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.keyUsage = defaults.keyUsage;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
        }

        public Builder setCertificatePolicies(@Nullable Input<List<CertificatePolicyInformationArgs>> certificatePolicies) {
            this.certificatePolicies = certificatePolicies;
            return this;
        }

        public Builder setCertificatePolicies(@Nullable List<CertificatePolicyInformationArgs> certificatePolicies) {
            this.certificatePolicies = Input.ofNullable(certificatePolicies);
            return this;
        }

        public Builder setExtendedKeyUsage(@Nullable Input<List<CertificateExtendedKeyUsageArgs>> extendedKeyUsage) {
            this.extendedKeyUsage = extendedKeyUsage;
            return this;
        }

        public Builder setExtendedKeyUsage(@Nullable List<CertificateExtendedKeyUsageArgs> extendedKeyUsage) {
            this.extendedKeyUsage = Input.ofNullable(extendedKeyUsage);
            return this;
        }

        public Builder setKeyUsage(@Nullable Input<CertificateKeyUsageArgs> keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        public Builder setKeyUsage(@Nullable CertificateKeyUsageArgs keyUsage) {
            this.keyUsage = Input.ofNullable(keyUsage);
            return this;
        }

        public Builder setSubjectAlternativeNames(@Nullable Input<List<CertificateGeneralNameArgs>> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder setSubjectAlternativeNames(@Nullable List<CertificateGeneralNameArgs> subjectAlternativeNames) {
            this.subjectAlternativeNames = Input.ofNullable(subjectAlternativeNames);
            return this;
        }

        public CertificateExtensionsArgs build() {
            return new CertificateExtensionsArgs(certificatePolicies, extendedKeyUsage, keyUsage, subjectAlternativeNames);
        }
    }
}
