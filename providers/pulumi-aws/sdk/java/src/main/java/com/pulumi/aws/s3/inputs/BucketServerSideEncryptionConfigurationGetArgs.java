// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class BucketServerSideEncryptionConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketServerSideEncryptionConfigurationGetArgs Empty = new BucketServerSideEncryptionConfigurationGetArgs();

    /**
     * A single object for server-side encryption by default configuration. (documented below)
     * 
     */
    @Import(name="rule", required=true)
    private Output<BucketServerSideEncryptionConfigurationRuleGetArgs> rule;

    /**
     * @return A single object for server-side encryption by default configuration. (documented below)
     * 
     */
    public Output<BucketServerSideEncryptionConfigurationRuleGetArgs> rule() {
        return this.rule;
    }

    private BucketServerSideEncryptionConfigurationGetArgs() {}

    private BucketServerSideEncryptionConfigurationGetArgs(BucketServerSideEncryptionConfigurationGetArgs $) {
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketServerSideEncryptionConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketServerSideEncryptionConfigurationGetArgs $;

        public Builder() {
            $ = new BucketServerSideEncryptionConfigurationGetArgs();
        }

        public Builder(BucketServerSideEncryptionConfigurationGetArgs defaults) {
            $ = new BucketServerSideEncryptionConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rule A single object for server-side encryption by default configuration. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder rule(Output<BucketServerSideEncryptionConfigurationRuleGetArgs> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule A single object for server-side encryption by default configuration. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder rule(BucketServerSideEncryptionConfigurationRuleGetArgs rule) {
            return rule(Output.of(rule));
        }

        public BucketServerSideEncryptionConfigurationGetArgs build() {
            $.rule = Objects.requireNonNull($.rule, "expected parameter 'rule' to be non-null");
            return $;
        }
    }

}
