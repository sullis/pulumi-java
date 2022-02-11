// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.outputs.ProjectTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetProjectResult {
    private final @Nullable List<String> assetIds;
    private final @Nullable String projectArn;
    private final @Nullable String projectDescription;
    private final @Nullable String projectId;
    private final @Nullable String projectName;
    private final @Nullable List<ProjectTag> tags;

    @OutputCustomType.Constructor({"assetIds","projectArn","projectDescription","projectId","projectName","tags"})
    private GetProjectResult(
        @Nullable List<String> assetIds,
        @Nullable String projectArn,
        @Nullable String projectDescription,
        @Nullable String projectId,
        @Nullable String projectName,
        @Nullable List<ProjectTag> tags) {
        this.assetIds = assetIds;
        this.projectArn = projectArn;
        this.projectDescription = projectDescription;
        this.projectId = projectId;
        this.projectName = projectName;
        this.tags = tags;
    }

    public List<String> getAssetIds() {
        return this.assetIds == null ? List.of() : this.assetIds;
    }
    public Optional<String> getProjectArn() {
        return Optional.ofNullable(this.projectArn);
    }
    public Optional<String> getProjectDescription() {
        return Optional.ofNullable(this.projectDescription);
    }
    public Optional<String> getProjectId() {
        return Optional.ofNullable(this.projectId);
    }
    public Optional<String> getProjectName() {
        return Optional.ofNullable(this.projectName);
    }
    public List<ProjectTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> assetIds;
        private @Nullable String projectArn;
        private @Nullable String projectDescription;
        private @Nullable String projectId;
        private @Nullable String projectName;
        private @Nullable List<ProjectTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetIds = defaults.assetIds;
    	      this.projectArn = defaults.projectArn;
    	      this.projectDescription = defaults.projectDescription;
    	      this.projectId = defaults.projectId;
    	      this.projectName = defaults.projectName;
    	      this.tags = defaults.tags;
        }

        public Builder setAssetIds(@Nullable List<String> assetIds) {
            this.assetIds = assetIds;
            return this;
        }

        public Builder setProjectArn(@Nullable String projectArn) {
            this.projectArn = projectArn;
            return this;
        }

        public Builder setProjectDescription(@Nullable String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setProjectName(@Nullable String projectName) {
            this.projectName = projectName;
            return this;
        }

        public Builder setTags(@Nullable List<ProjectTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetProjectResult build() {
            return new GetProjectResult(assetIds, projectArn, projectDescription, projectId, projectName, tags);
        }
    }
}
