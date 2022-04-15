// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption {
    /**
     * A KMS key ARN that is used to encrypt the connection password. If connection password protection is enabled, the caller of CreateConnection and UpdateConnection needs at least `kms:Encrypt` permission on the specified AWS KMS key, to encrypt passwords before storing them in the Data Catalog.
     * 
     */
    private final @Nullable String awsKmsKeyId;
    /**
     * When set to `true`, passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently of the catalog encryption.
     * 
     */
    private final Boolean returnConnectionPasswordEncrypted;

    @CustomType.Constructor
    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption(
        @CustomType.Parameter("awsKmsKeyId") @Nullable String awsKmsKeyId,
        @CustomType.Parameter("returnConnectionPasswordEncrypted") Boolean returnConnectionPasswordEncrypted) {
        this.awsKmsKeyId = awsKmsKeyId;
        this.returnConnectionPasswordEncrypted = returnConnectionPasswordEncrypted;
    }

    /**
     * A KMS key ARN that is used to encrypt the connection password. If connection password protection is enabled, the caller of CreateConnection and UpdateConnection needs at least `kms:Encrypt` permission on the specified AWS KMS key, to encrypt passwords before storing them in the Data Catalog.
     * 
    */
    public Optional<String> awsKmsKeyId() {
        return Optional.ofNullable(this.awsKmsKeyId);
    }
    /**
     * When set to `true`, passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently of the catalog encryption.
     * 
    */
    public Boolean returnConnectionPasswordEncrypted() {
        return this.returnConnectionPasswordEncrypted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String awsKmsKeyId;
        private Boolean returnConnectionPasswordEncrypted;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsKmsKeyId = defaults.awsKmsKeyId;
    	      this.returnConnectionPasswordEncrypted = defaults.returnConnectionPasswordEncrypted;
        }

        public Builder awsKmsKeyId(@Nullable String awsKmsKeyId) {
            this.awsKmsKeyId = awsKmsKeyId;
            return this;
        }
        public Builder returnConnectionPasswordEncrypted(Boolean returnConnectionPasswordEncrypted) {
            this.returnConnectionPasswordEncrypted = Objects.requireNonNull(returnConnectionPasswordEncrypted);
            return this;
        }        public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption build() {
            return new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption(awsKmsKeyId, returnConnectionPasswordEncrypted);
        }
    }
}
