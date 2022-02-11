// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectS3Destination {
    private final String bucketName;
    private final @Nullable String prefix;

    @OutputCustomType.Constructor({"bucketName","prefix"})
    private ProjectS3Destination(
        String bucketName,
        @Nullable String prefix) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.prefix = prefix;
    }

    public String getBucketName() {
        return this.bucketName;
    }
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectS3Destination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectS3Destination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.prefix = defaults.prefix;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public ProjectS3Destination build() {
            return new ProjectS3Destination(bucketName, prefix);
        }
    }
}
