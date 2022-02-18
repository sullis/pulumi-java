// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRegistryRepositoryResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String project;
    private final @Nullable String region;
    private final String repositoryUrl;

    @OutputCustomType.Constructor({"id","project","region","repositoryUrl"})
    private GetRegistryRepositoryResult(
        String id,
        String project,
        @Nullable String region,
        String repositoryUrl) {
        this.id = Objects.requireNonNull(id);
        this.project = Objects.requireNonNull(project);
        this.region = region;
        this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getProject() {
        return this.project;
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryRepositoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String project;
        private @Nullable String region;
        private String repositoryUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryRepositoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.repositoryUrl = defaults.repositoryUrl;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }

        public GetRegistryRepositoryResult build() {
            return new GetRegistryRepositoryResult(id, project, region, repositoryUrl);
        }
    }
}
