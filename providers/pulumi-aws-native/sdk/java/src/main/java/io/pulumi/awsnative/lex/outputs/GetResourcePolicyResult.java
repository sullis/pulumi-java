// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.ResourcePolicyPolicy;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourcePolicyResult {
    private final @Nullable String id;
    private final @Nullable ResourcePolicyPolicy policy;
    private final @Nullable String resourceArn;
    private final @Nullable String revisionId;

    @OutputCustomType.Constructor({"id","policy","resourceArn","revisionId"})
    private GetResourcePolicyResult(
        @Nullable String id,
        @Nullable ResourcePolicyPolicy policy,
        @Nullable String resourceArn,
        @Nullable String revisionId) {
        this.id = id;
        this.policy = policy;
        this.resourceArn = resourceArn;
        this.revisionId = revisionId;
    }

    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<ResourcePolicyPolicy> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    public Optional<String> getResourceArn() {
        return Optional.ofNullable(this.resourceArn);
    }
    public Optional<String> getRevisionId() {
        return Optional.ofNullable(this.revisionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable ResourcePolicyPolicy policy;
        private @Nullable String resourceArn;
        private @Nullable String revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.policy = defaults.policy;
    	      this.resourceArn = defaults.resourceArn;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setPolicy(@Nullable ResourcePolicyPolicy policy) {
            this.policy = policy;
            return this;
        }

        public Builder setResourceArn(@Nullable String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public Builder setRevisionId(@Nullable String revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public GetResourcePolicyResult build() {
            return new GetResourcePolicyResult(id, policy, resourceArn, revisionId);
        }
    }
}