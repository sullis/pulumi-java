// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeploymentTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentTagArgs Empty = new DeploymentTagArgs();

    /**
     * The key name of the tag
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key name of the tag
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The value for the tag
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value for the tag
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private DeploymentTagArgs() {}

    private DeploymentTagArgs(DeploymentTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentTagArgs $;

        public Builder() {
            $ = new DeploymentTagArgs();
        }

        public Builder(DeploymentTagArgs defaults) {
            $ = new DeploymentTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key name of the tag
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key name of the tag
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The value for the tag
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value for the tag
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DeploymentTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
