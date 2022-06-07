// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetObjectIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetObjectIamPolicyArgs Empty = new GetObjectIamPolicyArgs();

    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    @Import(name="generation")
    private @Nullable Output<String> generation;

    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    @Import(name="object", required=true)
    private Output<String> object;

    public Output<String> object() {
        return this.object;
    }

    @Import(name="userProject")
    private @Nullable Output<String> userProject;

    public Optional<Output<String>> userProject() {
        return Optional.ofNullable(this.userProject);
    }

    private GetObjectIamPolicyArgs() {}

    private GetObjectIamPolicyArgs(GetObjectIamPolicyArgs $) {
        this.bucket = $.bucket;
        this.generation = $.generation;
        this.object = $.object;
        this.userProject = $.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetObjectIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetObjectIamPolicyArgs $;

        public Builder() {
            $ = new GetObjectIamPolicyArgs();
        }

        public Builder(GetObjectIamPolicyArgs defaults) {
            $ = new GetObjectIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        public Builder object(String object) {
            return object(Output.of(object));
        }

        public Builder userProject(@Nullable Output<String> userProject) {
            $.userProject = userProject;
            return this;
        }

        public Builder userProject(String userProject) {
            return userProject(Output.of(userProject));
        }

        public GetObjectIamPolicyArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
