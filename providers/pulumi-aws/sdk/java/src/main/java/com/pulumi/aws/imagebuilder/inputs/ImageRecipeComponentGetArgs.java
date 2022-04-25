// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ImageRecipeComponentGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageRecipeComponentGetArgs Empty = new ImageRecipeComponentGetArgs();

    /**
     * Amazon Resource Name (ARN) of the Image Builder Component to associate.
     * 
     */
    @Import(name="componentArn", required=true)
    private Output<String> componentArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Component to associate.
     * 
     */
    public Output<String> componentArn() {
        return this.componentArn;
    }

    private ImageRecipeComponentGetArgs() {}

    private ImageRecipeComponentGetArgs(ImageRecipeComponentGetArgs $) {
        this.componentArn = $.componentArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageRecipeComponentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageRecipeComponentGetArgs $;

        public Builder() {
            $ = new ImageRecipeComponentGetArgs();
        }

        public Builder(ImageRecipeComponentGetArgs defaults) {
            $ = new ImageRecipeComponentGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentArn Amazon Resource Name (ARN) of the Image Builder Component to associate.
         * 
         * @return builder
         * 
         */
        public Builder componentArn(Output<String> componentArn) {
            $.componentArn = componentArn;
            return this;
        }

        /**
         * @param componentArn Amazon Resource Name (ARN) of the Image Builder Component to associate.
         * 
         * @return builder
         * 
         */
        public Builder componentArn(String componentArn) {
            return componentArn(Output.of(componentArn));
        }

        public ImageRecipeComponentGetArgs build() {
            $.componentArn = Objects.requireNonNull($.componentArn, "expected parameter 'componentArn' to be non-null");
            return $;
        }
    }

}
