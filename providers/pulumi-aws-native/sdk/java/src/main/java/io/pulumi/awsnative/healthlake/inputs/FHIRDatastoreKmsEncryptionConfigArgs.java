// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.inputs;

import io.pulumi.awsnative.healthlake.enums.FHIRDatastoreKmsEncryptionConfigCmkType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="cmkType", required=true)
    private final Input<FHIRDatastoreKmsEncryptionConfigCmkType> cmkType;

    public Input<FHIRDatastoreKmsEncryptionConfigCmkType> getCmkType() {
        return this.cmkType;
    }

    /**
     * The KMS encryption key id/alias used to encrypt the Data Store contents at rest.
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    public FHIRDatastoreKmsEncryptionConfigArgs(
        Input<FHIRDatastoreKmsEncryptionConfigCmkType> cmkType,
        @Nullable Input<String> kmsKeyId) {
        this.cmkType = Objects.requireNonNull(cmkType, "expected parameter 'cmkType' to be non-null");
        this.kmsKeyId = kmsKeyId;
    }

    private FHIRDatastoreKmsEncryptionConfigArgs() {
        this.cmkType = Input.empty();
        this.kmsKeyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FHIRDatastoreKmsEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FHIRDatastoreKmsEncryptionConfigCmkType> cmkType;
        private @Nullable Input<String> kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(FHIRDatastoreKmsEncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmkType = defaults.cmkType;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder setCmkType(Input<FHIRDatastoreKmsEncryptionConfigCmkType> cmkType) {
            this.cmkType = Objects.requireNonNull(cmkType);
            return this;
        }

        public Builder setCmkType(FHIRDatastoreKmsEncryptionConfigCmkType cmkType) {
            this.cmkType = Input.of(Objects.requireNonNull(cmkType));
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public FHIRDatastoreKmsEncryptionConfigArgs build() {
            return new FHIRDatastoreKmsEncryptionConfigArgs(cmkType, kmsKeyId);
        }
    }
}
