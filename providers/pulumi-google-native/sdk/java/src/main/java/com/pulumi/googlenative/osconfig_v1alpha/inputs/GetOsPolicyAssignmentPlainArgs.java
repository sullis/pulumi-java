// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOsPolicyAssignmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOsPolicyAssignmentPlainArgs Empty = new GetOsPolicyAssignmentPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="osPolicyAssignmentId", required=true)
    private String osPolicyAssignmentId;

    public String osPolicyAssignmentId() {
        return this.osPolicyAssignmentId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetOsPolicyAssignmentPlainArgs() {}

    private GetOsPolicyAssignmentPlainArgs(GetOsPolicyAssignmentPlainArgs $) {
        this.location = $.location;
        this.osPolicyAssignmentId = $.osPolicyAssignmentId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOsPolicyAssignmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOsPolicyAssignmentPlainArgs $;

        public Builder() {
            $ = new GetOsPolicyAssignmentPlainArgs();
        }

        public Builder(GetOsPolicyAssignmentPlainArgs defaults) {
            $ = new GetOsPolicyAssignmentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder osPolicyAssignmentId(String osPolicyAssignmentId) {
            $.osPolicyAssignmentId = osPolicyAssignmentId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetOsPolicyAssignmentPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.osPolicyAssignmentId = Objects.requireNonNull($.osPolicyAssignmentId, "expected parameter 'osPolicyAssignmentId' to be non-null");
            return $;
        }
    }

}
