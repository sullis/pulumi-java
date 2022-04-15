// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserGroupState extends io.pulumi.resources.ResourceArgs {

    public static final UserGroupState Empty = new UserGroupState();

    /**
     * The description of the user group.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the user group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The precedence of the user group.
     * 
     */
    @Import(name="precedence")
      private final @Nullable Output<Integer> precedence;

    public Output<Integer> precedence() {
        return this.precedence == null ? Codegen.empty() : this.precedence;
    }

    /**
     * The ARN of the IAM role to be associated with the user group.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    /**
     * The user pool ID.
     * 
     */
    @Import(name="userPoolId")
      private final @Nullable Output<String> userPoolId;

    public Output<String> userPoolId() {
        return this.userPoolId == null ? Codegen.empty() : this.userPoolId;
    }

    public UserGroupState(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<Integer> precedence,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> userPoolId) {
        this.description = description;
        this.name = name;
        this.precedence = precedence;
        this.roleArn = roleArn;
        this.userPoolId = userPoolId;
    }

    private UserGroupState() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.precedence = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.userPoolId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> precedence;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.precedence = defaults.precedence;
    	      this.roleArn = defaults.roleArn;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder precedence(@Nullable Output<Integer> precedence) {
            this.precedence = precedence;
            return this;
        }
        public Builder precedence(@Nullable Integer precedence) {
            this.precedence = Codegen.ofNullable(precedence);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }
        public Builder userPoolId(@Nullable Output<String> userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public Builder userPoolId(@Nullable String userPoolId) {
            this.userPoolId = Codegen.ofNullable(userPoolId);
            return this;
        }        public UserGroupState build() {
            return new UserGroupState(description, name, precedence, roleArn, userPoolId);
        }
    }
}
