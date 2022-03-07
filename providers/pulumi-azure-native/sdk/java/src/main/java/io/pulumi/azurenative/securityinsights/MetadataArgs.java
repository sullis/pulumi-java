// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.Kind;
import io.pulumi.azurenative.securityinsights.inputs.MetadataAuthorArgs;
import io.pulumi.azurenative.securityinsights.inputs.MetadataCategoriesArgs;
import io.pulumi.azurenative.securityinsights.inputs.MetadataDependenciesArgs;
import io.pulumi.azurenative.securityinsights.inputs.MetadataSourceArgs;
import io.pulumi.azurenative.securityinsights.inputs.MetadataSupportArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataArgs Empty = new MetadataArgs();

    /**
     * The creator of the content item.
     * 
     */
    @InputImport(name="author")
      private final @Nullable Input<MetadataAuthorArgs> author;

    public Input<MetadataAuthorArgs> getAuthor() {
        return this.author == null ? Input.empty() : this.author;
    }

    /**
     * Categories for the solution content item
     * 
     */
    @InputImport(name="categories")
      private final @Nullable Input<MetadataCategoriesArgs> categories;

    public Input<MetadataCategoriesArgs> getCategories() {
        return this.categories == null ? Input.empty() : this.categories;
    }

    /**
     * Static ID for the content.  Used to identify dependencies and content from solutions or community.  Hard-coded/static for out of the box content and solutions. Dynamic for user-created.  This is the resource name
     * 
     */
    @InputImport(name="contentId")
      private final @Nullable Input<String> contentId;

    public Input<String> getContentId() {
        return this.contentId == null ? Input.empty() : this.contentId;
    }

    /**
     * Dependencies for the content item, what other content items it requires to work.  Can describe more complex dependencies using a recursive/nested structure. For a single dependency an id/kind/version can be supplied or operator/criteria for complex formats.
     * 
     */
    @InputImport(name="dependencies")
      private final @Nullable Input<MetadataDependenciesArgs> dependencies;

    public Input<MetadataDependenciesArgs> getDependencies() {
        return this.dependencies == null ? Input.empty() : this.dependencies;
    }

    /**
     * first publish date solution content item
     * 
     */
    @InputImport(name="firstPublishDate")
      private final @Nullable Input<String> firstPublishDate;

    public Input<String> getFirstPublishDate() {
        return this.firstPublishDate == null ? Input.empty() : this.firstPublishDate;
    }

    /**
     * The kind of content the metadata is for.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,Kind>> kind;

    public Input<Either<String,Kind>> getKind() {
        return this.kind;
    }

    /**
     * last publish date for the solution content item
     * 
     */
    @InputImport(name="lastPublishDate")
      private final @Nullable Input<String> lastPublishDate;

    public Input<String> getLastPublishDate() {
        return this.lastPublishDate == null ? Input.empty() : this.lastPublishDate;
    }

    /**
     * The Metadata name.
     * 
     */
    @InputImport(name="metadataName")
      private final @Nullable Input<String> metadataName;

    public Input<String> getMetadataName() {
        return this.metadataName == null ? Input.empty() : this.metadataName;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
      private final Input<String> operationalInsightsResourceProvider;

    public Input<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * Full parent resource ID of the content item the metadata is for.  This is the full resource ID including the scope (subscription and resource group)
     * 
     */
    @InputImport(name="parentId", required=true)
      private final Input<String> parentId;

    public Input<String> getParentId() {
        return this.parentId;
    }

    /**
     * Providers for the solution content item
     * 
     */
    @InputImport(name="providers")
      private final @Nullable Input<List<String>> providers;

    public Input<List<String>> getProviders() {
        return this.providers == null ? Input.empty() : this.providers;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Source of the content.  This is where/how it was created.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<MetadataSourceArgs> source;

    public Input<MetadataSourceArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * Support information for the metadata - type, name, contact information
     * 
     */
    @InputImport(name="support")
      private final @Nullable Input<MetadataSupportArgs> support;

    public Input<MetadataSupportArgs> getSupport() {
        return this.support == null ? Input.empty() : this.support;
    }

    /**
     * Version of the content.  Default and recommended format is numeric (e.g. 1, 1.0, 1.0.0, 1.0.0.0), following ARM template best practices.  Can also be any string, but then we cannot guarantee any version checks
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public MetadataArgs(
        @Nullable Input<MetadataAuthorArgs> author,
        @Nullable Input<MetadataCategoriesArgs> categories,
        @Nullable Input<String> contentId,
        @Nullable Input<MetadataDependenciesArgs> dependencies,
        @Nullable Input<String> firstPublishDate,
        Input<Either<String,Kind>> kind,
        @Nullable Input<String> lastPublishDate,
        @Nullable Input<String> metadataName,
        Input<String> operationalInsightsResourceProvider,
        Input<String> parentId,
        @Nullable Input<List<String>> providers,
        Input<String> resourceGroupName,
        @Nullable Input<MetadataSourceArgs> source,
        @Nullable Input<MetadataSupportArgs> support,
        @Nullable Input<String> version,
        Input<String> workspaceName) {
        this.author = author;
        this.categories = categories;
        this.contentId = contentId;
        this.dependencies = dependencies;
        this.firstPublishDate = firstPublishDate;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.lastPublishDate = lastPublishDate;
        this.metadataName = metadataName;
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.parentId = Objects.requireNonNull(parentId, "expected parameter 'parentId' to be non-null");
        this.providers = providers;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.source = source;
        this.support = support;
        this.version = version;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private MetadataArgs() {
        this.author = Input.empty();
        this.categories = Input.empty();
        this.contentId = Input.empty();
        this.dependencies = Input.empty();
        this.firstPublishDate = Input.empty();
        this.kind = Input.empty();
        this.lastPublishDate = Input.empty();
        this.metadataName = Input.empty();
        this.operationalInsightsResourceProvider = Input.empty();
        this.parentId = Input.empty();
        this.providers = Input.empty();
        this.resourceGroupName = Input.empty();
        this.source = Input.empty();
        this.support = Input.empty();
        this.version = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MetadataAuthorArgs> author;
        private @Nullable Input<MetadataCategoriesArgs> categories;
        private @Nullable Input<String> contentId;
        private @Nullable Input<MetadataDependenciesArgs> dependencies;
        private @Nullable Input<String> firstPublishDate;
        private Input<Either<String,Kind>> kind;
        private @Nullable Input<String> lastPublishDate;
        private @Nullable Input<String> metadataName;
        private Input<String> operationalInsightsResourceProvider;
        private Input<String> parentId;
        private @Nullable Input<List<String>> providers;
        private Input<String> resourceGroupName;
        private @Nullable Input<MetadataSourceArgs> source;
        private @Nullable Input<MetadataSupportArgs> support;
        private @Nullable Input<String> version;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.categories = defaults.categories;
    	      this.contentId = defaults.contentId;
    	      this.dependencies = defaults.dependencies;
    	      this.firstPublishDate = defaults.firstPublishDate;
    	      this.kind = defaults.kind;
    	      this.lastPublishDate = defaults.lastPublishDate;
    	      this.metadataName = defaults.metadataName;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.parentId = defaults.parentId;
    	      this.providers = defaults.providers;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.source = defaults.source;
    	      this.support = defaults.support;
    	      this.version = defaults.version;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setAuthor(@Nullable Input<MetadataAuthorArgs> author) {
            this.author = author;
            return this;
        }

        public Builder setAuthor(@Nullable MetadataAuthorArgs author) {
            this.author = Input.ofNullable(author);
            return this;
        }

        public Builder setCategories(@Nullable Input<MetadataCategoriesArgs> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setCategories(@Nullable MetadataCategoriesArgs categories) {
            this.categories = Input.ofNullable(categories);
            return this;
        }

        public Builder setContentId(@Nullable Input<String> contentId) {
            this.contentId = contentId;
            return this;
        }

        public Builder setContentId(@Nullable String contentId) {
            this.contentId = Input.ofNullable(contentId);
            return this;
        }

        public Builder setDependencies(@Nullable Input<MetadataDependenciesArgs> dependencies) {
            this.dependencies = dependencies;
            return this;
        }

        public Builder setDependencies(@Nullable MetadataDependenciesArgs dependencies) {
            this.dependencies = Input.ofNullable(dependencies);
            return this;
        }

        public Builder setFirstPublishDate(@Nullable Input<String> firstPublishDate) {
            this.firstPublishDate = firstPublishDate;
            return this;
        }

        public Builder setFirstPublishDate(@Nullable String firstPublishDate) {
            this.firstPublishDate = Input.ofNullable(firstPublishDate);
            return this;
        }

        public Builder setKind(Input<Either<String,Kind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,Kind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setLastPublishDate(@Nullable Input<String> lastPublishDate) {
            this.lastPublishDate = lastPublishDate;
            return this;
        }

        public Builder setLastPublishDate(@Nullable String lastPublishDate) {
            this.lastPublishDate = Input.ofNullable(lastPublishDate);
            return this;
        }

        public Builder setMetadataName(@Nullable Input<String> metadataName) {
            this.metadataName = metadataName;
            return this;
        }

        public Builder setMetadataName(@Nullable String metadataName) {
            this.metadataName = Input.ofNullable(metadataName);
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(Input<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Input.of(Objects.requireNonNull(operationalInsightsResourceProvider));
            return this;
        }

        public Builder setParentId(Input<String> parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }

        public Builder setParentId(String parentId) {
            this.parentId = Input.of(Objects.requireNonNull(parentId));
            return this;
        }

        public Builder setProviders(@Nullable Input<List<String>> providers) {
            this.providers = providers;
            return this;
        }

        public Builder setProviders(@Nullable List<String> providers) {
            this.providers = Input.ofNullable(providers);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSource(@Nullable Input<MetadataSourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable MetadataSourceArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setSupport(@Nullable Input<MetadataSupportArgs> support) {
            this.support = support;
            return this;
        }

        public Builder setSupport(@Nullable MetadataSupportArgs support) {
            this.support = Input.ofNullable(support);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public MetadataArgs build() {
            return new MetadataArgs(author, categories, contentId, dependencies, firstPublishDate, kind, lastPublishDate, metadataName, operationalInsightsResourceProvider, parentId, providers, resourceGroupName, source, support, version, workspaceName);
        }
    }
}