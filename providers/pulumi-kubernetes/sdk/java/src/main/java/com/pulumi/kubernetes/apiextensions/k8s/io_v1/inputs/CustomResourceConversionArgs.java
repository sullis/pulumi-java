// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.WebhookConversionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 * 
 */
public final class CustomResourceConversionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceConversionArgs Empty = new CustomResourceConversionArgs();

    /**
     * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
     * 
     */
    @Import(name="strategy", required=true)
    private Output<String> strategy;

    /**
     * @return strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
     * 
     */
    public Output<String> strategy() {
        return this.strategy;
    }

    /**
     * webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.
     * 
     */
    @Import(name="webhook")
    private @Nullable Output<WebhookConversionArgs> webhook;

    /**
     * @return webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.
     * 
     */
    public Optional<Output<WebhookConversionArgs>> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    private CustomResourceConversionArgs() {}

    private CustomResourceConversionArgs(CustomResourceConversionArgs $) {
        this.strategy = $.strategy;
        this.webhook = $.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceConversionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceConversionArgs $;

        public Builder() {
            $ = new CustomResourceConversionArgs();
        }

        public Builder(CustomResourceConversionArgs defaults) {
            $ = new CustomResourceConversionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param strategy strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
         *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
         * 
         * @return builder
         * 
         */
        public Builder strategy(Output<String> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
         *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
         * 
         * @return builder
         * 
         */
        public Builder strategy(String strategy) {
            return strategy(Output.of(strategy));
        }

        /**
         * @param webhook webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.
         * 
         * @return builder
         * 
         */
        public Builder webhook(@Nullable Output<WebhookConversionArgs> webhook) {
            $.webhook = webhook;
            return this;
        }

        /**
         * @param webhook webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.
         * 
         * @return builder
         * 
         */
        public Builder webhook(WebhookConversionArgs webhook) {
            return webhook(Output.of(webhook));
        }

        public CustomResourceConversionArgs build() {
            $.strategy = Objects.requireNonNull($.strategy, "expected parameter 'strategy' to be non-null");
            return $;
        }
    }

}
