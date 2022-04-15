// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.inputs;

import io.pulumi.awsnative.healthlake.enums.FHIRDatastoreKmsEncryptionConfigCmkType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The customer-managed-key (CMK) used when creating a Data Store. If a customer owned key is not specified, an AWS owned key will be used for encryption.
 * 
 */
public final class FHIRDatastoreKmsEncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FHIRDatastoreKmsEncryptionConfigArgs Empty = new FHIRDatastoreKmsEncryptionConfigArgs();

    /**
     * The type of customer-managed-key (CMK) used for encryption. The two types of supported CMKs are customer owned CMKs and AWS owned CMKs.
     * 
     */
    @Import(name="cmkType", required=true)
      private final Output<FHIRDatastoreKmsEncryptionConfigCmkType> cmkType;

    public Output<FHIRDatastoreKmsEncryptionConfigCmkType> cmkType() {
        return this.cmkType;
    }

    /**
     * The KMS encryption key id/alias used to encrypt the Data Store contents at rest.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    public FHIRDatastoreKmsEncryptionConfigArgs(
        Output<FHIRDatastoreKmsEncryptionConfigCmkType> cmkType,
        @Nullable Output<String> kmsKeyId) {
        this.cmkType = Objects.requireNonNull(cmkType, "expected parameter 'cmkType' to be non-null");
        this.kmsKeyId = kmsKeyId;
    }

    private FHIRDatastoreKmsEncryptionConfigArgs() {
        this.cmkType = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FHIRDatastoreKmsEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FHIRDatastoreKmsEncryptionConfigCmkType> cmkType;
        private @Nullable Output<String> kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(FHIRDatastoreKmsEncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmkType = defaults.cmkType;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder cmkType(Output<FHIRDatastoreKmsEncryptionConfigCmkType> cmkType) {
            this.cmkType = Objects.requireNonNull(cmkType);
            return this;
        }
        public Builder cmkType(FHIRDatastoreKmsEncryptionConfigCmkType cmkType) {
            this.cmkType = Output.of(Objects.requireNonNull(cmkType));
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }        public FHIRDatastoreKmsEncryptionConfigArgs build() {
            return new FHIRDatastoreKmsEncryptionConfigArgs(cmkType, kmsKeyId);
        }
    }
}
