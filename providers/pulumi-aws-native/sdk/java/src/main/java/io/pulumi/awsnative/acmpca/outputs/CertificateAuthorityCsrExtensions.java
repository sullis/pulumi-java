// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.awsnative.acmpca.outputs.CertificateAuthorityAccessDescription;
import io.pulumi.awsnative.acmpca.outputs.CertificateAuthorityKeyUsage;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateAuthorityCsrExtensions {
    private final @Nullable CertificateAuthorityKeyUsage keyUsage;
    private final @Nullable List<CertificateAuthorityAccessDescription> subjectInformationAccess;

    @CustomType.Constructor
    private CertificateAuthorityCsrExtensions(
        @CustomType.Parameter("keyUsage") @Nullable CertificateAuthorityKeyUsage keyUsage,
        @CustomType.Parameter("subjectInformationAccess") @Nullable List<CertificateAuthorityAccessDescription> subjectInformationAccess) {
        this.keyUsage = keyUsage;
        this.subjectInformationAccess = subjectInformationAccess;
    }

    public Optional<CertificateAuthorityKeyUsage> keyUsage() {
        return Optional.ofNullable(this.keyUsage);
    }
    public List<CertificateAuthorityAccessDescription> subjectInformationAccess() {
        return this.subjectInformationAccess == null ? List.of() : this.subjectInformationAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityCsrExtensions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CertificateAuthorityKeyUsage keyUsage;
        private @Nullable List<CertificateAuthorityAccessDescription> subjectInformationAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityCsrExtensions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUsage = defaults.keyUsage;
    	      this.subjectInformationAccess = defaults.subjectInformationAccess;
        }

        public Builder keyUsage(@Nullable CertificateAuthorityKeyUsage keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public Builder subjectInformationAccess(@Nullable List<CertificateAuthorityAccessDescription> subjectInformationAccess) {
            this.subjectInformationAccess = subjectInformationAccess;
            return this;
        }
        public Builder subjectInformationAccess(CertificateAuthorityAccessDescription... subjectInformationAccess) {
            return subjectInformationAccess(List.of(subjectInformationAccess));
        }        public CertificateAuthorityCsrExtensions build() {
            return new CertificateAuthorityCsrExtensions(keyUsage, subjectInformationAccess);
        }
    }
}
