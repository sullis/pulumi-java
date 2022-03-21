// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryconnection_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectionIamPolicyArgs Empty = new GetConnectionIamPolicyArgs();

    @Import(name="connectionId", required=true)
      private final String connectionId;

    public String getConnectionId() {
        return this.connectionId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetConnectionIamPolicyArgs(
        String connectionId,
        String location,
        @Nullable String project) {
        this.connectionId = Objects.requireNonNull(connectionId, "expected parameter 'connectionId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetConnectionIamPolicyArgs() {
        this.connectionId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionId = defaults.connectionId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder connectionId(String connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetConnectionIamPolicyArgs build() {
            return new GetConnectionIamPolicyArgs(connectionId, location, project);
        }
    }
}
