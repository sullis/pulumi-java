// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserAuthenticationModeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserAuthenticationModeGetArgs Empty = new UserAuthenticationModeGetArgs();

    /**
     * The number of passwords belonging to the user.
     * 
     */
    @Import(name="passwordCount")
      private final @Nullable Output<Integer> passwordCount;

    public Output<Integer> passwordCount() {
        return this.passwordCount == null ? Codegen.empty() : this.passwordCount;
    }

    /**
     * The set of passwords used for authentication. You can create up to two passwords for each user.
     * 
     */
    @Import(name="passwords", required=true)
      private final Output<List<String>> passwords;

    public Output<List<String>> passwords() {
        return this.passwords;
    }

    /**
     * Indicates whether the user requires a password to authenticate. Must be set to `password`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public UserAuthenticationModeGetArgs(
        @Nullable Output<Integer> passwordCount,
        Output<List<String>> passwords,
        Output<String> type) {
        this.passwordCount = passwordCount;
        this.passwords = Objects.requireNonNull(passwords, "expected parameter 'passwords' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private UserAuthenticationModeGetArgs() {
        this.passwordCount = Codegen.empty();
        this.passwords = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAuthenticationModeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> passwordCount;
        private Output<List<String>> passwords;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAuthenticationModeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordCount = defaults.passwordCount;
    	      this.passwords = defaults.passwords;
    	      this.type = defaults.type;
        }

        public Builder passwordCount(@Nullable Output<Integer> passwordCount) {
            this.passwordCount = passwordCount;
            return this;
        }
        public Builder passwordCount(@Nullable Integer passwordCount) {
            this.passwordCount = Codegen.ofNullable(passwordCount);
            return this;
        }
        public Builder passwords(Output<List<String>> passwords) {
            this.passwords = Objects.requireNonNull(passwords);
            return this;
        }
        public Builder passwords(List<String> passwords) {
            this.passwords = Output.of(Objects.requireNonNull(passwords));
            return this;
        }
        public Builder passwords(String... passwords) {
            return passwords(List.of(passwords));
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public UserAuthenticationModeGetArgs build() {
            return new UserAuthenticationModeGetArgs(passwordCount, passwords, type);
        }
    }
}
