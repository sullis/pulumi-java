// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCutoverJobPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCutoverJobPlainArgs Empty = new GetCutoverJobPlainArgs();

    @Import(name="cutoverJobId", required=true)
    private String cutoverJobId;

    public String cutoverJobId() {
        return this.cutoverJobId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="migratingVmId", required=true)
    private String migratingVmId;

    public String migratingVmId() {
        return this.migratingVmId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sourceId", required=true)
    private String sourceId;

    public String sourceId() {
        return this.sourceId;
    }

    private GetCutoverJobPlainArgs() {}

    private GetCutoverJobPlainArgs(GetCutoverJobPlainArgs $) {
        this.cutoverJobId = $.cutoverJobId;
        this.location = $.location;
        this.migratingVmId = $.migratingVmId;
        this.project = $.project;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCutoverJobPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCutoverJobPlainArgs $;

        public Builder() {
            $ = new GetCutoverJobPlainArgs();
        }

        public Builder(GetCutoverJobPlainArgs defaults) {
            $ = new GetCutoverJobPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder cutoverJobId(String cutoverJobId) {
            $.cutoverJobId = cutoverJobId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder migratingVmId(String migratingVmId) {
            $.migratingVmId = migratingVmId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder sourceId(String sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public GetCutoverJobPlainArgs build() {
            $.cutoverJobId = Objects.requireNonNull($.cutoverJobId, "expected parameter 'cutoverJobId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.migratingVmId = Objects.requireNonNull($.migratingVmId, "expected parameter 'migratingVmId' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}
