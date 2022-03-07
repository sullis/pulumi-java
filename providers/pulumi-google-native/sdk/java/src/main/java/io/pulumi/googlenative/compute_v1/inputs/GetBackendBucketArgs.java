// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackendBucketArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackendBucketArgs Empty = new GetBackendBucketArgs();

    @InputImport(name="backendBucket", required=true)
      private final String backendBucket;

    public String getBackendBucket() {
        return this.backendBucket;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetBackendBucketArgs(
        String backendBucket,
        @Nullable String project) {
        this.backendBucket = Objects.requireNonNull(backendBucket, "expected parameter 'backendBucket' to be non-null");
        this.project = project;
    }

    private GetBackendBucketArgs() {
        this.backendBucket = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendBucket;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendBucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendBucket = defaults.backendBucket;
    	      this.project = defaults.project;
        }

        public Builder setBackendBucket(String backendBucket) {
            this.backendBucket = Objects.requireNonNull(backendBucket);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetBackendBucketArgs build() {
            return new GetBackendBucketArgs(backendBucket, project);
        }
    }
}