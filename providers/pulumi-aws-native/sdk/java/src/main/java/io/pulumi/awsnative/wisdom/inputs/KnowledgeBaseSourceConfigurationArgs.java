// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom.inputs;

import io.pulumi.awsnative.wisdom.inputs.KnowledgeBaseAppIntegrationsConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KnowledgeBaseSourceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final KnowledgeBaseSourceConfigurationArgs Empty = new KnowledgeBaseSourceConfigurationArgs();

    @InputImport(name="appIntegrations")
    private final @Nullable Input<KnowledgeBaseAppIntegrationsConfigurationArgs> appIntegrations;

    public Input<KnowledgeBaseAppIntegrationsConfigurationArgs> getAppIntegrations() {
        return this.appIntegrations == null ? Input.empty() : this.appIntegrations;
    }

    public KnowledgeBaseSourceConfigurationArgs(@Nullable Input<KnowledgeBaseAppIntegrationsConfigurationArgs> appIntegrations) {
        this.appIntegrations = appIntegrations;
    }

    private KnowledgeBaseSourceConfigurationArgs() {
        this.appIntegrations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseSourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<KnowledgeBaseAppIntegrationsConfigurationArgs> appIntegrations;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseSourceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appIntegrations = defaults.appIntegrations;
        }

        public Builder setAppIntegrations(@Nullable Input<KnowledgeBaseAppIntegrationsConfigurationArgs> appIntegrations) {
            this.appIntegrations = appIntegrations;
            return this;
        }

        public Builder setAppIntegrations(@Nullable KnowledgeBaseAppIntegrationsConfigurationArgs appIntegrations) {
            this.appIntegrations = Input.ofNullable(appIntegrations);
            return this;
        }

        public KnowledgeBaseSourceConfigurationArgs build() {
            return new KnowledgeBaseSourceConfigurationArgs(appIntegrations);
        }
    }
}
