// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Maps a set of terms to a set of synonyms. Set of synonyms will be treated as synonyms of each query term only. `query_terms` will not be treated as synonyms of each other. Example: &#34;sneakers&#34; will use a synonym of &#34;shoes&#34;. &#34;shoes&#34; will not use a synonym of &#34;sneakers&#34;.
 * 
 */
public final class GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse Empty = new GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse();

    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    @Import(name="onewayTerms", required=true)
    private List<String> onewayTerms;

    /**
     * @return Will be [deprecated = true] post migration;
     * 
     */
    public List<String> onewayTerms() {
        return this.onewayTerms;
    }

    /**
     * Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
     * 
     */
    @Import(name="queryTerms", required=true)
    private List<String> queryTerms;

    /**
     * @return Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
     * 
     */
    public List<String> queryTerms() {
        return this.queryTerms;
    }

    /**
     * Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
     * 
     */
    @Import(name="synonyms", required=true)
    private List<String> synonyms;

    /**
     * @return Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
     * 
     */
    public List<String> synonyms() {
        return this.synonyms;
    }

    private GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse() {}

    private GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse(GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse $) {
        this.onewayTerms = $.onewayTerms;
        this.queryTerms = $.queryTerms;
        this.synonyms = $.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse $;

        public Builder() {
            $ = new GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse();
        }

        public Builder(GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse defaults) {
            $ = new GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param onewayTerms Will be [deprecated = true] post migration;
         * 
         * @return builder
         * 
         */
        public Builder onewayTerms(List<String> onewayTerms) {
            $.onewayTerms = onewayTerms;
            return this;
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
        public Builder queryTerms(List<String> queryTerms) {
            $.queryTerms = queryTerms;
            return this;
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
        public Builder synonyms(List<String> synonyms) {
            $.synonyms = synonyms;
            return this;
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

        public GoogleCloudRetailV2betaRuleOnewaySynonymsActionResponse build() {
            $.onewayTerms = Objects.requireNonNull($.onewayTerms, "expected parameter 'onewayTerms' to be non-null");
            $.queryTerms = Objects.requireNonNull($.queryTerms, "expected parameter 'queryTerms' to be non-null");
            $.synonyms = Objects.requireNonNull($.synonyms, "expected parameter 'synonyms' to be non-null");
            return $;
        }
    }

}
