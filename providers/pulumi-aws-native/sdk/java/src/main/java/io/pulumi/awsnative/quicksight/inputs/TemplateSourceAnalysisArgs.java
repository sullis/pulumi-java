// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.TemplateDataSetReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * <p>The source analysis of the template.</p>
 * 
 */
public final class TemplateSourceAnalysisArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateSourceAnalysisArgs Empty = new TemplateSourceAnalysisArgs();

    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * <p>A structure containing information about the dataset references used as placeholders
     *             in the template.</p>
     * 
     */
    @Import(name="dataSetReferences", required=true)
      private final Output<List<TemplateDataSetReferenceArgs>> dataSetReferences;

    public Output<List<TemplateDataSetReferenceArgs>> dataSetReferences() {
        return this.dataSetReferences;
    }

    public TemplateSourceAnalysisArgs(
        Output<String> arn,
        Output<List<TemplateDataSetReferenceArgs>> dataSetReferences) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.dataSetReferences = Objects.requireNonNull(dataSetReferences, "expected parameter 'dataSetReferences' to be non-null");
    }

    private TemplateSourceAnalysisArgs() {
        this.arn = Codegen.empty();
        this.dataSetReferences = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateSourceAnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private Output<List<TemplateDataSetReferenceArgs>> dataSetReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateSourceAnalysisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataSetReferences = defaults.dataSetReferences;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public Builder dataSetReferences(Output<List<TemplateDataSetReferenceArgs>> dataSetReferences) {
            this.dataSetReferences = Objects.requireNonNull(dataSetReferences);
            return this;
        }
        public Builder dataSetReferences(List<TemplateDataSetReferenceArgs> dataSetReferences) {
            this.dataSetReferences = Output.of(Objects.requireNonNull(dataSetReferences));
            return this;
        }
        public Builder dataSetReferences(TemplateDataSetReferenceArgs... dataSetReferences) {
            return dataSetReferences(List.of(dataSetReferences));
        }        public TemplateSourceAnalysisArgs build() {
            return new TemplateSourceAnalysisArgs(arn, dataSetReferences);
        }
    }
}
