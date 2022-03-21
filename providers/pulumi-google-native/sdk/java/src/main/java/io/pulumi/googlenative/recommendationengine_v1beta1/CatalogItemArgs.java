// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs;
import io.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1FeatureMapArgs;
import io.pulumi.googlenative.recommendationengine_v1beta1.inputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogItemArgs Empty = new CatalogItemArgs();

    @Import(name="catalogId", required=true)
      private final Output<String> catalogId;

    public Output<String> getCatalogId() {
        return this.catalogId;
    }

    /**
     * Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both ["Shoes & Accessories" -> "Shoes"] and ["Sports & Fitness" -> "Athletic Clothing" -> "Shoes"], it could be represented as: "categoryHierarchies": [ { "categories": ["Shoes & Accessories", "Shoes"]}, { "categories": ["Sports & Fitness", "Athletic Clothing", "Shoes"] } ]
     * 
     */
    @Import(name="categoryHierarchies", required=true)
      private final Output<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies;

    public Output<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> getCategoryHierarchies() {
        return this.categoryHierarchies;
    }

    /**
     * Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This id must be unique among all catalog items within the same catalog. It should also be used when logging user events in order for the user events to be joined with the Catalog.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
     * 
     */
    @Import(name="itemAttributes")
      private final @Nullable Output<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> itemAttributes;

    public Output<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> getItemAttributes() {
        return this.itemAttributes == null ? Output.empty() : this.itemAttributes;
    }

    /**
     * Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
     * 
     */
    @Import(name="itemGroupId")
      private final @Nullable Output<String> itemGroupId;

    public Output<String> getItemGroupId() {
        return this.itemGroupId == null ? Output.empty() : this.itemGroupId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optional. Metadata specific to retail products.
     * 
     */
    @Import(name="productMetadata")
      private final @Nullable Output<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> productMetadata;

    public Output<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> getProductMetadata() {
        return this.productMetadata == null ? Output.empty() : this.productMetadata;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
     * 
     */
    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> getTitle() {
        return this.title;
    }

    public CatalogItemArgs(
        Output<String> catalogId,
        Output<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies,
        @Nullable Output<String> description,
        Output<String> id,
        @Nullable Output<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> itemAttributes,
        @Nullable Output<String> itemGroupId,
        @Nullable Output<String> location,
        @Nullable Output<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> productMetadata,
        @Nullable Output<String> project,
        @Nullable Output<List<String>> tags,
        Output<String> title) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.categoryHierarchies = Objects.requireNonNull(categoryHierarchies, "expected parameter 'categoryHierarchies' to be non-null");
        this.description = description;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.itemAttributes = itemAttributes;
        this.itemGroupId = itemGroupId;
        this.location = location;
        this.productMetadata = productMetadata;
        this.project = project;
        this.tags = tags;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private CatalogItemArgs() {
        this.catalogId = Output.empty();
        this.categoryHierarchies = Output.empty();
        this.description = Output.empty();
        this.id = Output.empty();
        this.itemAttributes = Output.empty();
        this.itemGroupId = Output.empty();
        this.location = Output.empty();
        this.productMetadata = Output.empty();
        this.project = Output.empty();
        this.tags = Output.empty();
        this.title = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> catalogId;
        private Output<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies;
        private @Nullable Output<String> description;
        private Output<String> id;
        private @Nullable Output<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> itemAttributes;
        private @Nullable Output<String> itemGroupId;
        private @Nullable Output<String> location;
        private @Nullable Output<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> productMetadata;
        private @Nullable Output<String> project;
        private @Nullable Output<List<String>> tags;
        private Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.categoryHierarchies = defaults.categoryHierarchies;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.itemAttributes = defaults.itemAttributes;
    	      this.itemGroupId = defaults.itemGroupId;
    	      this.location = defaults.location;
    	      this.productMetadata = defaults.productMetadata;
    	      this.project = defaults.project;
    	      this.tags = defaults.tags;
    	      this.title = defaults.title;
        }

        public Builder catalogId(Output<String> catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public Builder catalogId(String catalogId) {
            this.catalogId = Output.of(Objects.requireNonNull(catalogId));
            return this;
        }
        public Builder categoryHierarchies(Output<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies) {
            this.categoryHierarchies = Objects.requireNonNull(categoryHierarchies);
            return this;
        }
        public Builder categoryHierarchies(List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs> categoryHierarchies) {
            this.categoryHierarchies = Output.of(Objects.requireNonNull(categoryHierarchies));
            return this;
        }
        public Builder categoryHierarchies(GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs... categoryHierarchies) {
            return categoryHierarchies(List.of(categoryHierarchies));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder itemAttributes(@Nullable Output<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> itemAttributes) {
            this.itemAttributes = itemAttributes;
            return this;
        }
        public Builder itemAttributes(@Nullable GoogleCloudRecommendationengineV1beta1FeatureMapArgs itemAttributes) {
            this.itemAttributes = Output.ofNullable(itemAttributes);
            return this;
        }
        public Builder itemGroupId(@Nullable Output<String> itemGroupId) {
            this.itemGroupId = itemGroupId;
            return this;
        }
        public Builder itemGroupId(@Nullable String itemGroupId) {
            this.itemGroupId = Output.ofNullable(itemGroupId);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder productMetadata(@Nullable Output<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> productMetadata) {
            this.productMetadata = productMetadata;
            return this;
        }
        public Builder productMetadata(@Nullable GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs productMetadata) {
            this.productMetadata = Output.ofNullable(productMetadata);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }        public CatalogItemArgs build() {
            return new CatalogItemArgs(catalogId, categoryHierarchies, description, id, itemAttributes, itemGroupId, location, productMetadata, project, tags, title);
        }
    }
}
