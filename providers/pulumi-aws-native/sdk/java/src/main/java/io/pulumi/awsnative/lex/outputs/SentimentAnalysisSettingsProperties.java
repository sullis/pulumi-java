// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class SentimentAnalysisSettingsProperties {
    /**
     * Enable to call Amazon Comprehend for Sentiment natively within Lex
     * 
     */
    private final Boolean detectSentiment;

    @OutputCustomType.Constructor({"detectSentiment"})
    private SentimentAnalysisSettingsProperties(Boolean detectSentiment) {
        this.detectSentiment = Objects.requireNonNull(detectSentiment);
    }

    /**
     * Enable to call Amazon Comprehend for Sentiment natively within Lex
     * 
     */
    public Boolean getDetectSentiment() {
        return this.detectSentiment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SentimentAnalysisSettingsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean detectSentiment;

        public Builder() {
    	      // Empty
        }

        public Builder(SentimentAnalysisSettingsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectSentiment = defaults.detectSentiment;
        }

        public Builder setDetectSentiment(Boolean detectSentiment) {
            this.detectSentiment = Objects.requireNonNull(detectSentiment);
            return this;
        }

        public SentimentAnalysisSettingsProperties build() {
            return new SentimentAnalysisSettingsProperties(detectSentiment);
        }
    }
}
