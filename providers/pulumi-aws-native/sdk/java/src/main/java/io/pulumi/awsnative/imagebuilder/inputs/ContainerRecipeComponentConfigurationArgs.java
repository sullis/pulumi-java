// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration details of the component.
 * 
 */
public final class ContainerRecipeComponentConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerRecipeComponentConfigurationArgs Empty = new ContainerRecipeComponentConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) of the component.
     * 
     */
    @InputImport(name="componentArn")
    private final @Nullable Input<String> componentArn;

    public Input<String> getComponentArn() {
        return this.componentArn == null ? Input.empty() : this.componentArn;
    }

    public ContainerRecipeComponentConfigurationArgs(@Nullable Input<String> componentArn) {
        this.componentArn = componentArn;
    }

    private ContainerRecipeComponentConfigurationArgs() {
        this.componentArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeComponentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> componentArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeComponentConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
        }

        public Builder setComponentArn(@Nullable Input<String> componentArn) {
            this.componentArn = componentArn;
            return this;
        }

        public Builder setComponentArn(@Nullable String componentArn) {
            this.componentArn = Input.ofNullable(componentArn);
            return this;
        }

        public ContainerRecipeComponentConfigurationArgs build() {
            return new ContainerRecipeComponentConfigurationArgs(componentArn);
        }
    }
}
