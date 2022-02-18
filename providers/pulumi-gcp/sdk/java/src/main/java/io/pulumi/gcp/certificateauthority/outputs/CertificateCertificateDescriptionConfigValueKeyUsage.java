// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsage;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateCertificateDescriptionConfigValueKeyUsage {
    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage> baseKeyUsages;
    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsage> extendedKeyUsages;
    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages;

    @OutputCustomType.Constructor({"baseKeyUsages","extendedKeyUsages","unknownExtendedKeyUsages"})
    private CertificateCertificateDescriptionConfigValueKeyUsage(
        @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage> baseKeyUsages,
        @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsage> extendedKeyUsages,
        @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages) {
        this.baseKeyUsages = baseKeyUsages;
        this.extendedKeyUsages = extendedKeyUsages;
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage> getBaseKeyUsages() {
        return this.baseKeyUsages == null ? List.of() : this.baseKeyUsages;
    }
    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsage> getExtendedKeyUsages() {
        return this.extendedKeyUsages == null ? List.of() : this.extendedKeyUsages;
    }
    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? List.of() : this.unknownExtendedKeyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage> baseKeyUsages;
        private @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsage> extendedKeyUsages;
        private @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsages = defaults.baseKeyUsages;
    	      this.extendedKeyUsages = defaults.extendedKeyUsages;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder setBaseKeyUsages(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage> baseKeyUsages) {
            this.baseKeyUsages = baseKeyUsages;
            return this;
        }

        public Builder setExtendedKeyUsages(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsage> extendedKeyUsages) {
            this.extendedKeyUsages = extendedKeyUsages;
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        public CertificateCertificateDescriptionConfigValueKeyUsage build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsage(baseKeyUsages, extendedKeyUsages, unknownExtendedKeyUsages);
        }
    }
}
