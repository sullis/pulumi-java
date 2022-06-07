// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCutoverJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCutoverJobArgs Empty = new GetCutoverJobArgs();

    @Import(name="cutoverJobId", required=true)
    private Output<String> cutoverJobId;

    public Output<String> cutoverJobId() {
        return this.cutoverJobId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="migratingVmId", required=true)
    private Output<String> migratingVmId;

    public Output<String> migratingVmId() {
        return this.migratingVmId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sourceId", required=true)
    private Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }

    private GetCutoverJobArgs() {}

    private GetCutoverJobArgs(GetCutoverJobArgs $) {
        this.cutoverJobId = $.cutoverJobId;
        this.location = $.location;
        this.migratingVmId = $.migratingVmId;
        this.project = $.project;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCutoverJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCutoverJobArgs $;

        public Builder() {
            $ = new GetCutoverJobArgs();
        }

        public Builder(GetCutoverJobArgs defaults) {
            $ = new GetCutoverJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder cutoverJobId(Output<String> cutoverJobId) {
            $.cutoverJobId = cutoverJobId;
            return this;
        }

        public Builder cutoverJobId(String cutoverJobId) {
            return cutoverJobId(Output.of(cutoverJobId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder migratingVmId(Output<String> migratingVmId) {
            $.migratingVmId = migratingVmId;
            return this;
        }

        public Builder migratingVmId(String migratingVmId) {
            return migratingVmId(Output.of(migratingVmId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder sourceId(Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        public GetCutoverJobArgs build() {
            $.cutoverJobId = Objects.requireNonNull($.cutoverJobId, "expected parameter 'cutoverJobId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.migratingVmId = Objects.requireNonNull($.migratingVmId, "expected parameter 'migratingVmId' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}
