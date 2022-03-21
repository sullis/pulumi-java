// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebhookFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookFilterGetArgs Empty = new WebhookFilterGetArgs();

    /**
     * The [JSON path](https://github.com/json-path/JsonPath) to filter on.
     * 
     */
    @Import(name="jsonPath", required=true)
      private final Output<String> jsonPath;

    public Output<String> getJsonPath() {
        return this.jsonPath;
    }

    /**
     * The value to match on (e.g., `refs/heads/{Branch}`). See [AWS docs](https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_WebhookFilterRule.html) for details.
     * 
     */
    @Import(name="matchEquals", required=true)
      private final Output<String> matchEquals;

    public Output<String> getMatchEquals() {
        return this.matchEquals;
    }

    public WebhookFilterGetArgs(
        Output<String> jsonPath,
        Output<String> matchEquals) {
        this.jsonPath = Objects.requireNonNull(jsonPath, "expected parameter 'jsonPath' to be non-null");
        this.matchEquals = Objects.requireNonNull(matchEquals, "expected parameter 'matchEquals' to be non-null");
    }

    private WebhookFilterGetArgs() {
        this.jsonPath = Output.empty();
        this.matchEquals = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> jsonPath;
        private Output<String> matchEquals;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonPath = defaults.jsonPath;
    	      this.matchEquals = defaults.matchEquals;
        }

        public Builder jsonPath(Output<String> jsonPath) {
            this.jsonPath = Objects.requireNonNull(jsonPath);
            return this;
        }
        public Builder jsonPath(String jsonPath) {
            this.jsonPath = Output.of(Objects.requireNonNull(jsonPath));
            return this;
        }
        public Builder matchEquals(Output<String> matchEquals) {
            this.matchEquals = Objects.requireNonNull(matchEquals);
            return this;
        }
        public Builder matchEquals(String matchEquals) {
            this.matchEquals = Output.of(Objects.requireNonNull(matchEquals));
            return this;
        }        public WebhookFilterGetArgs build() {
            return new WebhookFilterGetArgs(jsonPath, matchEquals);
        }
    }
}
