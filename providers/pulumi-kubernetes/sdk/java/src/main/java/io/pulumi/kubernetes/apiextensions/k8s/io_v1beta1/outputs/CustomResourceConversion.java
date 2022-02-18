// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.WebhookClientConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomResourceConversion {
    /**
     * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `["v1beta1"]`.
     * 
     */
    private final @Nullable List<String> conversionReviewVersions;
    /**
     * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
     * 
     */
    private final String strategy;
    /**
     * webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
     * 
     */
    private final @Nullable WebhookClientConfig webhookClientConfig;

    @OutputCustomType.Constructor({"conversionReviewVersions","strategy","webhookClientConfig"})
    private CustomResourceConversion(
        @Nullable List<String> conversionReviewVersions,
        String strategy,
        @Nullable WebhookClientConfig webhookClientConfig) {
        this.conversionReviewVersions = conversionReviewVersions;
        this.strategy = Objects.requireNonNull(strategy);
        this.webhookClientConfig = webhookClientConfig;
    }

    /**
     * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `["v1beta1"]`.
     * 
     */
    public List<String> getConversionReviewVersions() {
        return this.conversionReviewVersions == null ? List.of() : this.conversionReviewVersions;
    }
    /**
     * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
     * 
     */
    public String getStrategy() {
        return this.strategy;
    }
    /**
     * webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
     * 
     */
    public Optional<WebhookClientConfig> getWebhookClientConfig() {
        return Optional.ofNullable(this.webhookClientConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceConversion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> conversionReviewVersions;
        private String strategy;
        private @Nullable WebhookClientConfig webhookClientConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceConversion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversionReviewVersions = defaults.conversionReviewVersions;
    	      this.strategy = defaults.strategy;
    	      this.webhookClientConfig = defaults.webhookClientConfig;
        }

        public Builder setConversionReviewVersions(@Nullable List<String> conversionReviewVersions) {
            this.conversionReviewVersions = conversionReviewVersions;
            return this;
        }

        public Builder setStrategy(String strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }

        public Builder setWebhookClientConfig(@Nullable WebhookClientConfig webhookClientConfig) {
            this.webhookClientConfig = webhookClientConfig;
            return this;
        }

        public CustomResourceConversion build() {
            return new CustomResourceConversion(conversionReviewVersions, strategy, webhookClientConfig);
        }
    }
}
