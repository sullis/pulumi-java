// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudasset.inputs.ProjectFeedConditionArgs;
import io.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectFeedArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectFeedArgs Empty = new ProjectFeedArgs();

    /**
     * A list of the full names of the assets to receive updates. You must specify either or both of
     * assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
     * exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
     * See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
     * 
     */
    @InputImport(name="assetNames")
    private final @Nullable Input<List<String>> assetNames;

    public Input<List<String>> getAssetNames() {
        return this.assetNames == null ? Input.empty() : this.assetNames;
    }

    /**
     * A list of types of the assets to receive updates. You must specify either or both of assetNames
     * and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
     * the feed. For example: "compute.googleapis.com/Disk"
     * See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
     * supported asset types.
     * 
     */
    @InputImport(name="assetTypes")
    private final @Nullable Input<List<String>> assetTypes;

    public Input<List<String>> getAssetTypes() {
        return this.assetTypes == null ? Input.empty() : this.assetTypes;
    }

    /**
     * The project whose identity will be used when sending messages to the
     * destination pubsub topic. It also specifies the project for API
     * enablement check, quota, and billing. If not specified, the resource's
     * project will be used.
     * 
     */
    @InputImport(name="billingProject")
    private final @Nullable Input<String> billingProject;

    public Input<String> getBillingProject() {
        return this.billingProject == null ? Input.empty() : this.billingProject;
    }

    /**
     * A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression "temporal_asset.deleted == true" will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<ProjectFeedConditionArgs> condition;

    public Input<ProjectFeedConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Asset content type. If not specified, no content but the asset name and type will be returned.
     * Possible values are `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, and `ACCESS_POLICY`.
     * 
     */
    @InputImport(name="contentType")
    private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
     * 
     */
    @InputImport(name="feedId", required=true)
    private final Input<String> feedId;

    public Input<String> getFeedId() {
        return this.feedId;
    }

    /**
     * Output configuration for asset feed destination.
     * Structure is documented below.
     * 
     */
    @InputImport(name="feedOutputConfig", required=true)
    private final Input<ProjectFeedFeedOutputConfigArgs> feedOutputConfig;

    public Input<ProjectFeedFeedOutputConfigArgs> getFeedOutputConfig() {
        return this.feedOutputConfig;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ProjectFeedArgs(
        @Nullable Input<List<String>> assetNames,
        @Nullable Input<List<String>> assetTypes,
        @Nullable Input<String> billingProject,
        @Nullable Input<ProjectFeedConditionArgs> condition,
        @Nullable Input<String> contentType,
        Input<String> feedId,
        Input<ProjectFeedFeedOutputConfigArgs> feedOutputConfig,
        @Nullable Input<String> project) {
        this.assetNames = assetNames;
        this.assetTypes = assetTypes;
        this.billingProject = billingProject;
        this.condition = condition;
        this.contentType = contentType;
        this.feedId = Objects.requireNonNull(feedId, "expected parameter 'feedId' to be non-null");
        this.feedOutputConfig = Objects.requireNonNull(feedOutputConfig, "expected parameter 'feedOutputConfig' to be non-null");
        this.project = project;
    }

    private ProjectFeedArgs() {
        this.assetNames = Input.empty();
        this.assetTypes = Input.empty();
        this.billingProject = Input.empty();
        this.condition = Input.empty();
        this.contentType = Input.empty();
        this.feedId = Input.empty();
        this.feedOutputConfig = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFeedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> assetNames;
        private @Nullable Input<List<String>> assetTypes;
        private @Nullable Input<String> billingProject;
        private @Nullable Input<ProjectFeedConditionArgs> condition;
        private @Nullable Input<String> contentType;
        private Input<String> feedId;
        private Input<ProjectFeedFeedOutputConfigArgs> feedOutputConfig;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFeedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetNames = defaults.assetNames;
    	      this.assetTypes = defaults.assetTypes;
    	      this.billingProject = defaults.billingProject;
    	      this.condition = defaults.condition;
    	      this.contentType = defaults.contentType;
    	      this.feedId = defaults.feedId;
    	      this.feedOutputConfig = defaults.feedOutputConfig;
    	      this.project = defaults.project;
        }

        public Builder setAssetNames(@Nullable Input<List<String>> assetNames) {
            this.assetNames = assetNames;
            return this;
        }

        public Builder setAssetNames(@Nullable List<String> assetNames) {
            this.assetNames = Input.ofNullable(assetNames);
            return this;
        }

        public Builder setAssetTypes(@Nullable Input<List<String>> assetTypes) {
            this.assetTypes = assetTypes;
            return this;
        }

        public Builder setAssetTypes(@Nullable List<String> assetTypes) {
            this.assetTypes = Input.ofNullable(assetTypes);
            return this;
        }

        public Builder setBillingProject(@Nullable Input<String> billingProject) {
            this.billingProject = billingProject;
            return this;
        }

        public Builder setBillingProject(@Nullable String billingProject) {
            this.billingProject = Input.ofNullable(billingProject);
            return this;
        }

        public Builder setCondition(@Nullable Input<ProjectFeedConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable ProjectFeedConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setContentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setFeedId(Input<String> feedId) {
            this.feedId = Objects.requireNonNull(feedId);
            return this;
        }

        public Builder setFeedId(String feedId) {
            this.feedId = Input.of(Objects.requireNonNull(feedId));
            return this;
        }

        public Builder setFeedOutputConfig(Input<ProjectFeedFeedOutputConfigArgs> feedOutputConfig) {
            this.feedOutputConfig = Objects.requireNonNull(feedOutputConfig);
            return this;
        }

        public Builder setFeedOutputConfig(ProjectFeedFeedOutputConfigArgs feedOutputConfig) {
            this.feedOutputConfig = Input.of(Objects.requireNonNull(feedOutputConfig));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public ProjectFeedArgs build() {
            return new ProjectFeedArgs(assetNames, assetTypes, billingProject, condition, contentType, feedId, feedOutputConfig, project);
        }
    }
}
