// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Label object for Deployments
 * 
 */
public final class DeploymentLabelEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentLabelEntryArgs Empty = new DeploymentLabelEntryArgs();

    /**
     * Key of the label
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Key of the label
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Value of the label
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the label
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private DeploymentLabelEntryArgs() {}

    private DeploymentLabelEntryArgs(DeploymentLabelEntryArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentLabelEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentLabelEntryArgs $;

        public Builder() {
            $ = new DeploymentLabelEntryArgs();
        }

        public Builder(DeploymentLabelEntryArgs defaults) {
            $ = new DeploymentLabelEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key of the label
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key of the label
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value of the label
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the label
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DeploymentLabelEntryArgs build() {
            return $;
        }
    }

}
