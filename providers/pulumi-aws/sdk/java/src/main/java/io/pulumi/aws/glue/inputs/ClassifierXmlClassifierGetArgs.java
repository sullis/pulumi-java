// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClassifierXmlClassifierGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassifierXmlClassifierGetArgs Empty = new ClassifierXmlClassifierGetArgs();

    /**
     * An identifier of the data format that the classifier matches.
     * 
     */
    @InputImport(name="classification", required=true)
      private final Input<String> classification;

    public Input<String> getClassification() {
        return this.classification;
    }

    /**
     * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by `/>`). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, `<row item_a="A" item_b="B"></row>` is okay, but `<row item_a="A" item_b="B" />` is not).
     * 
     */
    @InputImport(name="rowTag", required=true)
      private final Input<String> rowTag;

    public Input<String> getRowTag() {
        return this.rowTag;
    }

    public ClassifierXmlClassifierGetArgs(
        Input<String> classification,
        Input<String> rowTag) {
        this.classification = Objects.requireNonNull(classification, "expected parameter 'classification' to be non-null");
        this.rowTag = Objects.requireNonNull(rowTag, "expected parameter 'rowTag' to be non-null");
    }

    private ClassifierXmlClassifierGetArgs() {
        this.classification = Input.empty();
        this.rowTag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierXmlClassifierGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> classification;
        private Input<String> rowTag;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierXmlClassifierGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.rowTag = defaults.rowTag;
        }

        public Builder setClassification(Input<String> classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }

        public Builder setClassification(String classification) {
            this.classification = Input.of(Objects.requireNonNull(classification));
            return this;
        }

        public Builder setRowTag(Input<String> rowTag) {
            this.rowTag = Objects.requireNonNull(rowTag);
            return this;
        }

        public Builder setRowTag(String rowTag) {
            this.rowTag = Input.of(Objects.requireNonNull(rowTag));
            return this;
        }
        public ClassifierXmlClassifierGetArgs build() {
            return new ClassifierXmlClassifierGetArgs(classification, rowTag);
        }
    }
}