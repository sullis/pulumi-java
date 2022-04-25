// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleFilterAndArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleFilterAndArgs Empty = new BucketReplicationConfigRuleFilterAndArgs();

    /**
     * An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * A map of tags (key and value pairs) that identifies a subset of objects to which the rule applies. The rule applies only to objects having all the tags in its tagset.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags (key and value pairs) that identifies a subset of objects to which the rule applies. The rule applies only to objects having all the tags in its tagset.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private BucketReplicationConfigRuleFilterAndArgs() {}

    private BucketReplicationConfigRuleFilterAndArgs(BucketReplicationConfigRuleFilterAndArgs $) {
        this.prefix = $.prefix;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigRuleFilterAndArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigRuleFilterAndArgs $;

        public Builder() {
            $ = new BucketReplicationConfigRuleFilterAndArgs();
        }

        public Builder(BucketReplicationConfigRuleFilterAndArgs defaults) {
            $ = new BucketReplicationConfigRuleFilterAndArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param prefix An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param tags A map of tags (key and value pairs) that identifies a subset of objects to which the rule applies. The rule applies only to objects having all the tags in its tagset.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags (key and value pairs) that identifies a subset of objects to which the rule applies. The rule applies only to objects having all the tags in its tagset.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public BucketReplicationConfigRuleFilterAndArgs build() {
            return $;
        }
    }

}
