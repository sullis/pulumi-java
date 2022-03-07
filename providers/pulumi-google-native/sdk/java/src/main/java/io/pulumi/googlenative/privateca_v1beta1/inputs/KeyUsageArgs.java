// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ExtendedKeyUsageOptionsArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.KeyUsageOptionsArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ObjectIdArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A KeyUsage describes key usage values that may appear in an X.509 certificate.
 * 
 */
public final class KeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyUsageArgs Empty = new KeyUsageArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * 
     */
    @InputImport(name="baseKeyUsage")
      private final @Nullable Input<KeyUsageOptionsArgs> baseKeyUsage;

    public Input<KeyUsageOptionsArgs> getBaseKeyUsage() {
        return this.baseKeyUsage == null ? Input.empty() : this.baseKeyUsage;
    }

    /**
     * Detailed scenarios in which a key may be used.
     * 
     */
    @InputImport(name="extendedKeyUsage")
      private final @Nullable Input<ExtendedKeyUsageOptionsArgs> extendedKeyUsage;

    public Input<ExtendedKeyUsageOptionsArgs> getExtendedKeyUsage() {
        return this.extendedKeyUsage == null ? Input.empty() : this.extendedKeyUsage;
    }

    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    @InputImport(name="unknownExtendedKeyUsages")
      private final @Nullable Input<List<ObjectIdArgs>> unknownExtendedKeyUsages;

    public Input<List<ObjectIdArgs>> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Input.empty() : this.unknownExtendedKeyUsages;
    }

    public KeyUsageArgs(
        @Nullable Input<KeyUsageOptionsArgs> baseKeyUsage,
        @Nullable Input<ExtendedKeyUsageOptionsArgs> extendedKeyUsage,
        @Nullable Input<List<ObjectIdArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsage = baseKeyUsage;
        this.extendedKeyUsage = extendedKeyUsage;
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private KeyUsageArgs() {
        this.baseKeyUsage = Input.empty();
        this.extendedKeyUsage = Input.empty();
        this.unknownExtendedKeyUsages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<KeyUsageOptionsArgs> baseKeyUsage;
        private @Nullable Input<ExtendedKeyUsageOptionsArgs> extendedKeyUsage;
        private @Nullable Input<List<ObjectIdArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder setBaseKeyUsage(@Nullable Input<KeyUsageOptionsArgs> baseKeyUsage) {
            this.baseKeyUsage = baseKeyUsage;
            return this;
        }

        public Builder setBaseKeyUsage(@Nullable KeyUsageOptionsArgs baseKeyUsage) {
            this.baseKeyUsage = Input.ofNullable(baseKeyUsage);
            return this;
        }

        public Builder setExtendedKeyUsage(@Nullable Input<ExtendedKeyUsageOptionsArgs> extendedKeyUsage) {
            this.extendedKeyUsage = extendedKeyUsage;
            return this;
        }

        public Builder setExtendedKeyUsage(@Nullable ExtendedKeyUsageOptionsArgs extendedKeyUsage) {
            this.extendedKeyUsage = Input.ofNullable(extendedKeyUsage);
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable Input<List<ObjectIdArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable List<ObjectIdArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Input.ofNullable(unknownExtendedKeyUsages);
            return this;
        }
        public KeyUsageArgs build() {
            return new KeyUsageArgs(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}