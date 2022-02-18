// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionConstraintsResource;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModelBiasJobDefinitionModelBiasBaselineConfig {
    private final @Nullable String baseliningJobName;
    private final @Nullable ModelBiasJobDefinitionConstraintsResource constraintsResource;

    @OutputCustomType.Constructor({"baseliningJobName","constraintsResource"})
    private ModelBiasJobDefinitionModelBiasBaselineConfig(
        @Nullable String baseliningJobName,
        @Nullable ModelBiasJobDefinitionConstraintsResource constraintsResource) {
        this.baseliningJobName = baseliningJobName;
        this.constraintsResource = constraintsResource;
    }

    public Optional<String> getBaseliningJobName() {
        return Optional.ofNullable(this.baseliningJobName);
    }
    public Optional<ModelBiasJobDefinitionConstraintsResource> getConstraintsResource() {
        return Optional.ofNullable(this.constraintsResource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionModelBiasBaselineConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String baseliningJobName;
        private @Nullable ModelBiasJobDefinitionConstraintsResource constraintsResource;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionModelBiasBaselineConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseliningJobName = defaults.baseliningJobName;
    	      this.constraintsResource = defaults.constraintsResource;
        }

        public Builder setBaseliningJobName(@Nullable String baseliningJobName) {
            this.baseliningJobName = baseliningJobName;
            return this;
        }

        public Builder setConstraintsResource(@Nullable ModelBiasJobDefinitionConstraintsResource constraintsResource) {
            this.constraintsResource = constraintsResource;
            return this;
        }

        public ModelBiasJobDefinitionModelBiasBaselineConfig build() {
            return new ModelBiasJobDefinitionModelBiasBaselineConfig(baseliningJobName, constraintsResource);
        }
    }
}
