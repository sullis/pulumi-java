// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventTargetInputTransformer {
    /**
     * Key value pairs specified in the form of JSONPath (for example, time = $.time)
     * * You can have as many as 100 key-value pairs.
     * * You must use JSON dot notation, not bracket notation.
     * * The keys can't start with "AWS".
     * 
     */
    private final @Nullable Map<String,String> inputPaths;
    /**
     * Template to customize data sent to the target. Must be valid JSON. To send a string value, the string value must include double quotes. Values must be escaped for both JSON and the provider, e.g., `"\"Your string goes here.\\nA new line.\""`
     * 
     */
    private final String inputTemplate;

    @OutputCustomType.Constructor({"inputPaths","inputTemplate"})
    private EventTargetInputTransformer(
        @Nullable Map<String,String> inputPaths,
        String inputTemplate) {
        this.inputPaths = inputPaths;
        this.inputTemplate = Objects.requireNonNull(inputTemplate);
    }

    /**
     * Key value pairs specified in the form of JSONPath (for example, time = $.time)
     * * You can have as many as 100 key-value pairs.
     * * You must use JSON dot notation, not bracket notation.
     * * The keys can't start with "AWS".
     * 
    */
    public Map<String,String> getInputPaths() {
        return this.inputPaths == null ? Map.of() : this.inputPaths;
    }
    /**
     * Template to customize data sent to the target. Must be valid JSON. To send a string value, the string value must include double quotes. Values must be escaped for both JSON and the provider, e.g., `"\"Your string goes here.\\nA new line.\""`
     * 
    */
    public String getInputTemplate() {
        return this.inputTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetInputTransformer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> inputPaths;
        private String inputTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetInputTransformer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputPaths = defaults.inputPaths;
    	      this.inputTemplate = defaults.inputTemplate;
        }

        public Builder setInputPaths(@Nullable Map<String,String> inputPaths) {
            this.inputPaths = inputPaths;
            return this;
        }

        public Builder setInputTemplate(String inputTemplate) {
            this.inputTemplate = Objects.requireNonNull(inputTemplate);
            return this;
        }
        public EventTargetInputTransformer build() {
            return new EventTargetInputTransformer(inputPaths, inputTemplate);
        }
    }
}