// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationLogPattern {
    /**
     * @return The log pattern.
     * 
     */
    private final String pattern;
    /**
     * @return The name of the log pattern.
     * 
     */
    private final String patternName;
    /**
     * @return Rank of the log pattern.
     * 
     */
    private final Integer rank;

    @CustomType.Constructor
    private ApplicationLogPattern(
        @CustomType.Parameter("pattern") String pattern,
        @CustomType.Parameter("patternName") String patternName,
        @CustomType.Parameter("rank") Integer rank) {
        this.pattern = pattern;
        this.patternName = patternName;
        this.rank = rank;
    }

    /**
     * @return The log pattern.
     * 
     */
    public String pattern() {
        return this.pattern;
    }
    /**
     * @return The name of the log pattern.
     * 
     */
    public String patternName() {
        return this.patternName;
    }
    /**
     * @return Rank of the log pattern.
     * 
     */
    public Integer rank() {
        return this.rank;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLogPattern defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pattern;
        private String patternName;
        private Integer rank;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLogPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
    	      this.patternName = defaults.patternName;
    	      this.rank = defaults.rank;
        }

        public Builder pattern(String pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }
        public Builder patternName(String patternName) {
            this.patternName = Objects.requireNonNull(patternName);
            return this;
        }
        public Builder rank(Integer rank) {
            this.rank = Objects.requireNonNull(rank);
            return this;
        }        public ApplicationLogPattern build() {
            return new ApplicationLogPattern(pattern, patternName, rank);
        }
    }
}
