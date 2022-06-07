// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerTlsPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerTlsPolicyPlainArgs Empty = new GetServerTlsPolicyPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="serverTlsPolicyId", required=true)
    private String serverTlsPolicyId;

    public String serverTlsPolicyId() {
        return this.serverTlsPolicyId;
    }

    private GetServerTlsPolicyPlainArgs() {}

    private GetServerTlsPolicyPlainArgs(GetServerTlsPolicyPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.serverTlsPolicyId = $.serverTlsPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerTlsPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerTlsPolicyPlainArgs $;

        public Builder() {
            $ = new GetServerTlsPolicyPlainArgs();
        }

        public Builder(GetServerTlsPolicyPlainArgs defaults) {
            $ = new GetServerTlsPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder serverTlsPolicyId(String serverTlsPolicyId) {
            $.serverTlsPolicyId = serverTlsPolicyId;
            return this;
        }

        public GetServerTlsPolicyPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.serverTlsPolicyId = Objects.requireNonNull($.serverTlsPolicyId, "expected parameter 'serverTlsPolicyId' to be non-null");
            return $;
        }
    }

}
