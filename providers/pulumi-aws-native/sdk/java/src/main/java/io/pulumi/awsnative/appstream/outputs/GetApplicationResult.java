// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream.outputs;

import io.pulumi.awsnative.appstream.outputs.ApplicationS3Location;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApplicationResult {
    private final @Nullable String appBlockArn;
    private final @Nullable String arn;
    private final @Nullable List<String> attributesToDelete;
    private final @Nullable String createdTime;
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final @Nullable ApplicationS3Location iconS3Location;
    private final @Nullable String launchParameters;
    private final @Nullable String launchPath;
    private final @Nullable String workingDirectory;

    @OutputCustomType.Constructor({"appBlockArn","arn","attributesToDelete","createdTime","description","displayName","iconS3Location","launchParameters","launchPath","workingDirectory"})
    private GetApplicationResult(
        @Nullable String appBlockArn,
        @Nullable String arn,
        @Nullable List<String> attributesToDelete,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable ApplicationS3Location iconS3Location,
        @Nullable String launchParameters,
        @Nullable String launchPath,
        @Nullable String workingDirectory) {
        this.appBlockArn = appBlockArn;
        this.arn = arn;
        this.attributesToDelete = attributesToDelete;
        this.createdTime = createdTime;
        this.description = description;
        this.displayName = displayName;
        this.iconS3Location = iconS3Location;
        this.launchParameters = launchParameters;
        this.launchPath = launchPath;
        this.workingDirectory = workingDirectory;
    }

    public Optional<String> getAppBlockArn() {
        return Optional.ofNullable(this.appBlockArn);
    }
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<String> getAttributesToDelete() {
        return this.attributesToDelete == null ? List.of() : this.attributesToDelete;
    }
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<ApplicationS3Location> getIconS3Location() {
        return Optional.ofNullable(this.iconS3Location);
    }
    public Optional<String> getLaunchParameters() {
        return Optional.ofNullable(this.launchParameters);
    }
    public Optional<String> getLaunchPath() {
        return Optional.ofNullable(this.launchPath);
    }
    public Optional<String> getWorkingDirectory() {
        return Optional.ofNullable(this.workingDirectory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appBlockArn;
        private @Nullable String arn;
        private @Nullable List<String> attributesToDelete;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable ApplicationS3Location iconS3Location;
        private @Nullable String launchParameters;
        private @Nullable String launchPath;
        private @Nullable String workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appBlockArn = defaults.appBlockArn;
    	      this.arn = defaults.arn;
    	      this.attributesToDelete = defaults.attributesToDelete;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.iconS3Location = defaults.iconS3Location;
    	      this.launchParameters = defaults.launchParameters;
    	      this.launchPath = defaults.launchPath;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder setAppBlockArn(@Nullable String appBlockArn) {
            this.appBlockArn = appBlockArn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAttributesToDelete(@Nullable List<String> attributesToDelete) {
            this.attributesToDelete = attributesToDelete;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setIconS3Location(@Nullable ApplicationS3Location iconS3Location) {
            this.iconS3Location = iconS3Location;
            return this;
        }

        public Builder setLaunchParameters(@Nullable String launchParameters) {
            this.launchParameters = launchParameters;
            return this;
        }

        public Builder setLaunchPath(@Nullable String launchPath) {
            this.launchPath = launchPath;
            return this;
        }

        public Builder setWorkingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }

        public GetApplicationResult build() {
            return new GetApplicationResult(appBlockArn, arn, attributesToDelete, createdTime, description, displayName, iconS3Location, launchParameters, launchPath, workingDirectory);
        }
    }
}
