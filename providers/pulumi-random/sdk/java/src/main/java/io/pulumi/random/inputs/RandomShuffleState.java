// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RandomShuffleState extends io.pulumi.resources.ResourceArgs {

    public static final RandomShuffleState Empty = new RandomShuffleState();

    /**
     * The list of strings to shuffle.
     * 
     */
    @InputImport(name="inputs")
      private final @Nullable Input<List<String>> inputs;

    public Input<List<String>> getInputs() {
        return this.inputs == null ? Input.empty() : this.inputs;
    }

    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @InputImport(name="keepers")
      private final @Nullable Input<Map<String,Object>> keepers;

    public Input<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Input.empty() : this.keepers;
    }

    /**
     * The number of results to return. Defaults to the number of items in the `input` list. If fewer items are requested, some elements will be excluded from the result. If more items are requested, items will be repeated in the result but not more frequently than the number of items in the input list.
     * 
     */
    @InputImport(name="resultCount")
      private final @Nullable Input<Integer> resultCount;

    public Input<Integer> getResultCount() {
        return this.resultCount == null ? Input.empty() : this.resultCount;
    }

    /**
     * Random permutation of the list of strings given in `input`.
     * 
     */
    @InputImport(name="results")
      private final @Nullable Input<List<String>> results;

    public Input<List<String>> getResults() {
        return this.results == null ? Input.empty() : this.results;
    }

    /**
     * Arbitrary string with which to seed the random number generator, in order to produce less-volatile permutations of the list.
     * 
     */
    @InputImport(name="seed")
      private final @Nullable Input<String> seed;

    public Input<String> getSeed() {
        return this.seed == null ? Input.empty() : this.seed;
    }

    public RandomShuffleState(
        @Nullable Input<List<String>> inputs,
        @Nullable Input<Map<String,Object>> keepers,
        @Nullable Input<Integer> resultCount,
        @Nullable Input<List<String>> results,
        @Nullable Input<String> seed) {
        this.inputs = inputs;
        this.keepers = keepers;
        this.resultCount = resultCount;
        this.results = results;
        this.seed = seed;
    }

    private RandomShuffleState() {
        this.inputs = Input.empty();
        this.keepers = Input.empty();
        this.resultCount = Input.empty();
        this.results = Input.empty();
        this.seed = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RandomShuffleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> inputs;
        private @Nullable Input<Map<String,Object>> keepers;
        private @Nullable Input<Integer> resultCount;
        private @Nullable Input<List<String>> results;
        private @Nullable Input<String> seed;

        public Builder() {
    	      // Empty
        }

        public Builder(RandomShuffleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.keepers = defaults.keepers;
    	      this.resultCount = defaults.resultCount;
    	      this.results = defaults.results;
    	      this.seed = defaults.seed;
        }

        public Builder setInputs(@Nullable Input<List<String>> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setInputs(@Nullable List<String> inputs) {
            this.inputs = Input.ofNullable(inputs);
            return this;
        }

        public Builder setKeepers(@Nullable Input<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }

        public Builder setKeepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Input.ofNullable(keepers);
            return this;
        }

        public Builder setResultCount(@Nullable Input<Integer> resultCount) {
            this.resultCount = resultCount;
            return this;
        }

        public Builder setResultCount(@Nullable Integer resultCount) {
            this.resultCount = Input.ofNullable(resultCount);
            return this;
        }

        public Builder setResults(@Nullable Input<List<String>> results) {
            this.results = results;
            return this;
        }

        public Builder setResults(@Nullable List<String> results) {
            this.results = Input.ofNullable(results);
            return this;
        }

        public Builder setSeed(@Nullable Input<String> seed) {
            this.seed = seed;
            return this;
        }

        public Builder setSeed(@Nullable String seed) {
            this.seed = Input.ofNullable(seed);
            return this;
        }
        public RandomShuffleState build() {
            return new RandomShuffleState(inputs, keepers, resultCount, results, seed);
        }
    }
}