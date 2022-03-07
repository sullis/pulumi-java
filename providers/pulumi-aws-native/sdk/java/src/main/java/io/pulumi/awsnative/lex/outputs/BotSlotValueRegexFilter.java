// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotSlotValueRegexFilter {
    /**
     * Regex pattern
     * 
     */
    private final String pattern;

    @OutputCustomType.Constructor({"pattern"})
    private BotSlotValueRegexFilter(String pattern) {
        this.pattern = Objects.requireNonNull(pattern);
    }

    /**
     * Regex pattern
     * 
    */
    public String getPattern() {
        return this.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotValueRegexFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotValueRegexFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
        }

        public Builder setPattern(String pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }
        public BotSlotValueRegexFilter build() {
            return new BotSlotValueRegexFilter(pattern);
        }
    }
}