// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateTemplatePredefinedValuesKeyUsageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesKeyUsageGetArgs Empty = new CertificateTemplatePredefinedValuesKeyUsageGetArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * 
     */
    @InputImport(name="baseKeyUsage")
    private final @Nullable Input<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs> baseKeyUsage;

    public Input<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs> getBaseKeyUsage() {
        return this.baseKeyUsage == null ? Input.empty() : this.baseKeyUsage;
    }

    /**
     * Detailed scenarios in which a key may be used.
     * 
     */
    @InputImport(name="extendedKeyUsage")
    private final @Nullable Input<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage;

    public Input<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs> getExtendedKeyUsage() {
        return this.extendedKeyUsage == null ? Input.empty() : this.extendedKeyUsage;
    }

    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    @InputImport(name="unknownExtendedKeyUsages")
    private final @Nullable Input<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages;

    public Input<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs>> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Input.empty() : this.unknownExtendedKeyUsages;
    }

    public CertificateTemplatePredefinedValuesKeyUsageGetArgs(
        @Nullable Input<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs> baseKeyUsage,
        @Nullable Input<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage,
        @Nullable Input<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsage = baseKeyUsage;
        this.extendedKeyUsage = extendedKeyUsage;
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private CertificateTemplatePredefinedValuesKeyUsageGetArgs() {
        this.baseKeyUsage = Input.empty();
        this.extendedKeyUsage = Input.empty();
        this.unknownExtendedKeyUsages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesKeyUsageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs> baseKeyUsage;
        private @Nullable Input<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage;
        private @Nullable Input<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesKeyUsageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder setBaseKeyUsage(@Nullable Input<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs> baseKeyUsage) {
            this.baseKeyUsage = baseKeyUsage;
            return this;
        }

        public Builder setBaseKeyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageGetArgs baseKeyUsage) {
            this.baseKeyUsage = Input.ofNullable(baseKeyUsage);
            return this;
        }

        public Builder setExtendedKeyUsage(@Nullable Input<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage) {
            this.extendedKeyUsage = extendedKeyUsage;
            return this;
        }

        public Builder setExtendedKeyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageGetArgs extendedKeyUsage) {
            this.extendedKeyUsage = Input.ofNullable(extendedKeyUsage);
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable Input<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageGetArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Input.ofNullable(unknownExtendedKeyUsages);
            return this;
        }

        public CertificateTemplatePredefinedValuesKeyUsageGetArgs build() {
            return new CertificateTemplatePredefinedValuesKeyUsageGetArgs(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
