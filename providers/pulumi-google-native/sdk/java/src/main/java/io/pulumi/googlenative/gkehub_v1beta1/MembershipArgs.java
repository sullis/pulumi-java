// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.gkehub_v1beta1.enums.MembershipInfrastructureType;
import io.pulumi.googlenative.gkehub_v1beta1.inputs.AuthorityArgs;
import io.pulumi.googlenative.gkehub_v1beta1.inputs.MembershipEndpointArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipArgs Empty = new MembershipArgs();

    /**
     * Optional. How to identify workloads from this Membership. See the documentation on Workload Identity for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * 
     */
    @Import(name="authority")
      private final @Nullable Output<AuthorityArgs> authority;

    public Output<AuthorityArgs> getAuthority() {
        return this.authority == null ? Output.empty() : this.authority;
    }

    /**
     * Optional. Description of this membership, limited to 63 characters. Must match the regex: `a-zA-Z0-9*`
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Optional. Endpoint information to reach this member.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<MembershipEndpointArgs> endpoint;

    public Output<MembershipEndpointArgs> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * Optional. An externally-generated and managed ID for this Membership. This ID may be modified after creation, but this is not recommended. For GKE clusters, external_id is managed by the Hub API and updates will be ignored. The ID must match the regex: `a-zA-Z0-9*` If this Membership represents a Kubernetes cluster, this value should be set to the UID of the `kube-system` namespace object.
     * 
     */
    @Import(name="externalId")
      private final @Nullable Output<String> externalId;

    public Output<String> getExternalId() {
        return this.externalId == null ? Output.empty() : this.externalId;
    }

    /**
     * Optional. The infrastructure type this Membership is running on.
     * 
     */
    @Import(name="infrastructureType")
      private final @Nullable Output<MembershipInfrastructureType> infrastructureType;

    public Output<MembershipInfrastructureType> getInfrastructureType() {
        return this.infrastructureType == null ? Output.empty() : this.infrastructureType;
    }

    /**
     * Optional. GCP labels for this membership.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="membershipId", required=true)
      private final Output<String> membershipId;

    public Output<String> getMembershipId() {
        return this.membershipId;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    public MembershipArgs(
        @Nullable Output<AuthorityArgs> authority,
        @Nullable Output<String> description,
        @Nullable Output<MembershipEndpointArgs> endpoint,
        @Nullable Output<String> externalId,
        @Nullable Output<MembershipInfrastructureType> infrastructureType,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        Output<String> membershipId,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId) {
        this.authority = authority;
        this.description = description;
        this.endpoint = endpoint;
        this.externalId = externalId;
        this.infrastructureType = infrastructureType;
        this.labels = labels;
        this.location = location;
        this.membershipId = Objects.requireNonNull(membershipId, "expected parameter 'membershipId' to be non-null");
        this.project = project;
        this.requestId = requestId;
    }

    private MembershipArgs() {
        this.authority = Output.empty();
        this.description = Output.empty();
        this.endpoint = Output.empty();
        this.externalId = Output.empty();
        this.infrastructureType = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.membershipId = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AuthorityArgs> authority;
        private @Nullable Output<String> description;
        private @Nullable Output<MembershipEndpointArgs> endpoint;
        private @Nullable Output<String> externalId;
        private @Nullable Output<MembershipInfrastructureType> infrastructureType;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private Output<String> membershipId;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.externalId = defaults.externalId;
    	      this.infrastructureType = defaults.infrastructureType;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.membershipId = defaults.membershipId;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
        }

        public Builder authority(@Nullable Output<AuthorityArgs> authority) {
            this.authority = authority;
            return this;
        }
        public Builder authority(@Nullable AuthorityArgs authority) {
            this.authority = Output.ofNullable(authority);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder endpoint(@Nullable Output<MembershipEndpointArgs> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable MembershipEndpointArgs endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }
        public Builder externalId(@Nullable Output<String> externalId) {
            this.externalId = externalId;
            return this;
        }
        public Builder externalId(@Nullable String externalId) {
            this.externalId = Output.ofNullable(externalId);
            return this;
        }
        public Builder infrastructureType(@Nullable Output<MembershipInfrastructureType> infrastructureType) {
            this.infrastructureType = infrastructureType;
            return this;
        }
        public Builder infrastructureType(@Nullable MembershipInfrastructureType infrastructureType) {
            this.infrastructureType = Output.ofNullable(infrastructureType);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder membershipId(Output<String> membershipId) {
            this.membershipId = Objects.requireNonNull(membershipId);
            return this;
        }
        public Builder membershipId(String membershipId) {
            this.membershipId = Output.of(Objects.requireNonNull(membershipId));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }        public MembershipArgs build() {
            return new MembershipArgs(authority, description, endpoint, externalId, infrastructureType, labels, location, membershipId, project, requestId);
        }
    }
}
