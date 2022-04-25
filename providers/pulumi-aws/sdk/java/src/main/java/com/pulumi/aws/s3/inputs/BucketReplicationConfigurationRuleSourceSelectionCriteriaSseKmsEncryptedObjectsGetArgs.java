// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs Empty = new BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs();

    /**
     * Boolean which indicates if this criteria is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Boolean which indicates if this criteria is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs() {}

    private BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs(BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs $;

        public Builder() {
            $ = new BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs();
        }

        public Builder(BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs defaults) {
            $ = new BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Boolean which indicates if this criteria is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean which indicates if this criteria is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
