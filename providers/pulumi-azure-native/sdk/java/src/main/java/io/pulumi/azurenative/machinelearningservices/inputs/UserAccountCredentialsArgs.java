// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for user account that gets created on each on the nodes of a compute.
 * 
 */
public final class UserAccountCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserAccountCredentialsArgs Empty = new UserAccountCredentialsArgs();

    /**
     * Name of the administrator user account which can be used to SSH to nodes.
     * 
     */
    @InputImport(name="adminUserName", required=true)
    private final Input<String> adminUserName;

    public Input<String> getAdminUserName() {
        return this.adminUserName;
    }

    /**
     * Password of the administrator user account.
     * 
     */
    @InputImport(name="adminUserPassword")
    private final @Nullable Input<String> adminUserPassword;

    public Input<String> getAdminUserPassword() {
        return this.adminUserPassword == null ? Input.empty() : this.adminUserPassword;
    }

    /**
     * SSH public key of the administrator user account.
     * 
     */
    @InputImport(name="adminUserSshPublicKey")
    private final @Nullable Input<String> adminUserSshPublicKey;

    public Input<String> getAdminUserSshPublicKey() {
        return this.adminUserSshPublicKey == null ? Input.empty() : this.adminUserSshPublicKey;
    }

    public UserAccountCredentialsArgs(
        Input<String> adminUserName,
        @Nullable Input<String> adminUserPassword,
        @Nullable Input<String> adminUserSshPublicKey) {
        this.adminUserName = Objects.requireNonNull(adminUserName, "expected parameter 'adminUserName' to be non-null");
        this.adminUserPassword = adminUserPassword;
        this.adminUserSshPublicKey = adminUserSshPublicKey;
    }

    private UserAccountCredentialsArgs() {
        this.adminUserName = Input.empty();
        this.adminUserPassword = Input.empty();
        this.adminUserSshPublicKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAccountCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> adminUserName;
        private @Nullable Input<String> adminUserPassword;
        private @Nullable Input<String> adminUserSshPublicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAccountCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUserName = defaults.adminUserName;
    	      this.adminUserPassword = defaults.adminUserPassword;
    	      this.adminUserSshPublicKey = defaults.adminUserSshPublicKey;
        }

        public Builder setAdminUserName(Input<String> adminUserName) {
            this.adminUserName = Objects.requireNonNull(adminUserName);
            return this;
        }

        public Builder setAdminUserName(String adminUserName) {
            this.adminUserName = Input.of(Objects.requireNonNull(adminUserName));
            return this;
        }

        public Builder setAdminUserPassword(@Nullable Input<String> adminUserPassword) {
            this.adminUserPassword = adminUserPassword;
            return this;
        }

        public Builder setAdminUserPassword(@Nullable String adminUserPassword) {
            this.adminUserPassword = Input.ofNullable(adminUserPassword);
            return this;
        }

        public Builder setAdminUserSshPublicKey(@Nullable Input<String> adminUserSshPublicKey) {
            this.adminUserSshPublicKey = adminUserSshPublicKey;
            return this;
        }

        public Builder setAdminUserSshPublicKey(@Nullable String adminUserSshPublicKey) {
            this.adminUserSshPublicKey = Input.ofNullable(adminUserSshPublicKey);
            return this;
        }

        public UserAccountCredentialsArgs build() {
            return new UserAccountCredentialsArgs(adminUserName, adminUserPassword, adminUserSshPublicKey);
        }
    }
}
