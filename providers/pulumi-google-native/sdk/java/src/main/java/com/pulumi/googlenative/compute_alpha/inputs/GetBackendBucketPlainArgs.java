// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackendBucketPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackendBucketPlainArgs Empty = new GetBackendBucketPlainArgs();

    @Import(name="backendBucket", required=true)
    private String backendBucket;

    public String backendBucket() {
        return this.backendBucket;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBackendBucketPlainArgs() {}

    private GetBackendBucketPlainArgs(GetBackendBucketPlainArgs $) {
        this.backendBucket = $.backendBucket;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackendBucketPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackendBucketPlainArgs $;

        public Builder() {
            $ = new GetBackendBucketPlainArgs();
        }

        public Builder(GetBackendBucketPlainArgs defaults) {
            $ = new GetBackendBucketPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendBucket(String backendBucket) {
            $.backendBucket = backendBucket;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetBackendBucketPlainArgs build() {
            $.backendBucket = Objects.requireNonNull($.backendBucket, "expected parameter 'backendBucket' to be non-null");
            return $;
        }
    }

}
