// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.awsnative.appstream.inputs.ApplicationS3LocationArgs;
import io.pulumi.awsnative.appstream.inputs.ApplicationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    @InputImport(name="appBlockArn", required=true)
    private final Input<String> appBlockArn;

    public Input<String> getAppBlockArn() {
        return this.appBlockArn;
    }

    @InputImport(name="attributesToDelete")
    private final @Nullable Input<List<String>> attributesToDelete;

    public Input<List<String>> getAttributesToDelete() {
        return this.attributesToDelete == null ? Input.empty() : this.attributesToDelete;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="iconS3Location", required=true)
    private final Input<ApplicationS3LocationArgs> iconS3Location;

    public Input<ApplicationS3LocationArgs> getIconS3Location() {
        return this.iconS3Location;
    }

    @InputImport(name="instanceFamilies", required=true)
    private final Input<List<String>> instanceFamilies;

    public Input<List<String>> getInstanceFamilies() {
        return this.instanceFamilies;
    }

    @InputImport(name="launchParameters")
    private final @Nullable Input<String> launchParameters;

    public Input<String> getLaunchParameters() {
        return this.launchParameters == null ? Input.empty() : this.launchParameters;
    }

    @InputImport(name="launchPath", required=true)
    private final Input<String> launchPath;

    public Input<String> getLaunchPath() {
        return this.launchPath;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="platforms", required=true)
    private final Input<List<String>> platforms;

    public Input<List<String>> getPlatforms() {
        return this.platforms;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<ApplicationTagArgs>> tags;

    public Input<List<ApplicationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="workingDirectory")
    private final @Nullable Input<String> workingDirectory;

    public Input<String> getWorkingDirectory() {
        return this.workingDirectory == null ? Input.empty() : this.workingDirectory;
    }

    public ApplicationArgs(
        Input<String> appBlockArn,
        @Nullable Input<List<String>> attributesToDelete,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<ApplicationS3LocationArgs> iconS3Location,
        Input<List<String>> instanceFamilies,
        @Nullable Input<String> launchParameters,
        Input<String> launchPath,
        @Nullable Input<String> name,
        Input<List<String>> platforms,
        @Nullable Input<List<ApplicationTagArgs>> tags,
        @Nullable Input<String> workingDirectory) {
        this.appBlockArn = Objects.requireNonNull(appBlockArn, "expected parameter 'appBlockArn' to be non-null");
        this.attributesToDelete = attributesToDelete;
        this.description = description;
        this.displayName = displayName;
        this.iconS3Location = Objects.requireNonNull(iconS3Location, "expected parameter 'iconS3Location' to be non-null");
        this.instanceFamilies = Objects.requireNonNull(instanceFamilies, "expected parameter 'instanceFamilies' to be non-null");
        this.launchParameters = launchParameters;
        this.launchPath = Objects.requireNonNull(launchPath, "expected parameter 'launchPath' to be non-null");
        this.name = name;
        this.platforms = Objects.requireNonNull(platforms, "expected parameter 'platforms' to be non-null");
        this.tags = tags;
        this.workingDirectory = workingDirectory;
    }

    private ApplicationArgs() {
        this.appBlockArn = Input.empty();
        this.attributesToDelete = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.iconS3Location = Input.empty();
        this.instanceFamilies = Input.empty();
        this.launchParameters = Input.empty();
        this.launchPath = Input.empty();
        this.name = Input.empty();
        this.platforms = Input.empty();
        this.tags = Input.empty();
        this.workingDirectory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appBlockArn;
        private @Nullable Input<List<String>> attributesToDelete;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<ApplicationS3LocationArgs> iconS3Location;
        private Input<List<String>> instanceFamilies;
        private @Nullable Input<String> launchParameters;
        private Input<String> launchPath;
        private @Nullable Input<String> name;
        private Input<List<String>> platforms;
        private @Nullable Input<List<ApplicationTagArgs>> tags;
        private @Nullable Input<String> workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appBlockArn = defaults.appBlockArn;
    	      this.attributesToDelete = defaults.attributesToDelete;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.iconS3Location = defaults.iconS3Location;
    	      this.instanceFamilies = defaults.instanceFamilies;
    	      this.launchParameters = defaults.launchParameters;
    	      this.launchPath = defaults.launchPath;
    	      this.name = defaults.name;
    	      this.platforms = defaults.platforms;
    	      this.tags = defaults.tags;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder setAppBlockArn(Input<String> appBlockArn) {
            this.appBlockArn = Objects.requireNonNull(appBlockArn);
            return this;
        }

        public Builder setAppBlockArn(String appBlockArn) {
            this.appBlockArn = Input.of(Objects.requireNonNull(appBlockArn));
            return this;
        }

        public Builder setAttributesToDelete(@Nullable Input<List<String>> attributesToDelete) {
            this.attributesToDelete = attributesToDelete;
            return this;
        }

        public Builder setAttributesToDelete(@Nullable List<String> attributesToDelete) {
            this.attributesToDelete = Input.ofNullable(attributesToDelete);
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

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setIconS3Location(Input<ApplicationS3LocationArgs> iconS3Location) {
            this.iconS3Location = Objects.requireNonNull(iconS3Location);
            return this;
        }

        public Builder setIconS3Location(ApplicationS3LocationArgs iconS3Location) {
            this.iconS3Location = Input.of(Objects.requireNonNull(iconS3Location));
            return this;
        }

        public Builder setInstanceFamilies(Input<List<String>> instanceFamilies) {
            this.instanceFamilies = Objects.requireNonNull(instanceFamilies);
            return this;
        }

        public Builder setInstanceFamilies(List<String> instanceFamilies) {
            this.instanceFamilies = Input.of(Objects.requireNonNull(instanceFamilies));
            return this;
        }

        public Builder setLaunchParameters(@Nullable Input<String> launchParameters) {
            this.launchParameters = launchParameters;
            return this;
        }

        public Builder setLaunchParameters(@Nullable String launchParameters) {
            this.launchParameters = Input.ofNullable(launchParameters);
            return this;
        }

        public Builder setLaunchPath(Input<String> launchPath) {
            this.launchPath = Objects.requireNonNull(launchPath);
            return this;
        }

        public Builder setLaunchPath(String launchPath) {
            this.launchPath = Input.of(Objects.requireNonNull(launchPath));
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

        public Builder setPlatforms(Input<List<String>> platforms) {
            this.platforms = Objects.requireNonNull(platforms);
            return this;
        }

        public Builder setPlatforms(List<String> platforms) {
            this.platforms = Input.of(Objects.requireNonNull(platforms));
            return this;
        }

        public Builder setTags(@Nullable Input<List<ApplicationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ApplicationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWorkingDirectory(@Nullable Input<String> workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }

        public Builder setWorkingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = Input.ofNullable(workingDirectory);
            return this;
        }

        public ApplicationArgs build() {
            return new ApplicationArgs(appBlockArn, attributesToDelete, description, displayName, iconS3Location, instanceFamilies, launchParameters, launchPath, name, platforms, tags, workingDirectory);
        }
    }
}
