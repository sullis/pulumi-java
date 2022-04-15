// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.TemplateSourceAnalysisArgs;
import io.pulumi.awsnative.quicksight.inputs.TemplateSourceTemplateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The source entity of the template.</p>
 * 
 */
public final class TemplateSourceEntityArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateSourceEntityArgs Empty = new TemplateSourceEntityArgs();

    @Import(name="sourceAnalysis")
      private final @Nullable Output<TemplateSourceAnalysisArgs> sourceAnalysis;

    public Output<TemplateSourceAnalysisArgs> sourceAnalysis() {
        return this.sourceAnalysis == null ? Codegen.empty() : this.sourceAnalysis;
    }

    @Import(name="sourceTemplate")
      private final @Nullable Output<TemplateSourceTemplateArgs> sourceTemplate;

    public Output<TemplateSourceTemplateArgs> sourceTemplate() {
        return this.sourceTemplate == null ? Codegen.empty() : this.sourceTemplate;
    }

    public TemplateSourceEntityArgs(
        @Nullable Output<TemplateSourceAnalysisArgs> sourceAnalysis,
        @Nullable Output<TemplateSourceTemplateArgs> sourceTemplate) {
        this.sourceAnalysis = sourceAnalysis;
        this.sourceTemplate = sourceTemplate;
    }

    private TemplateSourceEntityArgs() {
        this.sourceAnalysis = Codegen.empty();
        this.sourceTemplate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateSourceEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TemplateSourceAnalysisArgs> sourceAnalysis;
        private @Nullable Output<TemplateSourceTemplateArgs> sourceTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateSourceEntityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceAnalysis = defaults.sourceAnalysis;
    	      this.sourceTemplate = defaults.sourceTemplate;
        }

        public Builder sourceAnalysis(@Nullable Output<TemplateSourceAnalysisArgs> sourceAnalysis) {
            this.sourceAnalysis = sourceAnalysis;
            return this;
        }
        public Builder sourceAnalysis(@Nullable TemplateSourceAnalysisArgs sourceAnalysis) {
            this.sourceAnalysis = Codegen.ofNullable(sourceAnalysis);
            return this;
        }
        public Builder sourceTemplate(@Nullable Output<TemplateSourceTemplateArgs> sourceTemplate) {
            this.sourceTemplate = sourceTemplate;
            return this;
        }
        public Builder sourceTemplate(@Nullable TemplateSourceTemplateArgs sourceTemplate) {
            this.sourceTemplate = Codegen.ofNullable(sourceTemplate);
            return this;
        }        public TemplateSourceEntityArgs build() {
            return new TemplateSourceEntityArgs(sourceAnalysis, sourceTemplate);
        }
    }
}
