// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClassifierGrokClassifier {
    /**
     * An identifier of the data format that the classifier matches.
     * 
     */
    private final String classification;
    /**
     * Custom grok patterns used by this classifier.
     * 
     */
    private final @Nullable String customPatterns;
    /**
     * The grok pattern used by this classifier.
     * 
     */
    private final String grokPattern;

    @OutputCustomType.Constructor({"classification","customPatterns","grokPattern"})
    private ClassifierGrokClassifier(
        String classification,
        @Nullable String customPatterns,
        String grokPattern) {
        this.classification = Objects.requireNonNull(classification);
        this.customPatterns = customPatterns;
        this.grokPattern = Objects.requireNonNull(grokPattern);
    }

    /**
     * An identifier of the data format that the classifier matches.
     * 
    */
    public String getClassification() {
        return this.classification;
    }
    /**
     * Custom grok patterns used by this classifier.
     * 
    */
    public Optional<String> getCustomPatterns() {
        return Optional.ofNullable(this.customPatterns);
    }
    /**
     * The grok pattern used by this classifier.
     * 
    */
    public String getGrokPattern() {
        return this.grokPattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierGrokClassifier defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String classification;
        private @Nullable String customPatterns;
        private String grokPattern;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierGrokClassifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.customPatterns = defaults.customPatterns;
    	      this.grokPattern = defaults.grokPattern;
        }

        public Builder setClassification(String classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }

        public Builder setCustomPatterns(@Nullable String customPatterns) {
            this.customPatterns = customPatterns;
            return this;
        }

        public Builder setGrokPattern(String grokPattern) {
            this.grokPattern = Objects.requireNonNull(grokPattern);
            return this;
        }
        public ClassifierGrokClassifier build() {
            return new ClassifierGrokClassifier(classification, customPatterns, grokPattern);
        }
    }
}