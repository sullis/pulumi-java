// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WarningResponse {
    /**
     * @return The priority for this warning.
     * 
     */
    private final String priority;
    /**
     * @return Explanation of the warning generated.
     * 
     */
    private final String text;

    @CustomType.Constructor
    private WarningResponse(
        @CustomType.Parameter("priority") String priority,
        @CustomType.Parameter("text") String text) {
        this.priority = priority;
        this.text = text;
    }

    /**
     * @return The priority for this warning.
     * 
     */
    public String priority() {
        return this.priority;
    }
    /**
     * @return Explanation of the warning generated.
     * 
     */
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WarningResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String priority;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(WarningResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.text = defaults.text;
        }

        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public WarningResponse build() {
            return new WarningResponse(priority, text);
        }
    }
}
