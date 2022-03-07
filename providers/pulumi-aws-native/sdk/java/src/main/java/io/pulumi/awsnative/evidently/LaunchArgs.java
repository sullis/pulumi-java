// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.evidently.inputs.LaunchGroupObjectArgs;
import io.pulumi.awsnative.evidently.inputs.LaunchMetricDefinitionObjectArgs;
import io.pulumi.awsnative.evidently.inputs.LaunchStepConfigArgs;
import io.pulumi.awsnative.evidently.inputs.LaunchTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchArgs Empty = new LaunchArgs();

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="groups", required=true)
      private final Input<List<LaunchGroupObjectArgs>> groups;

    public Input<List<LaunchGroupObjectArgs>> getGroups() {
        return this.groups;
    }

    @InputImport(name="metricMonitors")
      private final @Nullable Input<List<LaunchMetricDefinitionObjectArgs>> metricMonitors;

    public Input<List<LaunchMetricDefinitionObjectArgs>> getMetricMonitors() {
        return this.metricMonitors == null ? Input.empty() : this.metricMonitors;
    }

    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project", required=true)
      private final Input<String> project;

    public Input<String> getProject() {
        return this.project;
    }

    @InputImport(name="randomizationSalt")
      private final @Nullable Input<String> randomizationSalt;

    public Input<String> getRandomizationSalt() {
        return this.randomizationSalt == null ? Input.empty() : this.randomizationSalt;
    }

    @InputImport(name="scheduledSplitsConfig", required=true)
      private final Input<List<LaunchStepConfigArgs>> scheduledSplitsConfig;

    public Input<List<LaunchStepConfigArgs>> getScheduledSplitsConfig() {
        return this.scheduledSplitsConfig;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<LaunchTagArgs>> tags;

    public Input<List<LaunchTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LaunchArgs(
        @Nullable Input<String> description,
        Input<List<LaunchGroupObjectArgs>> groups,
        @Nullable Input<List<LaunchMetricDefinitionObjectArgs>> metricMonitors,
        @Nullable Input<String> name,
        Input<String> project,
        @Nullable Input<String> randomizationSalt,
        Input<List<LaunchStepConfigArgs>> scheduledSplitsConfig,
        @Nullable Input<List<LaunchTagArgs>> tags) {
        this.description = description;
        this.groups = Objects.requireNonNull(groups, "expected parameter 'groups' to be non-null");
        this.metricMonitors = metricMonitors;
        this.name = name;
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.randomizationSalt = randomizationSalt;
        this.scheduledSplitsConfig = Objects.requireNonNull(scheduledSplitsConfig, "expected parameter 'scheduledSplitsConfig' to be non-null");
        this.tags = tags;
    }

    private LaunchArgs() {
        this.description = Input.empty();
        this.groups = Input.empty();
        this.metricMonitors = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.randomizationSalt = Input.empty();
        this.scheduledSplitsConfig = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<List<LaunchGroupObjectArgs>> groups;
        private @Nullable Input<List<LaunchMetricDefinitionObjectArgs>> metricMonitors;
        private @Nullable Input<String> name;
        private Input<String> project;
        private @Nullable Input<String> randomizationSalt;
        private Input<List<LaunchStepConfigArgs>> scheduledSplitsConfig;
        private @Nullable Input<List<LaunchTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.groups = defaults.groups;
    	      this.metricMonitors = defaults.metricMonitors;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.randomizationSalt = defaults.randomizationSalt;
    	      this.scheduledSplitsConfig = defaults.scheduledSplitsConfig;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGroups(Input<List<LaunchGroupObjectArgs>> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }

        public Builder setGroups(List<LaunchGroupObjectArgs> groups) {
            this.groups = Input.of(Objects.requireNonNull(groups));
            return this;
        }

        public Builder setMetricMonitors(@Nullable Input<List<LaunchMetricDefinitionObjectArgs>> metricMonitors) {
            this.metricMonitors = metricMonitors;
            return this;
        }

        public Builder setMetricMonitors(@Nullable List<LaunchMetricDefinitionObjectArgs> metricMonitors) {
            this.metricMonitors = Input.ofNullable(metricMonitors);
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

        public Builder setProject(Input<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Input.of(Objects.requireNonNull(project));
            return this;
        }

        public Builder setRandomizationSalt(@Nullable Input<String> randomizationSalt) {
            this.randomizationSalt = randomizationSalt;
            return this;
        }

        public Builder setRandomizationSalt(@Nullable String randomizationSalt) {
            this.randomizationSalt = Input.ofNullable(randomizationSalt);
            return this;
        }

        public Builder setScheduledSplitsConfig(Input<List<LaunchStepConfigArgs>> scheduledSplitsConfig) {
            this.scheduledSplitsConfig = Objects.requireNonNull(scheduledSplitsConfig);
            return this;
        }

        public Builder setScheduledSplitsConfig(List<LaunchStepConfigArgs> scheduledSplitsConfig) {
            this.scheduledSplitsConfig = Input.of(Objects.requireNonNull(scheduledSplitsConfig));
            return this;
        }

        public Builder setTags(@Nullable Input<List<LaunchTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<LaunchTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LaunchArgs build() {
            return new LaunchArgs(description, groups, metricMonitors, name, project, randomizationSalt, scheduledSplitsConfig, tags);
        }
    }
}