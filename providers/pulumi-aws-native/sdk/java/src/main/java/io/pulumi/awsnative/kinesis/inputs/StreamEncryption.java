// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesis.inputs;

import io.pulumi.awsnative.kinesis.enums.StreamEncryptionEncryptionType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * When specified, enables or updates server-side encryption using an AWS KMS key for a specified stream. Removing this property from your stack template and updating your stack disables encryption.
 * 
 */
public final class StreamEncryption extends io.pulumi.resources.InvokeArgs {

    public static final StreamEncryption Empty = new StreamEncryption();

    /**
     * The encryption type to use. The only valid value is KMS.
     * 
     */
    @InputImport(name="encryptionType", required=true)
      private final StreamEncryptionEncryptionType encryptionType;

    public StreamEncryptionEncryptionType getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.
     * 
     */
    @InputImport(name="keyId", required=true)
      private final String keyId;

    public String getKeyId() {
        return this.keyId;
    }

    public StreamEncryption(
        StreamEncryptionEncryptionType encryptionType,
        String keyId) {
        this.encryptionType = Objects.requireNonNull(encryptionType, "expected parameter 'encryptionType' to be non-null");
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
    }

    private StreamEncryption() {
        this.encryptionType = null;
        this.keyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamEncryptionEncryptionType encryptionType;
        private String keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionType = defaults.encryptionType;
    	      this.keyId = defaults.keyId;
        }

        public Builder setEncryptionType(StreamEncryptionEncryptionType encryptionType) {
            this.encryptionType = Objects.requireNonNull(encryptionType);
            return this;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public StreamEncryption build() {
            return new StreamEncryption(encryptionType, keyId);
        }
    }
}