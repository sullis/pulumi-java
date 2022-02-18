// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.enums.RestMatchQuantifier;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The regular expressions to match the response content with.
 * 
 */
public final class RestResponseRegexArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestResponseRegexArgs Empty = new RestResponseRegexArgs();

    /**
     * Indicates whether any or all of the expressions should match with the response content.
     * 
     */
    @InputImport(name="matchQuantifier")
    private final @Nullable Input<RestMatchQuantifier> matchQuantifier;

    public Input<RestMatchQuantifier> getMatchQuantifier() {
        return this.matchQuantifier == null ? Input.empty() : this.matchQuantifier;
    }

    /**
     * The list of regular expressions.
     * 
     */
    @InputImport(name="matches")
    private final @Nullable Input<List<String>> matches;

    public Input<List<String>> getMatches() {
        return this.matches == null ? Input.empty() : this.matches;
    }

    public RestResponseRegexArgs(
        @Nullable Input<RestMatchQuantifier> matchQuantifier,
        @Nullable Input<List<String>> matches) {
        this.matchQuantifier = matchQuantifier;
        this.matches = matches;
    }

    private RestResponseRegexArgs() {
        this.matchQuantifier = Input.empty();
        this.matches = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestResponseRegexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RestMatchQuantifier> matchQuantifier;
        private @Nullable Input<List<String>> matches;

        public Builder() {
    	      // Empty
        }

        public Builder(RestResponseRegexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchQuantifier = defaults.matchQuantifier;
    	      this.matches = defaults.matches;
        }

        public Builder setMatchQuantifier(@Nullable Input<RestMatchQuantifier> matchQuantifier) {
            this.matchQuantifier = matchQuantifier;
            return this;
        }

        public Builder setMatchQuantifier(@Nullable RestMatchQuantifier matchQuantifier) {
            this.matchQuantifier = Input.ofNullable(matchQuantifier);
            return this;
        }

        public Builder setMatches(@Nullable Input<List<String>> matches) {
            this.matches = matches;
            return this;
        }

        public Builder setMatches(@Nullable List<String> matches) {
            this.matches = Input.ofNullable(matches);
            return this;
        }

        public RestResponseRegexArgs build() {
            return new RestResponseRegexArgs(matchQuantifier, matches);
        }
    }
}
