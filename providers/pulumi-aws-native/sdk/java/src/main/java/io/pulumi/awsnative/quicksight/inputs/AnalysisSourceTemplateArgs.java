// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.AnalysisDataSetReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * <p>The source template of an analysis.</p>
 * 
 */
public final class AnalysisSourceTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalysisSourceTemplateArgs Empty = new AnalysisSourceTemplateArgs();

    /**
     * <p>The Amazon Resource Name (ARN) of the source template of an analysis.</p>
     * 
     */
    @InputImport(name="arn", required=true)
    private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    /**
     * <p>The dataset references of the source template of an analysis.</p>
     * 
     */
    @InputImport(name="dataSetReferences", required=true)
    private final Input<List<AnalysisDataSetReferenceArgs>> dataSetReferences;

    public Input<List<AnalysisDataSetReferenceArgs>> getDataSetReferences() {
        return this.dataSetReferences;
    }

    public AnalysisSourceTemplateArgs(
        Input<String> arn,
        Input<List<AnalysisDataSetReferenceArgs>> dataSetReferences) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.dataSetReferences = Objects.requireNonNull(dataSetReferences, "expected parameter 'dataSetReferences' to be non-null");
    }

    private AnalysisSourceTemplateArgs() {
        this.arn = Input.empty();
        this.dataSetReferences = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisSourceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private Input<List<AnalysisDataSetReferenceArgs>> dataSetReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisSourceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataSetReferences = defaults.dataSetReferences;
        }

        public Builder setArn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder setDataSetReferences(Input<List<AnalysisDataSetReferenceArgs>> dataSetReferences) {
            this.dataSetReferences = Objects.requireNonNull(dataSetReferences);
            return this;
        }

        public Builder setDataSetReferences(List<AnalysisDataSetReferenceArgs> dataSetReferences) {
            this.dataSetReferences = Input.of(Objects.requireNonNull(dataSetReferences));
            return this;
        }

        public AnalysisSourceTemplateArgs build() {
            return new AnalysisSourceTemplateArgs(arn, dataSetReferences);
        }
    }
}
