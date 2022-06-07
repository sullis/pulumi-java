// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImportJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImportJobArgs Empty = new GetImportJobArgs();

    @Import(name="importJobId", required=true)
    private Output<String> importJobId;

    public Output<String> importJobId() {
        return this.importJobId;
    }

    @Import(name="keyRingId", required=true)
    private Output<String> keyRingId;

    public Output<String> keyRingId() {
        return this.keyRingId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetImportJobArgs() {}

    private GetImportJobArgs(GetImportJobArgs $) {
        this.importJobId = $.importJobId;
        this.keyRingId = $.keyRingId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImportJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImportJobArgs $;

        public Builder() {
            $ = new GetImportJobArgs();
        }

        public Builder(GetImportJobArgs defaults) {
            $ = new GetImportJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder importJobId(Output<String> importJobId) {
            $.importJobId = importJobId;
            return this;
        }

        public Builder importJobId(String importJobId) {
            return importJobId(Output.of(importJobId));
        }

        public Builder keyRingId(Output<String> keyRingId) {
            $.keyRingId = keyRingId;
            return this;
        }

        public Builder keyRingId(String keyRingId) {
            return keyRingId(Output.of(keyRingId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetImportJobArgs build() {
            $.importJobId = Objects.requireNonNull($.importJobId, "expected parameter 'importJobId' to be non-null");
            $.keyRingId = Objects.requireNonNull($.keyRingId, "expected parameter 'keyRingId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
