// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.inputs.ImageRecipeComponentParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageRecipeComponentConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRecipeComponentConfigurationArgs Empty = new ImageRecipeComponentConfigurationArgs();

    @InputImport(name="componentArn")
    private final @Nullable Input<String> componentArn;

    public Input<String> getComponentArn() {
        return this.componentArn == null ? Input.empty() : this.componentArn;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<List<ImageRecipeComponentParameterArgs>> parameters;

    public Input<List<ImageRecipeComponentParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public ImageRecipeComponentConfigurationArgs(
        @Nullable Input<String> componentArn,
        @Nullable Input<List<ImageRecipeComponentParameterArgs>> parameters) {
        this.componentArn = componentArn;
        this.parameters = parameters;
    }

    private ImageRecipeComponentConfigurationArgs() {
        this.componentArn = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeComponentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> componentArn;
        private @Nullable Input<List<ImageRecipeComponentParameterArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeComponentConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
    	      this.parameters = defaults.parameters;
        }

        public Builder setComponentArn(@Nullable Input<String> componentArn) {
            this.componentArn = componentArn;
            return this;
        }

        public Builder setComponentArn(@Nullable String componentArn) {
            this.componentArn = Input.ofNullable(componentArn);
            return this;
        }

        public Builder setParameters(@Nullable Input<List<ImageRecipeComponentParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<ImageRecipeComponentParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public ImageRecipeComponentConfigurationArgs build() {
            return new ImageRecipeComponentConfigurationArgs(componentArn, parameters);
        }
    }
}
