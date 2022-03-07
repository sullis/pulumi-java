// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.EntityType;
import io.pulumi.azurenative.securityinsights.inputs.ActivityEntityQueriesPropertiesQueryDefinitionsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActivityCustomEntityQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActivityCustomEntityQueryArgs Empty = new ActivityCustomEntityQueryArgs();

    /**
     * The entity query content to display in timeline
     * 
     */
    @InputImport(name="content")
      private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    /**
     * The entity query description
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Determines whether this activity is enabled or disabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The query applied only to entities matching to all filters
     * 
     */
    @InputImport(name="entitiesFilter")
      private final @Nullable Input<Map<String,List<String>>> entitiesFilter;

    public Input<Map<String,List<String>>> getEntitiesFilter() {
        return this.entitiesFilter == null ? Input.empty() : this.entitiesFilter;
    }

    /**
     * entity query ID
     * 
     */
    @InputImport(name="entityQueryId")
      private final @Nullable Input<String> entityQueryId;

    public Input<String> getEntityQueryId() {
        return this.entityQueryId == null ? Input.empty() : this.entityQueryId;
    }

    /**
     * The type of the query's source entity
     * 
     */
    @InputImport(name="inputEntityType")
      private final @Nullable Input<Either<String,EntityType>> inputEntityType;

    public Input<Either<String,EntityType>> getInputEntityType() {
        return this.inputEntityType == null ? Input.empty() : this.inputEntityType;
    }

    /**
     * The kind of the entity query that supports put request.
     * Expected value is 'Activity'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
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
     * The Activity query definitions
     * 
     */
    @InputImport(name="queryDefinitions")
      private final @Nullable Input<ActivityEntityQueriesPropertiesQueryDefinitionsArgs> queryDefinitions;

    public Input<ActivityEntityQueriesPropertiesQueryDefinitionsArgs> getQueryDefinitions() {
        return this.queryDefinitions == null ? Input.empty() : this.queryDefinitions;
    }

    /**
     * List of the fields of the source entity that are required to run the query
     * 
     */
    @InputImport(name="requiredInputFieldsSets")
      private final @Nullable Input<List<List<String>>> requiredInputFieldsSets;

    public Input<List<List<String>>> getRequiredInputFieldsSets() {
        return this.requiredInputFieldsSets == null ? Input.empty() : this.requiredInputFieldsSets;
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
     * The template id this activity was created from
     * 
     */
    @InputImport(name="templateName")
      private final @Nullable Input<String> templateName;

    public Input<String> getTemplateName() {
        return this.templateName == null ? Input.empty() : this.templateName;
    }

    /**
     * The entity query title
     * 
     */
    @InputImport(name="title")
      private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
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

    public ActivityCustomEntityQueryArgs(
        @Nullable Input<String> content,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Map<String,List<String>>> entitiesFilter,
        @Nullable Input<String> entityQueryId,
        @Nullable Input<Either<String,EntityType>> inputEntityType,
        Input<String> kind,
        Input<String> operationalInsightsResourceProvider,
        @Nullable Input<ActivityEntityQueriesPropertiesQueryDefinitionsArgs> queryDefinitions,
        @Nullable Input<List<List<String>>> requiredInputFieldsSets,
        Input<String> resourceGroupName,
        @Nullable Input<String> templateName,
        @Nullable Input<String> title,
        Input<String> workspaceName) {
        this.content = content;
        this.description = description;
        this.enabled = enabled;
        this.entitiesFilter = entitiesFilter;
        this.entityQueryId = entityQueryId;
        this.inputEntityType = inputEntityType;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.queryDefinitions = queryDefinitions;
        this.requiredInputFieldsSets = requiredInputFieldsSets;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.templateName = templateName;
        this.title = title;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ActivityCustomEntityQueryArgs() {
        this.content = Input.empty();
        this.description = Input.empty();
        this.enabled = Input.empty();
        this.entitiesFilter = Input.empty();
        this.entityQueryId = Input.empty();
        this.inputEntityType = Input.empty();
        this.kind = Input.empty();
        this.operationalInsightsResourceProvider = Input.empty();
        this.queryDefinitions = Input.empty();
        this.requiredInputFieldsSets = Input.empty();
        this.resourceGroupName = Input.empty();
        this.templateName = Input.empty();
        this.title = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityCustomEntityQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Map<String,List<String>>> entitiesFilter;
        private @Nullable Input<String> entityQueryId;
        private @Nullable Input<Either<String,EntityType>> inputEntityType;
        private Input<String> kind;
        private Input<String> operationalInsightsResourceProvider;
        private @Nullable Input<ActivityEntityQueriesPropertiesQueryDefinitionsArgs> queryDefinitions;
        private @Nullable Input<List<List<String>>> requiredInputFieldsSets;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> templateName;
        private @Nullable Input<String> title;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityCustomEntityQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.entitiesFilter = defaults.entitiesFilter;
    	      this.entityQueryId = defaults.entityQueryId;
    	      this.inputEntityType = defaults.inputEntityType;
    	      this.kind = defaults.kind;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.queryDefinitions = defaults.queryDefinitions;
    	      this.requiredInputFieldsSets = defaults.requiredInputFieldsSets;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.templateName = defaults.templateName;
    	      this.title = defaults.title;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setContent(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setEntitiesFilter(@Nullable Input<Map<String,List<String>>> entitiesFilter) {
            this.entitiesFilter = entitiesFilter;
            return this;
        }

        public Builder setEntitiesFilter(@Nullable Map<String,List<String>> entitiesFilter) {
            this.entitiesFilter = Input.ofNullable(entitiesFilter);
            return this;
        }

        public Builder setEntityQueryId(@Nullable Input<String> entityQueryId) {
            this.entityQueryId = entityQueryId;
            return this;
        }

        public Builder setEntityQueryId(@Nullable String entityQueryId) {
            this.entityQueryId = Input.ofNullable(entityQueryId);
            return this;
        }

        public Builder setInputEntityType(@Nullable Input<Either<String,EntityType>> inputEntityType) {
            this.inputEntityType = inputEntityType;
            return this;
        }

        public Builder setInputEntityType(@Nullable Either<String,EntityType> inputEntityType) {
            this.inputEntityType = Input.ofNullable(inputEntityType);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setQueryDefinitions(@Nullable Input<ActivityEntityQueriesPropertiesQueryDefinitionsArgs> queryDefinitions) {
            this.queryDefinitions = queryDefinitions;
            return this;
        }

        public Builder setQueryDefinitions(@Nullable ActivityEntityQueriesPropertiesQueryDefinitionsArgs queryDefinitions) {
            this.queryDefinitions = Input.ofNullable(queryDefinitions);
            return this;
        }

        public Builder setRequiredInputFieldsSets(@Nullable Input<List<List<String>>> requiredInputFieldsSets) {
            this.requiredInputFieldsSets = requiredInputFieldsSets;
            return this;
        }

        public Builder setRequiredInputFieldsSets(@Nullable List<List<String>> requiredInputFieldsSets) {
            this.requiredInputFieldsSets = Input.ofNullable(requiredInputFieldsSets);
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

        public Builder setTemplateName(@Nullable Input<String> templateName) {
            this.templateName = templateName;
            return this;
        }

        public Builder setTemplateName(@Nullable String templateName) {
            this.templateName = Input.ofNullable(templateName);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
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
        public ActivityCustomEntityQueryArgs build() {
            return new ActivityCustomEntityQueryArgs(content, description, enabled, entitiesFilter, entityQueryId, inputEntityType, kind, operationalInsightsResourceProvider, queryDefinitions, requiredInputFieldsSets, resourceGroupName, templateName, title, workspaceName);
        }
    }
}