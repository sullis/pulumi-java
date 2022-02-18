// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TenantState extends io.pulumi.resources.ResourceArgs {

    public static final TenantState Empty = new TenantState();

    /**
     * Whether to allow email/password user authentication.
     * 
     */
    @InputImport(name="allowPasswordSignup")
    private final @Nullable Input<Boolean> allowPasswordSignup;

    public Input<Boolean> getAllowPasswordSignup() {
        return this.allowPasswordSignup == null ? Input.empty() : this.allowPasswordSignup;
    }

    /**
     * Whether authentication is disabled for the tenant. If true, the users under
     * the disabled tenant are not allowed to sign-in. Admins of the disabled tenant
     * are not able to manage its users.
     * 
     */
    @InputImport(name="disableAuth")
    private final @Nullable Input<Boolean> disableAuth;

    public Input<Boolean> getDisableAuth() {
        return this.disableAuth == null ? Input.empty() : this.disableAuth;
    }

    /**
     * Human friendly display name of the tenant.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Whether to enable email link user authentication.
     * 
     */
    @InputImport(name="enableEmailLinkSignin")
    private final @Nullable Input<Boolean> enableEmailLinkSignin;

    public Input<Boolean> getEnableEmailLinkSignin() {
        return this.enableEmailLinkSignin == null ? Input.empty() : this.enableEmailLinkSignin;
    }

    /**
     * The name of the tenant that is generated by the server
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public TenantState(
        @Nullable Input<Boolean> allowPasswordSignup,
        @Nullable Input<Boolean> disableAuth,
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> enableEmailLinkSignin,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.allowPasswordSignup = allowPasswordSignup;
        this.disableAuth = disableAuth;
        this.displayName = displayName;
        this.enableEmailLinkSignin = enableEmailLinkSignin;
        this.name = name;
        this.project = project;
    }

    private TenantState() {
        this.allowPasswordSignup = Input.empty();
        this.disableAuth = Input.empty();
        this.displayName = Input.empty();
        this.enableEmailLinkSignin = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowPasswordSignup;
        private @Nullable Input<Boolean> disableAuth;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> enableEmailLinkSignin;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPasswordSignup = defaults.allowPasswordSignup;
    	      this.disableAuth = defaults.disableAuth;
    	      this.displayName = defaults.displayName;
    	      this.enableEmailLinkSignin = defaults.enableEmailLinkSignin;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setAllowPasswordSignup(@Nullable Input<Boolean> allowPasswordSignup) {
            this.allowPasswordSignup = allowPasswordSignup;
            return this;
        }

        public Builder setAllowPasswordSignup(@Nullable Boolean allowPasswordSignup) {
            this.allowPasswordSignup = Input.ofNullable(allowPasswordSignup);
            return this;
        }

        public Builder setDisableAuth(@Nullable Input<Boolean> disableAuth) {
            this.disableAuth = disableAuth;
            return this;
        }

        public Builder setDisableAuth(@Nullable Boolean disableAuth) {
            this.disableAuth = Input.ofNullable(disableAuth);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEnableEmailLinkSignin(@Nullable Input<Boolean> enableEmailLinkSignin) {
            this.enableEmailLinkSignin = enableEmailLinkSignin;
            return this;
        }

        public Builder setEnableEmailLinkSignin(@Nullable Boolean enableEmailLinkSignin) {
            this.enableEmailLinkSignin = Input.ofNullable(enableEmailLinkSignin);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public TenantState build() {
            return new TenantState(allowPasswordSignup, disableAuth, displayName, enableEmailLinkSignin, name, project);
        }
    }
}
