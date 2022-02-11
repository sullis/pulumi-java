// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TemplateDataSetReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateDataSetReferenceArgs Empty = new TemplateDataSetReferenceArgs();

    @InputImport(name="dataSetArn", required=true)
    private final Input<String> dataSetArn;

    public Input<String> getDataSetArn() {
        return this.dataSetArn;
    }

    @InputImport(name="dataSetPlaceholder", required=true)
    private final Input<String> dataSetPlaceholder;

    public Input<String> getDataSetPlaceholder() {
        return this.dataSetPlaceholder;
    }

    public TemplateDataSetReferenceArgs(
        Input<String> dataSetArn,
        Input<String> dataSetPlaceholder) {
        this.dataSetArn = Objects.requireNonNull(dataSetArn, "expected parameter 'dataSetArn' to be non-null");
        this.dataSetPlaceholder = Objects.requireNonNull(dataSetPlaceholder, "expected parameter 'dataSetPlaceholder' to be non-null");
    }

    private TemplateDataSetReferenceArgs() {
        this.dataSetArn = Input.empty();
        this.dataSetPlaceholder = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateDataSetReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dataSetArn;
        private Input<String> dataSetPlaceholder;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateDataSetReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetArn = defaults.dataSetArn;
    	      this.dataSetPlaceholder = defaults.dataSetPlaceholder;
        }

        public Builder setDataSetArn(Input<String> dataSetArn) {
            this.dataSetArn = Objects.requireNonNull(dataSetArn);
            return this;
        }

        public Builder setDataSetArn(String dataSetArn) {
            this.dataSetArn = Input.of(Objects.requireNonNull(dataSetArn));
            return this;
        }

        public Builder setDataSetPlaceholder(Input<String> dataSetPlaceholder) {
            this.dataSetPlaceholder = Objects.requireNonNull(dataSetPlaceholder);
            return this;
        }

        public Builder setDataSetPlaceholder(String dataSetPlaceholder) {
            this.dataSetPlaceholder = Input.of(Objects.requireNonNull(dataSetPlaceholder));
            return this;
        }

        public TemplateDataSetReferenceArgs build() {
            return new TemplateDataSetReferenceArgs(dataSetArn, dataSetPlaceholder);
        }
    }
}
