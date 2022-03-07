// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.enums.TriggerEventType;
import io.pulumi.googlenative.cloudbuild_v1.inputs.ApprovalConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.BitbucketServerTriggerConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.BuildArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.GitFileSourceArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.GitHubEventsConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.GitRepoSourceArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.PubsubConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.RepoSourceArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.WebhookConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * Configuration for manual approval to start a build invocation of this BuildTrigger.
     * 
     */
    @InputImport(name="approvalConfig")
      private final @Nullable Input<ApprovalConfigArgs> approvalConfig;

    public Input<ApprovalConfigArgs> getApprovalConfig() {
        return this.approvalConfig == null ? Input.empty() : this.approvalConfig;
    }

    /**
     * Autodetect build configuration. The following precedence is used (case insensitive): 1. cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for GitHub App Triggers.
     * 
     */
    @InputImport(name="autodetect")
      private final @Nullable Input<Boolean> autodetect;

    public Input<Boolean> getAutodetect() {
        return this.autodetect == null ? Input.empty() : this.autodetect;
    }

    /**
     * BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
     * 
     */
    @InputImport(name="bitbucketServerTriggerConfig")
      private final @Nullable Input<BitbucketServerTriggerConfigArgs> bitbucketServerTriggerConfig;

    public Input<BitbucketServerTriggerConfigArgs> getBitbucketServerTriggerConfig() {
        return this.bitbucketServerTriggerConfig == null ? Input.empty() : this.bitbucketServerTriggerConfig;
    }

    /**
     * Contents of the build template.
     * 
     */
    @InputImport(name="build")
      private final @Nullable Input<BuildArgs> build;

    public Input<BuildArgs> getBuild() {
        return this.build == null ? Input.empty() : this.build;
    }

    /**
     * Human-readable description of this trigger.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * If true, the trigger will never automatically execute a build.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * EventType allows the user to explicitly set the type of event to which this BuildTrigger should respond. This field will be validated against the rest of the configuration if it is set.
     * 
     */
    @InputImport(name="eventType")
      private final @Nullable Input<TriggerEventType> eventType;

    public Input<TriggerEventType> getEventType() {
        return this.eventType == null ? Input.empty() : this.eventType;
    }

    /**
     * Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
     * 
     */
    @InputImport(name="filename")
      private final @Nullable Input<String> filename;

    public Input<String> getFilename() {
        return this.filename == null ? Input.empty() : this.filename;
    }

    /**
     * A Common Expression Language string.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * The file source describing the local or remote Build template.
     * 
     */
    @InputImport(name="gitFileSource")
      private final @Nullable Input<GitFileSourceArgs> gitFileSource;

    public Input<GitFileSourceArgs> getGitFileSource() {
        return this.gitFileSource == null ? Input.empty() : this.gitFileSource;
    }

    /**
     * GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a GitHub event is received. Mutually exclusive with `trigger_template`.
     * 
     */
    @InputImport(name="github")
      private final @Nullable Input<GitHubEventsConfigArgs> github;

    public Input<GitHubEventsConfigArgs> getGithub() {
        return this.github == null ? Input.empty() : this.github;
    }

    /**
     * ignored_files and included_files are file glob matches using https://golang.org/pkg/path/filepath/#Match extended with support for "**". If ignored_files and changed files are both empty, then they are not used to determine whether or not to trigger a build. If ignored_files is not empty, then we ignore any files that match any of the ignored_file globs. If the change has no files that are outside of the ignored_files globs, then we do not trigger a build.
     * 
     */
    @InputImport(name="ignoredFiles")
      private final @Nullable Input<List<String>> ignoredFiles;

    public Input<List<String>> getIgnoredFiles() {
        return this.ignoredFiles == null ? Input.empty() : this.ignoredFiles;
    }

    /**
     * If any of the files altered in the commit pass the ignored_files filter and included_files is empty, then as far as this filter is concerned, we should trigger the build. If any of the files altered in the commit pass the ignored_files filter and included_files is not empty, then we make sure that at least one of those files matches a included_files glob. If not, then we do not trigger a build.
     * 
     */
    @InputImport(name="includedFiles")
      private final @Nullable Input<List<String>> includedFiles;

    public Input<List<String>> getIncludedFiles() {
        return this.includedFiles == null ? Input.empty() : this.includedFiles;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * User-assigned name of the trigger. Must be unique within the project. Trigger names must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="projectId", required=true)
      private final Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId;
    }

    /**
     * PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub message is published.
     * 
     */
    @InputImport(name="pubsubConfig")
      private final @Nullable Input<PubsubConfigArgs> pubsubConfig;

    public Input<PubsubConfigArgs> getPubsubConfig() {
        return this.pubsubConfig == null ? Input.empty() : this.pubsubConfig;
    }

    /**
     * The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`, where {trigger} is a unique identifier generated by the service.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * The service account used for all user-controlled operations including UpdateBuildTrigger, RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead. Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * The repo and ref of the repository from which to build. This field is used only for those triggers that do not respond to SCM events. Triggers that respond to such events build source at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub, Manual, and Cron triggers.
     * 
     */
    @InputImport(name="sourceToBuild")
      private final @Nullable Input<GitRepoSourceArgs> sourceToBuild;

    public Input<GitRepoSourceArgs> getSourceToBuild() {
        return this.sourceToBuild == null ? Input.empty() : this.sourceToBuild;
    }

    /**
     * Substitutions for Build resource. The keys must match the following regular expression: `^_[A-Z0-9_]+$`.
     * 
     */
    @InputImport(name="substitutions")
      private final @Nullable Input<Map<String,String>> substitutions;

    public Input<Map<String,String>> getSubstitutions() {
        return this.substitutions == null ? Input.empty() : this.substitutions;
    }

    /**
     * Tags for annotation of a `BuildTrigger`
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Template describing the types of source changes to trigger a build. Branch and tag names in trigger templates are interpreted as regular expressions. Any branch or tag change that matches that regular expression will trigger a build. Mutually exclusive with `github`.
     * 
     */
    @InputImport(name="triggerTemplate")
      private final @Nullable Input<RepoSourceArgs> triggerTemplate;

    public Input<RepoSourceArgs> getTriggerTemplate() {
        return this.triggerTemplate == null ? Input.empty() : this.triggerTemplate;
    }

    /**
     * WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook is sent to a trigger's webhook URL.
     * 
     */
    @InputImport(name="webhookConfig")
      private final @Nullable Input<WebhookConfigArgs> webhookConfig;

    public Input<WebhookConfigArgs> getWebhookConfig() {
        return this.webhookConfig == null ? Input.empty() : this.webhookConfig;
    }

    public TriggerArgs(
        @Nullable Input<ApprovalConfigArgs> approvalConfig,
        @Nullable Input<Boolean> autodetect,
        @Nullable Input<BitbucketServerTriggerConfigArgs> bitbucketServerTriggerConfig,
        @Nullable Input<BuildArgs> build,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<TriggerEventType> eventType,
        @Nullable Input<String> filename,
        @Nullable Input<String> filter,
        @Nullable Input<GitFileSourceArgs> gitFileSource,
        @Nullable Input<GitHubEventsConfigArgs> github,
        @Nullable Input<List<String>> ignoredFiles,
        @Nullable Input<List<String>> includedFiles,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> projectId,
        @Nullable Input<PubsubConfigArgs> pubsubConfig,
        @Nullable Input<String> resourceName,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<GitRepoSourceArgs> sourceToBuild,
        @Nullable Input<Map<String,String>> substitutions,
        @Nullable Input<List<String>> tags,
        @Nullable Input<RepoSourceArgs> triggerTemplate,
        @Nullable Input<WebhookConfigArgs> webhookConfig) {
        this.approvalConfig = approvalConfig;
        this.autodetect = autodetect;
        this.bitbucketServerTriggerConfig = bitbucketServerTriggerConfig;
        this.build = build;
        this.description = description;
        this.disabled = disabled;
        this.eventType = eventType;
        this.filename = filename;
        this.filter = filter;
        this.gitFileSource = gitFileSource;
        this.github = github;
        this.ignoredFiles = ignoredFiles;
        this.includedFiles = includedFiles;
        this.location = location;
        this.name = name;
        this.project = project;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.pubsubConfig = pubsubConfig;
        this.resourceName = resourceName;
        this.serviceAccount = serviceAccount;
        this.sourceToBuild = sourceToBuild;
        this.substitutions = substitutions;
        this.tags = tags;
        this.triggerTemplate = triggerTemplate;
        this.webhookConfig = webhookConfig;
    }

    private TriggerArgs() {
        this.approvalConfig = Input.empty();
        this.autodetect = Input.empty();
        this.bitbucketServerTriggerConfig = Input.empty();
        this.build = Input.empty();
        this.description = Input.empty();
        this.disabled = Input.empty();
        this.eventType = Input.empty();
        this.filename = Input.empty();
        this.filter = Input.empty();
        this.gitFileSource = Input.empty();
        this.github = Input.empty();
        this.ignoredFiles = Input.empty();
        this.includedFiles = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.projectId = Input.empty();
        this.pubsubConfig = Input.empty();
        this.resourceName = Input.empty();
        this.serviceAccount = Input.empty();
        this.sourceToBuild = Input.empty();
        this.substitutions = Input.empty();
        this.tags = Input.empty();
        this.triggerTemplate = Input.empty();
        this.webhookConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApprovalConfigArgs> approvalConfig;
        private @Nullable Input<Boolean> autodetect;
        private @Nullable Input<BitbucketServerTriggerConfigArgs> bitbucketServerTriggerConfig;
        private @Nullable Input<BuildArgs> build;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<TriggerEventType> eventType;
        private @Nullable Input<String> filename;
        private @Nullable Input<String> filter;
        private @Nullable Input<GitFileSourceArgs> gitFileSource;
        private @Nullable Input<GitHubEventsConfigArgs> github;
        private @Nullable Input<List<String>> ignoredFiles;
        private @Nullable Input<List<String>> includedFiles;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> projectId;
        private @Nullable Input<PubsubConfigArgs> pubsubConfig;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<GitRepoSourceArgs> sourceToBuild;
        private @Nullable Input<Map<String,String>> substitutions;
        private @Nullable Input<List<String>> tags;
        private @Nullable Input<RepoSourceArgs> triggerTemplate;
        private @Nullable Input<WebhookConfigArgs> webhookConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalConfig = defaults.approvalConfig;
    	      this.autodetect = defaults.autodetect;
    	      this.bitbucketServerTriggerConfig = defaults.bitbucketServerTriggerConfig;
    	      this.build = defaults.build;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.eventType = defaults.eventType;
    	      this.filename = defaults.filename;
    	      this.filter = defaults.filter;
    	      this.gitFileSource = defaults.gitFileSource;
    	      this.github = defaults.github;
    	      this.ignoredFiles = defaults.ignoredFiles;
    	      this.includedFiles = defaults.includedFiles;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.projectId = defaults.projectId;
    	      this.pubsubConfig = defaults.pubsubConfig;
    	      this.resourceName = defaults.resourceName;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.sourceToBuild = defaults.sourceToBuild;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.triggerTemplate = defaults.triggerTemplate;
    	      this.webhookConfig = defaults.webhookConfig;
        }

        public Builder setApprovalConfig(@Nullable Input<ApprovalConfigArgs> approvalConfig) {
            this.approvalConfig = approvalConfig;
            return this;
        }

        public Builder setApprovalConfig(@Nullable ApprovalConfigArgs approvalConfig) {
            this.approvalConfig = Input.ofNullable(approvalConfig);
            return this;
        }

        public Builder setAutodetect(@Nullable Input<Boolean> autodetect) {
            this.autodetect = autodetect;
            return this;
        }

        public Builder setAutodetect(@Nullable Boolean autodetect) {
            this.autodetect = Input.ofNullable(autodetect);
            return this;
        }

        public Builder setBitbucketServerTriggerConfig(@Nullable Input<BitbucketServerTriggerConfigArgs> bitbucketServerTriggerConfig) {
            this.bitbucketServerTriggerConfig = bitbucketServerTriggerConfig;
            return this;
        }

        public Builder setBitbucketServerTriggerConfig(@Nullable BitbucketServerTriggerConfigArgs bitbucketServerTriggerConfig) {
            this.bitbucketServerTriggerConfig = Input.ofNullable(bitbucketServerTriggerConfig);
            return this;
        }

        public Builder setBuild(@Nullable Input<BuildArgs> build) {
            this.build = build;
            return this;
        }

        public Builder setBuild(@Nullable BuildArgs build) {
            this.build = Input.ofNullable(build);
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

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setEventType(@Nullable Input<TriggerEventType> eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder setEventType(@Nullable TriggerEventType eventType) {
            this.eventType = Input.ofNullable(eventType);
            return this;
        }

        public Builder setFilename(@Nullable Input<String> filename) {
            this.filename = filename;
            return this;
        }

        public Builder setFilename(@Nullable String filename) {
            this.filename = Input.ofNullable(filename);
            return this;
        }

        public Builder setFilter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setGitFileSource(@Nullable Input<GitFileSourceArgs> gitFileSource) {
            this.gitFileSource = gitFileSource;
            return this;
        }

        public Builder setGitFileSource(@Nullable GitFileSourceArgs gitFileSource) {
            this.gitFileSource = Input.ofNullable(gitFileSource);
            return this;
        }

        public Builder setGithub(@Nullable Input<GitHubEventsConfigArgs> github) {
            this.github = github;
            return this;
        }

        public Builder setGithub(@Nullable GitHubEventsConfigArgs github) {
            this.github = Input.ofNullable(github);
            return this;
        }

        public Builder setIgnoredFiles(@Nullable Input<List<String>> ignoredFiles) {
            this.ignoredFiles = ignoredFiles;
            return this;
        }

        public Builder setIgnoredFiles(@Nullable List<String> ignoredFiles) {
            this.ignoredFiles = Input.ofNullable(ignoredFiles);
            return this;
        }

        public Builder setIncludedFiles(@Nullable Input<List<String>> includedFiles) {
            this.includedFiles = includedFiles;
            return this;
        }

        public Builder setIncludedFiles(@Nullable List<String> includedFiles) {
            this.includedFiles = Input.ofNullable(includedFiles);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setProjectId(Input<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Input.of(Objects.requireNonNull(projectId));
            return this;
        }

        public Builder setPubsubConfig(@Nullable Input<PubsubConfigArgs> pubsubConfig) {
            this.pubsubConfig = pubsubConfig;
            return this;
        }

        public Builder setPubsubConfig(@Nullable PubsubConfigArgs pubsubConfig) {
            this.pubsubConfig = Input.ofNullable(pubsubConfig);
            return this;
        }

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setSourceToBuild(@Nullable Input<GitRepoSourceArgs> sourceToBuild) {
            this.sourceToBuild = sourceToBuild;
            return this;
        }

        public Builder setSourceToBuild(@Nullable GitRepoSourceArgs sourceToBuild) {
            this.sourceToBuild = Input.ofNullable(sourceToBuild);
            return this;
        }

        public Builder setSubstitutions(@Nullable Input<Map<String,String>> substitutions) {
            this.substitutions = substitutions;
            return this;
        }

        public Builder setSubstitutions(@Nullable Map<String,String> substitutions) {
            this.substitutions = Input.ofNullable(substitutions);
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTriggerTemplate(@Nullable Input<RepoSourceArgs> triggerTemplate) {
            this.triggerTemplate = triggerTemplate;
            return this;
        }

        public Builder setTriggerTemplate(@Nullable RepoSourceArgs triggerTemplate) {
            this.triggerTemplate = Input.ofNullable(triggerTemplate);
            return this;
        }

        public Builder setWebhookConfig(@Nullable Input<WebhookConfigArgs> webhookConfig) {
            this.webhookConfig = webhookConfig;
            return this;
        }

        public Builder setWebhookConfig(@Nullable WebhookConfigArgs webhookConfig) {
            this.webhookConfig = Input.ofNullable(webhookConfig);
            return this;
        }
        public TriggerArgs build() {
            return new TriggerArgs(approvalConfig, autodetect, bitbucketServerTriggerConfig, build, description, disabled, eventType, filename, filter, gitFileSource, github, ignoredFiles, includedFiles, location, name, project, projectId, pubsubConfig, resourceName, serviceAccount, sourceToBuild, substitutions, tags, triggerTemplate, webhookConfig);
        }
    }
}