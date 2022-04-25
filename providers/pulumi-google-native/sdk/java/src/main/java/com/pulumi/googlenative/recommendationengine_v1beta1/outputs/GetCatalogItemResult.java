// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recommendationengine_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.recommendationengine_v1beta1.outputs.GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse;
import com.pulumi.googlenative.recommendationengine_v1beta1.outputs.GoogleCloudRecommendationengineV1beta1FeatureMapResponse;
import com.pulumi.googlenative.recommendationengine_v1beta1.outputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCatalogItemResult {
    /**
     * @return Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both [&#34;Shoes &amp; Accessories&#34; -&gt; &#34;Shoes&#34;] and [&#34;Sports &amp; Fitness&#34; -&gt; &#34;Athletic Clothing&#34; -&gt; &#34;Shoes&#34;], it could be represented as: &#34;categoryHierarchies&#34;: [ { &#34;categories&#34;: [&#34;Shoes &amp; Accessories&#34;, &#34;Shoes&#34;]}, { &#34;categories&#34;: [&#34;Sports &amp; Fitness&#34;, &#34;Athletic Clothing&#34;, &#34;Shoes&#34;] } ]
     * 
     */
    private final List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse> categoryHierarchies;
    /**
     * @return Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
     * 
     */
    private final String description;
    /**
     * @return Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
     * 
     */
    private final GoogleCloudRecommendationengineV1beta1FeatureMapResponse itemAttributes;
    /**
     * @return Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
     * 
     */
    private final String itemGroupId;
    /**
     * @return Optional. Metadata specific to retail products.
     * 
     */
    private final GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse productMetadata;
    /**
     * @return Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
     * 
     */
    private final List<String> tags;
    /**
     * @return Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GetCatalogItemResult(
        @CustomType.Parameter("categoryHierarchies") List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse> categoryHierarchies,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("itemAttributes") GoogleCloudRecommendationengineV1beta1FeatureMapResponse itemAttributes,
        @CustomType.Parameter("itemGroupId") String itemGroupId,
        @CustomType.Parameter("productMetadata") GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse productMetadata,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("title") String title) {
        this.categoryHierarchies = categoryHierarchies;
        this.description = description;
        this.itemAttributes = itemAttributes;
        this.itemGroupId = itemGroupId;
        this.productMetadata = productMetadata;
        this.tags = tags;
        this.title = title;
    }

    /**
     * @return Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both [&#34;Shoes &amp; Accessories&#34; -&gt; &#34;Shoes&#34;] and [&#34;Sports &amp; Fitness&#34; -&gt; &#34;Athletic Clothing&#34; -&gt; &#34;Shoes&#34;], it could be represented as: &#34;categoryHierarchies&#34;: [ { &#34;categories&#34;: [&#34;Shoes &amp; Accessories&#34;, &#34;Shoes&#34;]}, { &#34;categories&#34;: [&#34;Sports &amp; Fitness&#34;, &#34;Athletic Clothing&#34;, &#34;Shoes&#34;] } ]
     * 
     */
    public List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse> categoryHierarchies() {
        return this.categoryHierarchies;
    }
    /**
     * @return Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
     * 
     */
    public GoogleCloudRecommendationengineV1beta1FeatureMapResponse itemAttributes() {
        return this.itemAttributes;
    }
    /**
     * @return Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
     * 
     */
    public String itemGroupId() {
        return this.itemGroupId;
    }
    /**
     * @return Optional. Metadata specific to retail products.
     * 
     */
    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse productMetadata() {
        return this.productMetadata;
    }
    /**
     * @return Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCatalogItemResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse> categoryHierarchies;
        private String description;
        private GoogleCloudRecommendationengineV1beta1FeatureMapResponse itemAttributes;
        private String itemGroupId;
        private GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse productMetadata;
        private List<String> tags;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCatalogItemResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryHierarchies = defaults.categoryHierarchies;
    	      this.description = defaults.description;
    	      this.itemAttributes = defaults.itemAttributes;
    	      this.itemGroupId = defaults.itemGroupId;
    	      this.productMetadata = defaults.productMetadata;
    	      this.tags = defaults.tags;
    	      this.title = defaults.title;
        }

        public Builder categoryHierarchies(List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse> categoryHierarchies) {
            this.categoryHierarchies = Objects.requireNonNull(categoryHierarchies);
            return this;
        }
        public Builder categoryHierarchies(GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse... categoryHierarchies) {
            return categoryHierarchies(List.of(categoryHierarchies));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder itemAttributes(GoogleCloudRecommendationengineV1beta1FeatureMapResponse itemAttributes) {
            this.itemAttributes = Objects.requireNonNull(itemAttributes);
            return this;
        }
        public Builder itemGroupId(String itemGroupId) {
            this.itemGroupId = Objects.requireNonNull(itemGroupId);
            return this;
        }
        public Builder productMetadata(GoogleCloudRecommendationengineV1beta1ProductCatalogItemResponse productMetadata) {
            this.productMetadata = Objects.requireNonNull(productMetadata);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GetCatalogItemResult build() {
            return new GetCatalogItemResult(categoryHierarchies, description, itemAttributes, itemGroupId, productMetadata, tags, title);
        }
    }
}
