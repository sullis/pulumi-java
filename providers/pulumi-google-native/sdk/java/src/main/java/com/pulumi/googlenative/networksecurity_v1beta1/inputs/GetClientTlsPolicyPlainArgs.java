// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientTlsPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClientTlsPolicyPlainArgs Empty = new GetClientTlsPolicyPlainArgs();

    @Import(name="clientTlsPolicyId", required=true)
    private String clientTlsPolicyId;

    public String clientTlsPolicyId() {
        return this.clientTlsPolicyId;
    }

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

    private GetClientTlsPolicyPlainArgs() {}

    private GetClientTlsPolicyPlainArgs(GetClientTlsPolicyPlainArgs $) {
        this.clientTlsPolicyId = $.clientTlsPolicyId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClientTlsPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClientTlsPolicyPlainArgs $;

        public Builder() {
            $ = new GetClientTlsPolicyPlainArgs();
        }

        public Builder(GetClientTlsPolicyPlainArgs defaults) {
            $ = new GetClientTlsPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientTlsPolicyId(String clientTlsPolicyId) {
            $.clientTlsPolicyId = clientTlsPolicyId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetClientTlsPolicyPlainArgs build() {
            $.clientTlsPolicyId = Objects.requireNonNull($.clientTlsPolicyId, "expected parameter 'clientTlsPolicyId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
