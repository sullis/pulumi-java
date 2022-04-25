// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Encryption settings for the cluster.
 * 
 */
public final class EncryptionConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionConfigResponse Empty = new EncryptionConfigResponse();

    /**
     * Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    @Import(name="gcePdKmsKeyName", required=true)
    private String gcePdKmsKeyName;

    /**
     * @return Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    public String gcePdKmsKeyName() {
        return this.gcePdKmsKeyName;
    }

    private EncryptionConfigResponse() {}

    private EncryptionConfigResponse(EncryptionConfigResponse $) {
        this.gcePdKmsKeyName = $.gcePdKmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionConfigResponse $;

        public Builder() {
            $ = new EncryptionConfigResponse();
        }

        public Builder(EncryptionConfigResponse defaults) {
            $ = new EncryptionConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param gcePdKmsKeyName Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder gcePdKmsKeyName(String gcePdKmsKeyName) {
            $.gcePdKmsKeyName = gcePdKmsKeyName;
            return this;
        }

        public EncryptionConfigResponse build() {
            $.gcePdKmsKeyName = Objects.requireNonNull($.gcePdKmsKeyName, "expected parameter 'gcePdKmsKeyName' to be non-null");
            return $;
        }
    }

}
