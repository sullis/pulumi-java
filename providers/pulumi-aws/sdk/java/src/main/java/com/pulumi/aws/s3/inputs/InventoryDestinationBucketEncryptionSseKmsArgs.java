// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InventoryDestinationBucketEncryptionSseKmsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryDestinationBucketEncryptionSseKmsArgs Empty = new InventoryDestinationBucketEncryptionSseKmsArgs();

    /**
     * The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
     * 
     */
    @Import(name="keyId", required=true)
    private Output<String> keyId;

    /**
     * @return The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }

    private InventoryDestinationBucketEncryptionSseKmsArgs() {}

    private InventoryDestinationBucketEncryptionSseKmsArgs(InventoryDestinationBucketEncryptionSseKmsArgs $) {
        this.keyId = $.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryDestinationBucketEncryptionSseKmsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryDestinationBucketEncryptionSseKmsArgs $;

        public Builder() {
            $ = new InventoryDestinationBucketEncryptionSseKmsArgs();
        }

        public Builder(InventoryDestinationBucketEncryptionSseKmsArgs defaults) {
            $ = new InventoryDestinationBucketEncryptionSseKmsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyId The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
         * 
         * @return builder
         * 
         */
        public Builder keyId(Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public InventoryDestinationBucketEncryptionSseKmsArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            return $;
        }
    }

}
