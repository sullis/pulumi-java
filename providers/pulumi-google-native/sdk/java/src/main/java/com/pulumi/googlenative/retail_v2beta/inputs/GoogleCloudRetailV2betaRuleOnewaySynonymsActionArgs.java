// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Maps a set of terms to a set of synonyms. Set of synonyms will be treated as synonyms of each query term only. `query_terms` will not be treated as synonyms of each other. Example: &#34;sneakers&#34; will use a synonym of &#34;shoes&#34;. &#34;shoes&#34; will not use a synonym of &#34;sneakers&#34;.
 * 
 */
public final class GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs Empty = new GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs();

    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    @Import(name="onewayTerms")
    private @Nullable Output<List<String>> onewayTerms;

    /**
     * @return Will be [deprecated = true] post migration;
     * 
     */
    public Optional<Output<List<String>>> onewayTerms() {
        return Optional.ofNullable(this.onewayTerms);
    }

    /**
     * Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
     * 
     */
    @Import(name="queryTerms")
    private @Nullable Output<List<String>> queryTerms;

    /**
     * @return Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
     * 
     */
    public Optional<Output<List<String>>> queryTerms() {
        return Optional.ofNullable(this.queryTerms);
    }

    /**
     * Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
     * 
     */
    @Import(name="synonyms")
    private @Nullable Output<List<String>> synonyms;

    /**
     * @return Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
     * 
     */
    public Optional<Output<List<String>>> synonyms() {
        return Optional.ofNullable(this.synonyms);
    }

    private GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs() {}

    private GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs(GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs $) {
        this.onewayTerms = $.onewayTerms;
        this.queryTerms = $.queryTerms;
        this.synonyms = $.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs();
        }

        public Builder(GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs defaults) {
            $ = new GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param onewayTerms Will be [deprecated = true] post migration;
         * 
         * @return builder
         * 
         */
        public Builder onewayTerms(@Nullable Output<List<String>> onewayTerms) {
            $.onewayTerms = onewayTerms;
            return this;
        }

        /**
         * @param onewayTerms Will be [deprecated = true] post migration;
         * 
         * @return builder
         * 
         */
        public Builder onewayTerms(List<String> onewayTerms) {
            return onewayTerms(Output.of(onewayTerms));
        }

        /**
         * @param onewayTerms Will be [deprecated = true] post migration;
         * 
         * @return builder
         * 
         */
        public Builder onewayTerms(String... onewayTerms) {
            return onewayTerms(List.of(onewayTerms));
        }

        /**
         * @param queryTerms Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
         * 
         * @return builder
         * 
         */
        public Builder queryTerms(@Nullable Output<List<String>> queryTerms) {
            $.queryTerms = queryTerms;
            return this;
        }

        /**
         * @param queryTerms Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
         * 
         * @return builder
         * 
         */
        public Builder queryTerms(List<String> queryTerms) {
            return queryTerms(Output.of(queryTerms));
        }

        /**
         * @param queryTerms Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
         * 
         * @return builder
         * 
         */
        public Builder queryTerms(String... queryTerms) {
            return queryTerms(List.of(queryTerms));
        }

        /**
         * @param synonyms Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(@Nullable Output<List<String>> synonyms) {
            $.synonyms = synonyms;
            return this;
        }

        /**
         * @param synonyms Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(List<String> synonyms) {
            return synonyms(Output.of(synonyms));
        }

        /**
         * @param synonyms Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }

        public GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs build() {
            return $;
        }
    }

}
