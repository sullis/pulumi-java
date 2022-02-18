// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageBaseKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateConfigX509ConfigKeyUsageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigKeyUsageGetArgs Empty = new CertificateConfigX509ConfigKeyUsageGetArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @InputImport(name="baseKeyUsage", required=true)
    private final Input<CertificateConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage;

    public Input<CertificateConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> getBaseKeyUsage() {
        return this.baseKeyUsage;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @InputImport(name="extendedKeyUsage", required=true)
    private final Input<CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage;

    public Input<CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> getExtendedKeyUsage() {
        return this.extendedKeyUsage;
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    @InputImport(name="unknownExtendedKeyUsages")
    private final @Nullable Input<List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages;

    public Input<List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Input.empty() : this.unknownExtendedKeyUsages;
    }

    public CertificateConfigX509ConfigKeyUsageGetArgs(
        Input<CertificateConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage,
        Input<CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage,
        @Nullable Input<List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage, "expected parameter 'baseKeyUsage' to be non-null");
        this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage, "expected parameter 'extendedKeyUsage' to be non-null");
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private CertificateConfigX509ConfigKeyUsageGetArgs() {
        this.baseKeyUsage = Input.empty();
        this.extendedKeyUsage = Input.empty();
        this.unknownExtendedKeyUsages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509ConfigKeyUsageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CertificateConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage;
        private Input<CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage;
        private @Nullable Input<List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigX509ConfigKeyUsageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder setBaseKeyUsage(Input<CertificateConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage) {
            this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
            return this;
        }

        public Builder setBaseKeyUsage(CertificateConfigX509ConfigKeyUsageBaseKeyUsageGetArgs baseKeyUsage) {
            this.baseKeyUsage = Input.of(Objects.requireNonNull(baseKeyUsage));
            return this;
        }

        public Builder setExtendedKeyUsage(Input<CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage) {
            this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
            return this;
        }

        public Builder setExtendedKeyUsage(CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs extendedKeyUsage) {
            this.extendedKeyUsage = Input.of(Objects.requireNonNull(extendedKeyUsage));
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable Input<List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Input.ofNullable(unknownExtendedKeyUsages);
            return this;
        }

        public CertificateConfigX509ConfigKeyUsageGetArgs build() {
            return new CertificateConfigX509ConfigKeyUsageGetArgs(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
