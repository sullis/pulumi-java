// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.outputs;

import io.pulumi.awsnative.auditmanager.enums.AssessmentRoleType;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssessmentRole {
    private final @Nullable String roleArn;
    private final @Nullable AssessmentRoleType roleType;

    @CustomType.Constructor
    private AssessmentRole(
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("roleType") @Nullable AssessmentRoleType roleType) {
        this.roleArn = roleArn;
        this.roleType = roleType;
    }

    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public Optional<AssessmentRoleType> roleType() {
        return Optional.ofNullable(this.roleType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String roleArn;
        private @Nullable AssessmentRoleType roleType;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.roleType = defaults.roleType;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleType(@Nullable AssessmentRoleType roleType) {
            this.roleType = roleType;
            return this;
        }        public AssessmentRole build() {
            return new AssessmentRole(roleArn, roleType);
        }
    }
}
