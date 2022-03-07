// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.ContentLinkArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The integration service environment managed api deployment parameters.
 * 
 */
public final class IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs Empty = new IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs();

    /**
     * The integration service environment managed api content link for deployment.
     * 
     */
    @InputImport(name="contentLinkDefinition")
      private final @Nullable Input<ContentLinkArgs> contentLinkDefinition;

    public Input<ContentLinkArgs> getContentLinkDefinition() {
        return this.contentLinkDefinition == null ? Input.empty() : this.contentLinkDefinition;
    }

    public IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs(@Nullable Input<ContentLinkArgs> contentLinkDefinition) {
        this.contentLinkDefinition = contentLinkDefinition;
    }

    private IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs() {
        this.contentLinkDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ContentLinkArgs> contentLinkDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentLinkDefinition = defaults.contentLinkDefinition;
        }

        public Builder setContentLinkDefinition(@Nullable Input<ContentLinkArgs> contentLinkDefinition) {
            this.contentLinkDefinition = contentLinkDefinition;
            return this;
        }

        public Builder setContentLinkDefinition(@Nullable ContentLinkArgs contentLinkDefinition) {
            this.contentLinkDefinition = Input.ofNullable(contentLinkDefinition);
            return this;
        }
        public IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs build() {
            return new IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs(contentLinkDefinition);
        }
    }
}