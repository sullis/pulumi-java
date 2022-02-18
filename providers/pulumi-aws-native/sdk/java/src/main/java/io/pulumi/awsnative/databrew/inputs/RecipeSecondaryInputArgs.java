// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.RecipeDataCatalogInputDefinitionArgs;
import io.pulumi.awsnative.databrew.inputs.RecipeS3LocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Secondary input
 * 
 */
public final class RecipeSecondaryInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecipeSecondaryInputArgs Empty = new RecipeSecondaryInputArgs();

    @InputImport(name="dataCatalogInputDefinition")
    private final @Nullable Input<RecipeDataCatalogInputDefinitionArgs> dataCatalogInputDefinition;

    public Input<RecipeDataCatalogInputDefinitionArgs> getDataCatalogInputDefinition() {
        return this.dataCatalogInputDefinition == null ? Input.empty() : this.dataCatalogInputDefinition;
    }

    @InputImport(name="s3InputDefinition")
    private final @Nullable Input<RecipeS3LocationArgs> s3InputDefinition;

    public Input<RecipeS3LocationArgs> getS3InputDefinition() {
        return this.s3InputDefinition == null ? Input.empty() : this.s3InputDefinition;
    }

    public RecipeSecondaryInputArgs(
        @Nullable Input<RecipeDataCatalogInputDefinitionArgs> dataCatalogInputDefinition,
        @Nullable Input<RecipeS3LocationArgs> s3InputDefinition) {
        this.dataCatalogInputDefinition = dataCatalogInputDefinition;
        this.s3InputDefinition = s3InputDefinition;
    }

    private RecipeSecondaryInputArgs() {
        this.dataCatalogInputDefinition = Input.empty();
        this.s3InputDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeSecondaryInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RecipeDataCatalogInputDefinitionArgs> dataCatalogInputDefinition;
        private @Nullable Input<RecipeS3LocationArgs> s3InputDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeSecondaryInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogInputDefinition = defaults.dataCatalogInputDefinition;
    	      this.s3InputDefinition = defaults.s3InputDefinition;
        }

        public Builder setDataCatalogInputDefinition(@Nullable Input<RecipeDataCatalogInputDefinitionArgs> dataCatalogInputDefinition) {
            this.dataCatalogInputDefinition = dataCatalogInputDefinition;
            return this;
        }

        public Builder setDataCatalogInputDefinition(@Nullable RecipeDataCatalogInputDefinitionArgs dataCatalogInputDefinition) {
            this.dataCatalogInputDefinition = Input.ofNullable(dataCatalogInputDefinition);
            return this;
        }

        public Builder setS3InputDefinition(@Nullable Input<RecipeS3LocationArgs> s3InputDefinition) {
            this.s3InputDefinition = s3InputDefinition;
            return this;
        }

        public Builder setS3InputDefinition(@Nullable RecipeS3LocationArgs s3InputDefinition) {
            this.s3InputDefinition = Input.ofNullable(s3InputDefinition);
            return this;
        }

        public RecipeSecondaryInputArgs build() {
            return new RecipeSecondaryInputArgs(dataCatalogInputDefinition, s3InputDefinition);
        }
    }
}
