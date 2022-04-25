// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterEncryptionConfigProvider {
    /**
     * @return ARN of the Key Management Service (KMS) customer master key (CMK). The CMK must be symmetric, created in the same region as the cluster, and if the CMK was created in a different account, the user must have access to the CMK. For more information, see [Allowing Users in Other Accounts to Use a CMK in the AWS Key Management Service Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html).
     * 
     */
    private final String keyArn;

    @CustomType.Constructor
    private ClusterEncryptionConfigProvider(@CustomType.Parameter("keyArn") String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * @return ARN of the Key Management Service (KMS) customer master key (CMK). The CMK must be symmetric, created in the same region as the cluster, and if the CMK was created in a different account, the user must have access to the CMK. For more information, see [Allowing Users in Other Accounts to Use a CMK in the AWS Key Management Service Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html).
     * 
     */
    public String keyArn() {
        return this.keyArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionConfigProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionConfigProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
        }

        public Builder keyArn(String keyArn) {
            this.keyArn = Objects.requireNonNull(keyArn);
            return this;
        }        public ClusterEncryptionConfigProvider build() {
            return new ClusterEncryptionConfigProvider(keyArn);
        }
    }
}
