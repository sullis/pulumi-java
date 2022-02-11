// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.outputs.AccessPolicyIdentity;
import io.pulumi.awsnative.iotsitewise.outputs.AccessPolicyResource;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccessPolicyResult {
    private final @Nullable String accessPolicyArn;
    private final @Nullable String accessPolicyId;
    private final @Nullable AccessPolicyIdentity accessPolicyIdentity;
    private final @Nullable String accessPolicyPermission;
    private final @Nullable AccessPolicyResource accessPolicyResource;

    @OutputCustomType.Constructor({"accessPolicyArn","accessPolicyId","accessPolicyIdentity","accessPolicyPermission","accessPolicyResource"})
    private GetAccessPolicyResult(
        @Nullable String accessPolicyArn,
        @Nullable String accessPolicyId,
        @Nullable AccessPolicyIdentity accessPolicyIdentity,
        @Nullable String accessPolicyPermission,
        @Nullable AccessPolicyResource accessPolicyResource) {
        this.accessPolicyArn = accessPolicyArn;
        this.accessPolicyId = accessPolicyId;
        this.accessPolicyIdentity = accessPolicyIdentity;
        this.accessPolicyPermission = accessPolicyPermission;
        this.accessPolicyResource = accessPolicyResource;
    }

    public Optional<String> getAccessPolicyArn() {
        return Optional.ofNullable(this.accessPolicyArn);
    }
    public Optional<String> getAccessPolicyId() {
        return Optional.ofNullable(this.accessPolicyId);
    }
    public Optional<AccessPolicyIdentity> getAccessPolicyIdentity() {
        return Optional.ofNullable(this.accessPolicyIdentity);
    }
    public Optional<String> getAccessPolicyPermission() {
        return Optional.ofNullable(this.accessPolicyPermission);
    }
    public Optional<AccessPolicyResource> getAccessPolicyResource() {
        return Optional.ofNullable(this.accessPolicyResource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessPolicyArn;
        private @Nullable String accessPolicyId;
        private @Nullable AccessPolicyIdentity accessPolicyIdentity;
        private @Nullable String accessPolicyPermission;
        private @Nullable AccessPolicyResource accessPolicyResource;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyArn = defaults.accessPolicyArn;
    	      this.accessPolicyId = defaults.accessPolicyId;
    	      this.accessPolicyIdentity = defaults.accessPolicyIdentity;
    	      this.accessPolicyPermission = defaults.accessPolicyPermission;
    	      this.accessPolicyResource = defaults.accessPolicyResource;
        }

        public Builder setAccessPolicyArn(@Nullable String accessPolicyArn) {
            this.accessPolicyArn = accessPolicyArn;
            return this;
        }

        public Builder setAccessPolicyId(@Nullable String accessPolicyId) {
            this.accessPolicyId = accessPolicyId;
            return this;
        }

        public Builder setAccessPolicyIdentity(@Nullable AccessPolicyIdentity accessPolicyIdentity) {
            this.accessPolicyIdentity = accessPolicyIdentity;
            return this;
        }

        public Builder setAccessPolicyPermission(@Nullable String accessPolicyPermission) {
            this.accessPolicyPermission = accessPolicyPermission;
            return this;
        }

        public Builder setAccessPolicyResource(@Nullable AccessPolicyResource accessPolicyResource) {
            this.accessPolicyResource = accessPolicyResource;
            return this;
        }

        public GetAccessPolicyResult build() {
            return new GetAccessPolicyResult(accessPolicyArn, accessPolicyId, accessPolicyIdentity, accessPolicyPermission, accessPolicyResource);
        }
    }
}
