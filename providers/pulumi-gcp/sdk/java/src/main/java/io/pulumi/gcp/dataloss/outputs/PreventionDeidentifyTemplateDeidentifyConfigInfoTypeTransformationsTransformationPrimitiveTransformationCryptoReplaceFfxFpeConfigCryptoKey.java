// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped;
import io.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransient;
import io.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKey {
    /**
     * Kms wrapped key
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped kmsWrapped;
    /**
     * Transient crypto key
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransient $transient;
    /**
     * Unwrapped crypto key
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped unwrapped;

    @CustomType.Constructor
    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKey(
        @CustomType.Parameter("kmsWrapped") @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped kmsWrapped,
        @CustomType.Parameter("transient") @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransient $transient,
        @CustomType.Parameter("unwrapped") @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped unwrapped) {
        this.kmsWrapped = kmsWrapped;
        this.$transient = $transient;
        this.unwrapped = unwrapped;
    }

    /**
     * Kms wrapped key
     * Structure is documented below.
     * 
    */
    public Optional<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped> getKmsWrapped() {
        return Optional.ofNullable(this.kmsWrapped);
    }
    /**
     * Transient crypto key
     * Structure is documented below.
     * 
    */
    public Optional<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransient> get$transient() {
        return Optional.ofNullable(this.$transient);
    }
    /**
     * Unwrapped crypto key
     * Structure is documented below.
     * 
    */
    public Optional<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped> getUnwrapped() {
        return Optional.ofNullable(this.unwrapped);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped kmsWrapped;
        private @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransient $transient;
        private @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped unwrapped;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsWrapped = defaults.kmsWrapped;
    	      this.$transient = defaults.$transient;
    	      this.unwrapped = defaults.unwrapped;
        }

        public Builder kmsWrapped(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped kmsWrapped) {
            this.kmsWrapped = kmsWrapped;
            return this;
        }
        public Builder $transient(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyTransient $transient) {
            this.$transient = $transient;
            return this;
        }
        public Builder unwrapped(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped unwrapped) {
            this.unwrapped = unwrapped;
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKey build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKey(kmsWrapped, $transient, unwrapped);
        }
    }
}
