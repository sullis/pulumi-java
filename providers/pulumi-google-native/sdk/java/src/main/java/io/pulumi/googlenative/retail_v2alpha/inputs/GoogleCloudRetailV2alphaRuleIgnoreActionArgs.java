// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Prevents a term in the query from being used in search. Example: Don't search for "shoddy".
 * 
 */
public final class GoogleCloudRetailV2alphaRuleIgnoreActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleIgnoreActionArgs Empty = new GoogleCloudRetailV2alphaRuleIgnoreActionArgs();

    /**
     * Terms to ignore in the search query.
     * 
     */
    @InputImport(name="ignoreTerms")
      private final @Nullable Input<List<String>> ignoreTerms;

    public Input<List<String>> getIgnoreTerms() {
        return this.ignoreTerms == null ? Input.empty() : this.ignoreTerms;
    }

    public GoogleCloudRetailV2alphaRuleIgnoreActionArgs(@Nullable Input<List<String>> ignoreTerms) {
        this.ignoreTerms = ignoreTerms;
    }

    private GoogleCloudRetailV2alphaRuleIgnoreActionArgs() {
        this.ignoreTerms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleIgnoreActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> ignoreTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleIgnoreActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreTerms = defaults.ignoreTerms;
        }

        public Builder setIgnoreTerms(@Nullable Input<List<String>> ignoreTerms) {
            this.ignoreTerms = ignoreTerms;
            return this;
        }

        public Builder setIgnoreTerms(@Nullable List<String> ignoreTerms) {
            this.ignoreTerms = Input.ofNullable(ignoreTerms);
            return this;
        }
        public GoogleCloudRetailV2alphaRuleIgnoreActionArgs build() {
            return new GoogleCloudRetailV2alphaRuleIgnoreActionArgs(ignoreTerms);
        }
    }
}