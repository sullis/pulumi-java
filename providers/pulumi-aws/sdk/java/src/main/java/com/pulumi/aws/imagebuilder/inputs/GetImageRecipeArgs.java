// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageRecipeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageRecipeArgs Empty = new GetImageRecipeArgs();

    /**
     * Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    public String arn() {
        return this.arn;
    }

    /**
     * Key-value map of resource tags for the image recipe.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key-value map of resource tags for the image recipe.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetImageRecipeArgs() {}

    private GetImageRecipeArgs(GetImageRecipeArgs $) {
        this.arn = $.arn;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageRecipeArgs $;

        public Builder() {
            $ = new GetImageRecipeArgs();
        }

        public Builder(GetImageRecipeArgs defaults) {
            $ = new GetImageRecipeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags for the image recipe.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetImageRecipeArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
