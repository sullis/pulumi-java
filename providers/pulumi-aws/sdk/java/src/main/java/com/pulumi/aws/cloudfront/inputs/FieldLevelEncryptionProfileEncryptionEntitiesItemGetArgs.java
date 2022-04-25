// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs Empty = new FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs();

    /**
     * Object that contains an attribute `items` that contains the list of field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted.
     * 
     */
    @Import(name="fieldPatterns", required=true)
    private Output<FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs> fieldPatterns;

    /**
     * @return Object that contains an attribute `items` that contains the list of field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted.
     * 
     */
    public Output<FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs> fieldPatterns() {
        return this.fieldPatterns;
    }

    /**
     * The provider associated with the public key being used for encryption.
     * 
     */
    @Import(name="providerId", required=true)
    private Output<String> providerId;

    /**
     * @return The provider associated with the public key being used for encryption.
     * 
     */
    public Output<String> providerId() {
        return this.providerId;
    }

    /**
     * The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns.
     * 
     */
    @Import(name="publicKeyId", required=true)
    private Output<String> publicKeyId;

    /**
     * @return The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns.
     * 
     */
    public Output<String> publicKeyId() {
        return this.publicKeyId;
    }

    private FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs() {}

    private FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs(FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs $) {
        this.fieldPatterns = $.fieldPatterns;
        this.providerId = $.providerId;
        this.publicKeyId = $.publicKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs $;

        public Builder() {
            $ = new FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs();
        }

        public Builder(FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs defaults) {
            $ = new FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldPatterns Object that contains an attribute `items` that contains the list of field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted.
         * 
         * @return builder
         * 
         */
        public Builder fieldPatterns(Output<FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs> fieldPatterns) {
            $.fieldPatterns = fieldPatterns;
            return this;
        }

        /**
         * @param fieldPatterns Object that contains an attribute `items` that contains the list of field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted.
         * 
         * @return builder
         * 
         */
        public Builder fieldPatterns(FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs fieldPatterns) {
            return fieldPatterns(Output.of(fieldPatterns));
        }

        /**
         * @param providerId The provider associated with the public key being used for encryption.
         * 
         * @return builder
         * 
         */
        public Builder providerId(Output<String> providerId) {
            $.providerId = providerId;
            return this;
        }

        /**
         * @param providerId The provider associated with the public key being used for encryption.
         * 
         * @return builder
         * 
         */
        public Builder providerId(String providerId) {
            return providerId(Output.of(providerId));
        }

        /**
         * @param publicKeyId The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyId(Output<String> publicKeyId) {
            $.publicKeyId = publicKeyId;
            return this;
        }

        /**
         * @param publicKeyId The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyId(String publicKeyId) {
            return publicKeyId(Output.of(publicKeyId));
        }

        public FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs build() {
            $.fieldPatterns = Objects.requireNonNull($.fieldPatterns, "expected parameter 'fieldPatterns' to be non-null");
            $.providerId = Objects.requireNonNull($.providerId, "expected parameter 'providerId' to be non-null");
            $.publicKeyId = Objects.requireNonNull($.publicKeyId, "expected parameter 'publicKeyId' to be non-null");
            return $;
        }
    }

}
