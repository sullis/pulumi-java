// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesis.outputs;

import io.pulumi.awsnative.kinesis.enums.StreamEncryptionEncryptionType;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StreamEncryption {
    /**
     * The encryption type to use. The only valid value is KMS.
     * 
     */
    private final StreamEncryptionEncryptionType encryptionType;
    /**
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.
     * 
     */
    private final String keyId;

    @CustomType.Constructor
    private StreamEncryption(
        @CustomType.Parameter("encryptionType") StreamEncryptionEncryptionType encryptionType,
        @CustomType.Parameter("keyId") String keyId) {
        this.encryptionType = encryptionType;
        this.keyId = keyId;
    }

    /**
     * The encryption type to use. The only valid value is KMS.
     * 
    */
    public StreamEncryptionEncryptionType encryptionType() {
        return this.encryptionType;
    }
    /**
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.
     * 
    */
    public String keyId() {
        return this.keyId;
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

        public Builder encryptionType(StreamEncryptionEncryptionType encryptionType) {
            this.encryptionType = Objects.requireNonNull(encryptionType);
            return this;
        }
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }        public StreamEncryption build() {
            return new StreamEncryption(encryptionType, keyId);
        }
    }
}
