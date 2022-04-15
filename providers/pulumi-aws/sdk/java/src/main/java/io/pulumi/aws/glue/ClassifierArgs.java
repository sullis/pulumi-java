// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.glue.inputs.ClassifierCsvClassifierArgs;
import io.pulumi.aws.glue.inputs.ClassifierGrokClassifierArgs;
import io.pulumi.aws.glue.inputs.ClassifierJsonClassifierArgs;
import io.pulumi.aws.glue.inputs.ClassifierXmlClassifierArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassifierArgs Empty = new ClassifierArgs();

    /**
     * A classifier for Csv content. Defined below.
     * 
     */
    @Import(name="csvClassifier")
      private final @Nullable Output<ClassifierCsvClassifierArgs> csvClassifier;

    public Output<ClassifierCsvClassifierArgs> csvClassifier() {
        return this.csvClassifier == null ? Codegen.empty() : this.csvClassifier;
    }

    /**
     * A classifier that uses grok patterns. Defined below.
     * 
     */
    @Import(name="grokClassifier")
      private final @Nullable Output<ClassifierGrokClassifierArgs> grokClassifier;

    public Output<ClassifierGrokClassifierArgs> grokClassifier() {
        return this.grokClassifier == null ? Codegen.empty() : this.grokClassifier;
    }

    /**
     * A classifier for JSON content. Defined below.
     * 
     */
    @Import(name="jsonClassifier")
      private final @Nullable Output<ClassifierJsonClassifierArgs> jsonClassifier;

    public Output<ClassifierJsonClassifierArgs> jsonClassifier() {
        return this.jsonClassifier == null ? Codegen.empty() : this.jsonClassifier;
    }

    /**
     * The name of the classifier.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A classifier for XML content. Defined below.
     * 
     */
    @Import(name="xmlClassifier")
      private final @Nullable Output<ClassifierXmlClassifierArgs> xmlClassifier;

    public Output<ClassifierXmlClassifierArgs> xmlClassifier() {
        return this.xmlClassifier == null ? Codegen.empty() : this.xmlClassifier;
    }

    public ClassifierArgs(
        @Nullable Output<ClassifierCsvClassifierArgs> csvClassifier,
        @Nullable Output<ClassifierGrokClassifierArgs> grokClassifier,
        @Nullable Output<ClassifierJsonClassifierArgs> jsonClassifier,
        @Nullable Output<String> name,
        @Nullable Output<ClassifierXmlClassifierArgs> xmlClassifier) {
        this.csvClassifier = csvClassifier;
        this.grokClassifier = grokClassifier;
        this.jsonClassifier = jsonClassifier;
        this.name = name;
        this.xmlClassifier = xmlClassifier;
    }

    private ClassifierArgs() {
        this.csvClassifier = Codegen.empty();
        this.grokClassifier = Codegen.empty();
        this.jsonClassifier = Codegen.empty();
        this.name = Codegen.empty();
        this.xmlClassifier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClassifierCsvClassifierArgs> csvClassifier;
        private @Nullable Output<ClassifierGrokClassifierArgs> grokClassifier;
        private @Nullable Output<ClassifierJsonClassifierArgs> jsonClassifier;
        private @Nullable Output<String> name;
        private @Nullable Output<ClassifierXmlClassifierArgs> xmlClassifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvClassifier = defaults.csvClassifier;
    	      this.grokClassifier = defaults.grokClassifier;
    	      this.jsonClassifier = defaults.jsonClassifier;
    	      this.name = defaults.name;
    	      this.xmlClassifier = defaults.xmlClassifier;
        }

        public Builder csvClassifier(@Nullable Output<ClassifierCsvClassifierArgs> csvClassifier) {
            this.csvClassifier = csvClassifier;
            return this;
        }
        public Builder csvClassifier(@Nullable ClassifierCsvClassifierArgs csvClassifier) {
            this.csvClassifier = Codegen.ofNullable(csvClassifier);
            return this;
        }
        public Builder grokClassifier(@Nullable Output<ClassifierGrokClassifierArgs> grokClassifier) {
            this.grokClassifier = grokClassifier;
            return this;
        }
        public Builder grokClassifier(@Nullable ClassifierGrokClassifierArgs grokClassifier) {
            this.grokClassifier = Codegen.ofNullable(grokClassifier);
            return this;
        }
        public Builder jsonClassifier(@Nullable Output<ClassifierJsonClassifierArgs> jsonClassifier) {
            this.jsonClassifier = jsonClassifier;
            return this;
        }
        public Builder jsonClassifier(@Nullable ClassifierJsonClassifierArgs jsonClassifier) {
            this.jsonClassifier = Codegen.ofNullable(jsonClassifier);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder xmlClassifier(@Nullable Output<ClassifierXmlClassifierArgs> xmlClassifier) {
            this.xmlClassifier = xmlClassifier;
            return this;
        }
        public Builder xmlClassifier(@Nullable ClassifierXmlClassifierArgs xmlClassifier) {
            this.xmlClassifier = Codegen.ofNullable(xmlClassifier);
            return this;
        }        public ClassifierArgs build() {
            return new ClassifierArgs(csvClassifier, grokClassifier, jsonClassifier, name, xmlClassifier);
        }
    }
}
