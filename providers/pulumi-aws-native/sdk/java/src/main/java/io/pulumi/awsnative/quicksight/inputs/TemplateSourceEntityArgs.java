// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.TemplateSourceAnalysisArgs;
import io.pulumi.awsnative.quicksight.inputs.TemplateSourceTemplateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The source entity of the template.</p>
 * 
 */
public final class TemplateSourceEntityArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateSourceEntityArgs Empty = new TemplateSourceEntityArgs();

    @InputImport(name="sourceAnalysis")
    private final @Nullable Input<TemplateSourceAnalysisArgs> sourceAnalysis;

    public Input<TemplateSourceAnalysisArgs> getSourceAnalysis() {
        return this.sourceAnalysis == null ? Input.empty() : this.sourceAnalysis;
    }

    @InputImport(name="sourceTemplate")
    private final @Nullable Input<TemplateSourceTemplateArgs> sourceTemplate;

    public Input<TemplateSourceTemplateArgs> getSourceTemplate() {
        return this.sourceTemplate == null ? Input.empty() : this.sourceTemplate;
    }

    public TemplateSourceEntityArgs(
        @Nullable Input<TemplateSourceAnalysisArgs> sourceAnalysis,
        @Nullable Input<TemplateSourceTemplateArgs> sourceTemplate) {
        this.sourceAnalysis = sourceAnalysis;
        this.sourceTemplate = sourceTemplate;
    }

    private TemplateSourceEntityArgs() {
        this.sourceAnalysis = Input.empty();
        this.sourceTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateSourceEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TemplateSourceAnalysisArgs> sourceAnalysis;
        private @Nullable Input<TemplateSourceTemplateArgs> sourceTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateSourceEntityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceAnalysis = defaults.sourceAnalysis;
    	      this.sourceTemplate = defaults.sourceTemplate;
        }

        public Builder setSourceAnalysis(@Nullable Input<TemplateSourceAnalysisArgs> sourceAnalysis) {
            this.sourceAnalysis = sourceAnalysis;
            return this;
        }

        public Builder setSourceAnalysis(@Nullable TemplateSourceAnalysisArgs sourceAnalysis) {
            this.sourceAnalysis = Input.ofNullable(sourceAnalysis);
            return this;
        }

        public Builder setSourceTemplate(@Nullable Input<TemplateSourceTemplateArgs> sourceTemplate) {
            this.sourceTemplate = sourceTemplate;
            return this;
        }

        public Builder setSourceTemplate(@Nullable TemplateSourceTemplateArgs sourceTemplate) {
            this.sourceTemplate = Input.ofNullable(sourceTemplate);
            return this;
        }

        public TemplateSourceEntityArgs build() {
            return new TemplateSourceEntityArgs(sourceAnalysis, sourceTemplate);
        }
    }
}
