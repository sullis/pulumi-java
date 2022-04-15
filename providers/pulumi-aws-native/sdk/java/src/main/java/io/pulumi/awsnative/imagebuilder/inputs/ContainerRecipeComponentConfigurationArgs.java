// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="componentArn")
      private final @Nullable Output<String> componentArn;

    public Output<String> componentArn() {
        return this.componentArn == null ? Codegen.empty() : this.componentArn;
    }

    public ContainerRecipeComponentConfigurationArgs(@Nullable Output<String> componentArn) {
        this.componentArn = componentArn;
    }

    private ContainerRecipeComponentConfigurationArgs() {
        this.componentArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeComponentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> componentArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeComponentConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
        }

        public Builder componentArn(@Nullable Output<String> componentArn) {
            this.componentArn = componentArn;
            return this;
        }
        public Builder componentArn(@Nullable String componentArn) {
            this.componentArn = Codegen.ofNullable(componentArn);
            return this;
        }        public ContainerRecipeComponentConfigurationArgs build() {
            return new ContainerRecipeComponentConfigurationArgs(componentArn);
        }
    }
}
