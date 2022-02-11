// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesis.inputs;

import io.pulumi.awsnative.kinesis.enums.StreamEncryptionEncryptionType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class StreamEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamEncryptionArgs Empty = new StreamEncryptionArgs();

    @InputImport(name="encryptionType", required=true)
    private final Input<StreamEncryptionEncryptionType> encryptionType;

    public Input<StreamEncryptionEncryptionType> getEncryptionType() {
        return this.encryptionType;
    }

    @InputImport(name="keyId", required=true)
    private final Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId;
    }

    public StreamEncryptionArgs(
        Input<StreamEncryptionEncryptionType> encryptionType,
        Input<String> keyId) {
        this.encryptionType = Objects.requireNonNull(encryptionType, "expected parameter 'encryptionType' to be non-null");
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
    }

    private StreamEncryptionArgs() {
        this.encryptionType = Input.empty();
        this.keyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<StreamEncryptionEncryptionType> encryptionType;
        private Input<String> keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionType = defaults.encryptionType;
    	      this.keyId = defaults.keyId;
        }

        public Builder setEncryptionType(Input<StreamEncryptionEncryptionType> encryptionType) {
            this.encryptionType = Objects.requireNonNull(encryptionType);
            return this;
        }

        public Builder setEncryptionType(StreamEncryptionEncryptionType encryptionType) {
            this.encryptionType = Input.of(Objects.requireNonNull(encryptionType));
            return this;
        }

        public Builder setKeyId(Input<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Input.of(Objects.requireNonNull(keyId));
            return this;
        }

        public StreamEncryptionArgs build() {
            return new StreamEncryptionArgs(encryptionType, keyId);
        }
    }
}
